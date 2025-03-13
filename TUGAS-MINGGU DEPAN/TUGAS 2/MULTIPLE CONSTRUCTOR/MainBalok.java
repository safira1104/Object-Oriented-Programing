public class MainBalok {
    public static void main(String[] args) {
        
        Balok balok1 = new Balok();
        System.out.println("Volume balok 1 (0x0x0): " + balok1.getVolume());

        balok1.setPanjang(5);
        balok1.setLebar(4);
        balok1.setTinggi(3);
        System.out.println("Volume balok 1 (5, 4, 3): " + balok1.getVolume());

        Balok balok2 = new Balok(7, 6, 2);
        System.out.println("Volume balok2 (7x6x2): " + balok2.getVolume());

    }
}
