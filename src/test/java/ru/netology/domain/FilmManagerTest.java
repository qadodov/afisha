package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    @org.junit.jupiter.api.Test
    void addNewFilm() {
        FilmManager film = new FilmManager();

        film.addNewFilm("Avengers");

        int expected = 8;
        int actual = film.getMovieLength();

        assertEquals(expected, actual);

    }

    @Test
    void findAll() {
        FilmManager film = new FilmManager();
        FilmData data = new FilmData();

        film.addNewFilm("Avengers");

        String[] expected = {"Bloodshot", "Onward", "Hotel Belgrade", "The Gentleman", "The Invisible Man", "Trolls", "Number One", "Avengers"};
        String[] actual = film.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast() {
        FilmManager film = new FilmManager(3);

        System.out.println(Arrays.toString(film.findLast()));
    }
}