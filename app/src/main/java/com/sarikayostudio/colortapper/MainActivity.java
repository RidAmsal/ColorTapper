package com.sarikayostudio.colortapper;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.media.MediaPlayer;
import android.support.annotation.ColorRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import sarikayostudio.com.colortapper.R;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12;
    private String[] colorPallate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.B1);
        button2 = (Button) findViewById(R.id.B2);
        button3 = (Button) findViewById(R.id.B3);
        button4 = (Button) findViewById(R.id.B4);
        button5 = (Button) findViewById(R.id.B5);
        button6 = (Button) findViewById(R.id.B6);
        button7 = (Button) findViewById(R.id.B7);
        button8 = (Button) findViewById(R.id.B8);
        button9 = (Button) findViewById(R.id.B9);
        button10 = (Button) findViewById(R.id.B10);
        button11 = (Button) findViewById(R.id.B11);
        button12 = (Button) findViewById(R.id.B12);


        Button [] buttonArray = {button1,button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12};
        int [] color= {R.color.red, R.color.sweetorange, R.color.softpink, R.color.bluegray, R.color.choco, R.color.deeppurple, R.color.sourlime,
                R.color.skyblue, R.color.shadegrey, R.color.leafgreen, R.color.purewhite, R.color.black};

                for(int i=0; i<buttonArray.length;i++){
                    changeColorPressed(buttonArray[i], color[i]);

                }

    }
    private void changeColorPressed(Button b, int color){
        StateListDrawable states = new StateListDrawable();
        states.addState(new int[] {android.R.attr.state_pressed}, new ColorDrawable(getResources()
                .getColor(color)));
        states.addState(new int[] {}, new ColorDrawable(getResources().getColor(R.color.common_google_signin_btn_text_dark_pressed)));

        b.setBackground(states);
//
    }

}
