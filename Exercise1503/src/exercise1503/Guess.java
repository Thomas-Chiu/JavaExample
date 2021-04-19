/*
 * 專案：Exercise1503
 * 檔名：Guess.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise1503;

public class Guess {
    private String answer;
    private int A;
    private int B;
    
    public Guess() {
        answer = "1234";
        A = 0;
        B = 0;
    }
    
    public String getAnswer() {
        return answer;
    }
    
    public String getAB() {
        return Integer.toString(A) + "A" + Integer.toString(B) + "B";
    }
    
    public void ABCounter(String guess) {
        A = 0;
        B = 0;
        for (int i = 0; i < 4; i++) {
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
    
    public boolean test(String guess) {
        ABCounter(guess);
        if (A == 4) {
            return true;
        }
        else {
            return false;
        }
    }
}
