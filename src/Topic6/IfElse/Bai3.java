package Topic6.IfElse;

public class Bai3 {
    public static void sosanhten(String a, String b){
        if (a == b){
            System.out.println("2 người là cùng tên");
        }else {
            System.out.println("2 người là khác tên");
        }
    }

    public static void main(String[] args) {
        sosanhten("Hướng", "Duy");
    }
}
