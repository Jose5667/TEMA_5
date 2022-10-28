package com.example.tema_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Dibujar(this));
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
        pincel.setColor(Color.BLUE);
        pincel.setStrokeWidth(10);
        pincel.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(300,300,90,pincel);

    }
}