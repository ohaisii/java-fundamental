package mitramas;

public class SoalTiga {

    static boolean sayHello() {
        System.out.println("true");
        return true;
    }

    public static void main(String[] args) {

        if(sayHello()) {
            System.out.println(sayHello());
        }
    }
}
