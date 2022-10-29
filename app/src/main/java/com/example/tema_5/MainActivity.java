package com.example.tema_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View spin = new Dibujar(this);
        setContentView(spin);
//        spin.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate));
       // spin.startAnimation(AnimationUtils.loadAnimation(this, R.anim.alpha));
//       spin.startAnimation(AnimationUtils.loadAnimation(this,R.anim.traslate));
        spin.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale));
    }
}

class Dibujar extends View{
    Paint pincel = new Paint();
    public Dibujar(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        pincel.setColor(Color.RED);
        pincel.setStrokeWidth(10);
        pincel.setStyle(Paint.Style.FILL);
        canvas.drawRect(400,400,200,200,pincel);

        pincel.setColor(Color.WHITE);
        pincel.setStyle(Paint.Style.FILL);
        canvas.drawCircle(200,200,100,pincel);
        canvas.drawCircle(200,400,100,pincel);
        canvas.drawCircle(400,400,100,pincel);
        canvas.drawCircle(400,200,100,pincel);

        pincel.setColor(Color.BLUE);
        pincel.setStrokeWidth(10);
        pincel.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(300,300,90,pincel);

        pincel.setColor(Color.BLUE);
        pincel.setStyle(Paint.Style.FILL);
        pincel.setTextSize(50);
        canvas.drawText("C E S T E",400,320,pincel);
    }
}