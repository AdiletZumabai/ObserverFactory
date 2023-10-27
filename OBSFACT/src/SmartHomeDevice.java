// Product Interface
interface SmartHomeDevice {
    void performAction();
}

// Concrete Products
class SmartLight implements SmartHomeDevice {
    @Override
    public void performAction() {
        System.out.println("Smart Light: Turning on/off the lights.");
    }
}

class SecurityCamera implements SmartHomeDevice {
    @Override
    public void performAction() {
        System.out.println("Security Camera: Monitoring the premises.");
    }
}

// Factory Interface
interface SmartHomeDeviceFactory {
    SmartHomeDevice createDevice();
}

// Concrete Factories
class LightFactory implements SmartHomeDeviceFactory {
    @Override
    public SmartHomeDevice createDevice() {
        return new SmartLight();
    }
}

class CameraFactory implements SmartHomeDeviceFactory {
    @Override
    public SmartHomeDevice createDevice() {
        return new SecurityCamera();
    }
}
