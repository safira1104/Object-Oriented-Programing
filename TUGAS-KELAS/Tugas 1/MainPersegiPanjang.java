public class MainPersegiPanjang {
    public static void main(String[] args) {
        PersegiPanjang kotak1 = new PersegiPanjang();
        kotak1.setPanjang(5);
        kotak1.setLebar(6);

        System.out.println("Panjang Persegi Panjang = " +kotak1.getPanjang());
        System.out.println("Lebar Persegi Panjang = " +kotak1.getLebar());
        System.out.println("Luas Persegi Panjang = " +kotak1.getLuas());
        System.out.println("Keliling Persegi Panjang = "+kotak1.getKeliling());

        PersegiPanjang kotak2 = new PersegiPanjang();
        kotak2.setPanjang(15);
        kotak2.setLebar(10);

        
        System.out.println("Panjang Persegi Panjang = " +kotak2.getPanjang());
        System.out.println("Lebar Persegi Panjang = " +kotak2.getLebar());
        System.out.println("Luas Persegi Panjang = " +kotak2.getLuas());
        System.out.println("Keliling Persegi Panjang = "+kotak2.getKeliling());
    }
}