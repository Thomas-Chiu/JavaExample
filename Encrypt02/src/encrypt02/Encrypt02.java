/*
 * 檔名：Encrypt02.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
 package encrypt02;
 
 public class Encrypt02 {
    // 密碼表字元陣列
    private char[] code = new char[26];
    
    // 建構子
    public Encrypt02() {
        setCode();
    }
    
    // setter
    public void setCode() {
        int a = 3;
        int b = 5;
        
        int x, y, m, i;
        char c = 'a';
        for (i = 0; i < 26; i++) {
            x = c;
            y = x * a + b;
            m = y % 26;
            code[i] = (char) (m + 97);
            c++;
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
        Encrypt02 e = new Encrypt02();
        System.out.println(e.getCode());
        String s = "There is no spoon.";
        System.out.println(s);
        String s1 = e.toEncode(s);
        System.out.println(s1);
        String s2 = e.toDecode(s1);
        System.out.println(s2);
    }
}