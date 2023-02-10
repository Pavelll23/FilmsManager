package ru.netology.poster.posterService;

public class PosterManager {

    private String[] filmBox = new String[0];

    private int quantityLastFilms;


    public PosterManager() {
        this.quantityLastFilms = 10;
    }

    public PosterManager(int quantityLastFilms) {
        this.quantityLastFilms = quantityLastFilms;
    }
    public int getQuantityLastFilms() {
        return quantityLastFilms;
    }


    public String[] addingNewFilm(String film) {
        String[] tmp = new String[filmBox.length + 1];
        for (int i = 0; i < filmBox.length; i++) {
            tmp[i] = filmBox[i];
        }
        tmp[tmp.length - 1] = film;
        filmBox = tmp;
        return filmBox;
    }

    public String[] findAll() {
        return filmBox;
    }

    public String[] findLast() {
        int resultLenght;
        if (filmBox.length < getQuantityLastFilms()) {
            resultLenght = filmBox.length;
        } else {
            resultLenght = getQuantityLastFilms();
        }
        String[] min = new String[resultLenght];
        for (int i = 0; i < min.length; i++) {
            min[i] = filmBox[filmBox.length - 1 - i];
        }
        return min;

    }

}







