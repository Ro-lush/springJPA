package ru.academy.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.academy.pizza.model.OrderItem;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    List<OrderItem> findByOrderId(int orderId);
}
