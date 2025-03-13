public class Balok {
    //identifikasi atribut
    private int panjang;
    private int lebar;
    private int tinggi;
    private int volume;

    public Balok() {
        this.panjang = 0;
        this.lebar = 0;
        this.tinggi = 0;
        this.volume = 0;
    }

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.computeAndSetVolume(); 
    }


    public void setPanjang(int panjang){
        this.panjang = panjang;
        this.computeAndSetVolume(); 
    }

    public void setLebar(int lebar){
        this.lebar = lebar;
        this.computeAndSetVolume();
    }

    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
        this.computeAndSetVolume();
    }

    public void computeAndSetVolume(){
        this.volume = this.panjang*this.lebar*this.tinggi;
    }

    public int getVolume(){
        return this.volume;
    }
}