package org.kaiching.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count;

    public MainActivity() {
        count = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button_click = (Button)findViewById(R.id.button);
        final TextView text_display = (TextView)findViewById(R.id.textView);
        button_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count += 1;
                if (count % 2 == 0) {
                    text_display.setText(R.string.text_hello);
                    button_click.setText(R.string.click_me);
                }
                else {
                    text_display.setText(R.string.text_world);
                    button_click.setText(R.string.click_again);
                }
            }
        });
    }
}
