package cond.ex;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int doller = 13;

        if (doller < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (doller == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = doller * 1300;
            System.out.println("환전 금액은 " + won + "원 입니다.");
        }
    }
}
