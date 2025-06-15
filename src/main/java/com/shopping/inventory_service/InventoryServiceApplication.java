package com.shopping.inventory_service;

import com.shopping.inventory_service.model.Inventory;
import com.shopping.inventory_service.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadDatainInventorytable(InventoryRepository inventoryRepository) {
        return args -> {
            Inventory inventory1 = new Inventory();
            Inventory inventory2 = new Inventory();
            inventory1.setSkuCode("a");
            inventory1.setQuantity(12);
            inventory2.setSkuCode("b");
            inventory2.setQuantity(0);
            inventoryRepository.save(inventory1);
            inventoryRepository.save(inventory2);
        };
    }
}
