/*
 * 專案：Exercise1202
 * 檔名：Exercise1202.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise1202;

public class Exercise1202 {
    private static int count = 0;
    
    public Exercise1202() {
        count++;
    }
    
    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            Exercise1202 demo = new Exercise1202();
        }
        System.out.println(Exercise1202.getCount());
    }
    
}
