import java.util.Scanner;

public class javaone {
    public static void main(String age[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];
        //input
        for (int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }
        int x = sc.nextInt();


        //output
        for (int i = 0; i <numbers.length; i++) {
//            System.out.println(numbers[i]);
        if (numbers[i]== x){
            System.out.println("x is found " + i);
        }
        }
    }
}
