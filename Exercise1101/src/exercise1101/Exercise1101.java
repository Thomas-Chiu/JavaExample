/*
 * 專案：Exercise1101
 * 檔名：Exercise1101.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise1101;

interface Animal {
    public String name = "動物";
    public void speak();
}

public class Exercise1101 implements Animal {
    public void speak() {
        System.out.println("我是" + name);
    }

    public static void main(String[] args) {
        Exercise1101 demo = new Exercise1101();
        demo.speak();
    }
    
}
