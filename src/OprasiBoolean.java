public class OprasiBoolean {
    public static void main(String[] args) {
        //  && || !
        var absen = 70;
        var nilai = 80;
    
        var lulusAbsen = absen >= 70;
        var lulusnilai = nilai >= 70;

        var lulus = lulusAbsen && lulusnilai;

        System.out.println(lulus);

    }

}
