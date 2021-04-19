/*
 * 專案：Exercise0805
 * 檔名：Exercise0805.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise0805;

import java.util.Scanner;

public class Exercise0805 {
    int result;
    
    void add(int p) {
        result += p;
    }
    
    void subtract(int p) {
        result -= p;
    }
    
    void multiply(int p) {
        result *= p;
    }
    
    void divide(int p) {
        result /= p;
    }

    public static void main(String[] args) {
        int a, b, c, d, e;
        Scanner scanner = new Scanner(System.in);
        Exercise0805 demo = new Exercise0805();
        a = scanner.nextInt();
        demo.result = a;
        b = scanner.nextInt();
        demo.add(b);
        c = scanner.nextInt();
        demo.subtract(c);
        d = scanner.nextInt();
        demo.multiply(d);
        e = scanner.nextInt();
        demo.divide(e);
        System.out.println(demo.result);
    }
    
}
