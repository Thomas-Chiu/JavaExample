/*
 * 專案：Exercise0607
 * 檔名：Exercise0607.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise0607;

import java.util.Scanner;

public class Exercise0607 {

    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        
        if (a < 60) {
            System.out.println("~60");
        }
        else if (a >= 60 && a < 70) {
            System.out.println("60~70");
        }
        else if (a >= 70 && a < 80) {
            System.out.println("70~80");
        }
        else if (a >= 80 && a < 90) {
            System.out.println("80~90");
        }
        else if (a >= 90 && a < 100) {
            System.out.println("90~100");
        }
        else if (a == 100) {
            System.out.println("100");
        }
        else {
            System.out.println("-1");
        }
    }
    
}
