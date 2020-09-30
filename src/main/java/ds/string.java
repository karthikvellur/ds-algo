package ds;

public class string {

    public static void main(String[] args){
//        String str = "madam";
//        isPalindrome(str);

//        checkIfAllCharsAreUnique(str);

//        searchSubStringBruteForce();

//        String str = "ABC";
//        permutationsOfString(str, 0, str.length()-1);

//        reverseString(new char[]{'h', 'e', 'l', 'l', 'o', 'p'});

        // isSubSequence present
        // https://www.geeksforgeeks.org/given-two-strings-find-first-string-subsequence-second/
        String str1 = "AXY";
        String str2 = "YADXCP";
        int m = str1.length();
        int n = str2.length();
        boolean res = isSubSequence(str1, str2, m, n);
        if(res)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    //TODO Finding permutations of a string - https://www.javatpoint.com/program-to-find-all-permutations-of-a-string - Need to write java program

    static boolean isSubSequence(String str1, String str2, int m, int n)
    {
        // Base Cases
        if (m == 0)
            return true;
        if (n == 0)
            return false;

        // If last characters of two strings are matching
        if (str1.charAt(m-1) == str2.charAt(n-1))
            return isSubSequence(str1, str2, m-1, n-1);

        // If last characters are not matching
        return isSubSequence(str1, str2, m, n-1);
    }

    /**
     * Reference: https://www.javatpoint.com/program-to-find-all-permutations-of-a-string
     *            https://youtu.be/AfxHGNRtFac
     * Need to go through it properly and also go through the video to understand it correctly
     *
     *
     * @param str
     * @param left
     * @param right
     */
    static void permutationsOfString(String str, int left, int right){
        if(left == right)
            System.out.println(str);
        else {
            for(int i=left; i<=right; i++){
                str = swap(str, left, i);
                permutationsOfString(str, left+1, right);
                str = swap(str, left, i);
            }
        }
    }

    static String swap(String str, int i, int j){
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }

    static void searchSubStringBruteForce(){
        String textStr = "I live in bangalore";
        String patStr = "live";
        char[] text = textStr.toCharArray();
        char[] pattern = patStr.toCharArray();
        boolean found = false;
        for(int i=0;i<text.length;i++){
            int j = 0;
            while(j<pattern.length && pattern[j] == text[i+j]){
                j++;
            }

            if(j == pattern.length)
                found = true;
        }

        if(found)
            System.out.println("Pattern found");
        else
            System.out.println("Patttern not found");
    }

    static void isPalindrome(String str){
        if(str == null || str.length() != 0)
            System.out.println("Not a palindrome");

        System.out.println("Using inbuilt method");
        StringBuilder strBuilder = new StringBuilder(str);
        if(str.equalsIgnoreCase(strBuilder.reverse().toString()))
            System.out.println("String is a palindrome");
        else
            System.out.println("String is not a palindrome");

        System.out.println("Not using any inbuilt method");
        int length = str.length();
        int i = 0;
        for(i=0; i<(length/2); i++){
            if(str.charAt(i) != str.charAt(length-1-i))
                break;
        }

        if( i == (length-1)/2)
            System.out.println("String is a palindrome");
        else
            System.out.println("String is not a palindrome");
    }

    // Time complexity: Generically you can consider the complexity to be O(N) even though inner loop is starting with i+1
    static void checkIfAllCharsAreUnique(String str){
        if(str == null || str.length() == 0){
            System.out.println("String is null or empty");
            return;
        }

        int length = str.length();
        int i;
        int j;
        boolean unique = true;
        for(i=0; i<length; i++){
            for(j=i+1; j<length; j++){
                if( str.charAt(i) == str.charAt(j)){
                    System.out.println("String characters are not unique");
                    unique = false;
                    break;
                }
            }
            if( ! unique){
                break;
            }
        }

        if(unique)
            System.out.println("String characters are unique");

    }

    static void reverseString(char[] s) {
        int i = s.length-1;
        int j = 0;
        while(i > 1){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i--;
            j++;
        }
        System.out.println("Reversed String: ");
        for ( char ch: s) {
            System.out.println(ch);
        }
    }
}
