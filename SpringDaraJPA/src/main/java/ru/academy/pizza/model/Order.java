package ru.academy.pizza.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private  List<OrderItem> items;

    @Column(name = "customer_name", nullable = false)
    private String customerName;
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private String status;

    @Column(name = "order_amount", nullable = false)
    private Double orderAmount;


   /*  public String getDishes() {
         StringBuilder stringBuffer = new StringBuilder();

         for (Dish dish: items) {
            stringBuffer.append(dish.getName()).append("; ");
         }

         return stringBuffer.toString();
     }*/
   
}
