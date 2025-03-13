public class MainOval {
    public static void main(String[] args) {
        Oval oval1 = new Oval();
        oval1.setSumbuPanjang(10);
        oval1.setSumbuPendek(5);

        System.out.println("Sumbu Panjang Oval = " + oval1.getSumbuPanjang());
        System.out.println("Sumbu Pendek Oval = " + oval1.getSumbuPendek());
        System.out.println("Luas Oval = " + oval1.getLuas());
        System.out.println("Keliling Oval = " + oval1.getKeliling());

        Oval oval2 = new Oval();
        oval2.setSumbuPanjang(8);
        oval2.setSumbuPendek(4);

        System.out.println("\nSumbu Panjang Oval = " + oval2.getSumbuPanjang());
        System.out.println("Sumbu Pendek Oval = " + oval2.getSumbuPendek());
        System.out.println("Luas Oval = " + oval2.getLuas());
        System.out.println("Keliling Oval = " + oval2.getKeliling());

        Oval oval3 = new Oval();
        oval3.setSumbuPanjang(15);
        oval3.setSumbuPendek(7);

        System.out.println("\nSumbu Panjang Oval = " + oval3.getSumbuPanjang());
        System.out.println("Sumbu Pendek Oval = " + oval3.getSumbuPendek());
        System.out.println("Luas Oval = " + oval3.getLuas());
        System.out.println("Keliling Oval = " + oval3.getKeliling());

        Oval oval4 = new Oval();
        oval4.setSumbuPanjang(6);
        oval4.setSumbuPendek(3);

        System.out.println("\nSumbu Panjang Oval = " + oval4.getSumbuPanjang());
        System.out.println("Sumbu Pendek Oval = " + oval4.getSumbuPendek());
        System.out.println("Luas Oval = " + oval4.getLuas());
        System.out.println("Keliling Oval = " + oval4.getKeliling());
    }
}
