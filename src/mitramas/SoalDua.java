package mitramas;

public class SoalDua {

    public static void main(String[] args) {

        int a=5, f=3;
        for(;;) {
            if((a+=f+1)>8)
                break;
            else
                f = a%(f+1);
        }
        System.out.println(f*a);
    }
}
