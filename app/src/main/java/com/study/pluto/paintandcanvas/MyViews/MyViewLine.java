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
public class MyViewLine extends View{

    private Context mContext;

    public MyViewLine(Context context) {
        super(context);
        this.mContext = context;
    }

    public MyViewLine(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewLine(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint mPaint = new Paint();
        mPaint.setAntiAlias(true);/*抗锯齿*/
        mPaint.setShadowLayer(40,100,100, Color.BLACK);
        mPaint.setStrokeWidth(5);/*设置画笔宽度*/
        mPaint.setColor(Color.RED);

        /*画出画布的背景色*/
        canvas.drawRGB(150,150,150);

        /*@param float startX
        * @param float startY
        * @param float stopX
        * @param float stopY
        * @param paint
        * */
        canvas.drawLine(10,10, 250,250, mPaint);


    }
}
