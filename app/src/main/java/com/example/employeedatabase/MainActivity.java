package com.example.employeedatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout l1;
    private LinearLayout l2;
    private TextView txt;
    Animation transition;
    Animation transition2;
    //Animation bslide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      l1=findViewById(R.id.l1);
      l2=findViewById(R.id.l2);

      txt=findViewById(R.id.txt1);
      transition= AnimationUtils.loadAnimation(this,R.anim.transition);
      transition2= AnimationUtils.loadAnimation(this,R.anim.transition2);
      //bslide= AnimationUtils.loadAnimation(this,R.anim.bslide);
      l1.setAnimation(transition);
      l2.setAnimation(transition2);
       final Intent i=new Intent(MainActivity.this,AdminEmployee.class);
       Thread timer=new Thread() {
          public void run(){
              try{
                  sleep(2000);
              }
              catch(InterruptedException e)
              {
                  e.printStackTrace();
              }
              finally {
                  startActivity(i);
                  finish();
              }
          }

       };
       timer.start();
    }
}
