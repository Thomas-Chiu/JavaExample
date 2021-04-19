/*
 * 專案：Exercise0502
 * 檔名：Exercise0502.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise0502;

import java.util.Scanner;

public class Exercise0502 {

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        
        a = scanner.nextInt();
        b = scanner.nextInt();
        
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
    
}
