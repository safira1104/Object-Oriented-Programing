public class MainPersegi {
    public static void main(String[] args) {
        // Membuat objek Persegi dengan constructor
        Persegi persegi1 = new Persegi(5);
        Persegi persegi2 = new Persegi(10);

        
        System.out.println("Sisi Persegi 1: " + persegi1.getSisi());
        System.out.println("Luas Persegi 1: " + persegi1.getLuas());
        System.out.println("Keliling Persegi 1: " + persegi1.getKeliling());

  
        System.out.println("Sisi Persegi 2: " + persegi2.getSisi());
        System.out.println("Luas Persegi 2: " + persegi2.getLuas());
        System.out.println("Keliling Persegi 2: " + persegi2.getKeliling());
    }    
}
