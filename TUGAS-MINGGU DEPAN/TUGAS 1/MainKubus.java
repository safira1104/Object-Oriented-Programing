public class MainKubus {
    public static void main(String[] args) {
        Kubus volume1 = new Kubus();

        volume1.setSisi(8);
        volume1.computeandSetVolume();
        System.out.println("Volume kubus 1: " + volume1.getVolume());

        Kubus volume2 = new Kubus();
        volume2.setSisi(10);
        volume2.computeandSetVolume();
        System.out.println("Volume kubus 2: " + volume2.getVolume());

        Kubus volume3 = new Kubus();
        volume3.setSisi(25);
        volume3.computeandSetVolume();
        System.out.println("Volume kubus 3: " + volume3.getVolume());

    }
}
