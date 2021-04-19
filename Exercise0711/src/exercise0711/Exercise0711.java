/*
 * 專案：Exercise0711
 * 檔名：Exercise0711.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise0711;

import java.util.Scanner;

public class Exercise0711 {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int i = 3;
        while (i <= n)
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            i += 1;
        }
        System.out.println(n3);
    }
    
}
