package com.shopping.inventory_service.service;

import com.shopping.inventory_service.dto.InventoryResponseDto;
import com.shopping.inventory_service.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public List<InventoryResponseDto> isInstock(List<String> skuCodeList) {
        return inventoryRepository.findBySkuCodeIn(skuCodeList)
                .stream()
                .map(inventory ->
                    InventoryResponseDto.builder()
                            .skuCode(inventory.getSkuCode())
                            .isInstock(inventory.getQuantity() > 0)
                            .build()
                ).toList();

    }
}
