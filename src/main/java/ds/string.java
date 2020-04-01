package ds;

public class string {

    public static void main(String[] args){
        String str = "madam";

//        isPalindrome(str);
        checkIfAllCharsAreUnique(str);

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
}
