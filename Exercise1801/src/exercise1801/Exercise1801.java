/*
 * 專案：Exercise1801
 * 檔名：Exercise1801.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise1801;

import java.util.Scanner;

public class Exercise1801 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Guess guess = new Guess();
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
    
}
