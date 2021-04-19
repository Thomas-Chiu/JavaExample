/*
 * 專案：Exercise1501
 * 檔名：Guess.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise1501;

public class Guess {
    private String answer;
    
    public Guess() {
        answer = "1234";
    }
    
    public String getAnswer() {
        return answer;
    }
    
    public boolean test(String guess) {
        if (guess.equals(answer)) {
            return true;
        }
        else {
            return false;
        }
    }
}
