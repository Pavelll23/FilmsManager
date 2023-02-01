package ru.netology.poster.posterService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PosterManagerTest {
    PosterManager manager = new PosterManager();
    @Test
    public void shouldAddingFilm (){
        manager.addingNewFilm("Бладшот");

        String[]expected = {"Бладшот"};
        String[]actual = manager.addingNewFilm("");
    }
    @Test
    public void ShouldAddFilmNoName() {
        manager.addingNewFilm("");

        String[]expected = {"",""};
        String[] acyual = manager.addingNewFilm("");
        Assertions.assertArrayEquals(expected, acyual);

    }


    @Test
    public void shouldAddFilmAndFindAll(){
        manager.addingNewFilm("Бладшот");
        manager.addingNewFilm("Вперед");
        manager.addingNewFilm("Отель Белград");
        manager.addingNewFilm("Джентельмены");
        manager.addingNewFilm("Человек неведимка");

        String[] expected = {"Бладшот","Вперед","Отель Белград","Джентельмены","Человек неведимка"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected,actual);

    }

    @Test
    public void shouldFindeLast(){
        manager.addingNewFilm("Бладшот");
        manager.addingNewFilm("Вперед");
        manager.addingNewFilm("Отель Белград");


        String[] expected = {"Отель Белград","Вперед","Бладшот"};
        String[] actual = manager.findLast();
       Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLastQuanyity(){
        manager.addingNewFilm("Бладшот");
        manager.addingNewFilm("Вперед");
        manager.addingNewFilm("Отель Белград");
        manager.addingNewFilm("Джентельмены");
        manager.addingNewFilm("Человек неведимка");

        manager.setQuantityLastFilms(2);

        String[] expected = {"Человек неведимка","Джентельмены"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected,actual);





    }



    }






