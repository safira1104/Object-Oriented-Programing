public class LimasSegiEmpat {
    //identifikasi atribut
    private double sisi;
    private double tinggi;
    private double volume;

    //  method untuk mengatur sisi
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public void computeandSetVolume(){
        this.volume = (1.0/3)*this.sisi*this.sisi*this.tinggi;
    }

    public double getVolume(){
        return this.volume;
    }
}
