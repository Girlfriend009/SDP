package BehavioralPatterns.Command;

// Television.java
// Класс телевизора, который выполняет действия
public class Television {
    public void turnOn() {
        System.out.println("Television is turned ON.");
    }

    public void turnOff() {
        System.out.println("Television is turned OFF.");
    }

    public void volumeUp() {
        System.out.println("Volume is increased.");
    }

    public void volumeDown() {
        System.out.println("Volume is decreased.");
    }

    public void nextChannel() {
        System.out.println("Switched to the next channel.");
    }

    public void previousChannel() {
        System.out.println("Switched to the previous channel.");
    }
}
