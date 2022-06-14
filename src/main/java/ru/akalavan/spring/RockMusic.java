package ru.akalavan.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> listMusic = new ArrayList<>();

    {
        listMusic.add("Hollywood undead - Undead");
        listMusic.add("Hollywood undead - Young");
        listMusic.add("Hollywood undead - Everywhere I Go");
    }

    @Override
    public List<String> getSong() {
        return listMusic;
    }
}
