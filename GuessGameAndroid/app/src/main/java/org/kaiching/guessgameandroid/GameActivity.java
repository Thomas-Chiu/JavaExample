package org.kaiching.guessgameandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    int number;
    int count;
    String user_input;
    Guess game;
    TextView display;
    Button button_home, button_new, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Intent intent = this.getIntent();
        number = intent.getIntExtra("number", 4);
        display = (TextView)findViewById(R.id.display);
        //display.setText(Integer.toString(number));

        button_home = (Button) findViewById(R.id.button_home);
        button_new = (Button) findViewById(R.id.button_start);
        button_1 = (Button) findViewById(R.id.button_1);
        button_2 = (Button) findViewById(R.id.button_2);
        button_3 = (Button) findViewById(R.id.button_3);
        button_4 = (Button) findViewById(R.id.button_4);
        button_5 = (Button) findViewById(R.id.button_5);
        button_6 = (Button) findViewById(R.id.button_6);
        button_7 = (Button) findViewById(R.id.button_7);
        button_8 = (Button) findViewById(R.id.button_8);
        button_9 = (Button) findViewById(R.id.button_9);
        button_0 = (Button) findViewById(R.id.button_0);

        button_1.setEnabled(false);
        button_2.setEnabled(false);
        button_3.setEnabled(false);
        button_4.setEnabled(false);
        button_5.setEnabled(false);
        button_6.setEnabled(false);
        button_7.setEnabled(false);
        button_8.setEnabled(false);
        button_9.setEnabled(false);
        button_0.setEnabled(false);

        button_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main2ActivityIntent = new Intent(GameActivity.this, MainActivity.class);
                startActivity(main2ActivityIntent);
            }
        });

        button_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game = new Guess(number);
                count = 0;
                user_input = "";
                display.setText("");
                button_1.setEnabled(true);
                button_2.setEnabled(true);
                button_3.setEnabled(true);
                button_4.setEnabled(true);
                button_5.setEnabled(true);
                button_6.setEnabled(true);
                button_7.setEnabled(true);
                button_8.setEnabled(true);
                button_9.setEnabled(true);
                button_0.setEnabled(true);
                display.append("遊戲開始\n");
            }
        });

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count != number) {
                    user_input += "1";
                    count += 1;
                    display.append("1");
                    if (count == number) {
                        getResult();
                    }
                }
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count != number) {
                    user_input += "2";
                    count += 1;
                    display.append("2");
                    if (count == number) {
                        getResult();
                    }
                }
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count != number) {
                    user_input += "3";
                    count += 1;
                    display.append("3");
                    if (count == number) {
                        getResult();
                    }
                }
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count != number) {
                    user_input += "4";
                    count += 1;
                    display.append("4");
                    if (count == number) {
                        getResult();
                    }
                }
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count != number) {
                    user_input += "5";
                    count += 1;
                    display.append("5");
                    if (count == number) {
                        getResult();
                    }
                }
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count != number) {
                    user_input += "6";
                    count += 1;
                    display.append("6");
                    if (count == number) {
                        getResult();
                    }
                }
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count != number) {
                    user_input += "7";
                    count += 1;
                    display.append("7");
                    if (count == number) {
                        getResult();
                    }
                }
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count != number) {
                    user_input += "8";
                    count += 1;
                    display.append("8");
                    if (count == number) {
                        getResult();
                    }
                }
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count != number) {
                    user_input += "9";
                    count += 1;
                    display.append("9");
                    if (count == number) {
                        getResult();
                    }
                }
            }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count != number) {
                    user_input += "0";
                    count += 1;
                    display.append("0");
                    if (count == number) {
                        getResult();
                    }
                }
            }
        });
    }

    void getResult() {
        display.append(": ");
        count = 0;
        game.ABCounter(user_input);
        if (game.findNumber(user_input)) {
            display.append("數字重複！\n");
        }
        else {
            if (game.getAB().equals("4A0B")) {
                display.append("恭喜猜對！\n");
                button_1.setEnabled(false);
                button_2.setEnabled(false);
                button_3.setEnabled(false);
                button_4.setEnabled(false);
                button_5.setEnabled(false);
                button_6.setEnabled(false);
                button_7.setEnabled(false);
                button_8.setEnabled(false);
                button_9.setEnabled(false);
                button_0.setEnabled(false);
            }
            else {
                display.append(game.getAB() + "\n");
            }
        }
        user_input = "";
    }
}
