package AdvancePattern;
public class DEcToBin {
    public static void DecToBin (int n) {
        int MyNum = n;
        int pow = 0 ;
        int BinNum = 0;

        while (n>0) {
            int rem = n% 2 ;
            BinNum = BinNum + (rem * (int)Math.pow(10, pow));

            pow++;
            n = n/2;
        }

        System.out.println("Binary Form of " + MyNum + " is " + BinNum);
    }

    public static void main (String args []) {
        DecToBin(8);
    }
}
