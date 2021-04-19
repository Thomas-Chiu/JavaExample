/*
 * 專案：Exercise0602
 * 檔名：Exercise0602.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise0602;

import java.util.Scanner;

public class Exercise0602 {

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        
        a = scanner.nextInt();
        b = scanner.nextInt();
        
        if (a == b) {
            System.out.println("a 等於 b");
        }
        else {
            System.out.println("a 不等於 b");
        }
    }
    
}
