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
    void findLast() {
        Manager manager = new Manager(10);
        manager.setTitles(new String[] {"Бладшот", "Вперед", "Отель", "Джентельмены", "Тролли"});

    }
}