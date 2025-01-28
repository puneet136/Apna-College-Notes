package AdvancePattern;
public class BInToDec {

    public static void BinToDec (int n) {
        int myNum = n;
        int pow = 0 ;
        int decNum = 0;

        while (n>0) {
            int lastdigit = n % 10;
            decNum = decNum + (lastdigit *  (int)(Math.pow(2, pow)));
            pow++;

            n /= 10;
        }

        System.out.println("Decimal of " + myNum + " = " +decNum);
    }
    public static void main (String args[]) {
            BinToDec(101);
    }
}
