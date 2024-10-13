package BehavioralPatterns.Command;

// TurnOnCommand.java
// Команда для включения телевизора
public class TurnOnCommand implements Command {
    private final Television television;

    public TurnOnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOn(); // Выполняем команду включения
    }
}
