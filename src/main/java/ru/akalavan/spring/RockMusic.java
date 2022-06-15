package ru.akalavan.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }

    @Override
    public List<String> getSong() {
        return listMusic;
    }
}
