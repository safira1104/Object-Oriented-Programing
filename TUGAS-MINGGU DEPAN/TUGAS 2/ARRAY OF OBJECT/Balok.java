public class Balok {
    //identifikasi atribut
    private int panjang;
    private int lebar;
    private int tinggi;
    private int volume;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.computeAndSetVolume(); 
    }

    public Balok() {
        this(1, 1, 1); // Memanggil constructor pertama dengan nilai default
    }

    public void computeAndSetVolume(){
        this.volume = this.panjang*this.lebar*this.tinggi;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getTinggi() {
        return tinggi;
    }
    
    public int getVolume(){
        return this.volume;
    }
}