package ru.academy.pizza.service;

import ru.academy.pizza.model.Order;
import ru.academy.pizza.repository.OrderRepository;

import java.time.LocalDateTime;
import java.util.List;

public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public List<Order> getOrdersByCustomer(String customerName) {
        return orderRepository.findByCustomerName(customerName);
    }

    public List<Order> getOrdersByStatus(String status) {
        return orderRepository.findByStatus(status);
    }

    public List<Order> getOrdersBetweenDates(LocalDateTime start, LocalDateTime end) {
        return orderRepository.findByCreatedAtBetween(start, end);
    }

    public Order createOrder(Order order) {
        // Calculate total amount
        double total = order.getItems().stream()
                .mapToDouble(item -> item.getMenu().getPrice() * item.getQuantity())
                .sum();
        order.setOrderAmount(total);
        order.setCreatedAt(LocalDateTime.now());

        return orderRepository.save(order);
    }
}
