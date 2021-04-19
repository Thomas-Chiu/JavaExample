/*
 * 《程式語言教學誌》的範例檔案
 * 專案：EncryptAndroid
 * 檔名：EncodeActivity.java
 * 作者：張凱慶
 * 網站：https://kaiching.org
 */
package org.kaiching.encryptandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.ClipboardManager;
import android.content.ClipData;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EncodeActivity extends AppCompatActivity {
    private Encrypt e;
    private String result;

    private Button button_encode;
    private EditText input_text;
    private TextView display_text;
    private Button button_copy;
    private Button button_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encode);

        button_encode = (Button) findViewById(R.id.button_encode);
        input_text = (EditText) findViewById(R.id.input_text);
        display_text = (TextView) findViewById(R.id.display_text);
        button_encode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e = new Encrypt();
                result = e.toEncode(input_text.getText().toString());
                display_text.setText(result);
            }
        });

        button_copy = (Button) findViewById(R.id.button_copy);
        button_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData data = ClipData.newPlainText("text", result);
                clipboard.setPrimaryClip(data);
            }
        });

        button_home = (Button) findViewById(R.id.button_home);
        button_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main2ActivityIntent = new Intent(EncodeActivity.this, MainActivity.class);
                startActivity(main2ActivityIntent);
            }
        });
    }

}
