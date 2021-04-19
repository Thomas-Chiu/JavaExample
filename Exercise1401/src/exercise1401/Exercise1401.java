/*
 * 專案：Exercise1401
 * 檔名：Exercise1401.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise1401;

import java.util.Scanner;

public class Exercise1401 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Guess guess = new Guess();
        int user_guess = scanner.nextInt();
        if (user_guess == guess.getAnswer()) {
            System.out.println("恭喜猜對！");
        }
        else {
            System.out.println("猜錯囉！");
        }
    }
    
}
