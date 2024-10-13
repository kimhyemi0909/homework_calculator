import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        String operator;

        System.out.println("첫번째 숫자를 입력하세요.");
        num1 = scanner.nextDouble();

        System.out.println("연산자를 입력하세요.");
        operator = scanner.next();

        System.out.println("두번째 숫자를 입력하세요.");
        num2 = scanner.nextDouble();

        if(operator.equals("+")) {
            double result = num1 + num2;
            System.out.printf("결과: " + "%.1f", result);
        }
        if(operator.equals("-")){
            double result = num1 - num2;
            System.out.printf("결과: " + "%.1f", result);
        }
        if(operator.equals("*")){
            double result = num1 * num2;
            System.out.printf("결과: " + "%.1f", result);
        }
        if(operator.equals("/")){
            if (num2 == 0){
                System.out.println("0으로 나눌 수 없습니다.");
                return;
            }
            double result = num1 / num2;
            System.out.printf("결과: " + "%.2f", result);
        }

        scanner.close();
    }
}
