public class Perulangan {
    public static void main(String[] args) {
        // Perulangan For
        for( var counter = 1; counter <= 10; counter++){
            System.out.println("Perulangan Ke-"+ counter);
        }

        // Perulangan While
        var nilai = 1;

        while (nilai <=5) {
            System.out.println("Perulangan Ke-"+ nilai);
            nilai++;
        }
        
        // Perulangan While
        var nilai1 = 1;

        do {
            System.out.println("Perulangan Ke-"+nilai1);
            nilai1++;
        } while (nilai1 <= 3);
    }
}
