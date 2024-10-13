package BehavioralPatterns.Memento;

// Caretaker.java
// Класс, который управляет сохранениями (снимками)
import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private final List<TextMemento> mementos = new ArrayList<>(); // Список снимков

    public void addMemento(TextMemento memento) {
        mementos.add(memento); // Добавляем снимок в список
    }

    public TextMemento getMemento(int index) {
        return mementos.get(index); // Возвращаем снимок по индексу
    }
}
