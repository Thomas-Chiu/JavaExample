/*
 * 專案：Exercise0702
 * 檔名：Exercise0702.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise0702;

import java.util.Scanner;

public class Exercise0702 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
    
}
