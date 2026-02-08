package basics.programs.mathematics;

public class PalindromeNumbers {

    public static void main(String[] args) {

        int n = 78987;
        int temp = n;

        int reverseNo = 0;

        while (temp > 0) {
            reverseNo = (reverseNo * 10) + (temp % 10);
            temp = temp / 10;
        }

        if (n == reverseNo) {
            System.out.println(n + " is a Palindrome Number");
        } else {
            System.out.println(n + " is not a Palindrome Number");
        }
    }

}
