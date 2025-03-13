public class MainBola {
    public static void main(String[] args) {
        Bola volume1 = new Bola();

        volume1.setRadius(7);
        volume1.computeandSetVolume();
        System.out.println("Volume bola 1: " + volume1.getVolume());

        Bola volume2 = new Bola();
        volume2.setRadius(14);
        volume2.computeandSetVolume();
        System.out.println("Volume bola 2: " + volume2.getVolume());
    }
}
