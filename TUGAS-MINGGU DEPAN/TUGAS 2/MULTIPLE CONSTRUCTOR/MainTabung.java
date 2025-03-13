public class MainTabung {
    public static void main(String[] args) {

        Tabung tabung1 = new Tabung();
        System.out.println("Volume tabung 1 (default): " + tabung1.getVolume());

        tabung1.setRadius(7);
        tabung1.setTinggi(10);
        System.out.println("Volume tabung 1 (radius 7, tinggi 10): " + tabung1.getVolume());

        Tabung tabung2 = new Tabung(5, 12);
        System.out.println("Volume tabung2 (radius 5, tinggi 12): " + tabung2.getVolume());

    }
}
