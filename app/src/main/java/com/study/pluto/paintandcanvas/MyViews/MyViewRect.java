package com.study.pluto.paintandcanvas.MyViews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by admin on 2016/5/20.
 */
public class MyViewRect extends View {

    private Context mContext = null;

    public MyViewRect(Context context) {
        super(context);
        this.mContext = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint mPaint = new Paint();
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(30f);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);

        canvas.drawRGB(255,255,255);
        /*@param float left, 相对于X方向的偏移值，即矩形左边为 横坐标为left的一条线
          @param float top, 相对于Y方向的偏移值，即矩形上边为 纵坐标为top的一条线
          @param float right, 相对于X方向的偏移值，即矩形右边为 横坐标为right的一条线
          @param float bottom 相对于Y方向的偏移值，即矩形底边为 纵坐标为top的一条线
          上述4条线围成的矩形，即为所画矩形*/
        /*方式1： 直接传入4个值，以及画笔*/
//        canvas.drawRect(50,10,100, 100,mPaint);

        /*方式2： 先构建一个矩形Rect对象，然后传入该Rect对象和画笔*/
//        Rect rect = new Rect(100,200,600,400);/*值为整形*/
//        canvas.drawRect(rect,mPaint);

        /*方式3： 先构建一个矩形Rect对象，然后传入该Rect对象和画笔*/
        RectF rectF = new RectF(55.5f,10.1f,250.2f,520.5f);/*值为浮点型*/
        canvas.drawRect(rectF,mPaint);
    }
}
