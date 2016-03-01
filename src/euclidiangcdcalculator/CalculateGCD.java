/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euclidiangcdcalculator;

/**
 *
 * @author John
 */
public class CalculateGCD {
    public static int getGCD(int m, int n) {
        int gcd;
        if (m < 0) {
            m = -m;
        }
        if (n < 0) {
            n = -n;
        }
        
        while (m != 0 && n != 0) {
            if (m >= n) {
                m = m - n;
            }
            if (n >= m) {
                n = n - m;
            }
        }
        if (m == 0) {
            gcd = n;
        } else {
            gcd = m;
        }
        return gcd;
    }
}
