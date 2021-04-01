class Q4 {
    static String WordInput = "";
    
    public static void main (String[] args){
        isPalindrome("racecar");
        isPalindrome("MonsterKing");
        isPalindrome("Anna");
    }
    
    public static boolean isPalindrome(String word){
        word = word.toLowerCase();
        //if (word.length() == 0){
            //System.out.println("Come on human, put something in.");
            //return false;
        //}
        
        if (word.length() == 1 || word.length() == 0){
            System.out.println("This is a palindrome");
            return true;
        }
        
        if (word.charAt(0) != word.charAt(word.length()-1)){
            System.out.println("This is NOT a palindrome");
            return false;
        }
        
        return isPalindrome(word.substring(1,word.length()-1));
    } 
}