/*
 * 專案：Exercise1701
 * 檔名：Guess.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise1701;

public class Guess {
    private String answer;
    private int A;
    private int B;
    private int times;
    
    public Guess() {
        answer = "1234";
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
    
    public boolean findNumber(String guess) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
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
        if (A == 4) {
            return true;
        }
        else {
            return false;
        }
    }
}
