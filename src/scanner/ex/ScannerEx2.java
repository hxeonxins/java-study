package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요:");
        int intvalue = scanner.nextInt();

        if (intvalue % 2 == 0) {
            System.out.println("입력한 숫자" + intvalue + "는 짝수입니다.");
        } else {
            System.out.println("입력한 숫자" + intvalue + "는 홀수 입니다.");
        }
    }
}
