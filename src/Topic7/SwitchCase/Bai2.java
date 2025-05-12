package Topic7.SwitchCase;

public class Bai2 {
    public static void tinhtoan(String pheptoan){
        int a = 5;
        int b = 10;
        switch (pheptoan){
            case "+":
                System.out.println(a+b);
            case "-":
                System.out.println(a-b);
            case "*":
                System.out.println(a*b);
            case "/":
                System.out.println(a/b);
            case "%":
                System.out.println(a%b);
        }
    }

    public static void main(String[] args) {
        tinhtoan("*");
    }
}
