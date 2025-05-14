package Topic9.VongLapWhile;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int giaithua = 1;
        int i = 0;
        while ( i < n ){
            i++;
            giaithua *= i;
        }
        System.out.println(giaithua);
    }
}
