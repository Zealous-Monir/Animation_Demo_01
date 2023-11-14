package com.example.animationdemo_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button buttonID;
    ImageView imageViewID;
  //  Animation myAnim;
    Animation up_down_cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonID = findViewById(R.id.buttonID);
        imageViewID = findViewById(R.id.imageViewID);

     //   myAnim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.my_anim);
        up_down_cont = AnimationUtils.loadAnimation(MainActivity.this,R.anim.up_down_cont);

        buttonID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imageViewID.startAnimation(up_down_cont);

            }
        });


    }
}