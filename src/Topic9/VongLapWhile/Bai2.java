package Topic9.VongLapWhile;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = a;
        while (i >= a & i <= b) {
            i++;
            if (i % 3 ==0 & i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}
