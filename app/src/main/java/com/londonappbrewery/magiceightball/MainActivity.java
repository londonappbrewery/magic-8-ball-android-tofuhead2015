package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button rollButton;
        rollButton = findViewById(R.id.rollButton);

        final ImageView ball = findViewById(R.id.ball);

        final int[] ballArray = new int[] {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);
                Log.d("Dicee", "The number for the left dice is " + number);

                int imageResourceId = ballArray[number];
                ball.setImageResource(imageResourceId);

            }
        });
    }
}
