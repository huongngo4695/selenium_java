package Topic6.IfElse;

public class Bai6 {
    public static void xeploai(float a){
        if (a > 0 && a < 5){
            System.out.println("Điểm D");
        }else if (a >= 5 && a < 7.5){
            System.out.println("Điểm C");
        }else if (a >= 7.5 && a < 8.5){
            System.out.println("Điểm B");
        }else if (a >= 8.5 && a <= 10){
            System.out.println("Điểm A");
        }else {
            System.out.println("Điểm không hợp lệ");
        }
    }

    public static void main(String[] args) {
        xeploai(11);
    }
}
