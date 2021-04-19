/*
 * 檔名：StaticDemo.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */ 
package staticdemo;

 public class StaticDemo {
    private static int a = 0;
    private int b;
    
    public StaticDemo() {
        a++;
        b = 0;
    }
    
    public static double test() {
        return ((double) a / 10);
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            StaticDemo d = new StaticDemo();
            System.out.println();
            int p1 = StaticDemo.a;
            System.out.println(p1);
            System.out.println(d.b);
            double p2 = StaticDemo.test();
            System.out.println(p2);
            System.out.println();
        }
    }
}
