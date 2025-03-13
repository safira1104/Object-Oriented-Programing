public class MainLimasSegiEmpat {
    public static void main(String[] args) {

        LimasSegiEmpat[] limasArray = new LimasSegiEmpat[5];
        
        for (int i = 0; i < limasArray.length; i++) {
            double sisi = (i + 1) * 3.0; 
            double tinggi = (i + 1) * 2.0;
            limasArray[i] = new LimasSegiEmpat(sisi, tinggi);
        }

        System.out.println("Volume masing-masing Limas Segi Empat:");
        for (LimasSegiEmpat l : limasArray) {
            System.out.println("Limas dengan sisi = " + l.getSisi() + 
                               ", tinggi = " + l.getTinggi() + 
                               " memiliki volume: " + l.getVolume());
        }

        double totalVolume = 0;
        for (LimasSegiEmpat l : limasArray) {
            totalVolume += l.getVolume();
        }
        double rataRataVolume = totalVolume / limasArray.length;

        System.out.println("\nRata-rata volume Limas Segi Empat: " + rataRataVolume);
    }
}
