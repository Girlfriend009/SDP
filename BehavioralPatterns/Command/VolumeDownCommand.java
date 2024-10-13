package BehavioralPatterns.Command;

// VolumeDownCommand.java
// Команда для уменьшения громкости
public class VolumeDownCommand implements Command {
    private final Television television;

    public VolumeDownCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.volumeDown(); // Выполняем команду уменьшения громкости
    }
}