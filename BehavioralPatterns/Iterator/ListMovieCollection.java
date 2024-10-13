package BehavioralPatterns.Iterator;
// ListMovieCollection.java
// Коллекция фильмов на основе списка
import java.util.ArrayList;
import java.util.List;

public class ListMovieCollection {
    private final List<String> movies; // Список фильмов

    public ListMovieCollection() {
        movies = new ArrayList<>(); // Инициализируем список
    }

    public void addMovie(String movie) {
        movies.add(movie); // Добавляем фильм в коллекцию
    }

    public Iterator<String> createIterator() {
        return new ListMovieIterator(movies); // Возвращаем итератор для списка
    }
}