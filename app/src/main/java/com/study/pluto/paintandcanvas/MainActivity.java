package com.study.pluto.paintandcanvas;

import android.graphics.RectF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.study.pluto.paintandcanvas.MyViews.MyViewArc;
import com.study.pluto.paintandcanvas.MyViews.MyViewCircle;
import com.study.pluto.paintandcanvas.MyViews.MyViewLine;
import com.study.pluto.paintandcanvas.MyViews.MyViewLines;
import com.study.pluto.paintandcanvas.MyViews.MyViewOval;
import com.study.pluto.paintandcanvas.MyViews.MyViewPoint;
import com.study.pluto.paintandcanvas.MyViews.MyViewPoints;
import com.study.pluto.paintandcanvas.MyViews.MyViewRect;
import com.study.pluto.paintandcanvas.MyViews.MyViewRoundRect;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout viewById = (FrameLayout) findViewById(R.id.root);
//        viewById.addView(new MyViewCircle(this));/*圆形*/
//        viewById.addView(new MyViewLine(this));/*线*/
//        viewById.addView(new MyViewLines(this));/*多条线*/
//        viewById.addView(new MyViewPoint(this));/*点*/
//        viewById.addView(new MyViewPoints(this));/*多个点*/
//        viewById.addView(new MyViewRect(this));/*矩形*/
//        viewById.addView(new MyViewRoundRect(this));/*圆角矩形*/
//        viewById.addView(new MyViewOval(this));/*椭圆*/
        viewById.addView(new MyViewArc(this));/*弧*/
    }
}
