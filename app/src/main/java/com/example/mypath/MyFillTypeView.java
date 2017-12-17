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
 * Created by Administrator on 2017/12/17
 * 学习Path的填充方式
 * 有的方法不好用 不清楚为什么
 */

public class MyFillTypeView extends View {
    private Paint mPaint;
    private Path mPath;
    public MyFillTypeView(Context context) {
        super(context);
    }

    public MyFillTypeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.BLUE);
        mPaint.setStrokeWidth(2);
        mPath = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //为了方便观察，先移动画布
        canvas.translate(350, 500);
        canvas.drawColor(Color.YELLOW);

//        mPath.addRect(-400, -400, 400, 400, Path.Direction.CW);
        mPath.addRect(-200, -200, 200, 200, Path.Direction.CCW);
//        mPath.addRect(200,200,300,400, Path.Direction.CCW);
//        mPath.setFillType(Path.FillType.EVEN_ODD);
        mPath.setFillType(Path.FillType.WINDING);
        canvas.drawPath(mPath,mPaint);

    }
}
