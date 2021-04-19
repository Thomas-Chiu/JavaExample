/*
 * 專案：Exercise0703
 * 檔名：Exercise0703.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise0703;

public class Exercise0703 {

    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int j = 1;
        while (i <= n) {
            while (j <= i) {
                System.out.print("*");
                j += 1;
            }
            System.out.println();
            j = 1;
            i++;
        }
    }
    
}
