/*
 * 檔名：SelectionDemo.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package selectiondemo;

// 示範 if-else 的類別
public class SelectionDemo {

    public static void main(String[] args) {
        System.out.println();
        
        if (3 > 5) {
            System.out.println("3大於5發生了！");
        }
        else if (4 > 5) {
            System.out.println("4大於5發生了！");
        }
        else if (5 > 5) {
            System.out.println("5大於5發生了！");
        }
        else if (6 > 5) {
            System.out.println("6當然大於5哩！");
        }
        else {
            System.out.println("沒有符合的條件");
        }
        
        System.out.println();
    }
    
}
