package ru.academy.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import ru.academy.pizza.config.ConfigPizza;
import ru.academy.pizza.customerService.CustomerService;
import ru.academy.pizza.model.MargaritaPizza;
import ru.academy.pizza.model.Order;
import ru.academy.pizza.model.Pizza;

import java.util.List;

@SpringBootApplication


public class PizzeriaApplication {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ConfigPizza configPizza;

    public static void main(String[] args) {
        SpringApplication.run(PizzeriaApplication.class, args);
    }


 /*   @Override
    public void run(String... args) {

        Order order1 = new Order(
                List.of(
                        new MargaritaPizza(Pizza.Size.MEDIUM, configPizza),
                        new MargaritaPizza(Pizza.Size.LARGE, configPizza)
                ),
                "Иван Иванов"
        );

        customerService.placeOrder(order1);

    }*/
}