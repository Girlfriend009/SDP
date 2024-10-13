package BehavioralPatterns.Mediator;

// HomeMediator.java
// Интерфейс посредника, который определяет методы для обработки данных сенсоров
public interface HomeMediator {
    void registerSensor(Sensor sensor); // Регистрация сенсора
    void reportData(String data); // Отчет о данных от сенсоров
}
