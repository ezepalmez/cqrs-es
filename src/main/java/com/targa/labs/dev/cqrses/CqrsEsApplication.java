package com.targa.labs.dev.cqrses;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "SCQRS & ES Sample App based on Spring Boot and Axon",
                version = "3.0",
                description = "App to demonstrate CQRS & ES based on Spring Boot and Axon",
                contact = @Contact(
                        name = "Oficina de Tegnolog\u00eda e Inform\u00e1tica",
                        url = "Nebrass Lamouchi",
                        email = "lnibrass@gmail.com"
                ))
)
public class CqrsEsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CqrsEsApplication.class, args);
    }

}
