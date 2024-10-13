package BehavioralPatterns.Mediator;

// HomeMediatorImpl.java
// Реализация посредника, который обрабатывает данные от сенсоров
import java.util.ArrayList;
import java.util.List;

public class HomeMediatorImpl implements HomeMediator {
    private final List<Sensor> sensors = new ArrayList<>(); // Список зарегистрированных сенсоров

    @Override
    public void registerSensor(Sensor sensor) {
        sensors.add(sensor); // Регистрация сенсора
    }

    @Override
    public void reportData(String data) {
        System.out.println("Report received: " + data); // Отчет о данных
    }

    public void printReport() {
        // Метод для вывода отчета
        System.out.println("Generating report from registered sensors.");
    }
}

