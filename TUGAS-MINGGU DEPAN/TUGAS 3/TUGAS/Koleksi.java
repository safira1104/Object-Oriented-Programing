public class Koleksi {
    String judul;
    String penerbit;
    int tahun;

    public Koleksi(String judul, String penerbit, int tahun) {
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    public Koleksi(String judul, String penerbit) {
        this(judul, penerbit, 0); 
    }

    public String toString() {
        return "Judul: " + judul + ", Penerbit: " + penerbit + ", Tahun: " + tahun;
    }
}