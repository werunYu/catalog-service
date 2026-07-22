FROM eclipse-temurin:21 AS builder
WORKDIR workspace
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} catalog-service.jar
 # 从使用分层JAR模式的归档文件中抽取各个层
RUN java -Djarmode=tools -jar catalog-service.jar extract --layers --launcher --destination extracted
# RUN java -Djarmode=layertools -jar catalog-service.jar extract  -Djarmode=layertools 这个模式在 Spring Boot 4.0.3 中已经被弃用

FROM eclipse-temurin:21
RUN useradd spring
# 将spring配置为当前用户
USER spring
WORKDIR workspace
# 将第一阶段的每个JAR层复制到第二阶段的workspace目录中
COPY --from=builder workspace/extracted/dependencies/ ./
COPY --from=builder workspace/extracted/spring-boot-loader/ ./
COPY --from=builder workspace/extracted/snapshot-dependencies/ ./
COPY --from=builder workspace/extracted/application/ ./
# 使用Spring Boot Launcher启动应用,此时应用位于层中,而不再是unber-JAR
ENTRYPOINT ["java", "org.springframework.boot.loader.launch.JarLauncher"]