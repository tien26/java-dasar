public class DataNumber {

    public static void main(String[] args){
        Byte iniByte = 100;
        Short iniShort = 1000;
        Integer iniInt = 1000000;
        Long iniLong2 = 1000000L;

        float iniFloat = 10.12F;
        double iniDouble = 12.2424;

        int decimalInt = 25;
        int hexInt = 0xA132B;
        int binInt = 0b01010101;

        long balance = 1_000_000_000_000L;
        int sum = 60_000_000;

        System.out.println(iniByte);
        System.out.println(iniInt);
        System.out.println(iniShort);
        System.out.println(iniLong2);
        System.out.println(iniFloat);
        System.out.println(iniDouble);
        System.out.println(decimalInt);
        System.out.println(hexInt);
        System.out.println(binInt);
        System.out.println(balance);
        System.out.println(sum);
    }
}