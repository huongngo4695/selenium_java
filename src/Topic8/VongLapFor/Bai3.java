package Topic8.VongLapFor;

public class Bai3 {
    public static void main(String[] args) {
        int tong = 0;
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                tong += i;
            }
        }
        System.out.println("Tổng các số chẵn từ 1 đến 10 là: " + tong);
    }
}
