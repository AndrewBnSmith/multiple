import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //problem 4

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter integer n: ");
//        int x = scan.nextInt();
//        for(int sum = 0; x!= 0; x/=10){
//            sum += x%10;
//        }

            //problem 2

//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter integer n: ");
//        int n = scan.nextInt();
//        int sum = 0;
//        for(int i = 1; i <= n; i++){
//            if (i % 2 ==0){
//                System.out.println(i);
//                sum = sum + i;
//            }
//
//
//        }
//        System.out.println("The sum of all even numbers between 1 and " + n + " " + "is: " + sum);

//            problem 1:

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer x: ");
        int x = scan.nextInt();

        for(int i = 1; i <= x; i++){

            if (i % 3 == 0 && i % 2 !=0){

                System.out.println(i + " " + "is a multiple of 3");

            }


        }
    }
}