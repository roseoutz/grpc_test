package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.rsocket.RSocketRequester;
import reactor.util.retry.Retry;

import java.time.Duration;

@Configuration
public class RocketConfig {

    @Bean
    public RSocketRequester getRSocketRequester() {
        return RSocketRequester.builder()
                .rsocketConnector(
                        connector ->
                                connector.reconnect(Retry.fixedDelay(2, Duration.ofSeconds(3)))
                )
                .tcp("localhost", 9999);
    }
}
