public class Tabung {
    //identifikasi atribut
    private double radius;
    private double tinggi;
    private double volume;

    public Tabung() {
        this.radius = 0;
        this.tinggi = 0;
        this.volume = 0;
    }

    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
        this.computeAndSetVolume(); 
    }

    //  method untuk mengatur sisi
    public void setRadius(double radius){
        this.radius = radius;
        this.computeAndSetVolume();
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
        this.computeAndSetVolume();
    }

    public void computeAndSetVolume(){
        this.volume = 3.14*this.radius*this.radius*this.tinggi;
    }

    public double getVolume(){
        return this.volume;
    }
}
