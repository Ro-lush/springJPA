package ru.academy.pizza.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ConfigurationProperties
public class ConfigPizza {
    // Ключ будет "margarita.name", значение "Маргарита"
    private final Map<String, String> pizza = new HashMap<>();

    // Spring автоматически заполнит эту Map
    public Map<String, String> getPizza() {
        return pizza;
    }

   /* public void setMargarita(Map<String, String> properties) {
        this.margarita = properties;
    }*/
    // Spring будет вызывать этот метод для каждого свойства
    public void set(String key, String value) {
        pizza.put(key, value);
    }

    public String get(String key) {
        return pizza.get(key);
    }

}