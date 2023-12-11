package cond.ex;

public class EvenOddExA {
    //원래 코드도 답이 될수 있으나 더 간략하게 할 수 있음
    public static void main(String[] args) {
        int x = 6;

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + result);
    }
}
