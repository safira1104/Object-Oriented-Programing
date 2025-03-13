public class Kubus {

    //identifikasi atribut
    private int sisi;
    
    public Kubus (int sisi) {
        this.sisi = sisi;
    }
    
    public int getSisi(){
        return sisi;
    }

    public int getVolume(){
        return sisi*sisi*sisi;
    }
}