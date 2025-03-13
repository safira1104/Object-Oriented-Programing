public class MainKubus {
    public static void main(String[] args) {

        Kubus[] volume = new Kubus[5];

        for (int i = 0; i < volume.length; i++) {
            int sisi = (i + 1) * 2; 
            volume[i] = new Kubus(sisi);
        }

        int totalVolume = 0;
        int index = 1;
        for (Kubus k : volume) {
            System.out.println("Kubus ke-" + index + " (Sisi: " + (index * 2) + ") -> Volume: " + k.getVolume());
            totalVolume += k.getVolume();
            index++;
        }

        double rataRataVolume = (double) totalVolume / volume.length;
        System.out.println("Rata-rata volume Kubus: " + rataRataVolume);


    }
}
