package com.doughdev.doughkins.configs

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment
import org.springframework.jdbc.datasource.DriverManagerDataSource
import javax.sql.DataSource


@Configuration
class AppConfig {
    @Autowired
    var env: Environment? = null

    @Bean
    fun dataSource(): DataSource? {
        val dataSource = DriverManagerDataSource()
        dataSource.setDriverClassName(env?.getProperty("driverClassName") ?: "env returned null")
        dataSource.setUrl(env?.getProperty("url"))
        dataSource.setUsername(env?.getProperty("user"))
        dataSource.setPassword(env?.getProperty("password"))
        return dataSource
    }
}
