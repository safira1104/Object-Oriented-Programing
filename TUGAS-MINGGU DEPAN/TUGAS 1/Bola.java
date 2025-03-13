public class Bola {
    // Identifikasi atribut
    private double radius;
    private double volume;

    // Method untuk mengatur radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void computeandSetVolume() {
        this.volume = (4.0 / 3) * 3.14 * this.radius * this.radius * this.radius;
    }

    public double getVolume() {
        return this.volume;
     }
}
