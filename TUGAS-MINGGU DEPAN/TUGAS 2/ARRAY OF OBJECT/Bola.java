public class Bola {
    // Identifikasi atribut
    private double radius;
    private double volume;

    public Bola(double radius) {
        this.radius = radius;
        this.computeAndSetVolume();
    }

    public void computeAndSetVolume() {
        this.volume = (4.0 / 3) * 3.14 * this.radius * this.radius * this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getVolume() {
        return this.volume;
     }
}
