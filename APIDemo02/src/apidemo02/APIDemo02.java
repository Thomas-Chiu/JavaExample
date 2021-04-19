/*
 * 檔名：APIDemo02.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package apidemo02;

public class APIDemo02 {
    public static void main(String[] args) {
        String s = "There is no spoon.";
        System.out.println(s);
        String s1 = s.replace("a", "e");
        System.out.println(s1);
        String s2 = s1.replace("e", "i");
        System.out.println(s2);
        String s3 = s2.replace("i", "o");
        System.out.println(s3);
        String s4 = s3.replace("o", "u");
        System.out.println(s4);
        String s5 = s4.replace("u", "a");
        System.out.println(s5);
    }
}