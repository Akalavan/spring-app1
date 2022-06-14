package ru.akalavan.spring;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Hollywood undead - Undead";
    }
}
