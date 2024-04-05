package sample;

public class ForSample {

    public static void main(String[] args) {
        for(int i = 1 ; i <= 20 ; i++) {
            if (i % 2 != 0 ) {
                continue ;
            }else if (i == 16) {
                break;
            }
            System.out.println(i);
        }

    }

}
