package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int x =  6;

        System.out.println(x);

        if (x % 2 == 0) {
            System.out.println("짝수");
        }
        if (x % 2 != 0) {
            System.out.println("홀수");
        }
    }
}
