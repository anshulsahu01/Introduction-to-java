import java.util.Scanner;

public class Break10 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int day = obj.nextInt();
//        String fruit = obj.nextLine();
//        System.out.println(fruit);

//        switch (fruit) {
//            case "mango" -> System.out.println("king of fruit");
//            case "apple" -> System.out.println("healthy");
//            case "orang" -> System.out.println("nagpur");
//            default -> System.out.println("please enter a vaild fruit");
//
//        }
        switch (day){
            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("tuesday");
                break;

            case 3:
                System.out.println("wednesday");
                break;

            case 4:
                System.out.println("thursday");
                break;

            case 5:
                System.out.println("friday");
                break;

            case 6:
                System.out.println("saturday");
                break;

            case 7:
                System.out.println("sunday");
                break;


            default:
                System.out.println("enter a valid number");
        }



    }
}
