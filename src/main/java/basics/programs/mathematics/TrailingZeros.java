package basics.programs.mathematics;

public class TrailingZeros {

    public static void main(String[] args) {
        int n = 10;
        int fact = 1;

        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        int x = 0;
        int temp = fact;

        while (temp % 10 == 0) {
            x++;
            temp = temp / 10;
        }

        System.out.println("Trailing zeros in " + fact + " which is factorial of " + n + " are " + x);
        System.out.println("Trailing zeros in " + n + " using efficient method are " + calTrailingZeros(n));
    }

    // Efficient method to avoid overflow of program
    // Formula = n/5 + n/25 + n/125 ....

    public static int calTrailingZeros(int n) {

        int j = 0;
        int result = 0;
        for (int i = 5; i <= n; i = i * 5) {
            result += n / i;
        }
        
        return result;
    }
}
