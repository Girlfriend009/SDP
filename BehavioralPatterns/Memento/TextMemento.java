package BehavioralPatterns.Memento;

// TextMemento.java
// Класс снимка, который хранит состояние текста
public class TextMemento {
    private final String text; // Хранимое состояние текста

    public TextMemento(String text) {
        this.text = text; // Сохраняем состояние текста
    }

    public String getText() {
        return text; // Возвращаем сохраненное состояние текста
    }
}
