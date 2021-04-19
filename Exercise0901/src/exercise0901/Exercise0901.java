/*
 * 專案：Exercise0901
 * 檔名：Exercise0901.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise0901;

import java.util.Scanner;

public class Exercise0901 {
    int result;
    
    Exercise0901(int p) {
        result = p;
    }
    
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
        a = scanner.nextInt();
        Exercise0901 demo = new Exercise0901(a);        
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
