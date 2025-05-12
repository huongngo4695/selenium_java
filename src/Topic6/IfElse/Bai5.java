package Topic6.IfElse;

public class Bai5 {
    public static void kiemtra(int a) {
        if (a >= 10 && a <= 100) {
            System.out.println(a + " nằm trong [10,100]");
        } else {
            System.out.println(a + " không nằm trong [10,100]");
        }
    }

    public static void main(String[] args) {
        kiemtra(-9);
    }
}

