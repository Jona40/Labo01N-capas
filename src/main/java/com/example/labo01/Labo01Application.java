package com.example.labo01;

import com.example.labo01.services.ProductoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Labo01Application {

    public static void main(String[] args) {
        SpringApplication.run(Labo01Application.class, args);
    }
    @Bean
    public CommandLineRunner run(ProductoService productService) {

        return args -> {

            System.out.println("=== INICIANDO APP ===");
            productService.findAll().forEach(p ->
                    System.out.println(p.getNombre() + " - $" + p.getPrecio())
            );
        };
    }
}
