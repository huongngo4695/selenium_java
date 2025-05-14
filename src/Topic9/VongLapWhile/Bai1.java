package Topic9.VongLapWhile;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = n;
        while (i <= 100){
            i++;
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
