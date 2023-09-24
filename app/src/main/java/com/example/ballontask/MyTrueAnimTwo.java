package com.example.ballontask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.cazaea.sweetalert.SweetAlertDialog;

import java.util.Random;
//import taimoor.sultani.sweetalert2.Sweetalert;

public class MyTrueAnimTwo extends AppCompatActivity {

     ImageView yellobubble;
    private ImageView bluebubble;
    private ImageView violetbubble;
    private ImageView retbubble;
    private ImageView greenbubble;
    private ImageView redbubble1;
    private ImageView yellowbubble1;
    private ImageView bluebubble1;
    private ImageView violetbubble2;
    private ImageView greenbubble2;
    private ImageView bluebubble2;
    private ImageView yellobubble2;
    private ImageView redbubble2;
    String[] data={"yellow","red","blue","volite","green"};
    int val;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_true_anim_two);
        yellobubble = (ImageView) findViewById(R.id.yellobubble);
        bluebubble = (ImageView) findViewById(R.id.bluebubble);
        violetbubble = (ImageView) findViewById(R.id.violetbubble);
        retbubble = (ImageView) findViewById(R.id.retbubble);
        greenbubble = (ImageView) findViewById(R.id.greenbubble);
        redbubble1 = (ImageView) findViewById(R.id.redbubble1);
        yellowbubble1 = (ImageView) findViewById(R.id.yellowbubble1);
        bluebubble1 = (ImageView) findViewById(R.id.bluebubble1);
        violetbubble2 = (ImageView) findViewById(R.id.violetbubble2);
        greenbubble2 = (ImageView) findViewById(R.id.greenbubble2);
        bluebubble2 = (ImageView) findViewById(R.id.bluebubble2);
        yellobubble2 = (ImageView) findViewById(R.id.yellobubble2);
        redbubble2 = (ImageView) findViewById(R.id.redbubble2);
        Random random=new Random();


        final  View view5=findViewById(R.id.ll1);
        final  View view6=findViewById(R.id.ll2);
        final  View view7=findViewById(R.id.ll3);

        final SpringAnimation springAnim5 = new SpringAnimation(view5, DynamicAnimation.TRANSLATION_Y, 0);
        springAnim5.getSpring().setDampingRatio(SpringForce.DAMPING_RATIO_MEDIUM_BOUNCY);
        springAnim5.getSpring().setStiffness(SpringForce.STIFFNESS_VERY_LOW);
        springAnim5.animateToFinalPosition(-900f);
        springAnim5.start();

        final SpringAnimation springAnim6 = new SpringAnimation(view6, DynamicAnimation.TRANSLATION_Y, 0);
        springAnim6.getSpring().setDampingRatio(SpringForce.DAMPING_RATIO_MEDIUM_BOUNCY);
        springAnim6.getSpring().setStiffness(SpringForce.STIFFNESS_VERY_LOW);
        springAnim6.animateToFinalPosition(-900f);
        springAnim6.start();

        final SpringAnimation springAnim7 = new SpringAnimation(view7, DynamicAnimation.TRANSLATION_Y, 0);
        springAnim7.getSpring().setDampingRatio(SpringForce.DAMPING_RATIO_MEDIUM_BOUNCY);
        springAnim7.getSpring().setStiffness(SpringForce.STIFFNESS_VERY_LOW);
        springAnim7.animateToFinalPosition(-900f);
        springAnim7.start();

        val=0;
        Toast.makeText(this, data[val], Toast.LENGTH_SHORT).show();
        yellobubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(data[val].equals("yellow"))
                {
                    count++;
                    yellobubble.setVisibility(View.GONE);
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.bullonburst);
                    music.start();
                    val=2;

                    if(count<13)
                    {
                        Toast.makeText(MyTrueAnimTwo.this, data[val], Toast.LENGTH_SHORT).show();
                    }
                    else {
                        gameover();
                    }
                }
                else {
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.wrongsound);
                    music.start();
                }
            }
        });
        yellowbubble1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(data[val].equals("yellow"))
                {
                    count++;
                    yellowbubble1.setVisibility(View.GONE);
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.bullonburst);
                    music.start();
                    val=2;
                    if(count<13)
                    {
                        Toast.makeText(MyTrueAnimTwo.this, data[val], Toast.LENGTH_SHORT).show();
                    }
                    else {
                        gameover();
                    }
                }
                else {
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.wrongsound);
                    music.start();
                }
            }
        });
        yellobubble2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(data[val].equals("yellow"))
                {
                    count++;
                    yellobubble2.setVisibility(View.GONE);
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.bullonburst);
                    music.start();
                    val=2;
                    if(count<13)
                    {
                        Toast.makeText(MyTrueAnimTwo.this, data[val], Toast.LENGTH_SHORT).show();
                    }
                    else {
                        gameover();
                    }
                }
                else {
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.wrongsound);
                    music.start();
                }
            }
        });

        retbubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(data[val].equals("red"))
                {
                    count++;
                    retbubble.setVisibility(View.GONE);
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.bullonburst);
                    music.start();
                    val=4;
                    if(count<13)
                    {
                        Toast.makeText(MyTrueAnimTwo.this, data[val], Toast.LENGTH_SHORT).show();
                    }
                    else {
                        gameover();
                    }
                }
                else {
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.wrongsound);
                    music.start();
                }
            }
        });

        redbubble1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(data[val].equals("red"))
                {
                    count++;
                    redbubble1.setVisibility(View.GONE);
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.bullonburst);
                    music.start();
                    val=0;
                    if(count<13)
                    {
                        Toast.makeText(MyTrueAnimTwo.this, data[val], Toast.LENGTH_SHORT).show();
                    }
                    else {
                        gameover();
                    }
                }
                else {
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.wrongsound);
                    music.start();
                }
            }
        });

        redbubble2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(data[val].equals("red"))
                {
                    count++;
                    redbubble2.setVisibility(View.GONE);
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.bullonburst);
                    music.start();
                    val=0;
                    if(count<13)
                    {
                        Toast.makeText(MyTrueAnimTwo.this, data[val], Toast.LENGTH_SHORT).show();
                    }
                    else {
                        gameover();
                    }
                }
                else {
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.wrongsound);
                    music.start();
                }
            }
        });

        bluebubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(data[val].equals("blue"))
                {
                    count++;
                    bluebubble.setVisibility(View.GONE);
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.bullonburst);
                    music.start();
                    val=3;
                    if(count<13)
                    {
                        Toast.makeText(MyTrueAnimTwo.this, data[val], Toast.LENGTH_SHORT).show();
                    }
                    else {
                        gameover();
                    }
                }
                else {
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.wrongsound);
                    music.start();
                }
            }
        });

        bluebubble1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(data[val].equals("blue"))
                {
                    count++;
                    bluebubble1.setVisibility(View.GONE);
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.bullonburst);
                    val=3;
                    music.start();
                    if(count<13)
                    {
                        Toast.makeText(MyTrueAnimTwo.this, data[val], Toast.LENGTH_SHORT).show();
                    }
                    else {
                        gameover();
                    }
                }
                else {
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.wrongsound);
                    music.start();
                }
            }
        });

        bluebubble2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(data[val].equals("blue"))
                {
                    count++;
                    bluebubble2.setVisibility(View.GONE);
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.bullonburst);
                    music.start();
                    val=1;
                    if(count<13)
                    {
                        Toast.makeText(MyTrueAnimTwo.this, data[val], Toast.LENGTH_SHORT).show();
                    }
                    else {
                        gameover();
                    }
                }
                else {
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.wrongsound);
                    music.start();
                }
            }
        });


        violetbubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(data[val].equals("volite"))
                {
                    count++;
                    violetbubble.setVisibility(View.GONE);
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.bullonburst);
                    music.start();
                    val=1;
                    if(count<13)
                    {
                        Toast.makeText(MyTrueAnimTwo.this, data[val], Toast.LENGTH_SHORT).show();
                    }
                    else {
                        gameover();
                    }
                }
                else {
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.wrongsound);
                    music.start();
                }
            }
        });

        violetbubble2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(data[val].equals("volite"))
                {
                    count++;
                    violetbubble2.setVisibility(View.GONE);
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.bullonburst);
                    music.start();
                    val=4;
                    if(count<13)
                    {
                        Toast.makeText(MyTrueAnimTwo.this, data[val], Toast.LENGTH_SHORT).show();
                    }
                    else {
                        gameover();
                    }
                }
                else {
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.wrongsound);
                    music.start();
                }
            }
        });

        greenbubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(data[val].equals("green"))
                {
                    count++;
                    greenbubble.setVisibility(View.GONE);
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.bullonburst);
                    music.start();
                    val=1;
                    if(count<13)
                    {
                        Toast.makeText(MyTrueAnimTwo.this, data[val], Toast.LENGTH_SHORT).show();
                    }
                    else {
                        gameover();
                    }
                }
                else {
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.wrongsound);
                    music.start();
                }
            }
        });

        greenbubble2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(data[val].equals("green"))
                {
                    count++;
                    greenbubble2.setVisibility(View.GONE);
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.bullonburst);
                    music.start();
                    val=2;
                    if(count<13)
                    {
                        Toast.makeText(MyTrueAnimTwo.this, data[val], Toast.LENGTH_SHORT).show();
                    }
                    else {
                        gameover();
                    }

                }
                else {
                    MediaPlayer music = MediaPlayer.create(MyTrueAnimTwo.this, R.raw.wrongsound);
                    music.start();
                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }

    private void gameover() {

       SweetAlertDialog sweetAlertDialog= new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE);
        sweetAlertDialog.setTitleText("Game Over");
        sweetAlertDialog.setContentText("Press Ok To Re-Start Game");
        sweetAlertDialog.setConfirmText("Ok!");
        sweetAlertDialog.setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sweetAlertDialog) {
                Intent intent=getIntent();
                startActivity(intent);
            }
        });
        sweetAlertDialog.setCancelText("Exit");
        sweetAlertDialog.setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sweetAlertDialog) {
                finishAffinity();
            }
        });
        sweetAlertDialog.show();

//       Sweetalert sweetalert= new Sweetalert(this, Sweetalert.NORMAL_TYPE);
//        sweetalert.setTitleText("Game Over");
//        sweetalert.setContentText("Press Ok to Re-Start");
//        sweetalert.setCanceledOnTouchOutside(false);
//        sweetalert.setCancelText("OK!");
//        sweetalert.setCancelClickListener(new Sweetalert.OnSweetClickListener() {
//            @Override
//            public void onClick(Sweetalert sweetAlertDialog) {
//                Intent intent=getIntent();
//                startActivity(intent);
//            }
//        });
//        sweetalert.show();
    }
}