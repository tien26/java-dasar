public class IfStatement {
    public static void main(String[] args) {
        var nilai = 80;
        var absen = 90;

        if (nilai >= 70 && absen>= 75) {
            System.out.println("Selamat Anda Lulus");
        }else{
            System.out.println("Maaf Anda Gagal");
        }

        if (nilai >= 90 && absen > 90) {
            System.out.println("A");
        }else if (nilai >= 70 && absen >= 70) {
            System.out.println("B");
        }else{
            System.out.println('C');
        }
    }
}
