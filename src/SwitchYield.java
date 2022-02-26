public class SwitchYield {
    public static void main(String[] args) {
        var nilai = "A";
        String outout = switch (nilai) {
            case "A":
                yield "Wow Anda Lulus Dengan Baik";
            case "B":
                yield "Wow Anda Lulus";
            default:
                yield "Nilai Anda Buruk";
        };
        System.out.println(outout);
    }
}
