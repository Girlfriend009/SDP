package BehavioralPatterns.Mediator;

// TemperatureSensor.java
// Сенсор температуры, который отправляет данные через посредника
public class TemperatureSensor implements Sensor {
    private final HomeMediator mediator;

    public TemperatureSensor(HomeMediator mediator) {
        this.mediator = mediator;
        mediator.registerSensor(this); // Регистрация в посреднике
    }

    @Override
    public void sendData() {
        mediator.reportData("Temperature: 22°C"); // Отправляем данные о температуре
    }
}