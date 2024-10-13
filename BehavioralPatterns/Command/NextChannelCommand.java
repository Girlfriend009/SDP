package BehavioralPatterns.Command;

// NextChannelCommand.java
// Команда для переключения на следующий канал
public class NextChannelCommand implements Command {
    private final Television television;

    public NextChannelCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.nextChannel(); // Выполняем команду переключения на следующий канал
    }
}