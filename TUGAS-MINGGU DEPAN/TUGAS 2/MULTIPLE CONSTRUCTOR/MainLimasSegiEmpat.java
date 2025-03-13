public class MainLimasSegiEmpat {
    public static void main(String[] args) {

        LimasSegiEmpat limas1 = new LimasSegiEmpat();
        System.out.println("Volume limas 1 (0,0): " + limas1.getVolume());

        limas1.setSisi(6);
        limas1.setTinggi(10);
        System.out.println("Volume limas 1 (sisi 6, tinggi 10): " + limas1.getVolume());

        LimasSegiEmpat limas2 = new LimasSegiEmpat(8, 12);
        System.out.println("Volume limas2 (sisi 8, tinggi 12): " + limas2.getVolume());

    }
}
