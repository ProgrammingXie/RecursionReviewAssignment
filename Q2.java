class Q2 {
    static int Limit = 0;
    
    public static void main(String[] args){
        triangle(15);
        System.out.println("");
        reverseTriangle(15);
    }
    
    public static String triangle(int n){
        if (n == 0){
            return "";
        }
        printStars(n);
        return triangle(n-1);
    }
    
    public static String  reverseTriangle(int n){ 
        Limit++;
        if (Limit > n){
            return "";
        }
        //n-(n-1)
        printStars(Limit);
        return reverseTriangle(n);
    }
    
    public static void printStars(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}   