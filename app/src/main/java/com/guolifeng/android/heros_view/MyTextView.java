
package com.guolifeng.android.heros_view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by 郭利锋 on 2017/5/30 0030.
 * [简要描述]<BR>
 */

public class MyTextView extends TextView
{
    private Paint mPaint1;
    private Paint mPaint2;

    public MyTextView(Context context)
    {
        super(context);
        init();
    }

    public MyTextView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init();

    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init();

    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        canvas.drawRect(0, 0, getMeasuredWidth(), getMeasuredHeight(), mPaint1);
        canvas.drawRect(10, 10, getMeasuredWidth() - 10, getMeasuredHeight() - 10, mPaint2);
        canvas.save();
        canvas.translate(10, 0);
        super.onDraw(canvas);
        canvas.restore();
    }

    private void init()
    {
        mPaint1 = new Paint();
        mPaint1.setColor(getResources().getColor(R.color.colorAccent));
        mPaint1.setStyle(Paint.Style.FILL);

        mPaint2 = new Paint();
        mPaint2.setColor(getResources().getColor(R.color.colorPrimary));
        mPaint2.setStyle(Paint.Style.FILL);
    }
}
