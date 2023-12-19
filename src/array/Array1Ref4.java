package array;

public class Array1Ref4 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; //배열 생성과 초기화. 주의! new int[]를 안 쓰려면 라인을 나누면 안됨

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "점수" + students[i]);
        }
    }
}
