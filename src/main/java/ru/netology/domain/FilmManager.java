package ru.netology.domain;

public class FilmManager {

    FilmData data = new FilmData();

    private int managerLimit = 10;
    private String[] movies = {
            data.filmOne,
            data.filmTwo,
            data.filmThree,
            data.filmFour,
            data.filmFive,
            data.filmSix,
            data.filmSeven,
    };

    public FilmManager() {

    }

    public FilmManager(int managerLimit) {
        this.managerLimit = managerLimit;
    }

    public String[] addNewFilm(String newFilm) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newFilm;
        movies = tmp;
        return movies;
    }

    public String[] findAll() {
        return movies;
    }

    public int getMovieLength() {
        return movies.length;
    }

    public String[] findLast() {
        int resultLength;
        if (managerLimit > movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = managerLimit;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}

