import java.util.Scanner;

public class inttoroman {
    public static String intToRoman(int num) {
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] syb = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder romanNum = new StringBuilder();
        int i = 0;
        while (num > 0) {
            while (num >= val[i]) {
                romanNum.append(syb[i]);
                num -= val[i];
            }
            i++;
        }
        return romanNum.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();
        String roman = intToRoman(num);
        System.out.println("Roman numeral: " + roman);
    }
}
