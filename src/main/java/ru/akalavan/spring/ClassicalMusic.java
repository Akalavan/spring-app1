package ru.akalavan.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    List<String> listMusic = new ArrayList<>();

    {
        listMusic.add("ClassicMusic1");
        listMusic.add("ClassicMusic2");
        listMusic.add("ClassicMusic3");
    }

    @Override
    public List<String> getSong() {
        return listMusic;
    }
}
