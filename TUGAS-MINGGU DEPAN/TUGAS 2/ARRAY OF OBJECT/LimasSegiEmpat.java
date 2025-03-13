public class LimasSegiEmpat {
    //identifikasi atribut
    private double sisi;
    private double tinggi;
    private double volume;

    public LimasSegiEmpat() {
        this(1, 1); // Memanggil constructor utama dengan nilai default
    }

    public LimasSegiEmpat(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
        this.computeandSetVolume(); 
    }

    public void computeandSetVolume(){
        this.volume = (1.0/3)*this.sisi*this.sisi*this.tinggi;
    }

    public double getSisi() {
        return sisi;
    }

    public double getTinggi() {
        return tinggi;
    }
    
    public double getVolume(){
        return this.volume;
    }
}
