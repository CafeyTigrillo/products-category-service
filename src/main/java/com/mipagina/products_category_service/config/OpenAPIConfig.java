package com.mipagina.products_category_service.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI myOpenAPI() {
        Contact contact = new Contact();
        contact.setEmail("support@restaurantapi.com");
        contact.setName("Restaurant API Support");
        contact.setUrl("https://www.restaurantapi.com");

        License license = new License()
                .name("Apache License 2.0")
                .url("https://www.apache.org/licenses/LICENSE-2.0");

        Info info = new Info()
                .title("Restaurant Products Category Management API")
                .version("1.0")
                .contact(contact)
                .description("This API allows managing restaurant products by categories, enabling efficient categorization and retrieval of food items.")
                .license(license);

        return new OpenAPI().info(info);
    }
}