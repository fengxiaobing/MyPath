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

public class MyPathView extends View {

    private Paint mPaint;
    private Path mPath;

    public MyPathView(Context context) {
        super(context);
    }

    public MyPathView(Context context, @Nullable AttributeSet attrs) {
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
        mPath.moveTo(300,100);
//        mPath.setLastPoint(300,100);
        mPath.lineTo(300,500);
//        mPath.moveTo(400,500);
        mPath.setLastPoint(400,500);
        mPath.lineTo(500,500);
//        mPath.close();
        mPaint.setTextSize(40);
        canvas.drawPath(mPath,mPaint);

        canvas.drawLine(300,100,300,500,mPaint);
        canvas.drawText("我爱你",500,500,mPaint);
//        canvas.drawCircle(100,500,100,mPaint);
    }
}
