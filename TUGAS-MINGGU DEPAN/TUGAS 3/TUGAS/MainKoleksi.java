public class MainKoleksi {
    public static void main(String[] args) {
        // Membuat objek Buku
        Buku buku1 = new Buku("Pemrograman Java", "James Gosling", "Erlangga", 2020);
        Buku buku2 = new Buku("Struktur Data", "Adi Nugroho");

        // Membuat objek Majalah
        Majalah majalah1 = new Majalah("National Geographic", "Edisi Januari", "Gramedia", 2023);
        Majalah majalah2 = new Majalah("Time Magazine", "Edisi Februari", "Time Inc.", 2024);

        // Membuat objek Skripsi
        Skripsi skripsi1 = new Skripsi("2101234567", "Budi Santoso", "Analisis Data", "UI Press", 2023);
        Skripsi skripsi2 = new Skripsi("2107654321", "Siti Aisyah");

        // Menampilkan data koleksi
        System.out.println(buku1);
        System.out.println(buku2);
        System.out.println(majalah1);
        System.out.println(majalah2);
        System.out.println(skripsi1);
        System.out.println(skripsi2);
    }
}
