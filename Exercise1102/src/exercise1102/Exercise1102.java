/*
 * 專案：Exercise1102
 * 檔名：Exercise1102.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise1102;

import exercise1002.Animal;
import exercise1002.Cat;
import exercise1002.Dog;
import java.util.ArrayList;
import java.util.List;

public class Exercise1102 {

    
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
