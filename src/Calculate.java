public class Calculate {
    private double num1;
    private double num2;

    // 생성자
    public Calculate(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // 덧셈
    public double add() {
        return num1 + num2;
    }

    // 뺄셈
    public double subtract() {
        return num1 - num2;
    }

    // 곱셈
    public double multiply() {
        return num1 * num2;
    }

    // 나눗셈
    public double divide() {
        return num1 / num2;
    }

    // main 메서드
    public static void main(String[] args) {
        Calculate calc = new Calculate(8, 4);

        System.out.println("덧셈: " + calc.add());
        System.out.println("뺄셈: " + calc.subtract());
        System.out.println("곱셈: " + calc.multiply());
        System.out.println("나눗셈: " + calc.divide());
    }
}
