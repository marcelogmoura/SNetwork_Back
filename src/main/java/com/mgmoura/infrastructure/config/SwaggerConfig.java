package com.mgmoura.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI customOpenApi() {
		OpenAPI openAPI = new OpenAPI().components(new Components())
				.info(new Info().title("API Spring Boot - Marcelo Moura")
						.description("API Spring Boot").version("v1.0")
						.contact(new Contact().name("Marcelo Moura").email("mgmoura@gmail.com")
								.url("https://github.com/marcelogmoura")));
		return openAPI;
	}

}
