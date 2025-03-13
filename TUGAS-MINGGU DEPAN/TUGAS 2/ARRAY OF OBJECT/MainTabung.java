public class MainTabung {
    public static void main(String[] args) {
        Tabung[] tabungArray = new Tabung[5];

        for (int i = 0; i < tabungArray.length; i++) {
            double radius = (i + 1) * 2.0;
            double tinggi = (i + 1) * 3.0;
            tabungArray[i] = new Tabung(radius, tinggi);
        }

        System.out.println("Volume masing-masing Tabung:");
        for (Tabung t : tabungArray) {
            System.out.println("Tabung dengan radius = " + t.getRadius() +
                               ", tinggi = " + t.getTinggi() +
                               " memiliki volume: " + t.getVolume());
        }


        double totalVolume = 0;
        for (Tabung t : tabungArray) {
            totalVolume += t.getVolume();
        }
        double rataRataVolume = totalVolume / tabungArray.length;

        System.out.println("\nRata-rata volume Tabung: " + rataRataVolume);
        
    }
}
