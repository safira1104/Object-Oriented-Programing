
public class PersegiPanjang {
    private int panjang, lebar;

    // identifikasi method

    public void setPanjang(int panjang){
        // this mengacu pada atribut  pada kelas sehingga tidak bertubrukan
        this.panjang = panjang;
    }

    public void setLebar(int lebar){
        // this mengacu pada atribut  pada kelas sehingga tidak bertubrukan
        this.lebar = lebar;
    }

    //mengambil nilai sisi (mengembalikan nilai sisi)
    public int getPanjang(){
        return panjang;
    }

    public int getLebar(){
        return lebar;
    }

    public int getLuas(){
        int luas = this.panjang*this.lebar;
        return luas;
    }

    public int getKeliling(){
        return 2*(this.panjang+this.lebar);
    }
}
