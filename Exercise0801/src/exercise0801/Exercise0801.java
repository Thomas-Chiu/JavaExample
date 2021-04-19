/*
 * 專案：Exercise0801
 * 檔名：Exercise0801.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise0801;

public class Exercise0801 {
    int result;
    
    void add(int p) {
        result += p;
    }

    public static void main(String[] args) {
        Exercise0801 demo = new Exercise0801();
        demo.result = 25;
        demo.add(24);
        System.out.println(demo.result);
    }
    
}
