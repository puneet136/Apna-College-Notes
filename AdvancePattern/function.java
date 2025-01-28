package AdvancePattern;
public class function {

    public static int factorial (int n) {
            int fac= 1;                 // Base Condition
        for(int i =1 ; i<=n ; i++) {
                fac *= i;
        }
        return fac;
    }
    public static void main(String[] args) {
        
        System.out.println(factorial(4));
    }
}

