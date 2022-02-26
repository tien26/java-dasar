public class KonversiNumber {
    public static void main (String[] args){
    //    konversi data otomatis dari kecil kebesar
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        //    konversi data manual dari kecil kebesar

        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;

        System.out.println(iniShort2);
    }
}
