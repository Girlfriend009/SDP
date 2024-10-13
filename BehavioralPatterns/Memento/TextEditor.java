package BehavioralPatterns.Memento;

// TextEditor.java
// Класс текстового редактора, который управляет текстом
import java.util.Stack;

public class TextEditor {
    private String text = ""; // Текущий текст

    public void write(String newText) {
        text += newText; // Добавляем новый текст
    }

    public TextMemento save() {
        return new TextMemento(text); // Сохраняем текущее состояние текста
    }

    public void restore(TextMemento memento) {
        text = memento.getText(); // Восстанавливаем текст из снимка
    }

    public String getText() {
        return text; // Возвращаем текущий текст
    }
}
