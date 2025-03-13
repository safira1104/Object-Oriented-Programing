public class Skripsi extends Buku {
    private String NPM;

    public Skripsi(String NPM, String penulis, String  judul, String penerbit, int tahun){
        super(judul, penulis, penerbit, tahun);
        this.NPM = NPM;
    }

    public Skripsi(String NPM, String penulis) {
        this(NPM, penulis, "Tidak Diketahui", "Tidak Diketahui", 0);
    }

    public String toString() {
        return super.toString() + ", NPM: " + NPM;
    }
}
