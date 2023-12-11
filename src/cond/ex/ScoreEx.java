package cond.ex;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 90;

        System.out.println("score: " + score);

        if (score >= 90) {
            System.out.println("학점은 A 입니다.");
        } else if (score >= 80) {
            System.out.println("학점은 B 입니다.");
        } else if (score >= 70) {
            System.out.println("학점은 C 입니다.");
        } else if (score >= 60) {
            System.out.println("학점은 D 입니다.");
        } else {
            System.out.println("헉점은 F 입니다.");
        }
    }
}
