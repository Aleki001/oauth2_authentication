package org.wababe.oauth2_authentication.config;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;

@Configuration
public class EnvConfig {

    @Bean
    public Dotenv dotenv() {
        return Dotenv.configure().ignoreIfMissing().load();
    }

    @Bean
    public String setEnvironmentVariables(ConfigurableEnvironment environment, Dotenv dotenv) {
        dotenv.entries().forEach(entry ->
                environment.getSystemProperties().put(entry.getKey(), entry.getValue())
        );
        return "environmentVariablesSet";
    }
}