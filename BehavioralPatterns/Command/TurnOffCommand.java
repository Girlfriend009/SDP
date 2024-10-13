package BehavioralPatterns.Command;

// TurnOffCommand.java
// Команда для выключения телевизора
public class TurnOffCommand implements Command {
    private final Television television;

    public TurnOffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOff(); // Выполняем команду выключения
    }
}