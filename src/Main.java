

import java.util.Scanner;
public class Main {
public static int printMyName(int a,int b){
    int sum = a+b;
//    System.out.println(sum);
    return sum;
}


    public static void main(String[] args) {
//        System.out.println("Hello world !");
//        for(int counter = 0; counter < 11; counter++){
//            System.out.println(counter  + " ");
//    int i = 0;
//    while (i<11){
//        System.out.println(i);
//        i++;
//
//
//    }
//     int i = 0;
//     do {
//         System.out.println(i);
//         i++;
//     }while (i<11);
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        int sum = 0;
//        for(int n = 1; n<11;n++){
//            System.out.println("2 * "+ n + "=");
//            System.out.println(n*i);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=printMyName( a,  b);
        System.out.println(sum);

    }


    }


