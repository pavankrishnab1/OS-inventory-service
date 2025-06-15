package com.shopping.inventory_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
public class InventoryResponseDto {
    private String skuCode;
    private boolean isInstock;
}
