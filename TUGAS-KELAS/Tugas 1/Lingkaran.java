public class Lingkaran {
    //identifikasi atribut
    private double jari_jari;

    // identifikasi method

    public void setjari_jari(int jari_jari){
        // this mengacu pada atribut  pada kelas sehingga tidak bertubrukan
        this.jari_jari = jari_jari;
    }

    //mengambil nilai sisi (mengembalikan nilai sisi)
    public double getjari_jari(){
        return jari_jari;
    }

    public double getLuas(){
        double luas = 3.14*this.jari_jari*this.jari_jari;
        return luas;
        // atau langsung ketik return sisi*sisi
    }

    public double getKeliling(){
        return 3.14*2*this.jari_jari;
    }
}
