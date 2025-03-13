public class MainLimasSegiEmpat {
    public static void main(String[] args) {

        LimasSegiEmpat[] limasArray = new LimasSegiEmpat[5];
        
        for (int i = 0; i < limasArray.length; i++) {
            if (i == 1) {
                limasArray[i] = new LimasSegiEmpat(); // Constructor default (sisi=1, tinggi=1)
            } else {
                double sisi = (i + 2) * 2;
                double tinggi = (i + 3) * 3;
                limasArray[i] = new LimasSegiEmpat(sisi, tinggi); // Constructor dengan parameter
            }
        }

        System.out.println("Volume masing-masing Limas Segi Empat:");
        double totalVolume = 0;
        for (LimasSegiEmpat l : limasArray) {
            System.out.println("Limas dengan sisi = " + l.getSisi() + 
                               ", tinggi = " + l.getTinggi() + 
                               " memiliki volume: " + l.getVolume());
            totalVolume += l.getVolume();
        }

        double rataRataVolume = totalVolume / limasArray.length;

        System.out.println("\nRata-rata volume Limas Segi Empat: " + rataRataVolume);
    }
}
