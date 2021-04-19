/*
 * 專案：Exercise0710
 * 檔名：Exercise0710.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise0710;

public class Exercise0710 {

    public static void main(String[] args) {
        int n = 20;
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
