//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 연산자
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a % b);

        int x = 5;
        x += 3;
        System.out.println(x);

        int num = 5;
        System.out.println(num == 5);

        boolean result = (5 > 3) && (10 > 5);

        System.out.println(result);

        int i = 1;
        i++;

        System.out.println(i);

        int score = 85;
        String grade = (score >= 90) ? "A" : "B";

        System.out.println(grade);

        // 조건문
        num = 10;
        if (num > 0) {
            System.out.println("양수입니다.");
        } else if (num == 0) {
            System.out.println("0입니다.");
        } else {
            System.out.println("음수입니다.");
        }

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            default:
                System.out.println("기타 요일");
                break;
        }

        // 반복문
        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int count = 3;
        while (count > 0) {
            System.out.println(count);
            count--;
        }

        num = 0;
        do {
            System.out.println(num);
            num++;
        } while (num < 3);
    }
}