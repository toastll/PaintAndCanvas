package com.study.pluto.paintandcanvas.MyViews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by admin on 2016/5/20.
 */
public class MyViewArc extends View {

    private Context mContext = null;

    public MyViewArc(Context context) {
        super(context);
        this.mContext = context;
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

         /*实现画笔的基本属性*/
        Paint mPaint = new Paint();
        mPaint.setAntiAlias(true);/*设置抗锯齿【抗锯齿 边缘柔化，减少明显的棱角】*/
        mPaint.setColor(Color.RED);/*设置画笔颜色*/
        /*设置填充样式  Style.FILL/Style.FILL_AND_STROKE/Style.STROKE等等 还有很多*/
//        mPaint.setStyle(Paint.Style.FILL);/*完全填充*/
        mPaint.setStyle(Paint.Style.STROKE);/*只填充描边 */
        mPaint.setAlpha(255);/*设置透明度 0~255 【需要注意的是： alpha的值为0时才是全透明】*/
        mPaint.setStrokeWidth(5);/*设置画笔宽度*/
        /*float radius, float dx, float dy, int shadowColor*/
        mPaint.setShadowLayer(10,5,5,Color.TRANSPARENT);/*设置阴影*/

        /*设置画布颜色*/
        canvas.drawRGB(255,255,255);/*画出画布颜色*/

        /*推荐方法*/
        /*参数：
        RectF oval:生成椭圆的矩形
        float startAngle：弧开始的角度，以X轴正方向为0度
        float sweepAngle：弧持续的角度
        boolean useCenter:是否有弧的两边，True，还两边，False，只有一条弧*/
        RectF voal = new RectF(100f,100f,400f,150f);
        //mPaint.setStyle(Paint.Style.FILL);/*是否填充*/
        canvas.drawArc(voal,90f,270f,true,mPaint);
    }
}
