package ru.netology.poster.posterService;

public class PosterManager {
    public void setQuantityLastFilms(int quantityLastFilms) {
        this.quantityLastFilms = quantityLastFilms;
    }
    private int quantityLastFilms;
    public PosterManager(){
        this.quantityLastFilms = 10;
    }
    public PosterManager(int quantityLastFilms){
        this.quantityLastFilms = quantityLastFilms;
    }
    private String[] filmBox = new String[0];
    public String[] addingNewFilm(String film){
        String[] tmp = new String[filmBox.length + 1];
        for (int i = 0; i < filmBox.length; i++){
            tmp[i] = filmBox[i];
        }
        tmp[tmp.length - 1] = film;
        filmBox = tmp;
        return filmBox;
    }

    public String[] findAll(){
        return filmBox;
    }

    public String[] findLast(){
        int resultLenght;
        if (filmBox.length < quantityLastFilms){
            resultLenght = filmBox.length;
        } else {
            resultLenght = quantityLastFilms;
        }
        String[] min = new String[resultLenght];
        for (int i = 0; i < min.length; i++){
            min[i] = filmBox[filmBox.length - 1 -i];
    }
        return min;

    }




}




