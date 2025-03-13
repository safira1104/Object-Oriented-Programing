public class MainBalok {
    public static void main(String[] args) {
        Balok volume1 = new Balok();

        volume1.setPanjang(8);
        volume1.setLebar(9);
        volume1.setTinggi(10);
        
        volume1.computeandSetVolume();
        System.out.println("Volume Balok 1: " + volume1.getVolume());

        Balok volume2 = new Balok();
        volume2.setPanjang(2);
        volume2.setLebar(3);
        volume2.setTinggi(5);
        
        volume2.computeandSetVolume();
        System.out.println("Volume Balok 2: " + volume2.getVolume());

    }
}
