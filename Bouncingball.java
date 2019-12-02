package com.example.bouncy;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

import java.util.ArrayList;
import java.util.Iterator;

public class Bouncingball extends View {
    int maxX; //width of screen
    int maxY; //height of screen
    private Circle ball;
    public ArrayList<Circle> ballList = new ArrayList<Circle>();

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        maxX = w;
        maxY = h;

        Iterator g = ballList.iterator();
        while(g.hasNext()) {
            Circle ball = (Circle) g.next();
            ball.setMax(maxX, maxY);
        }
    }

    public Bouncingball(Context context) {
        super(context);
        //ball one
        ball = new Circle(Color.BLUE);
        ball.setCoords(0,0,80);
        ball.setSpeed(5,5);
        ballList.add(ball);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator its = ballList.iterator();
        while(its.hasNext()) {
            Circle ball = (Circle) its.next();
            ball.draw(canvas);
        }
        invalidate();
    }

}
