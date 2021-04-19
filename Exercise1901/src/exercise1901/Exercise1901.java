/*
 * 專案：Exercise1901
 * 檔名：Exercise1901.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise1901;

import java.util.Scanner;

public class Exercise1901 {
    Guess guess;
    Scanner scanner;
    
    public Exercise1901() {
        guess = new Guess();
        scanner = new Scanner(System.in);
    }

    
    public static void main(String[] args) {
        Exercise1901 game = new Exercise1901();
        while (true) {
            String user_guess = game.scanner.nextLine();
            if (user_guess.length() != 4) {
                System.out.println("長度不符！");
                continue;
            }
            if (game.guess.findNumber(user_guess)) {
                System.out.println("數字重複！");
                continue;
            }
            if (game.guess.test(user_guess)) {
                System.out.println("恭喜猜對！");
                System.out.println("一共猜了" + Integer.toString(game.guess.getTimes()) + "次！");
                break;
            }
            else {
                System.out.println(game.guess.getAB());
            }
        }
    }
    
}
