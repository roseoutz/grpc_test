package com.example.config;

import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;

@EnableR2dbcRepositories
@EnableR2dbcAuditing
@Configuration
public class R2DBCConfig {

    @Bean
    public ConnectionFactoryInitializer initializer(ConnectionFactory connectionFactory) {
        ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
        initializer.setConnectionFactory(connectionFactory);
        ClassPathResource cpr = new ClassPathResource("sql/db-schema.sql");
        if (cpr.exists()) {
            ResourceDatabasePopulator populator = new ResourceDatabasePopulator(new ClassPathResource("sql/db-schema.sql"));
            initializer.setDatabasePopulator(populator);
        }
        return initializer;
    }
}
