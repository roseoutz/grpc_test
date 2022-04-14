package com.example.config;

import com.example.grpc.service.EventService;
import com.linecorp.armeria.common.grpc.GrpcSerializationFormats;
import com.linecorp.armeria.server.docs.DocService;
import com.linecorp.armeria.server.grpc.GrpcService;
import com.linecorp.armeria.server.logging.AccessLogWriter;
import com.linecorp.armeria.server.logging.LoggingService;
import com.linecorp.armeria.spring.ArmeriaServerConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArmeriaConfig {

    @Autowired
    protected EventService eventService;

    @Bean
    public ArmeriaServerConfigurator armeriaServerConfigurator() {
        return serverBuilder -> {
            serverBuilder.decorator(LoggingService.newDecorator());
            serverBuilder.accessLogWriter(AccessLogWriter.combined(), false);

            serverBuilder
                    .service(GrpcService.builder()
                            .addService(eventService)
                            .supportedSerializationFormats(GrpcSerializationFormats.values())
                            .enableUnframedRequests(true)
                            .build()
                    );

            serverBuilder.serviceUnder("/docs", new DocService());
        };
    }

}
