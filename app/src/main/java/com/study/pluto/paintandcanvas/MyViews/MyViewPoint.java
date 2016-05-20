package com.study.pluto.paintandcanvas.MyViews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by admin on 2016/5/20.
 */
public class MyViewPoint extends View {

    private Context mContext = null;


    public MyViewPoint(Context context) {
        super(context);
        this.mContext = context;
    }

    public MyViewPoint(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
    }

    public MyViewPoint(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint mPaint = new Paint();
        mPaint.setAntiAlias(true);/*设置抗锯齿，平滑*/
        mPaint.setStrokeWidth(50f);/*设置画笔宽度,画点时，画笔的宽度会决定点的宽度*/
        mPaint.setShadowLayer(10f,100,100, Color.BLUE);
        mPaint.setColor(Color.GREEN);

        canvas.drawRGB(255,255,255);
        canvas.drawPoint(100,100,mPaint);


    }
}
