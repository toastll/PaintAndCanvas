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
public class MyViewLines extends View {

    private Context mContext;

    public MyViewLines(Context context) {
        super(context);
        this.mContext = context;
    }

    public MyViewLines(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
    }

    public MyViewLines(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint mPaint = new Paint();
        mPaint.setColor(Color.RED);/*设置画笔颜色*/
        mPaint.setAntiAlias(true);/*抗锯齿 平滑*/
        mPaint.setStrokeWidth(5.0f);/*设置画笔宽度*/
        mPaint.setShadowLayer(50f,100f,100f,Color.BLUE);/*画笔设置阴影有毛用？*/

        canvas.drawARGB(255,100,100,100);/*第一个值为透明度*/

        /*设定line的点集合，2个点画1条线*/
        float mPoints[] = { 100,100,100,400, /*点1 （100,100）  点2（100,400）*/
                            200,400,400,400, /*点3 （200,400）  点4（400,400）*/
                            600,300,400,100, /*点5 （600,300）  点6（400,100）*/
                            500,100,100,200};/*点7 （500,100）  点8（100,200）*/
        /*todo 参数说明
        * @param  float[] pts,  点集
        * @param  int offset, 【offset偏移】忽略offset个点之后开始绘图
        * @param  int count,  从offset开始，描绘之后的count个值
        *                     要求必须为4的倍数 2个值表示1个点 2个点表示1条线
        *                     使用时注意不要超出mPoints的下标，避免越界
        * @param  Paint paint 所用画笔
        * */
        /*如：此处为忽略前两个值开始绘图，
        即从第3个值开始，画至第10个值
        共8个值，4个点，2条线*/
        canvas.drawLines(mPoints,2,8,mPaint);

//        canvas.drawLines(mPoints,mPaint);
    }
}
