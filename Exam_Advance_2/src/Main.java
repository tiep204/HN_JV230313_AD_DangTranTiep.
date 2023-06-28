import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số ISBN:");
        String isbn = sc.nextLine();
        while (isbn.length() != 10) {
            System.out.println("Số ISBN không hợp lệ. Vui lòng nhập lại:");
            isbn = sc.nextLine();
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < isbn.length(); i++) {
            char digitChar = isbn.charAt(i);
            if (Character.isDigit(digitChar)) {
                int digit = Character.getNumericValue(digitChar);
                stack.push(digit);
            } else {
                System.out.println("Số ISBN không hợp lệ. Chỉ được phép chứa các chữ số.");
                return;
            }
        }
        int sum = 0;
        int multiplier = 1;
        while (!stack.isEmpty()) {
            int digit = stack.pop();
            sum += digit * multiplier;
            multiplier++;
        }
        if (sum % 11 == 0) {
            System.out.println("Số ISBN hợp lệ.");
        } else {
            System.out.println("Số ISBN không hợp lệ.");
        }
    }
}