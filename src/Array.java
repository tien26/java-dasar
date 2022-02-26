public class Array {
    public static void main(String[] args) {
        // membuat array
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Irfan";
        arrayString[1] = "dan";
        arrayString[2] = "Martien";

        System.out.println(arrayString[0]+" "+arrayString[1]+" "+arrayString[2]);
        
        // array Initializer
        int[] arrayInt = new int[]{
            10, 1, 21, 22, 32
        };

        long[] arrayLong = {
            10, 1, 21, 22, 32
        };

        System.out.println(arrayInt[0]);
        System.out.println(arrayLong[4]);

        // Oprasi Array
        long[] oprasiArray = {
            10, 1, 21, 22, 32
        };

        oprasiArray[0] = 200;

        System.out.println(oprasiArray[0]);
        System.out.println(oprasiArray[1]);
        // menghitung jumlah array
        System.out.println(oprasiArray.length);

        // array didalam array
        String[][] nama = {
            {"irfan","martien"},
            {"seyna","oktavia"},
            {"lira","iryanti"}
        };

        String[] nama1 = nama[0];
        System.out.println(nama1[1]);

        System.out.println(nama[1][0]);
        System.out.println(nama[2][1]);
    }
}
