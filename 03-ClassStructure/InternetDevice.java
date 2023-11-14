public class InternetDevice {
    String name;
    boolean connected;
    static int connectedDevices = 0;

    InternetDevice(String name)
    {
        this.name = name;
    }

    void connect()
    {
        this.connected = true;
        connectedDevices++;
    }

    void disconnect()
    {
        this.connected = false;
        connectedDevices--;
    }

    public boolean isConnected() {
        return connected;
    }

    static int displayConnections()
    {
        return connectedDevices;
    }

    public static void main(String[] args) {
        InternetDevice id1 = new InternetDevice("phone");
        InternetDevice id2 = new InternetDevice("PC");
        InternetDevice id3 = new InternetDevice("laptop");
        InternetDevice id4 = new InternetDevice("TV");
        InternetDevice id5 = new InternetDevice("microwave");

        id1.connect();
        id2.connect();
        id5.connect();
        id1.disconnect();

        System.out.println(InternetDevice.displayConnections());
        System.out.println(id5.isConnected());
    }
}
