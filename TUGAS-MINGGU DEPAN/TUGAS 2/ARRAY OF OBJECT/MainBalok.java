public class MainBalok {
    public static void main(String[] args) {
        
        Balok[] balokArray = new Balok[5];

        for (int i = 0; i < balokArray.length; i++) {
            int panjang = (i + 2) * 3; 
            int lebar = (i + 2) * 2;  
            int tinggi = (i + 2);  
            balokArray[i] = new Balok(panjang, lebar, tinggi);
        }

        System.out.println("Volume masing-masing Balok:");
        for (Balok b : balokArray) {
            System.out.println("Balok dengan (P x L x T) = (" + b.getPanjang() + " x " + b.getLebar() + " x " + b.getTinggi() + 
                               ") memiliki volume: " + b.getVolume());
        }

        int totalVolume = 0;
        for (Balok b : balokArray) {
            totalVolume += b.getVolume();
        }
        double rataRataVolume = (double) totalVolume / balokArray.length;

        System.out.println("\nRata-rata volume Balok: " + rataRataVolume);
    }
}
