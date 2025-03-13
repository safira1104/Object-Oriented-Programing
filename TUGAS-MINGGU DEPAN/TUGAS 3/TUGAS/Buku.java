public class Buku extends Koleksi{
    private String penulis;

    public Buku(String judul, String edisi, String penerbit, int tahun){
        super(judul, penerbit, tahun);
        this.penulis = penulis;
    }

    public Buku(String judul, String penulis) {
        this(judul, penulis, "Tidak Diketahui", 0);
    }

    public String toString() {
        return super.toString() + ", Penulis: " + penulis;
    }
}
