public class LampMain {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp();
        lamp1.turnOn();
        lamp1.checkStatus();

        Lamp lamp2 = new Lamp();
        lamp2.turnOff();
        lamp2.checkStatus();
    }
}
