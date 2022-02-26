public class VariableArgument {
    // Tanpa Variable Argument
    public static void main(String[] args) {
        sayCongrats("irfan", 70,70,75,80);
    }
    // Harus pake variable argument (int...) jika tidak akan error
    static void sayCongrats(String name, int... values){
        int total = 0;
        for (var value : values){
            total += value;
        }
        int finalvalue = total/values.length;

        if (finalvalue >= 75) {
            System.out.println("Selamat "+ name + ", Anda Lulus Dengan Nilai "+finalvalue);
        }else{
            System.out.println("Maaf "+ name + ", Anda Tidak Lulus Dengan Nilai "+finalvalue);
        }

    }
}
