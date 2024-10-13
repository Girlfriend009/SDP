package BehavioralPatterns.Iterator;

// ArrayMovieCollection.java
// Коллекция фильмов на основе массива
public class ArrayMovieCollection {
    private final String[] movies; // Массив фильмов
    private int index = 0; // Индекс для добавления фильмов

    public ArrayMovieCollection(int size) {
        movies = new String[size]; // Инициализируем массив
    }

    public void addMovie(String movie) {
        if (index < movies.length) {
            movies[index++] = movie; // Добавляем фильм в массив
        }
    }

    public Iterator<String> createIterator() {
        return new ArrayMovieIterator(movies); // Возвращаем итератор для массива
    }
}
