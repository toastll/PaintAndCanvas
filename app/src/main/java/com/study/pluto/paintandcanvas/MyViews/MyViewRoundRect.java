package com.study.pluto.paintandcanvas.MyViews;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;

/**
 * Created by admin on 2016/5/20.
 */
public class MyViewRoundRect extends View {

    private Context mContext = null;

    public MyViewRoundRect(Context context) {
        super(context);
        this.mContext = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint mPaint = new Paint();
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(30f);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setAntiAlias(true);

        canvas.drawRGB(255,255,255);

        /*float rx:生成圆角的椭圆的X轴半径
          float ry:生成圆角的椭圆的Y轴半径
          todo rx = ry 可以生成圆角，  rx>ry 生成的圆角在X方向上较长， rx <ry 生成的圆角在y方向上较长*/

        /*方式1 线构造出矩形，再添加弧度*/
        RectF rectF = new RectF(100f,100f,400f,400f);
        canvas.drawRoundRect(rectF, 40f, 5f, mPaint);

        /*方式2  直接构造圆角矩形  不推荐【出错 为成功 不推荐】*/
//        canvas.drawRoundRect(100f,100F,300F,400F,10f,10f,mPaint);
    }
}
