package Toantu;

public class Toantu {
    static int number = 100;
    static int n;
    static int a;
    static int b;
    static int c;
    public static void checkNumber(int n) {
        if (n == number) {
            System.out.println("number: " + n);
        }else if (n > number) {
            System.out.println("number <" + n);
        }else
            System.out.println("number > " + n);
    }

    public static void checkCondition(int a, int b, int c){
        System.out.println(a==b);
        System.out.println(a>=b && a>=c);
        System.out.println(b>=a || b>=c);
    }
    public static void main(String[] args) {
        checkNumber(99);
        checkCondition(number, 99, 98);
    }
}
