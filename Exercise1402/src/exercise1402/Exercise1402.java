/*
 * 專案：Exercise1402
 * 檔名：Exercise1402.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise1402;

import java.util.Scanner;

public class Exercise1402 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Guess guess = new Guess();
        String user_guess = scanner.nextLine();
        if (user_guess.equals(guess.getAnswer())) {
            System.out.println("恭喜猜對！");
        }
        else {
            System.out.println("猜錯囉！");
        }
    }
    
}
