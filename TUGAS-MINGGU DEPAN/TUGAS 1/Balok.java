public class Balok {
    //identifikasi atribut
    private int panjang;
    private int lebar;
    private int tinggi;
    private int volume;

    //  method untuk mengatur sisi
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }

    public void setLebar(int lebar){
        this.lebar = lebar;
    }

    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }

    public void computeandSetVolume(){
        this.volume = this.panjang*this.lebar*this.tinggi;
    }

    public int getVolume(){
        return this.volume;
    }
}