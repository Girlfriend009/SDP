package BehavioralPatterns.Command;

// RemoteControl.java
// Класс пульта дистанционного управления
public class RemoteControl {
    private Command command; // Переменная для хранения команды

    public void setCommand(Command command) {
        this.command = command; // Устанавливаем команду
    }

    public void pressButton() {
        command.execute(); // Выполняем команду при нажатии кнопки
    }
}
