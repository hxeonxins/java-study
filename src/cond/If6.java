package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000이상 구매 1000할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        } //전체를 묶어서 보기 때문에 하나를 만족하면 나머지 실행 안됨 ->동시할인 적용 안됨

        System.out.println("총 할인 금액: " + discount + "원");

        if (true) System.out.println("if문에서 실행됨");
        //코드가 한줄일 때는 {} 안써도 됨. 그러나 추천하진 않음. 가독성과 유지보수 때문!
    }
}
