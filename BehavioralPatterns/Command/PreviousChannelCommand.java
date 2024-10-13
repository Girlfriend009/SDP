package BehavioralPatterns.Command;

// PreviousChannelCommand.java
// Команда для переключения на предыдущий канал
public class PreviousChannelCommand implements Command {
    private final Television television;

    public PreviousChannelCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.previousChannel(); // Выполняем команду переключения на предыдущий канал
    }
}
