package com.polarbookshop.catalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * @author werun
 * @version 1.0
 * @date 2026/07/07 14:58
 * @description
 **/
@SpringBootApplication
@ConfigurationPropertiesScan // 加载Spring上下文中的配置数据bean
public class CatalogServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatalogServiceApplication.class, args);
    }
}
