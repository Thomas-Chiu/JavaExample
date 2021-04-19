/*
 * 專案：Exercise0902
 * 檔名：Exercise0902.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise0902;

import java.util.Scanner;

public class Exercise0902 {
    int result;
    
    Exercise0902() {
        result = 1;
    }
    
    void calculate(int n) {
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exercise0902 c = new Exercise0902();
        c.calculate(scanner.nextInt());
        System.out.println(c.result);
    }
    
}
