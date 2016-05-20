package com.study.pluto.paintandcanvas.MyViews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by admin on 2016/5/20.
 */
public class MyViewPoints extends View {

    private Context mContext = null;

    public MyViewPoints(Context context) {
        super(context);
        this.mContext = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.RED);
//        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(40f);/*设置画笔宽度，画点时，以点的坐标点为中心，点的宽高为此处的 40f/2*/
        mPaint.setShadowLayer(0,100,100,Color.BLUE);/*为毛感觉设了阴影层没个卵用？*/

        /*设置画布颜色*/
        canvas.drawRGB(255,255,255);

        float[] pts = {80,40, 200,200};
        /*此处用法与DrawLines的用法相同
        * offset: 集合中跳过的数值个数，注意不是点的个数！一个点是两个数值；
        * count:参与绘制的数值的个数，指pts[]里人数值个数，而不是点的个数，因为一个点是两个数值*/
        canvas.drawPoints(pts,1,2,mPaint);
//        canvas.drawPoints(pts,mPaint);
    }
}
