class Q3 {
    public static void main(String[] args){
        reverse("this is Ethan");
    }
    
    public static String reverse(String word){
        if (word.length() == 0){
            return "";
        }
        
        System.out.print(word.charAt(word.length()-1));
        return reverse(word.substring(0,word.length()-1));
    
    
    }
}