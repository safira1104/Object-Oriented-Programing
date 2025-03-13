public class MainTabung {
    public static void main(String[] args) {
        Tabung[] tabungArray = new Tabung[5];

        for (int i = 0; i < tabungArray.length; i++) {
            if (i == 1) {
                // Gunakan constructor default (radius = 1, tinggi = 1)
                tabungArray[i] = new Tabung();
            } else {
                // Gunakan constructor dengan parameter (radius dan tinggi dihitung berdasarkan indeks)
                double radius = (i + 1) * 2;
                double tinggi = (i + 1) * 3;
                tabungArray[i] = new Tabung(radius, tinggi);
            }
        }

        System.out.println("Volume masing-masing Tabung:");
        double totalVolume = 0;

        for (Tabung t : tabungArray) {
            System.out.println("Tabung dengan radius = " + t.getRadius() +
                               ", tinggi = " + t.getTinggi() +
                               " memiliki volume: " + t.getVolume());

            totalVolume += t.getVolume();
        }

        double rataRataVolume = totalVolume / tabungArray.length;

        System.out.println("\nRata-rata volume Tabung: " + rataRataVolume);
        
    }
}
