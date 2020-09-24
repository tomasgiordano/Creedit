package com.example.creedit;


import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.alarmados.R;
import com.hanks.htextview.evaporate.EvaporateTextView;
import com.hanks.htextview.scale.ScaleTextView;

public class splashActivity extends AppCompatActivity {

    private final int DURACION_SPLASH = 4000;
    Context mContext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splashscreen);

        EvaporateTextView tv1 = (EvaporateTextView) findViewById(R.id.textView1);
        EvaporateTextView tv2 = (EvaporateTextView) findViewById(R.id.textView2);
        tv1.animateText("Tomás Giordano");
        tv2.animateText("4°A");

        Animation middleAnimation = AnimationUtils.loadAnimation(this,R.anim.middle_animation);
        ImageView imageView = findViewById(R.id.imageView2);
        imageView.setAnimation(middleAnimation);


        new Handler().postDelayed(new Runnable() {
            public void run()
            {
                Intent intent = new Intent(splashActivity.this, AuthActivity.class);
                startActivity(intent);
                finish();
            }
        }, DURACION_SPLASH);
    }


}
