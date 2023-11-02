public class Lamp {
    boolean state = false;

    public void turnOn()
    {
        state = true;
    }

    public void turnOff()
    {
        state = false;
    }

    public void checkStatus()
    {
        System.out.println(state ? "The lamp is on" : "The lamp is off");
    }
}
