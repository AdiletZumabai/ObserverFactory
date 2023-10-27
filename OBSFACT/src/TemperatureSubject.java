import java.util.ArrayList;
import java.util.List;
// Subject Interface
interface TemperatureSubject {
    void addObserver(TemperatureObserver observer);
    void removeObserver(TemperatureObserver observer);
    void notifyObservers(int temperature);
}

// Concrete Subject
class Thermostat implements TemperatureSubject {
    private int temperature = 70; // Initial temperature
    private List<TemperatureObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(TemperatureObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(TemperatureObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int temperature) {
        for (TemperatureObserver observer : observers) {
            observer.update(temperature);
        }
    }

    // Simulate temperature change
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers(temperature);
    }
}

// Observer Interface
interface TemperatureObserver {
    void update(int temperature);
}

// Concrete Observers
class SmartHeatingSystem implements TemperatureObserver {
    @Override
    public void update(int temperature) {
        System.out.println("Smart Heating System: Adjusting temperature to " + temperature + " degrees.");
    }
}

class MobileApp implements TemperatureObserver {
    @Override
    public void update(int temperature) {
        System.out.println("Mobile App: Displaying temperature as " + temperature + " degrees.");
    }
}
