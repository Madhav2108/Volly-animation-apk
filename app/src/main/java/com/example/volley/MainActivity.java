<<<<<<< HEAD
package com.example.volley;

import android.animation.Animator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    TextView qu,tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image=findViewById(R.id.image);
        qu=findViewById(R.id.qu);
        tv=findViewById(R.id.tv);





                YoYo.with(Techniques.FadeIn)
                        .duration(9000).withListener
                        (new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animation) {

                            }

                            @Override
                            public void onAnimationEnd(Animator animation) {
                                YoYo.with(Techniques.RubberBand).duration(3000).playOn(qu);
                            }

                            @Override
                            public void onAnimationCancel(Animator animation) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animation) {

                            }
                        }).playOn(image);
                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        try {
                            Thread.sleep(1000);
                            finish();

                            startActivity(new Intent(MainActivity.this, secondActivity.class));

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                    }
                }).start();


    }
=======
package com.example.volley;

import android.animation.Animator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    TextView qu,tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image=findViewById(R.id.image);
        qu=findViewById(R.id.qu);
        tv=findViewById(R.id.tv);





                YoYo.with(Techniques.FadeIn)
                        .duration(9000).withListener
                        (new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animation) {

                            }

                            @Override
                            public void onAnimationEnd(Animator animation) {
                                YoYo.with(Techniques.RubberBand).duration(3000).playOn(qu);
                            }

                            @Override
                            public void onAnimationCancel(Animator animation) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animation) {

                            }
                        }).playOn(image);
                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        try {
                            Thread.sleep(1000);
                            finish();

                            startActivity(new Intent(MainActivity.this, secondActivity.class));

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                    }
                }).start();


    }
>>>>>>> c95cebe... new
}