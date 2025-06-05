package ru.academy.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.academy.pizza.model.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {

}
