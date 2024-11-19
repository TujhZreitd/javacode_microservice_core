package ru.javacode.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderCreatedEvent {
    private String productId;
    private String nameProduct;
    private BigDecimal price;
    private Integer quantity;
    private boolean payment;
    private boolean shipping;
}
