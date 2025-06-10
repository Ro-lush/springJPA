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
import ru.academy.pizza.model.Menu;
import ru.academy.pizza.model.Order;
import ru.academy.pizza.model.Pizza;
import ru.academy.pizza.repository.MenuRepository;
import ru.academy.pizza.repository.OrderRepository;
import ru.academy.pizza.service.OrderService;

import java.util.List;
import java.util.Optional;

@SpringBootApplication


public class PizzeriaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PizzeriaApplication.class, args);

    }


}