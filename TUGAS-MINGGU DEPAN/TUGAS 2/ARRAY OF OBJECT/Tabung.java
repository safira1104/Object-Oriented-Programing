public class Tabung {
    //identifikasi atribut
    private double radius;
    private double tinggi;
    private double volume;

    public Tabung() {
        this.radius = 1;
        this.tinggi = 1;
        computeAndSetVolume();
    }
    
    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
        this.computeAndSetVolume(); 
    }

    public void computeAndSetVolume(){
        this.volume = 3.14*this.radius*this.radius*this.tinggi;
    }

    public double getRadius() {
        return radius;
    }

    public double getTinggi() {
        return tinggi;
    }
    
    public double getVolume(){
        return this.volume;
    }
}
