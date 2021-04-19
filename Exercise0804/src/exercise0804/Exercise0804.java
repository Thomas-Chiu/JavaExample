/*
 * 專案：Exercise0804
 * 檔名：Exercise0804.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise0804;

import java.util.Scanner;

public class Exercise0804 {
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

    public static void main(String[] args) {
        int a, b, c, d;
        Scanner scanner = new Scanner(System.in);
        Exercise0804 demo = new Exercise0804();
        a = scanner.nextInt();
        demo.result = a;
        b = scanner.nextInt();
        demo.add(b);
        c = scanner.nextInt();
        demo.subtract(c);
        d = scanner.nextInt();
        demo.multiply(d);
        System.out.println(demo.result);
    }
    
}
