package BehavioralPatterns.Iterator;

// Iterator.java
// Интерфейс итератора, который определяет методы для перебора элементов коллекции
public interface Iterator<T> {
    boolean hasNext(); // Проверяет, есть ли следующий элемент
    T next(); // Возвращает следующий элемент
}