import java.util.Scanner;

public class sumcode {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(a + b);
        scanner.close();
    }
}
