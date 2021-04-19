/*
 * 專案：Exercise1502
 * 檔名：Exercise1502.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise1502;

import java.util.Scanner;

public class Exercise1502 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Guess guess = new Guess();
        String user_guess = scanner.nextLine();
        if (guess.test(user_guess)) {
            System.out.println("恭喜猜對！");
        }
        else {
            System.out.println(guess.getAB());
        }
    }
    
}
