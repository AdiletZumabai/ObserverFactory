public class SmartHomeDemo {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        SmartHeatingSystem heatingSystem = new SmartHeatingSystem();
        MobileApp mobileApp = new MobileApp();

        thermostat.addObserver(heatingSystem);
        thermostat.addObserver(mobileApp);

        thermostat.setTemperature(75);

        SmartHomeDeviceFactory lightFactory = new LightFactory();
        SmartHomeDeviceFactory cameraFactory = new CameraFactory();

        SmartHomeDevice light = lightFactory.createDevice();
        SmartHomeDevice camera = cameraFactory.createDevice();

        light.performAction();
        camera.performAction();
    }
}


