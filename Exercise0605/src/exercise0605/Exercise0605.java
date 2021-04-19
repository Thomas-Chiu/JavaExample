/*
 * 專案：Exercise0605
 * 檔名：Exercise0605.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise0605;

import java.util.Scanner;

public class Exercise0605 {

    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        
        switch (a) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
            case 5:
                System.out.println(5);
                break;
            case 6:
                System.out.println(6);
                break;
            case 7:
                System.out.println(7);
                break;
            case 8:
                System.out.println(8);
                break;
            case 9:
                System.out.println(9);
                break;
            default:
                System.out.println(-1);
                break;
        }
    }
    
}
