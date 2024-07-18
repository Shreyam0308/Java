import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three numbers :- ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("Max num is " + num1);
        }
        if(num2>num3 && num2>num1){
            System.out.println("Max num is " + num2);
        }
        if(num3>num1 && num3>num2){
            System.out.println("Max num is " + num3);
        }
    }
}
