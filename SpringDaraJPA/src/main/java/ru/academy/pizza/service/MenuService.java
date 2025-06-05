package ru.academy.pizza.service;

import ru.academy.pizza.model.Menu;
import ru.academy.pizza.repository.MenuRepository;

import java.util.List;

public class MenuService {
    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public List<Menu> getAllMenuItems() {
        return menuRepository.findAll();
    }

    public Menu addMenuItem(Menu menu) {
        return menuRepository.save(menu);
    }
}
