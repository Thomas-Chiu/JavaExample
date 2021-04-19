/*
 * 專案：Exercise0806
 * 檔名：Exercise0806.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise0806;

import java.util.Scanner;

public class Exercise0806 {
    int result;
    
    void calculate(int n) {
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exercise0806 c = new Exercise0806();
        c.result = 1;
        c.calculate(scanner.nextInt());
        System.out.println(c.result);
    }
    
}
