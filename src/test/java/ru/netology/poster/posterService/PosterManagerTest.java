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
    public void shouldAddFilmNoName() {
        manager.addingNewFilm("");

        String[]expected = {"",""};
        String[] acyual = manager.addingNewFilm("");
        Assertions.assertArrayEquals(expected, acyual);
    }
    @Test
    public void shouldWorkConstructor(){
        PosterManager manager1 = new PosterManager(1);

        Assertions.assertEquals(1, manager1.getQuantityLastFilms());
    }
    @Test
    public void shouldWorkConWenNotInstalled(){
        PosterManager manager1 = new PosterManager();

        Assertions.assertEquals(10, manager1.getQuantityLastFilms());
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
    public void shouldFindLastQuanyity(){
        PosterManager post = new PosterManager(2);
        post.addingNewFilm("Бладшот");
        post.addingNewFilm("Вперед");
        post.addingNewFilm("Отель Белград");
        post.addingNewFilm("Джентельмены");
        post.addingNewFilm("Человек неведимка");

        String[] expected = {"Человек неведимка","Джентельмены"};
        String[] actual = post.findLast();
        Assertions.assertArrayEquals(expected,actual);





    }



    }






