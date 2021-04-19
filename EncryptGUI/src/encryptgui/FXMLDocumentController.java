/*
 * 專案：EncryptGUI
 * 檔名：FXMLDocumentController.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package encryptgui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

public class FXMLDocumentController implements Initializable {
    
    private Encrypt e;
    private String result;
    
    @FXML
    private Label display;
    
    @FXML
    private TextField input;
    
    @FXML
    private TextField output;
    
    @FXML
    private void newMethod(ActionEvent event) {
        e = new Encrypt();
        display.setText(e.code);
    }
    
    @FXML
    private void loadMethod(ActionEvent event) {
        try {
            FileReader fr = new FileReader("code.txt");
            BufferedReader r = new BufferedReader(fr);
            String ms = r.readLine();
            e = new Encrypt(ms);
            fr.close();
            display.setText("載入成功!");
        }
        catch (IOException ex) {
            display.setText("載入失敗!");
        }
        finally {
            output.setText("載入之後...");
        }
    }
    
    @FXML
    private void saveMethod(ActionEvent event) {
        try {
            if (e == null) {
                display.setText("沒有密碼物件!");
            }
            else {
                File f = new File("code.txt");
                FileWriter fw = new FileWriter(f);
                fw.write(String.valueOf(e.code));
                fw.close();
            }
            display.setText("儲存成功!");
        }
        catch (IOException ex) {
            display.setText("儲存失敗!");
        }
        finally {
            output.setText("存檔之後...");
        }
    }
    
    @FXML
    private void encodeMethod(ActionEvent event) {
        if (input.getText().isEmpty()) {
            display.setText("沒有輸入英文句子!");
        }
        else {
            if (e == null) {
                display.setText("沒有密碼物件!");
            }
            else {
                result = e.toEncode(input.getText());
                output.setText(result);
                display.setText("已編碼");
            }
        }
    }
    
    @FXML
    private void decodeMethod(ActionEvent event) {
        if (input.getText().trim().isEmpty()) {
            display.setText("沒有輸入英文句子!");
        }
        else {
            if (e == null) {
                display.setText("沒有密碼物件!");
            }
            else {
                result = e.toDecode(input.getText());
                output.setText(result);
                display.setText("已解碼");
            }
        }
    }
    
    @FXML
    private void copyMethod(ActionEvent event) {
        Clipboard clipboard = Clipboard.getSystemClipboard();
        ClipboardContent content = new ClipboardContent();
        content.putString(result);
        clipboard.setContent(content);
        display.setText("已拷貝");
    }
    
    @FXML
    private void clearMethod(ActionEvent event) {
        input.setText("");
        output.setText("");
        e = null;
        result = "";
        display.setText("已清除");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
