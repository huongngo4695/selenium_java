package Topic9.VongLapWhile;

public class Bai6 {
    public static void main(String[] args) {
        int tong = 0;
        int i = 1;
        while ( i <= 10 ) {
            i++;
            if (i % 2 == 0){
                tong += i;
            }
        }
        System.out.println(tong);
    }
}
