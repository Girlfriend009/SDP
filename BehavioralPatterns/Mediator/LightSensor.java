package BehavioralPatterns.Mediator;

// LightSensor.java
// Сенсор освещенности, который отправляет данные через посредника
public class LightSensor implements Sensor {
    private final HomeMediator mediator;

    public LightSensor(HomeMediator mediator) {
        this.mediator = mediator;
        mediator.registerSensor(this); // Регистрация в посреднике
    }

    @Override
    public void sendData() {
        mediator.reportData("Light: 300 Lux"); // Отправляем данные об освещенности
    }
}
