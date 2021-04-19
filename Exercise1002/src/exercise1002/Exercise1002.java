/*
 * 專案：Exercise1002
 * 檔名：Exercise1002.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise1002;

import java.util.ArrayList;
import java.util.List;

public class Exercise1002 {

    public static void main(String[] args) {
        List<Animal> animal_list = new ArrayList<Animal>();
        animal_list.add(new Animal());
        animal_list.add(new Dog());
        animal_list.add(new Cat());
        for (Animal item:animal_list) {
            item.speak();
        }
    }
    
}
