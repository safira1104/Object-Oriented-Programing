public class Kubus {

    //identifikasi atribut
    private int sisi;
    private int volume;

    //  method untuk mengatur sisi
    public void setSisi(int sisiBaru){
        this.sisi = sisiBaru;
    }

    public void computeandSetVolume(){
        this.volume = this.sisi*this.sisi*this.sisi;
    }

    public int getVolume(){
        return this.volume;
    }
}