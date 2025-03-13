public class MainBalok {
    public static void main(String[] args) {
        
        Balok[] balokArray = new Balok[5];

        for (int i = 0; i < balokArray.length; i++) {
            if (i == 1) {
                balokArray[i] = new Balok(); // Constructor default (p = 1, l = 1, t = 1)
            } else {
                int panjang = (i + 1) * 2;
                int lebar = (i + 2) * 2;
                int tinggi = (i + 3) * 2;
                balokArray[i] = new Balok(panjang, lebar, tinggi); // Constructor dengan parameter
            }
        }

        System.out.println("Volume masing-masing Balok:");
        int totalVolume = 0;
        for (Balok b : balokArray) {
            System.out.println("Balok (P: " + b.getPanjang() + ", L: " + b.getLebar() + ", T: " + b.getTinggi() + ") -> Volume: " + b.getVolume());
            totalVolume += b.getVolume();
        }
        
        double rataRataVolume = (double) totalVolume / balokArray.length;

        System.out.println("\nRata-rata volume Balok: " + rataRataVolume);
    }
}
