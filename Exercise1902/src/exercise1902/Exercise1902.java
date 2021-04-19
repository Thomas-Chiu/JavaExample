/*
 * 專案：Exercise1902
 * 檔名：Exercise1902.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise1902;

import java.util.Scanner;

public class Exercise1902 {
    Guess guess;
    Scanner scanner;
    
    public Exercise1902() {
        guess = new Guess();
        scanner = new Scanner(System.in);
    }
    
    public void run() {
        while (true) {
            String user_guess = scanner.nextLine();
            if (user_guess.length() != 4) {
                System.out.println("長度不符！");
                continue;
            }
            if (guess.findNumber(user_guess)) {
                System.out.println("數字重複！");
                continue;
            }
            if (guess.test(user_guess)) {
                System.out.println("恭喜猜對！");
                System.out.println("一共猜了" + Integer.toString(guess.getTimes()) + "次！");
                break;
            }
            else {
                System.out.println(guess.getAB());
            }
        }
    }

    
    public static void main(String[] args) {
        Exercise1902 game = new Exercise1902();
        game.run();
    }
    
}
