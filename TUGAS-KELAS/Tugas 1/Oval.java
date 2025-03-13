public class Oval {
    // Identifikasi atribut
    private double sumbuPendek;
    private double sumbuPanjang;

    // Method untuk mengatur nilai sumbu pendek
    public void setSumbuPendek(double sumbuPendek) {
        this.sumbuPendek = sumbuPendek;
    }

    // Method untuk mengatur nilai sumbu panjang
    public void setSumbuPanjang(double sumbuPanjang) {
        this.sumbuPanjang = sumbuPanjang;
    }

    // Method untuk mendapatkan nilai sumbu pendek
    public double getSumbuPendek() {
        return sumbuPendek;
    }

    // Method untuk mendapatkan nilai sumbu panjang
    public double getSumbuPanjang() {
        return sumbuPanjang;
    }

    // Method untuk menghitung luas oval
    public double getLuas() {
        return 3.14 * sumbuPendek * sumbuPanjang;
    }

    // Method untuk menghitung keliling oval (menggunakan pendekatan Ramanujan)
    public double getKeliling() {
        return 3.14 * (3 * (sumbuPendek + sumbuPanjang) - 
               Math.sqrt((3 * sumbuPendek + sumbuPanjang) * (sumbuPendek + 3 * sumbuPanjang)));
    }
}
