class Palindrome {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        str = str.replaceAll("\\s",""); // remove space
        str = str.replaceAll("\\W", ""); // remove punctuation 
        int left_p = 0;
        int right_p = str.length() - 1; // pointer @ zero

        while ( left_p < right_p){
            if(str.charAt(left_p) != str.charAt(right_p)){
                return false;
            }
            left_p++;
            right_p--;
        }
        return true;
    }
}