/*
 * 專案：Encrypt
 * 檔名：Encrypt.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package encrypt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Encrypt {
    // 字母表
    final String letter = "abcdefghijklmnopqrstuvwxyz";
    // 密碼表
    String code;
    
    // 無參數建構子
    public Encrypt() {
        this.code = "";
        List<String> letterList = new ArrayList<String>(Arrays.asList(this.letter.split("")));
        Collections.shuffle(letterList);
        for (String s : letterList) {
            this.code += s;
        }
        
        System.out.println(this.code);
    }
    
    // 有參數的建構子
    public Encrypt(String str) {
        this.code = str;
    }
    
    // 編碼方法
    public String toEncode(String inputString) {
        String result = "";
        List<String> inputList = new ArrayList<String>(Arrays.asList(inputString.split("")));
        for (String s : inputList) {
            if (letter.contains(s)) {
                result += this.code.substring(this.letter.indexOf(s), this.letter.indexOf(s)+1);
            }
            else {
                result += s;
            }
        }
        
        return result;
    }
    
    // 解碼方法
    public String toDecode(String inputString) {
        String result = "";
        List<String> inputList = new ArrayList<String>(Arrays.asList(inputString.split("")));
        for (String s : inputList) {
            if (letter.contains(s)) {
                result += this.letter.substring(this.code.indexOf(s), this.code.indexOf(s)+1);
            }
            else {
                result += s;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Encrypt demo = new Encrypt();
        String s1 = "There is no spoon.";
        System.out.println(s1);
        String s2 = demo.toEncode(s1);
        System.out.println(s2);
        String s3 = demo.toDecode(s2);
        System.out.println(s3);
    }   
}
