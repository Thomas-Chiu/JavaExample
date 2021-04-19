/*
 * 專案：Exercise1201
 * 檔名：Exercise1201.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise1201;

public class Exercise1201 {
    public static int count = 0;
    
    public Exercise1201() {
        count++;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Exercise1201 demo = new Exercise1201();
        }
        System.out.println(Exercise1201.count);
    }
    
}
