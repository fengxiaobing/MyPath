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
 */

public class MyCircle extends View {
    private Paint mPaint;
    private Path mPath;
    public MyCircle(Context context) {
        super(context);
    }

    public MyCircle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.BLUE);
        mPaint.setStrokeWidth(2);
        mPaint.setStyle(Paint.Style.STROKE);
        mPath = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPath.moveTo(200,200);
        /*//画圆弧
        mPath.arcTo(200,200,400,400,0f,350f,true);
        //画矩形
        mPath.addRect(200,200,400,400, Path.Direction.CCW);
        //画椭圆
        mPath.addOval(400,400,800,600, Path.Direction.CW);
        mPath.lineTo(700,700);
        canvas.drawPath(mPath,mPaint);*/
        Path mCirclePath = new Path();
        mCirclePath.addOval(200,200,300,300, Path.Direction.CCW);
        //画矩形
        mPath.addRect(200,200,400,400, Path.Direction.CCW);
        //路径合并
        mPath.addPath(mCirclePath,50,-50);
        canvas.drawPath(mPath,mPaint);

    }
}
