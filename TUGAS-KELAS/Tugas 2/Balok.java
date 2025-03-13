public class Balok {
    //identifikasi atribut
    private int panjang;
    private int lebar;
    private int tinggi;
    
    public Balok (int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    //  method untuk mengatur sisi
    public int getPanjang(){
        return panjang;
    }

    public int getLebar(){
        return lebar;
    }

    public int getTinggi(){
        return tinggi;
    }

    public int getVolume(){
        return panjang*lebar*tinggi;
    }
}