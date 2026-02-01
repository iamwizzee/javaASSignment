package pdf2;

public class Assignment_05 {

    static boolean isPalindrome(int num) {
        int ognum = num;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        return ognum == rev ? true : false;
    }

    static boolean isPalindrome(String str) {
        StringBuilder strr = new StringBuilder(str);
        return str.equals(strr.reverse().toString()) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome("heh"));
    }
}