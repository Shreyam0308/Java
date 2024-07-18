import java.util.Scanner;

class add{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter a numbers :- ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum;
        sum = num1 + num2;
        System.err.println(name + " your Sum is " + sum);
        sc.close();
    }
}