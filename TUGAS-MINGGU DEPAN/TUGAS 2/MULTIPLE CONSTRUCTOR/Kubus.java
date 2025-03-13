public class Kubus {

    //identifikasi atribut
    private int sisi;
    private int volume;

    public Kubus() {
        this.sisi = 0;
        this.volume = 0;
    }

    public Kubus(int sisi) {
        this.sisi = sisi;
        this.computeAndSetVolume(); 
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
        this.computeAndSetVolume(); 
    }

    public void computeAndSetVolume() {
        this.volume = this.sisi * this.sisi * this.sisi;
    }

    public int getVolume() {
        return this.volume;
    }

}