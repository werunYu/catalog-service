package com.polarbookshop.catalogservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;

/**
 * @author werun
 * @version 1.0
 * @date 2026/07/21 11:27
 * @description
 **/
@Configuration
@EnableJdbcAuditing // 为持久化实体启用审计
public class DataConfig {
}
