package cond;

public class Switch3 {public static void main(String[] args) {
    int grade = 2;

    int coupon;
    switch (grade) {
        case 1:
            coupon = 1000;
            break;
        case 2:
        case 3: //break 없으면 다음 코드도 같이 실행됨
            coupon = 3000;
            break;
        default:
            coupon = 500;
    }
    System.out.println("발급받은 쿠폰 " + coupon);
}
}
