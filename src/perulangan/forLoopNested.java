package perulangan;

public class forLoopNested {

    public static void main(String[] args) {
        //this is for nested
        int a = 5;
        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
