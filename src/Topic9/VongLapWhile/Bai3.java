package Topic9.VongLapWhile;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tong = 0;
        int i = 0;
        while ( i <= n ){
            i++;
            if ( i % 2 == 1){
                tong += i;
            }
        }
        System.out.println(tong);
    }
}
