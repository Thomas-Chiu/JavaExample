/*
 * 專案：Exercise0803
 * 檔名：Exercise0803.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise0803;

import java.util.Scanner;

public class Exercise0803 {
    int result;
    
    void add(int p) {
        result += p;
    }
    
    void subtract(int p) {
        result -= p;
    }
    
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        Exercise0803 demo = new Exercise0803();
        a = scanner.nextInt();
        demo.result = a;
        b = scanner.nextInt();
        demo.add(b);
        c = scanner.nextInt();
        demo.subtract(c);
        System.out.println(demo.result);
    }
    
}
