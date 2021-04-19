/*
 * 專案：Exercise0709
 * 檔名：Exercise0709.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise0709;

import java.util.Scanner;

public class Exercise0709 {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
    }
    
}
