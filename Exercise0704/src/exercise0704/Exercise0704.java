/*
 * 專案：Exercise0704
 * 檔名：Exercise0704.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise0704;

public class Exercise0704 {

    public static void main(String[] args) {
        int n = 5;
        int i = 0;
        int j = 5;
        while (i < n) {
            while (j > i) {
                System.out.print("*");
                j -= 1;
            }
            System.out.println();
            j = 5;
            i++;
        }
    }
}
