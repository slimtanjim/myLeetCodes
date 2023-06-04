public class DriverMain{
    public static void main (String[] args) {
    System.out.println("yes");

    Palindrome myPal = new Palindrome();

    System.out.println(myPal.isPalindrome("race is a car"));
    System.out.println(myPal.isPalindrome("racecar"));
    }
}