public class MainLimasSegiEmpat {
    public static void main(String[] args) {
        LimasSegiEmpat volume1 = new LimasSegiEmpat();

        volume1.setSisi(9);
        volume1.setTinggi(10);
        
        volume1.computeandSetVolume();
        System.out.println("Volume Limas Segiempat 1: " + volume1.getVolume());

        LimasSegiEmpat volume2 = new LimasSegiEmpat();
        volume2.setSisi(12);
        volume2.setTinggi(10);
        
        volume2.computeandSetVolume();
        System.out.println("Volume Limas Segiempat 2: " + volume2.getVolume());

    }
}
