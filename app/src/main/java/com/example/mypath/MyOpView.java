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
 * 布尔操作:应用场景：用简单的图形通过特定规则合成相对复杂的图形。
 */

public class MyOpView extends View {
    private Paint mPaint;
    private Path mPath1,mPath2;
    public MyOpView(Context context) {
        super(context);
    }

    public MyOpView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.BLUE);
        mPaint.setStrokeWidth(2);
        mPath1 = new Path();
        mPath2 = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.translate(400,500);
        // 画两个圆
        // 圆1:圆心 = (0,0),半径 = 100
        // 圆2:圆心 = (50,0),半径 = 100
        mPath1.addCircle(0, 0, 100, Path.Direction.CW);
        mPath2.addRect(0, 0,200, 200,Path.Direction.CW);
// 取两个路径的异或集
        mPath1.op(mPath2, Path.Op.XOR);
        canvas.drawPath(mPath1,mPaint);

    }
}
