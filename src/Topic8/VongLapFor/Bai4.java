package Topic8.VongLapFor;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int tong = 0;
        for (int i = a; i <=b; i++){
            tong += i;
        }
        System.out.println(tong);
    }
}
