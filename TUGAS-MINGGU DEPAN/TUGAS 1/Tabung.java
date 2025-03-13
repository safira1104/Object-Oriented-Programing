public class Tabung {
    //identifikasi atribut
    private double radius;
    private double tinggi;
    private double volume;

    //  method untuk mengatur sisi
    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public void computeandSetVolume(){
        this.volume = 3.14*this.radius*this.radius*this.tinggi;
    }

    public double getVolume(){
        return this.volume;
    }
}
