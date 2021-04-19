/*
 * 專案：Exercise1503
 * 檔名：Exercise1503.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise1503;

import java.util.Scanner;

public class Exercise1503 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Guess guess = new Guess();
        while (true) {
            String user_guess = scanner.nextLine();
            if (guess.test(user_guess)) {
                System.out.println("恭喜猜對！");
                break;
            }
            else {
                System.out.println(guess.getAB());
            }
        }
    }
    
}
