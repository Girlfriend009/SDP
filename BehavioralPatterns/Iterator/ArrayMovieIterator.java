package BehavioralPatterns.Iterator;

// ArrayMovieIterator.java
// Итератор для коллекции фильмов на основе массива
public class ArrayMovieIterator implements Iterator<String> {
    private final String[] movies; // Массив фильмов
    private int position = 0; // Текущая позиция итератора

    public ArrayMovieIterator(String[] movies) {
        this.movies = movies; // Инициализируем массив фильмов
    }

    @Override
    public boolean hasNext() {
        return position < movies.length; // Проверяем, есть ли еще элементы
    }

    @Override
    public String next() {
        return movies[position++]; // Возвращаем текущий элемент и переходим к следующему
    }
}