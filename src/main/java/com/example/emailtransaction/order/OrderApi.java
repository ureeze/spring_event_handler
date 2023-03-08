package com.example.emailtransaction.order;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderApi {

    private final OrderService orderService;
    private final OrderRepository orderRepository;

    @PostMapping
    public void doOrder(@RequestBody OrderRequest dto) {
        orderService.doOrder(dto);
    }

    @GetMapping
    public List<Order> getOrders(){
        return orderRepository.findAll();
    }

}