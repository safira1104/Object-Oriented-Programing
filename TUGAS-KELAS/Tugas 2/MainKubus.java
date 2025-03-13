public class MainKubus {
    public static void main(String[] args) {
        Kubus volume1 = new Kubus(8);
        Kubus volume2 = new Kubus(10);
        Kubus volume3 = new Kubus(25);

        System.out.println("Sisi kubus 1: " + volume1.getSisi());
        System.out.println("Volume kubus 1: " + volume1.getVolume());

        
        System.out.println("Sisi kubus 2: " + volume2.getSisi());
        System.out.println("Volume kubus 2: " + volume2.getVolume());

        System.out.println("Sisi kubus 3: " + volume3.getSisi());
        System.out.println("Volume kubus 3: " + volume3.getVolume());

    }
}
