package org.kaiching.guessgameandroid;

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

        Button button_03 = (Button) findViewById(R.id.button_3);
        button_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main2ActivityIntent = new Intent(MainActivity.this, GameActivity.class);
                main2ActivityIntent.putExtra("number", 3);
                startActivity(main2ActivityIntent);
            }
        });

        Button button_04 = (Button) findViewById(R.id.button_04);
        button_04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main2ActivityIntent = new Intent(MainActivity.this, GameActivity.class);
                main2ActivityIntent.putExtra("number", 4);
                startActivity(main2ActivityIntent);
            }
        });

        Button button_05 = (Button) findViewById(R.id.button_5);
        button_05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main2ActivityIntent = new Intent(MainActivity.this, GameActivity.class);
                main2ActivityIntent.putExtra("number", 5);
                startActivity(main2ActivityIntent);
            }
        });

        Button button_06 = (Button) findViewById(R.id.button_6);
        button_06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main2ActivityIntent = new Intent(MainActivity.this, GameActivity.class);
                main2ActivityIntent.putExtra("number", 6);
                startActivity(main2ActivityIntent);
            }
        });
    }
}
