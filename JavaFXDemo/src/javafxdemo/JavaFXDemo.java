/*
 * 檔名：JavaFXDemo.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package javafxdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXDemo extends Application {
    private int count = 0;
    
    @Override
    public void start(Stage primaryStage) {
        // VBox 為排版需要的視窗元件
        VBox root = new VBox();
        
        // Label 為視窗元件
        Label display = new Label();
        display.setText("你好");
        
        // Button 為視窗元件
        Button click_button = new Button();
        click_button.setText("按我");
        click_button.setOnAction(new EventHandler<ActionEvent>() {
            
            // 以下為按下按鈕的執行方法
            @Override
            public void handle(ActionEvent event) {
                count += 1;
                if (count % 2 == 0) {
                    display.setText("你好");
                    click_button.setText("按我");
                }
                else {
                    display.setText("世界");
                    click_button.setText("再按");
                }   
            }
        });
        
        // 依序設定加入視窗元件、設定對齊及編距
        root.getChildren().add(click_button);
        root.getChildren().add(display);
        root.setAlignment(Pos.CENTER);
        VBox.setMargin(click_button, new Insets(10, 10, 10, 10));
        VBox.setMargin(display, new Insets(10, 10, 10, 10));
        
        // 設定視窗尺寸
        Scene scene = new Scene(root, 250, 250);
 
        // 設定標題及視窗
        primaryStage.setTitle("JavaFX Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
