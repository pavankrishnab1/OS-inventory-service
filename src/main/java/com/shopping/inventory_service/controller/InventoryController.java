package com.shopping.inventory_service.controller;

import com.shopping.inventory_service.dto.InventoryResponseDto;
import com.shopping.inventory_service.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponseDto> isInstock(@RequestParam List<String> skuCode) {

        return inventoryService.isInstock(skuCode);
    }
}
