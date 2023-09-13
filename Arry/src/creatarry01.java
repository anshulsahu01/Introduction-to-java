import java.util.Scanner;

public class creatarry01 {
    public static void main(String[] args) {
        int[] arr = new int[6];


        arr[0] = 23;
        arr[1] = 43;
        arr[2] = 32;
        arr[3] = 831;
        arr[4] = 232;
        arr[5] = 123;

        System.out.println(arr[0]);

//        input using for loop
        Scanner obj =new Scanner(System.in);
        for (int i =0; i<arr.length;i++){
            arr[i]= obj.nextInt();

        }
        for (int i =0; i<arr.length;i++){
            System.out.println(arr[i]+ " ");

        }
    }
}
