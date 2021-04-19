/*
 * 檔名：Encrypt04.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
 package encrypt04;
 
 public class Encrypt04 {
    // 密碼表字元陣列
    private char[] code = new char[26];
    
    // 建構子
    public Encrypt04() {
        setCode();
    }
    
    // setter
    public void setCode() {
        int a = 0;
        int b = 0;
        
        a = (int) (Math.random() * 10);
        System.out.printf("%d, ", a);
        b = (int) (Math.random() * 10);
        System.out.printf("%d, ", b);
        
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
        for (int i = 0; i < 20; i++) {
            Encrypt04 e = new Encrypt04();
            System.out.println(e.getCode());
        }
        //String s = "There is no spoon.";
        //System.out.println(s);
        //String s1 = e.toEncode(s);
        //System.out.println(s1);
        //String s2 = e.toDecode(s1);
        //System.out.println(s2);
    }
}