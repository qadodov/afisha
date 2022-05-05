package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    MovieItem first = new MovieItem("Avengers");

    @Test
    void addMovie() {
        Manager manager = new Manager();
        manager.addMovie("Avengers");

        String[] expected = {"Avengers"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastSetToLimit() {
        Manager manager = new Manager();
        manager.addMovie("Фильм1");
        manager.addMovie("Фильм2");
        manager.addMovie("Фильм3");
        manager.addMovie("Фильм4");
        manager.addMovie("Фильм5");
        manager.addMovie("Фильм6");
        manager.addMovie("Фильм7");
        manager.addMovie("Фильм8");
        manager.addMovie("Фильм9");
        manager.addMovie("Фильм10");

        String[] expected = {"Фильм10", "Фильм9", "Фильм8", "Фильм7", "Фильм6", "Фильм5", "Фильм4", "Фильм3", "Фильм2", "Фильм1"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastSetUnderLimit() {
        Manager manager = new Manager(3);
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель");
        manager.addMovie("Джентельмены");
        manager.addMovie("Тролли");

        String[] expected = {"Тролли", "Джентельмены", "Отель"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastSetoverLimit() {
        Manager manager = new Manager(2);
        manager.addMovie("Фильм1");
        manager.addMovie("Фильм2");
        manager.addMovie("Фильм3");
        manager.addMovie("Фильм4");
        manager.addMovie("Фильм5");
        manager.addMovie("Фильм6");
        manager.addMovie("Фильм7");
        manager.addMovie("Фильм8");
        manager.addMovie("Фильм9");
        manager.addMovie("Фильм10");

        String[] expected = {"Фильм10", "Фильм9"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}