public class Majalah extends Koleksi {
    private String edisi;

    public Majalah(String judul, String edisi, String penerbit, int tahun) {
        super(judul, penerbit, tahun);
        this.edisi = edisi;
    }

    public Majalah(String judul, String edisi) {
        this(judul, edisi, "Tidak Diketahui", 0);
    }

    public String toString() {
        return super.toString() + ", Edisi: " + edisi;
    }
}
