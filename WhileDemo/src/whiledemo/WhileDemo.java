/*
 * 檔名：WhileDemo.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package whiledemo;

public class WhileDemo {
    public static void main(String[] args) {
        int i = 10; // 設定控制變數
        while (i > 0) { // 測試結束條件
            // 迴圈工作區
            System.out.println(i);
            i--; // 調整控制變數值
        }
    }
}
