import java.util.Scanner;
public class SimpleCalculator {

    public double calculate(double num1, double num2, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("除数不能为0");
                    result = Double.POSITIVE_INFINITY; // 或者返回一个错误码
                }
                break;
            default:
                System.out.println("无效的运算符");
                break;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数字: ");
        double num1 = scanner.nextDouble();
        System.out.print("请输入运算符 (+, -, *, /): ");
        String operator = scanner.next();
        System.out.print("请输入第二个数字: ");
        double num2 = scanner.nextDouble();
        double result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                // 检查除数为0的情况
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("除数不能为0");
                    return;
                }
                break;
            default:
                System.out.println("无效的运算符");
                return;
        }
        System.out.printf("%.2f %s %.2f = %.2f%n", num1, operator, num2, result);
        scanner.close();
    }
}
