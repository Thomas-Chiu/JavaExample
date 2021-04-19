/*
 * 專案：Exercise0807
 * 檔名：Exercise0807.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise0807;

import java.util.Scanner;

public class Exercise0807 {
    int result;
    
    void calculate(int n) {
        int n1 = 0;
        int n2 = 1;
        result = 0;
        int i = 3;
        while (i <= n)
        {
            result = n1 + n2;
            n1 = n2;
            n2 = result;
            i += 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exercise0807 c = new Exercise0807();
        c.calculate(scanner.nextInt());
        System.out.println(c.result);
    }
    
}
