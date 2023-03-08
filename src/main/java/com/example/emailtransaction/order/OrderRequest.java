package com.example.emailtransaction.order;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class OrderRequest {

    private BigDecimal productAmount;
    private Long productId;
    private Orderer orderer;

    public Order toEntity() {
        return new Order(productId, productAmount, orderer);
    }
}