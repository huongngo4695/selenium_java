package Topic6.IfElse;

public class Bai2 {
    public static void sosanh( int a, int b){
        if (a >=b ){
            System.out.println("a lớn hơn hoặc bằng b");
        }else {
            System.out.println("a nhỏ hơn b");
        }
    }
    public static void main(String[] args) {
        sosanh(5,10);
    }
}
