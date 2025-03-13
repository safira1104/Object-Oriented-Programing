public class Square {
    //identifikasi atribut
    private int sisi;

    // identifikasi method

    public void setSisi(int sisi){
        // this mengacu pada atribut  pada kelas sehingga tidak bertubrukan
        this.sisi = sisi;
    }

    //mengambil nilai sisi (mengembalikan nilai sisi)
    public int getSisi(){
        return sisi;
    }

    public int getLuas(){
        int luas = this.sisi*this.sisi;
        return luas;
        // atau langsung ketik return sisi*sisi
    }

    public int getKeliling(){
        return 4*this.sisi;
    }
}

