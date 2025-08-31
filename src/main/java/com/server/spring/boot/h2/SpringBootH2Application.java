package com.server.spring.boot.h2;

import com.server.spring.boot.h2.model.Product;
import com.server.spring.boot.h2.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class SpringBootH2Application {

    private final ProductRepository productRepository;

    public SpringBootH2Application(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootH2Application.class, args);
	}

    @Bean
    CommandLineRunner runner() {
        return args -> {
            productRepository.deleteAll();
            Product product = new Product();
            product.setName("Product 1");
            product.setDescription("This is product 1");
            product.setPrice(BigDecimal.valueOf(100.0));
            productRepository.save(product);
        };
    }
}
