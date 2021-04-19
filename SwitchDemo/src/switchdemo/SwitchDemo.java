/*
 * 檔名：SwitchDemo.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package switchdemo;

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println();
        
        switch (6) {
            case 3:
                System.out.println("選擇是3...");
                break;
            case 4:
                System.out.println("選擇是4...");
                break;
            case 5:
                System.out.println("選擇是5...");
                break;
            case 6:
                System.out.println("選擇是6...");
                break;
            default:
                System.out.println("沒有符合的");
        }
        
        System.out.println();
    }
}
