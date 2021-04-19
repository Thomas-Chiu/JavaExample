/*
 * 檔名：ForeachDemo.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package foreachdemo;

public class ForeachDemo {
    public static void main(String[] args) {
        // 建立含有 10 個整數的陣列
        int[] a = new int[10];
        // 初始化陣列元素
        int v = 10;
        for (int i = 0; i < 10; i++) {
            a[i] = v--;
        }
        // 利用 for 迴圈印出每一個元素
        for (int i : a) {
            System.out.println(i);
        }
    }    
}
