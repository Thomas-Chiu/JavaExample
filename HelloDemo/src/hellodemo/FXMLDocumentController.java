/*
 * 專案：HelloDemo
 * 檔名：FXMLDocumentController.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package hellodemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {
    private int count;
    
    public FXMLDocumentController() {
        count = 0;
    }
    
    @FXML
    private Label label;
    
    @FXML
    private Button button;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        count += 1;
        if (count % 2 == 0) {
            label.setText("你好");
            button.setText("點我");
        }
        else {
            label.setText("世界");
            button.setText("再點");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
