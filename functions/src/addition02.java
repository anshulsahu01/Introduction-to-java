import java.util.Scanner;

public class addition02 {
    public static void main(String[] args) {

        int ans= add2();
        System.out.println(ans);
    }
    static void add(){
        System.out.println("enter two number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int sum = a+b;
        System.out.println("the value of sum" +sum);

//        return sum ;

    }
    // return type

    static int add2(){
        System.out.println("enter two number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int sum = a+b;
//        System.out.println("the value of sum" +sum);

        return sum ;

    }

}
