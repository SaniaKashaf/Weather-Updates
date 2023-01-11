package com.sandipbhattacharya.weatherupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class mysplash extends AppCompatActivity {
    Animation animation,animation9;
    TextView textView00;
    ImageView imageView99;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mysplash);

        textView00=findViewById(R.id.mttext);
        imageView99=findViewById(R.id.myimage);
        animation= AnimationUtils.loadAnimation(mysplash.this,R.anim.top_animation);
        animation9= AnimationUtils.loadAnimation(mysplash.this,R.anim.bottom_animation);
        imageView99.setAnimation(animation);
        textView00.setAnimation(animation9);

new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
        Intent i=new Intent(mysplash.this,MainActivity.class);
        startActivity(i);
    }
},3000);


    }
}