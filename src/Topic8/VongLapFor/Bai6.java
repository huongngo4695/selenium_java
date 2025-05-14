package Topic8.VongLapFor;

import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}