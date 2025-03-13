public class MainBola {
    public static void main(String[] args) {
        
        Bola[] bolaArray = new Bola[5];

        for (int i = 0; i < bolaArray.length; i++) {
            if (i == 1) {
                bolaArray[i] = new Bola(); // Constructor default (radius = 1)
            } else {
                double radius = (i + 2) * 2;
                bolaArray[i] = new Bola(radius); // Constructor dengan parameter
            }
        }

        System.out.println("Volume masing-masing Bola:");
        double totalVolume = 0;
        for (Bola b : bolaArray) {
            System.out.println("Bola dengan radius = " + b.getRadius() +
                               " memiliki volume: " + b.getVolume());
            totalVolume += b.getVolume();
        }

        double rataRataVolume = totalVolume / bolaArray.length;

        System.out.println("\nRata-rata volume Bola: " + rataRataVolume);

    }
}
