public class MainKubus {
    public static void main(String[] args) {

        Kubus volume1  = new Kubus();
        System.out.println("Volume kubus 1 (default): " + volume1.getVolume());

        volume1.setSisi(3);
        System.out.println("Volume kubus 1 (sisi 3): " + volume1.getVolume());

        Kubus volume2 = new Kubus(4);
        System.out.println("Volume kubus 2 (sisi 4): " + volume2.getVolume());

    }
}
