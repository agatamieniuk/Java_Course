package com.example.security.rest;

import com.example.security.dto.OrderDto;
import com.example.security.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/orders")
public class OrdersRestController {

    private final OrderService orderService;

    public OrdersRestController(@Autowired OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<OrderDto>> getOrder(@PathVariable Integer id) {
        Optional<OrderDto> order = orderService.findById(id);

        if (order.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(order);
        }
    }

    @GetMapping
    public ResponseEntity<List<OrderDto>> getOrders() {
        List<OrderDto> orders = orderService.findAll();
        return ResponseEntity.ok(orders);
    }
}
