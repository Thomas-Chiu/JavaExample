/*
 * 專案：GuessGameDemo
 * 檔名：FXMLDocumentController.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package guessgamedemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;

public class FXMLDocumentController implements Initializable {
    int number;
    int count;
    String user_input;
    Guess game;
    
    @FXML
    private TextArea display;
    
    @FXML
    private Button button1;
    
    @FXML
    private Button button2;
    
    @FXML
    private Button button3;
    
    @FXML
    private Button button4;
    
    @FXML
    private Button button5;
    
    @FXML
    private Button button6;
    
    @FXML
    private Button button7;
    
    @FXML
    private Button button8;
    
    @FXML
    private Button button9;
    
    @FXML
    private Button button0;
    
    public FXMLDocumentController() {
        number = 4;
        count = 0;
        user_input = "";
        game = new Guess();
    }
    
    @FXML
    private void handleButton1Action(ActionEvent event) {
        if (count != number) {
            user_input += "1";
            count += 1;
            display.appendText("1");
            if (count == number) {
                getResult();
            }
        }
    }
    
    @FXML
    private void handleButton2Action(ActionEvent event) {
        if (count != number) {
            user_input += "2";
            count += 1;
            display.appendText("2");
            if (count == number) {
                getResult();
            }
        }
    }
    
    @FXML
    private void handleButton3Action(ActionEvent event) {
        if (count != number) {
            user_input += "3";
            count += 1;
            display.appendText("3");
            if (count == number) {
                getResult();
            }
        }
    }
    
    @FXML
    private void handleButton4Action(ActionEvent event) {
        if (count != number) {
            user_input += "4";
            count += 1;
            display.appendText("4");
            if (count == number) {
                getResult();
            }
        }
    }
    
    @FXML
    private void handleButton5Action(ActionEvent event) {
        if (count != number) {
            user_input += "5";
            count += 1;
            display.appendText("5");
            if (count == number) {
                getResult();
            }
        }
    }
    
    @FXML
    private void handleButton6Action(ActionEvent event) {
        if (count != number) {
            user_input += "6";
            count += 1;
            display.appendText("6");
            if (count == number) {
                getResult();
            }
        }
    }
    
    @FXML
    private void handleButton7Action(ActionEvent event) {
        if (count != number) {
            user_input += "7";
            count += 1;
            display.appendText("7");
            if (count == number) {
                getResult();
            }
        }
    }
    
    @FXML
    private void handleButton8Action(ActionEvent event) {
        if (count != number) {
            user_input += "8";
            count += 1;
            display.appendText("8");
            if (count == number) {
                getResult();
            }
        }
    }
    
    @FXML
    private void handleButton9Action(ActionEvent event) {
        if (count != number) {
            user_input += "9";
            count += 1;
            display.appendText("9");
            if (count == number) {
                getResult();
            }
        }
    }
    
    @FXML
    private void handleButton0Action(ActionEvent event) {
        if (count != number) {
            user_input += "0";
            count += 1;
            display.appendText("0");
            if (count == number) {
                getResult();
            }
        }
    }
    
    @FXML
    private void newGameAction(ActionEvent event) {
        display.clear();
        count = 0;
        user_input = "";
        game = new Guess();
        button1.setDisable(false);
        button2.setDisable(false);
        button3.setDisable(false);
        button4.setDisable(false);
        button5.setDisable(false);
        button6.setDisable(false);
        button7.setDisable(false);
        button8.setDisable(false);
        button9.setDisable(false);
        button0.setDisable(false);
        display.appendText("遊戲開始\n");
    }
    
    private void getResult() {
        display.appendText(": ");
        count = 0;
        game.ABCounter(user_input);
        if (game.findNumber(user_input)) {
            display.appendText("數字重複！\n");
        }
        else {
            if (game.getAB().equals("4A0B")) {
                display.appendText("恭喜猜對！\n");
                button1.setDisable(true);
                button2.setDisable(true);
                button3.setDisable(true);
                button4.setDisable(true);
                button5.setDisable(true);
                button6.setDisable(true);
                button7.setDisable(true);
                button8.setDisable(true);
                button9.setDisable(true);
                button0.setDisable(true);
            }
            else {
                display.appendText(game.getAB() + "\n");
            }
        }
        user_input = "";
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
