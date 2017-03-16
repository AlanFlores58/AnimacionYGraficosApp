package com.example.alanflores.animacionygraficosapp;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageFrameAnimation;
    private Animation animation;
    private Button buttonTweenAnimation, buttonFrameAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonFrameAnimation = (Button) findViewById(R.id.button_frame_animation);
        buttonTweenAnimation = (Button) findViewById(R.id.button_tween_animation);

        imageFrameAnimation = (ImageView) findViewById(R.id.imageViewFrameAnimation);

        buttonFrameAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageFrameAnimation.setBackgroundResource(R.drawable.frame_anmination);
                AnimationDrawable animationDrawable = (AnimationDrawable) imageFrameAnimation.getBackground();
                animationDrawable.start();
                buttonFrameAnimation.setBackgroundResource(R.drawable.shape_button);
                buttonTweenAnimation.setBackgroundResource(android.R.drawable.btn_default);
            }
        });

        buttonTweenAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.tween_anmination);
                imageFrameAnimation.startAnimation(animation);
                buttonTweenAnimation.setBackgroundResource(R.drawable.shape_button);
                buttonFrameAnimation.setBackgroundResource(android.R.drawable.btn_default);
            }
        });
    }
}
