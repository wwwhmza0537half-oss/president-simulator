package com.presidentsimulator.game;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(40, 40, 40, 40);
        layout.setBackgroundColor(Color.rgb(20, 30, 45));

        TextView title = new TextView(this);
        title.setText("محاكاة الرئيس");
        title.setTextSize(32);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);

        TextView description = new TextView(this);
        description.setText("\nأنت رئيس الدولة\nاتخذ القرارات وقُد البلاد.");
        description.setTextSize(20);
        description.setTextColor(Color.WHITE);
        description.setGravity(Gravity.CENTER);

        Button startButton = new Button(this);
        startButton.setText("ابدأ اللعبة");

        layout.addView(title);
        layout.addView(description);
        layout.addView(startButton);

        setContentView(layout);
    }
}
