public class TurnOnCommaned implements Command {
    private Television tv;

    public TurnOnCommaned(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
