package cond;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자"; //a ? b : c ->삼항 연산자
        System.out.println("age = " + age + ", status = " + status);
    }
}
