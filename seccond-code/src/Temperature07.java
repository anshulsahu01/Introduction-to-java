

import java.util.Scanner;

public class Temperature07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter temperature in C");
        float tempC = in.nextFloat();
        float temF = (tempC *9/5) +32;
        System.out.println(temF);
    }
}
