/*
 * 檔名：Encrypt01.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
 package encrypt01;
 
 public class Encrypt01 {
    // 密碼表字元陣列
    private char[] code = new char[26];
    
    // 建構子
    public Encrypt01() {
        setCode();
    }
    
    // setter
    public void setCode() {
        char c = 'a';
        for (int i = 0; i < 26; i++) {
            code[i] = c++;
        }
    }
    
    // getter
    public char[] getCode() {
        return code;
    }
    
    // 編碼的方法
    public String toEncode(String s) {
        return s;
    }
    
    // 解碼的方法
    public String toDecode(String s) {
        return s;
    }
    
    // 測試的 main()
    public static void main(String[] args) {
        Encrypt01 e = new Encrypt01();
        System.out.println(e.code);
        String s = "There is no spoon.";
        System.out.println(s);
        String s1 = e.toEncode(s);
        System.out.println(s1);
        String s2 = e.toDecode(s1);
        System.out.println(s2);
    }
}