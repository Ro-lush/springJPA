package ru.academy.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.academy.pizza.model.Menu;
import ru.academy.pizza.repository.MenuRepository;

import java.util.List;
@Service
public class MenuService {
    @Autowired
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
