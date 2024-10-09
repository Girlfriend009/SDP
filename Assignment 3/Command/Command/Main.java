public class Main {
    public static void main(String[] args) {
        Television tv = new Television();

        Command turnOn = new TurnOnCommaned(tv);
        Command turnOff = new TurnOffCommand(tv);
        Command volumeUp = new VolumeUpCommand(tv);
        Command volumeDown = new VolumeDownCommand(tv);
        Command nextChannel = new NextChannelCommand(tv);
        Command previousChannel = new PreviusChannelCommand(tv);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(0, turnOn);
        remote.setCommand(1, turnOff);
        remote.setCommand(2, volumeUp);
        remote.setCommand(3, volumeDown);
        remote.setCommand(4, nextChannel);
        remote.setCommand(5, previousChannel);

        remote.pressButton(0);
        remote.pressButton(2);
        remote.pressButton(4);
        remote.pressButton(1);
    }
}