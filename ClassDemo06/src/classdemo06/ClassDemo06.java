/*
 * 檔名：ClassDemo06.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package classdemo06;

import java.util.ArrayList;
import java.util.List;

public class ClassDemo06 {
    public static void main(String[] args) {
        List<Animal> animal_list = new ArrayList<Animal>();
        animal_list.add(new Animal());
        animal_list.add(new Elephant());
        animal_list.add(new Mouse());
        for (Animal item:animal_list) {
            item.speak();
        }
    }
}
