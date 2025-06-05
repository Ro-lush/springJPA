package ru.academy.pizza.model;


import ru.academy.pizza.config.ConfigPizza;


public class MargaritaPizza extends Pizza {


    public MargaritaPizza(Size size, ConfigPizza cfg) {
        super(cfg.get("margarita.name"), size,
                switch (size) {
                    case SMALL -> Double.parseDouble(cfg.get("margarita.price.small"));
                    case MEDIUM -> Double.parseDouble(cfg.get("margarita.price.medium"));
                    case LARGE -> Double.parseDouble(cfg.get("margarita.price.large"));
                }, cfg
        );
    }

    @Override
    public String getName() {
        return super.getName() + " " + getSize();
    }

}
