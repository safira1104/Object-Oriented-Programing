public class LimasSegiEmpat {
    //identifikasi atribut
    private double sisi;
    private double tinggi;
    private double volume;

    public LimasSegiEmpat() {
        this.sisi = 0;
        this.tinggi = 0;
        this.volume = 0;
    }

    public LimasSegiEmpat(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
        this.computeandSetVolume(); // Hitung volume otomatis
    }

    //  method untuk mengatur sisi
    public void setSisi(double sisi){
        this.sisi = sisi;
        this.computeandSetVolume();
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
        this.computeandSetVolume();
    }

    public void computeandSetVolume(){
        this.volume = (1.0/3)*this.sisi*this.sisi*this.tinggi;
    }

    public double getVolume(){
        return this.volume;
    }
}
