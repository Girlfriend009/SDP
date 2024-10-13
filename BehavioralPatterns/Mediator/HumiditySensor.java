package BehavioralPatterns.Mediator;

// HumiditySensor.java
// Сенсор влажности, который отправляет данные через посредника
public class HumiditySensor implements Sensor {
    private final HomeMediator mediator;

    public HumiditySensor(HomeMediator mediator) {
        this.mediator = mediator;
        mediator.registerSensor(this); // Регистрация в посреднике
    }

    @Override
    public void sendData() {
        mediator.reportData("Humidity: 60%"); // Отправляем данные о влажности
    }
}
