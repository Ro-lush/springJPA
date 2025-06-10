package ru.academy.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.academy.pizza.model.Menu;

import java.util.List;
@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

}
