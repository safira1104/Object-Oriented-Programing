public class Persegi {
     // Atribut
     private int sisi;

     // Constructor untuk menginisialisasi sisi
     public Persegi(int sisi) {
         this.sisi = sisi;
     }
 
     // Getter untuk mengambil nilai sisi
     public int getSisi() {
         return sisi;
     }
 
     // Menghitung luas persegi
     public int getLuas() {
         return sisi * sisi;
     }
 
     // Menghitung keliling persegi
     public int getKeliling() {
         return 4 * sisi;
     }
    
}