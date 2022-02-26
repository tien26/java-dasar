public class MethodReturn {
    public static void main(String[] args) {
        var a = 100;
        var b = 200;
        var c = hitung(a, b);

        System.out.println(c);
    }

    static int hitung(int value1,int value2){
        var total = value1 + value2;
        return total;
    }
}
