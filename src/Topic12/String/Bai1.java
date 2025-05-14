package Topic12.String;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char kyTu;
        int tong = 0;
        for ( int i=0 ; i < text.length() ; i++){
            kyTu = text.charAt(i);
           if (Character.isUpperCase(kyTu)){
               tong ++;
           }
        }
        System.out.println(tong);
    }
}
