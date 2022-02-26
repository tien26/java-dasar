public class KonversiDariPrimitif {
    public static void main(String[] args) {
        int age = 22; //Primitif
        //keobject
        Integer ageObject = age;
        // keprimitif lagi
        int ageAgain = ageObject;
        // Konversi dari object ke primitif dengan tipe berbeda
        short shotAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();

        System.out.println(ageAgain);
        System.out.println(shotAge);
        System.out.println(byteAge);
    }
}
