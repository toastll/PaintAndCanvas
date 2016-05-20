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
public class MyViewCircle extends View {

    private Context mContext = null;

    public MyViewCircle(Context context) {
        super(context);
        this.mContext = context;
    }

    public MyViewCircle(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewCircle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /*这个构造方法是干啥用的？*/
//    public MyView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//    }

    /*todo 重写父类方法的快捷键  ctrl+o*/

    /**
     * 重写onDraw（）方法， 在每次重绘时自主实现绘图
     * @param canvas
     */
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
        mPaint.setShadowLayer(10,5,5,Color.BLACK);/*设置阴影*/

        /*设置画布颜色*/
        canvas.drawRGB(255,255,255);/*画出画布颜色*/

        /*画圆 使用画笔画圆*/
        /*@param float cx,  圆心的X坐标
          @param float cy,  圆心的Y坐标
          @param float radius, 圆的半径
          @NonNull Paint paint 使用的画笔 */
        canvas.drawCircle(100,100,20,mPaint);
    }
}

