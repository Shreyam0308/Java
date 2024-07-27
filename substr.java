import java.util.Scanner;

public class substr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sub = s.substring(3,7);
        System.out.println("Sub string = " + sub);
    }
}
