package com.example.mypath;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/12/17.
 * 贝塞尔曲线
 */

public class MyBezierView extends View{
    private Paint mPaint;
    private Path mPath1,mPath2;
    public MyBezierView(Context context) {
        super(context);
    }

    public MyBezierView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.BLUE);
        mPaint.setStrokeWidth(8);
        mPaint.setStyle(Paint.Style.STROKE);
        mPath1 = new Path();
        mPath2 = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 绘制二阶贝塞尔曲线
        //  (x1,y1)为控制点，(x2,y2)为终点
      /*  quadTo(float x1, float y1, float x2, float y2)
//  (x1,y1)为控制点距离起点的偏移量，(x2,y2)为终点距离起点的偏移量
        rQuadTo(float x1, float y1, float x2, float y2)*/

        mPath1.moveTo(100,100);
        mPath1.quadTo(500,500,300,800);
        canvas.drawPath(mPath1,mPaint);
    }
}
