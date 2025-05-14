package Topic8.VongLapFor;
import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int tong = 0;
        for (int i = 0; i <= a; i++){
            if (i % 2 == 1){
                tong += i;
            }
        }
        System.out.println(tong);
    }
}
