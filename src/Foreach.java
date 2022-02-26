public class Foreach {
    public static void main(String[] args) {
        // Tanpa Foreach
        String[] data = {
            "Irfan", "Martien","Tampan",
            "dan","sangat","Baik"
        };

        for(int i =0; i<data.length; i++){
            System.out.println(data[i]);
        }

        for (var jumlah : data) {
            System.out.println(jumlah);
        }

    }
}
