/*
 * 專案：Exercise0802
 * 檔名：Exercise0802.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise0802;

import java.util.Scanner;

public class Exercise0802 {
    int result;
    
    void add(int p) {
        result += p;
    }

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        Exercise0802 demo = new Exercise0802();
        a = scanner.nextInt();
        demo.result = a;
        b = scanner.nextInt();
        demo.add(b);
        System.out.println(demo.result);
    }
    
}
