

import java.util.Scanner;
public class Largest08 {
    public static void main(String[] args) {
        System.out.println("please enter 3 three number ");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;

        if (max<b){
            max= b;
        }
        if (max<c){
            max =c;
        }
        System.out.println("maximum number is ");
        System.out.println(max);





    }
}
