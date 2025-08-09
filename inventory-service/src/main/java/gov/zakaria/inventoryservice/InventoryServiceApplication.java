package gov.zakaria.inventoryservice;

import gov.zakaria.inventoryservice.repository.productRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(productRepository productRepository) {
        return args -> {
            productRepository.save(gov.zakaria.inventoryservice.entities.Product.builder()
                            .id(UUID.randomUUID().toString())
                    .name("Laptop").price(1200.00).quantity(10).build());
            productRepository.save(gov.zakaria.inventoryservice.entities.Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Smartphone").price(800.00).quantity(20).build());
            productRepository.save(gov.zakaria.inventoryservice.entities.Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Tablet").price(500.00).quantity(15).build());

            productRepository.findAll().forEach(p -> {
                System.out.println("------------------------------------");
                System.out.println(p.getName());
                System.out.println(p.getPrice());
                System.out.println(p.getQuantity());
                System.out.println("------------------------------------");
            });

        };
    }

}
