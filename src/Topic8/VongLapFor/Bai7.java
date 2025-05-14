package Topic8.VongLapFor;
import java.util.Scanner;

public class Bai7  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tich = 1;
        for (int i = 1; i <= n; i++){
            tich *= i;
            System.out.println(tich);
        }
    }
}
