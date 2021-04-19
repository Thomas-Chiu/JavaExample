/*
 * 專案：Exercise1802
 * 檔名：Guess.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise1802;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Guess {
    private String answer;
    private int A;
    private int B;
    private int times;
    private int digit;
    
    public Guess() {
        digit = 4;
        setArribute();
        
    }
    
    public Guess(int p) {
        digit = p;
        setArribute();
    }
    
    private void setArribute() {
        String all_numbers = "0123456789";
        String answer_demo = "";
        List<String> answerList = new ArrayList<String>(Arrays.asList(all_numbers.split("")));
        Collections.shuffle(answerList);
        for (String s : answerList) {
            answer_demo += s;
        }
        answer = answer_demo.substring(0, digit);
        do {
            answer = answer_demo.substring(0, digit);
        } while (Character.toString(answer.charAt(0)).equals("0"));
        A = 0;
        B = 0;
        times = 0;
    }
    
    public String getAnswer() {
        return answer;
    }
    
    public String getAB() {
        return Integer.toString(A) + "A" + Integer.toString(B) + "B";
    }
    
    public int getTimes() {
        return times;
    }
    
    public void addTimes() {
        times += 1;
    }
    
    public void ABCounter(String guess) {
        A = 0;
        B = 0;
        for (int i = 0; i < digit; i++) {
            String j = Character.toString(answer.charAt(i));
            if (guess.contains(j)) {
                if (answer.indexOf(j) == guess.indexOf(j)) {
                    A += 1;
                }
                else {
                    B += 1;
                }
            }
        }
    }
    
    public boolean findNumber(String guess) {
        int count = 0;
        for (int i = 0; i < digit; i++) {
            for (int j = 0; j < 4; j++) {
                if (Character.toString(guess.charAt(i)).equals(Character.toString(guess.charAt(j)))) {
                    count += 1;
                }
            }
            if (count > 1) {
                return true;
            }
            count = 0;
        }
        return false;
    }
    
    public boolean test(String guess) {
        addTimes();
        ABCounter(guess);
        if (A == digit) {
            return true;
        }
        else {
            return false;
        }
    }
}
