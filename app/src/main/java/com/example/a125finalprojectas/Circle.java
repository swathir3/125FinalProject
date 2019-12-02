package com.example.a125finalprojectas;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class Circle {
    private int leftX;
    private int leftY;
    private int radius;
    private Paint paint;
    private RectF bounds;
    private int speedX;
    private int speedY;
    private int maxX;
    private int maxY;

    public Circle(int color) {
        paint = new Paint();
        paint.setColor(color);
        bounds = new RectF();
    }
    public void setCoords(int x, int y, int radius) {
        leftX = x;
        leftY = y;
        this.radius = radius;
        bounds.set(leftX, leftY, leftX+this.radius*2, leftY+this.radius*2);
    }
    public void setSpeed(int speedX, int speedY) {
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public void setMax(int maxx, int maxy) {
        this.maxX = maxx;
        this.maxY = maxy;
    }

    public void draw(Canvas canvas) {
        canvas.drawOval(bounds, paint);
        update();
    }

    private void update() {
        if (leftX+2*radius > maxX) {
            speedX = speedX * -1;
        } else if (leftX < 0) {
            speedX = speedX * -1;
        }
        if (leftY+2*radius > maxY) {
            speedY = speedY * -1;
        } else if (leftY < 0) {
            speedY = speedY * -1;
        }
        leftX = leftX + speedX;
        leftY = leftY + speedY;
        bounds.set(leftX, leftY, leftX+2*radius, leftY+2*radius);
    }
}

