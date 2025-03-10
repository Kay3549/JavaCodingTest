package programmers.모의고사1회;

import java.text.DecimalFormat;

public class test {

    public static void main(String[] args) {
        asdf(2590);
    }

    public static int asdf(int a) {
        DecimalFormat df = new DecimalFormat("#,###");

        System.out.println("원 : " + df.format(a));
        System.out.println("-10 : " + df.format(a * 0.9));
        System.out.println("-20 : " + df.format(a * 0.8));
        System.out.println("-30 : " + df.format(a * 0.7));
        System.out.println("-40 : " + df.format(a * 0.6));

        return 0;
    }
}