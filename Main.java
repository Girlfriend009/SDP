//1)Chain
//package BehavioralPatterns.Chain;
//
//// Основной класс для тестирования цепочки обязанностей
//public class Main {
//    public static void main(String[] args) {
//        // Создаем экземпляры обработчиков
//        PaymentHandler a = new PaymentA();
//        PaymentHandler b = new PaymentB();
//        PaymentHandler c = new PaymentC();
//
//        // Настраиваем цепочку: A -> B -> C
//        a.setNext(b);
//        b.setNext(c);
//
//        // Попытка оплатить товар стоимостью 210$
//        a.handlePayment(210); // Ожидается, что будет обработано Payment B
//    }
//}


//2)BehavioralPatterns.Command
//package BehavioralPatterns.Command;
//
//// Main.java
//// Главный класс для запуска приложения
//public class Main {
//    public static void main(String[] args) {
//        Television television = new Television(); // Создаем объект телевизора
//        RemoteControl remote = new RemoteControl(); // Создаем объект пульта
//
//        // Создаем команды и связываем их с телевизором
//        BehavioralPatterns.Command turnOn = new TurnOnCommand(television);
//        BehavioralPatterns.Command turnOff = new TurnOffCommand(television);
//        BehavioralPatterns.Command volumeUp = new VolumeUpCommand(television);
//        BehavioralPatterns.Command volumeDown = new VolumeDownCommand(television);
//        BehavioralPatterns.Command nextChannel = new NextChannelCommand(television);
//        BehavioralPatterns.Command previousChannel = new PreviousChannelCommand(television);
//
//        // Используем пульт для управления телевизором
//        remote.setCommand(turnOn);
//        remote.pressButton(); // Включаем телевизор
//
//        remote.setCommand(volumeUp);
//        remote.pressButton(); // Увеличиваем громкость
//
//        remote.setCommand(turnOff);
//        remote.pressButton(); // Выключаем телевизор
//    }
//}


//3)Iterator
//package BehavioralPatterns.Iterator;
//public class Main {
//    public static void main(String[] args) {
//        // Создаем коллекцию фильмов на основе списка
//        ListMovieCollection listMovieCollection = new ListMovieCollection();
//        listMovieCollection.addMovie("Inception");
//        listMovieCollection.addMovie("Interstellar");
//
//        // Используем итератор для вывода фильмов из списка
//        Iterator<String> listIterator = listMovieCollection.createIterator();
//        System.out.println("Movies in List:");
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next()); // Выводим название фильма
//        }
//
//        // Создаем коллекцию фильмов на основе массива
//        ArrayMovieCollection arrayMovieCollection = new ArrayMovieCollection(3);
//        arrayMovieCollection.addMovie("The Matrix");
//        arrayMovieCollection.addMovie("The Godfather");
//
//        // Используем итератор для вывода фильмов из массива
//        Iterator<String> arrayIterator = arrayMovieCollection.createIterator();
//        System.out.println("Movies in Array:");
//        while (arrayIterator.hasNext()) {
//            System.out.println(arrayIterator.next()); // Выводим название фильма
//        }
//    }
//}

//4)Mediator
//package BehavioralPatterns.Mediator;
//public class Main {
//    public static void main(String[] args) {
//        HomeMediator mediator = new HomeMediatorImpl(); // Создаем посредника
//
//        // Создаем сенсоры и регистрируем их
//        Sensor tempSensor = new TemperatureSensor(mediator);
//        Sensor humiditySensor = new HumiditySensor(mediator);
//        Sensor lightSensor = new LightSensor(mediator);
//
//        // Отправляем данные от сенсоров через посредника
//        tempSensor.sendData();
//        humiditySensor.sendData();
//        lightSensor.sendData();
//
//        // Выводим отчет
//        ((HomeMediatorImpl) mediator).printReport();
//    }
//}

//5)Memento
//package BehavioralPatterns.Memento;
//
//public class Main {
//    public static void main(String[] args) {
//        TextEditor editor = new TextEditor(); // Создаем текстовый редактор
//        Caretaker caretaker = new Caretaker(); // Создаем хранителя
//
//        // Вводим текст и сохраняем состояние
//        editor.write("Hello, ");
//        caretaker.addMemento(editor.save()); // Сохраняем состояние
//
//        editor.write("world!");
//        System.out.println("Current Text: " + editor.getText()); // Печатаем текущий текст
//
//        // Восстанавливаем состояние из снимка
//        editor.restore(caretaker.getMemento(0));
//        System.out.println("Restored Text: " + editor.getText()); // Печатаем восстановленный текст
//    }
//}




