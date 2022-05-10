package ECPE205;
import java.lang.Math;
import java.util.Locale;

public class calculator {
    public double XPowerY (double x, double y) {
        return Math.pow(x,y);
    }

public int factorial (int a) {
        int fact = 1;
        for(int i = 1; i <= a; i++){
            fact = fact * i;
        }
        return fact;
}

public String palindrome (String p) {
        String pal = "";
        int l = p.length();
        for (int i = (l - 1); i >= 0; --i){
            pal = pal + p.charAt(i);
        }
        return pal.toLowerCase();
}

    //create a method that accepts an array of integer values, the method then sorts the value in ascending order
    //** you may choose whatever sort data structure (bubble sort, shell sort,...)
    //use parameterizedTest methodSource
}
