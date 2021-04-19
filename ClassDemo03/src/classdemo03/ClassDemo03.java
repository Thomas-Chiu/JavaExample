/*
 * 檔名：ClassDemo03.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package classdemo03;

public class ClassDemo03 {
    private int a;
    
    // setter 方法
    public void setA(int p1) {
        a = p1;
    }
    
    // getter 方法
    public int getA() {
        return a;
    }
    
    public int doSomething(int p1) {
        return a + p1;
    }
    
    public static void main(String[] args) {
        ClassDemo03 d = new ClassDemo03();
        
        // 利用 setter 設定屬性
        d.setA(11);
        
        System.out.println();
        // 利用 getter 印出屬性 a
        System.out.println(d.getA());
        System.out.println(d.doSomething(1));
        System.out.println();
    }
}