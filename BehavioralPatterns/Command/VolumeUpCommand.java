package BehavioralPatterns.Command;

// VolumeUpCommand.java
// Команда для увеличения громкости
public class VolumeUpCommand implements Command {
    private final Television television;

    public VolumeUpCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.volumeUp(); // Выполняем команду увеличения громкости
    }
}

