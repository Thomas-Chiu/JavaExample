/*
 * 檔名：PackageDemo.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package packagedemo;

import classdemo06.Animal;
import classdemo06.Elephant;
import classdemo06.Mouse;

import java.util.ArrayList;
import java.util.List;

public class PackageDemo {
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
