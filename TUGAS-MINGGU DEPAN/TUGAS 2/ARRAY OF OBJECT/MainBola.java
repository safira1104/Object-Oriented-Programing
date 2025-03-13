public class MainBola {
    public static void main(String[] args) {
        
        Bola[] bolaArray = new Bola[5];

        for (int i = 0; i < bolaArray.length; i++) {
            double radius = (i + 1) * 2.0;
            bolaArray[i] = new Bola(radius);
        }

        System.out.println("Volume masing-masing Bola:");
        for (Bola b : bolaArray) {
            System.out.println("Bola dengan radius = " + b.getRadius() +
                               " memiliki volume: " + b.getVolume());
        }

        double totalVolume = 0;
        for (Bola b : bolaArray) {
            totalVolume += b.getVolume();
        }
        double rataRataVolume = totalVolume / bolaArray.length;

        System.out.println("\nRata-rata volume Bola: " + rataRataVolume);

    }
}
