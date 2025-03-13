public class MainTabung {
    public static void main(String[] args) {
        Tabung volume1 = new Tabung();

        volume1.setRadius(7);
        volume1.setTinggi(10);
        
        volume1.computeandSetVolume();
        System.out.println("Volume tabung 1: " + volume1.getVolume());

        Tabung volume2 = new Tabung();
        volume2.setRadius(14);
        volume2.setTinggi(10);
        
        volume2.computeandSetVolume();
        System.out.println("Volume tabung 2: " + volume2.getVolume());

    }
}
