package com.guolifeng.android.heros_view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 郭利锋 on 2017/5/14 0014.
 * [简要描述]<BR>
 */

public class MyView extends View
{
    public MyView(Context context)
    {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
    {
        setMeasuredDimension(measureWidth(widthMeasureSpec), measureWidth(heightMeasureSpec));
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
    }

    private int measureWidth(int measureSpec)
    {
        int reasult = 0;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);
        if (specMode == MeasureSpec.EXACTLY)
        {
            reasult = specSize;
        } else
        {
            reasult = 200;
            if (specMode == MeasureSpec.AT_MOST)
            {
                reasult = Math.min(specSize, reasult);
            }
        }
        return reasult;

    }
}
