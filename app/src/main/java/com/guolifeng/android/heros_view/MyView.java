package com.guolifeng.android.heros_view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by 郭利锋 on 2017/5/14 0014.
 * [简要描述]<BR>
 */

public class MyView extends View
{
    private static final String TAG = "MyView";
    private int lastX;
    private int lastY;

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
    protected void onLayout(boolean changed, int left, int top, int right, int bottom)
    {
        Log.i(TAG, "onLayout: ");
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        Log.i(TAG, "onTouchEvent: ");
        int x = (int) event.getX();
        int y = (int) event.getY();
        switch (event.getAction())
        {
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "onTouchEvent: ACTION_UP");
                break;
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "onTouchEvent: ACTION_DOWN");
                lastX = x;
                lastY = y;
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "onTouchEvent: ACTION_MOVE");
                int offsetX = x - lastX;
                int offsetY = y - lastY;
                //方法:3
                ((View) getParent()).scrollBy(-offsetX, -offsetY);
                //方法：2
//                offsetLeftAndRight(offsetX);
//                offsetTopAndBottom(offsetY);
                //方法：1
//                layout(getLeft() + offsetX, getTop() + offsetY, getRight() + offsetX, getBottom() + offsetY);
                break;
            default:
                break;
        }
        //返回true 表示拦截的意思
        return true;
    }
}
