# 单元测试单独跑，走本机正常 Docker（不受 Tilt 的 minikube docker-env 影响）
# local_resource(
    # 'unit-tests',
    # cmd = 'mvn test',
    # deps = ['pom.xml', 'src'],
# )

# Build
custom_build(
    # Name of the container image
    ref = 'catalog-service',
    # Command to build the container image
    # Windows 下用 %EXPECTED_REF%，Linux/Mac 下用 $EXPECTED_REF
    command = 'mvn spring-boot:build-image -DskipTests -Dspring-boot.build-image.imageName=%EXPECTED_REF%',
    # Files to watch that trigger a new build
    deps = ['pom.xml', 'src']
)
# Deploy
k8s_yaml(['k8s/deployment.yml', 'k8s/service.yml'])

# Manage
k8s_resource('catalog-service', port_forwards=['9001'])