public class PreviusChannelCommand implements Command {
    private Television tv;

    public PreviusChannelCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.previousChannel();
    }
}
