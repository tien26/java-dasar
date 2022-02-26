public class MethodOverloading {
    public static void main(String[] args) {
        sayhello();
        sayhello("Irfan");
        sayhello("Irfan","Martien");
    }
    // jika ingin membuat method dengan nama yang sama isi methos / parameter /jml parameter harus berbeda
    static void sayhello(){
        System.out.println("Hello");
    }
    static void sayhello(String firstName){
        System.out.println("Hello "+firstName);
    }
    static void sayhello(String firstName, String lastName){
        System.out.println("Hello "+firstName+" "+lastName);
    }
}
