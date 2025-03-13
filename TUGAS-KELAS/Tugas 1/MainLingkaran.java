public class MainLingkaran {
        public static void main(String[] args) {
            Lingkaran lingkaran1 = new Lingkaran();
            lingkaran1.setjari_jari(7);
    
            System.out.println("jari jari lingkaran = " +lingkaran1.getjari_jari());
            System.out.println("Luas Persegi Panjang = " +lingkaran1.getLuas());
            System.out.println("Keliling Persegi Panjang = "+lingkaran1.getKeliling());
    
            Lingkaran lingkaran2 = new Lingkaran();
            lingkaran2.setjari_jari(14);
    
            System.out.println("jari jari lingkaran = " +lingkaran2.getjari_jari());
            System.out.println("Luas Persegi Panjang = " +lingkaran2.getLuas());
            System.out.println("Keliling Persegi Panjang = "+lingkaran2.getKeliling());
        }
}
