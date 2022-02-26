public class Break {
    public static void main(String[] args) {
        var counter = 1;
        while (true) {
            System.out.println("Perulangan ke-"+counter);
            counter++;
            if (counter > 5) {
                break;
            }
        }

        for(int nilai = 1; nilai <=10; nilai++){
            if (nilai % 2 == 0) {
                continue;
            }

            System.out.println("Perulangan Ganjil-"+nilai);
        }
    }
}
