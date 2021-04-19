/*
 * 檔名：Animal.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package classdemo06;

public class Animal {
    protected String name;
    
    public Animal() {
        this.name = "動物";
    }

    public Animal(String s) {
        this.name = s;
    }

    public void speak() {
        System.out.println("哈囉，我是" + this.name);
    }
    
}
