package BehavioralPatterns.Iterator;

import java.util.List;

// ListMovieIterator.java
// Итератор для коллекции фильмов на основе списка
import java.util.List;

public class ListMovieIterator implements Iterator<String> {
    private final List<String> movies; // Список фильмов
    private int position = 0; // Текущая позиция итератора

    public ListMovieIterator(List<String> movies) {
        this.movies = movies; // Инициализируем список фильмов
    }

    @Override
    public boolean hasNext() {
        return position < movies.size(); // Проверяем, есть ли еще элементы
    }

    @Override
    public String next() {
        return movies.get(position++); // Возвращаем текущий элемент и переходим к следующему
    }
}