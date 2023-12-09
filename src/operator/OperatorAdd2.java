package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        //전위 증감 연산자의 예
        int a = 1;
        int b = 0;
        b = ++a; //a의 값을 먼저 증가 시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b); // 결과 a=2, b=2

        //후위 증감 연산자의 예
        a = 1; //a값을 다시 1로 지정
        b = 0; //b값을 다시 0으로 지정
        b = a++; //a값을 b에 먼저 대입하고, 그 후 a값 증가
        System.out.println("a = " + a + "," + " b = " + b); // 결과 a=2, b=1

        ++a;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);
        //단독으로 쓰이는 경우에는 전위 후위가 딱히 상관 없음

    }
}
