public class MainBola {
    public static void main(String[] args) {
        
        Bola bola1 = new Bola();
        System.out.println("Volume bola 1 (default): " + bola1.getVolume());

        bola1.setRadius(7);
        System.out.println("Volume bola 1 (radius 7) : " + bola1.getVolume());

        Bola bola2 = new Bola(10);
        System.out.println("Volume bola2 (radius 10): " + bola2.getVolume());
    }
}
