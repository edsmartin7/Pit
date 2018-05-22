package com.example.eddie.pit.Views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;

public class Pit extends ViewGroup implements PitInterface {

    GridLayout gridLayout;
    FrameLayout frameLayout;

    //Constructors
    public Pit(Context context) {
        super(context);
    }

    public Pit(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Pit(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        //initial 5 points
        Point initBallOne = new Point(context);
        Point initBallTwo = new Point(context);
        Point initBallThree = new Point(context);
        Point initBallFour = new Point(context);
        Point initBallFive = new Point(context);

        //inflate layout

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {

    }

    /**
     * Add new point at (0, 0)
     */
    @Override
    public void addPoint(Context context) {

        Point add = new Point(context);

    }

    /**
     * Redraw the lines between the Points
     */
    public void redrawEdges(Context context) {
        int count = getChildCount();
        Point temp = (Point) getChildAt(0);

    }

}
