/*
 * 檔名：ClassDemo01.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package classdemo01;

// 宣告類別名稱
public class ClassDemo01 {
    // 這裡定義屬性
    int a;
    
    // 這裡定義方法
    public int doSomething(int p1) {
        return a + p1;
    }
    
    // 這裡定義 main() 方法
    public static void main(String[] args) {
        ClassDemo01 d = new ClassDemo01();
        d.a = 11;
        System.out.println();
        System.out.println(d.doSomething(5));
        System.out.println();
    }
}