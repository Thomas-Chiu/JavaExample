/*
 * 《程式語言教學誌》的範例檔案
 * 專案：EncryptAndroid
 * 檔名：MainActivity.java
 * 作者：張凱慶
 * 網站：https://kaiching.org
 */
package org.kaiching.encryptandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_start = (Button) findViewById(R.id.button_start);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main2ActivityIntent = new Intent(MainActivity.this, EncodeActivity.class);
                startActivity(main2ActivityIntent);
            }
        });
    }
}
