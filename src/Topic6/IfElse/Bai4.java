package Topic6.IfElse;

public class Bai4 {
    public static void timsolonnhat(int a, int b, int c){
        if (a > b && a > c){
            System.out.println(a);
        }else if (b > a && b > c){
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        timsolonnhat(5,6,10);
    }
}
