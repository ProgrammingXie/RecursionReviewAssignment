class Q1 {
    public static void main(String[] args){
        System.out.println("Greatest Common Denominator is: " + GCD(252,105));
    
    }
    
    public static int GCD (int A, int B){
        if (A == B){
            return A;
        }
        
        if (A > B){
            return GCD(A-B, B);
        }
        else {
            return GCD(A, B-A);
        }
    }
}