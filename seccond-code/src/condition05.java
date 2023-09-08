

import java.util.Scanner;
public class condition05 {
    public static void main(String[] args) {
        System.out.println("conditions");
//        int a = 10;
//        if( a==10){
//            System.out.println("aja");
//        }
//        else{
//            System.out.println("ni a");
//        }

//        for(int i =0; i<= 10; i+=2){
//            System.out.println(i);
//        }
//        print number form 1 to n
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        for(int i =0; i<= n; i+=2){
            System.out.println(i +" ");
        }
    }
}
