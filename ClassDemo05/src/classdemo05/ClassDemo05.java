/*
 * 檔名：ClassDemo05.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package classdemo05;

public class ClassDemo05 {
    private int a;
    
    public ClassDemo05(int a) {
        setA(a);
    }
    
    public void setA(int a) {
        // 利用 this 存取屬性
        this.a = a;
    }
    
    public int getA() {
        return a;
    }
    
    public int doSomething(int a) {
        // 參數跟屬性使用相同的識別字
        return this.a + a;
    }
    
    public static void main(String[] args) {
        ClassDemo05 d = new ClassDemo05(13);
        
        System.out.println();
        System.out.println(d.getA());
        System.out.println(d.doSomething(9));
        System.out.println();
    }
}