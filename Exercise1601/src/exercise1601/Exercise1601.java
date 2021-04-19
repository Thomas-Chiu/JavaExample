/*
 * 專案：Exercise1601
 * 檔名：Exercise1601.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package exercise1601;

import java.util.Scanner;

public class Exercise1601 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Guess guess = new Guess();
        while (true) {
            String user_guess = scanner.nextLine();
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
