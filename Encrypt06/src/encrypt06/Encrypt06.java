/*
 * 專案：Encrypt06
 * 檔名：Encrypt06.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
 package encrypt06;
 
 public class Encrypt06 {
    // 密碼表字元陣列
    private char[] code = new char[26];
    
    // 建構子
    public Encrypt06() {
        setCode();
    }
    
    public void setCode() {
        int a = 0;
        int b = 0;
    
        while (a % 2 == 0) {
            a = (int) (Math.random() * 10);
            b = (int) (Math.random() * 10);
        }
    
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
    char[] cs = s.toCharArray();
    int i, ci, d, m;
    char r;
    String rs = "";
    Character cc;
    
    for (i = 0; i < cs.length; i++) {
        if (cs[i] >= 97 && cs[i] <= 122) {
            ci = cs[i];
            m = ci - 97;
            cs[i] = code[m];
        }
    }
    
    for (i = 0; i < cs.length; i++) {
        cc = new Character(cs[i]);
        rs = rs.concat(cc.toString());
    }
    
    return rs;
}
    
    // 解碼的方法
public String toDecode(String s) {
    char[] cs = s.toCharArray();
    int i, j;
    char r;
    String rs = "";
    Character cc;
    
    for (i = 0; i < cs.length; i++) {
        if (cs[i] >= 97 && cs[i] <= 122) {
            for (j = 0; j <= code.length; j++) {
                if (cs[i] == code[j]) {
                    cs[i] = (char) (j + 97);
                    break;
                }
            }
        }
    }
    
    for (i = 0; i < cs.length; i++) {
        cc = new Character(cs[i]);
        rs = rs.concat(cc.toString());
    }
    
    return rs;
}
    
    // 測試的 main()
    public static void main(String[] args) {
        Encrypt06 e = new Encrypt06();
        System.out.println(e.getCode());
        String s = "There is no spoon.";
        System.out.println(s);
        String s1 = e.toEncode(s);
        System.out.println(s1);
        String s2 = e.toDecode(s1);
        System.out.println(s2);
    }
}