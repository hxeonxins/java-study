package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0; //temp는 if문에서만 사용
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
