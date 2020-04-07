package ds;

public class string {

    public static void main(String[] args){
//        String str = "madam";
//        isPalindrome(str);

//        checkIfAllCharsAreUnique(str);

        searchSubStringBruteForce();


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

    // Finding permutations of a string - https://www.javatpoint.com/program-to-find-all-permutations-of-a-string - Need to write java program
}
