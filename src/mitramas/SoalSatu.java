package mitramas;

public class SoalSatu {
    public static void main(String[] args) {
        char[]ch = {'S','L','N'};

        for(int i=0; i<3; i++) {
            char temp1 = ch[1];
            ch[1] = ch[2];
            ch[2] = temp1;
            char temp2 = ch[0];
            ch[0] = ch[1];
            ch[1] = temp2;
        }
        System.out.println(ch);

    }
}
