/*
 * 專案：Exercise0705
 * 檔名：Exercise0705.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise0705;

import java.util.Scanner;

public class Exercise0705 {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int i = 0;
        int j = n;
        while (i < n) {
            while (j > i) {
                System.out.print("*");
                j -= 1;
            }
            System.out.println();
            j = n;
            i++;
        }
    }
    
}
