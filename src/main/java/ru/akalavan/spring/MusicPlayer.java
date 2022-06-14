package ru.akalavan.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private final Music classicMusic;
    private final Music rockMusic;

    // IoC
    public MusicPlayer(@Qualifier("classicalMusic") Music classicMusic,
                       @Qualifier("rockMusic") Music rockMusic) {
        this.classicMusic = classicMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(Style style) {
        switch (style) {
            case ROCK:
                return rockMusic.getSong().get(getRandomMusic(rockMusic.getSong().size()));
            case CLASSICAL:
                return classicMusic.getSong().get(getRandomMusic(classicMusic.getSong().size()));
            default:
                return "Not found";
        }
    }

    private int getRandomMusic(int size) {
        return new Random().nextInt(size);
    }

}
