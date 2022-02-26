public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Selamat Nilai Anda Sangat Baik");
                break;
            case "B":
                System.out.println("Selamat Nilai Anda Baik");
                break;
            case "C":
                System.out.println("Selamat Nilai Anda Kurang Baik");
                break;
        
            default:
                System.out.println("Nilai Anda Buruk");
        }

        // Switch Lambda
        switch (nilai) {
            case "A" ->System.out.println("Nilai Anda Sangat Baik Sekali");
            case "B" ->System.out.println("Nilai Anda Baik");
        
            default-> {
                System.out.println("Nilai Anda Buruk Sekali");
            }
        }

    }
}
