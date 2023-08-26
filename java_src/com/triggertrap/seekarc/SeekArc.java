package com.triggertrap.seekarc;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.daaw.avee.R;
/* loaded from: classes2.dex */
public class SeekArc extends View {
    private final int mAngleOffset;
    private Paint mArcPaint;
    private int mArcRadius;
    private RectF mArcRect;
    private int mArcWidth;
    private boolean mClockwise;
    private int mMax;
    private OnSeekArcChangeListener mOnSeekArcChangeListener;
    private int mProgress;
    private Paint mProgressPaint;
    private float mProgressSweep;
    private int mProgressWidth;
    private int mRotation;
    private boolean mRoundedEdges;
    private int mStartAngle;
    private int mSweepAngle;
    private Drawable mThumb;
    private int mThumbXPos;
    private int mThumbYPos;
    private double mTouchAngle;
    private float mTouchIgnoreRadius;
    private boolean mTouchInside;
    private int mTranslateX;
    private int mTranslateY;
    private static final String TAG = SeekArc.class.getSimpleName();
    private static int INVALID_PROGRESS_VALUE = -1;

    /* loaded from: classes2.dex */
    public interface OnSeekArcChangeListener {
        void onProgressChanged(SeekArc seekArc, int i, boolean z);

        void onStartTrackingTouch(SeekArc seekArc);

        void onStopTrackingTouch(SeekArc seekArc);
    }

    public SeekArc(Context context) {
        super(context);
        this.mAngleOffset = -90;
        this.mMax = 100;
        this.mProgress = 0;
        this.mProgressWidth = 4;
        this.mArcWidth = 2;
        this.mStartAngle = 0;
        this.mSweepAngle = 360;
        this.mRotation = 0;
        this.mRoundedEdges = false;
        this.mTouchInside = true;
        this.mClockwise = true;
        this.mArcRadius = 0;
        this.mProgressSweep = 0.0f;
        this.mArcRect = new RectF();
        init(context, null, 0);
    }

    public SeekArc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAngleOffset = -90;
        this.mMax = 100;
        this.mProgress = 0;
        this.mProgressWidth = 4;
        this.mArcWidth = 2;
        this.mStartAngle = 0;
        this.mSweepAngle = 360;
        this.mRotation = 0;
        this.mRoundedEdges = false;
        this.mTouchInside = true;
        this.mClockwise = true;
        this.mArcRadius = 0;
        this.mProgressSweep = 0.0f;
        this.mArcRect = new RectF();
        init(context, attributeSet, R.attr.seekArcStyle);
    }

    public SeekArc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAngleOffset = -90;
        this.mMax = 100;
        this.mProgress = 0;
        this.mProgressWidth = 4;
        this.mArcWidth = 2;
        this.mStartAngle = 0;
        this.mSweepAngle = 360;
        this.mRotation = 0;
        this.mRoundedEdges = false;
        this.mTouchInside = true;
        this.mClockwise = true;
        this.mArcRadius = 0;
        this.mProgressSweep = 0.0f;
        this.mArcRect = new RectF();
        init(context, attributeSet, i);
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        Log.d(TAG, "Initialising SeekArc");
        Resources resources = getResources();
        float f = context.getResources().getDisplayMetrics().density;
        int color = resources.getColor(R.color.progress_gray);
        int color2 = resources.getColor(17170450);
        this.mThumb = resources.getDrawable(R.drawable.seek_arc_control_selector);
        this.mProgressWidth = (int) (this.mProgressWidth * f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SeekArc, i, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(11);
            if (drawable != null) {
                this.mThumb = drawable;
            }
            int intrinsicHeight = this.mThumb.getIntrinsicHeight() / 2;
            int intrinsicWidth = this.mThumb.getIntrinsicWidth() / 2;
            this.mThumb.setBounds(-intrinsicWidth, -intrinsicHeight, intrinsicWidth, intrinsicHeight);
            this.mMax = obtainStyledAttributes.getInteger(3, this.mMax);
            this.mProgress = obtainStyledAttributes.getInteger(4, this.mProgress);
            this.mProgressWidth = (int) obtainStyledAttributes.getDimension(6, this.mProgressWidth);
            this.mArcWidth = (int) obtainStyledAttributes.getDimension(1, this.mArcWidth);
            this.mStartAngle = obtainStyledAttributes.getInt(9, this.mStartAngle);
            this.mSweepAngle = obtainStyledAttributes.getInt(10, this.mSweepAngle);
            this.mRotation = obtainStyledAttributes.getInt(7, this.mRotation);
            this.mRoundedEdges = obtainStyledAttributes.getBoolean(8, this.mRoundedEdges);
            this.mTouchInside = obtainStyledAttributes.getBoolean(13, this.mTouchInside);
            this.mClockwise = obtainStyledAttributes.getBoolean(2, this.mClockwise);
            color = obtainStyledAttributes.getColor(0, color);
            color2 = obtainStyledAttributes.getColor(5, color2);
            obtainStyledAttributes.recycle();
        }
        int i2 = this.mProgress;
        int i3 = this.mMax;
        if (i2 > i3) {
            i2 = i3;
        }
        this.mProgress = i2;
        if (i2 < 0) {
            i2 = 0;
        }
        this.mProgress = i2;
        int i4 = this.mSweepAngle;
        if (i4 > 360) {
            i4 = 360;
        }
        this.mSweepAngle = i4;
        if (i4 < 0) {
            i4 = 0;
        }
        this.mSweepAngle = i4;
        int i5 = this.mStartAngle;
        if (i5 > 360) {
            i5 = 0;
        }
        this.mStartAngle = i5;
        this.mStartAngle = i5 >= 0 ? i5 : 0;
        Paint paint = new Paint();
        this.mArcPaint = paint;
        paint.setColor(color);
        this.mArcPaint.setAntiAlias(true);
        this.mArcPaint.setStyle(Paint.Style.STROKE);
        this.mArcPaint.setStrokeWidth(this.mArcWidth);
        Paint paint2 = new Paint();
        this.mProgressPaint = paint2;
        paint2.setColor(color2);
        this.mProgressPaint.setAntiAlias(true);
        this.mProgressPaint.setStyle(Paint.Style.STROKE);
        this.mProgressPaint.setStrokeWidth(this.mProgressWidth);
        if (this.mRoundedEdges) {
            this.mArcPaint.setStrokeCap(Paint.Cap.ROUND);
            this.mProgressPaint.setStrokeCap(Paint.Cap.ROUND);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (!this.mClockwise) {
            canvas.scale(-1.0f, 1.0f, this.mArcRect.centerX(), this.mArcRect.centerY());
        }
        float f = (this.mStartAngle - 90) + this.mRotation;
        canvas.drawArc(this.mArcRect, f, this.mSweepAngle, false, this.mArcPaint);
        canvas.drawArc(this.mArcRect, f, this.mProgressSweep, false, this.mProgressPaint);
        canvas.translate(this.mTranslateX - this.mThumbXPos, this.mTranslateY - this.mThumbYPos);
        this.mThumb.draw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(getSuggestedMinimumHeight(), i2);
        int defaultSize2 = getDefaultSize(getSuggestedMinimumWidth(), i);
        int min = Math.min(defaultSize2, defaultSize);
        this.mTranslateX = (int) (defaultSize2 * 0.5f);
        this.mTranslateY = (int) (defaultSize * 0.5f);
        int paddingLeft = min - getPaddingLeft();
        int i3 = paddingLeft / 2;
        this.mArcRadius = i3;
        float f = (defaultSize / 2) - i3;
        float f2 = (defaultSize2 / 2) - i3;
        float f3 = paddingLeft;
        this.mArcRect.set(f2, f, f2 + f3, f3 + f);
        double d = this.mArcRadius;
        double d2 = ((int) this.mProgressSweep) + this.mStartAngle + this.mRotation + 90;
        double cos = Math.cos(Math.toRadians(d2));
        Double.isNaN(d);
        this.mThumbXPos = (int) (d * cos);
        double d3 = this.mArcRadius;
        double sin = Math.sin(Math.toRadians(d2));
        Double.isNaN(d3);
        this.mThumbYPos = (int) (d3 * sin);
        setTouchInSide(this.mTouchInside);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            onStartTrackingTouch();
            updateOnTouch(motionEvent);
        } else if (action == 1) {
            onStopTrackingTouch();
            setPressed(false);
        } else if (action == 2) {
            updateOnTouch(motionEvent);
        } else if (action == 3) {
            onStopTrackingTouch();
            setPressed(false);
        }
        return true;
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mThumb;
        if (drawable != null && drawable.isStateful()) {
            this.mThumb.setState(getDrawableState());
        }
        invalidate();
    }

    private void onStartTrackingTouch() {
        OnSeekArcChangeListener onSeekArcChangeListener = this.mOnSeekArcChangeListener;
        if (onSeekArcChangeListener != null) {
            onSeekArcChangeListener.onStartTrackingTouch(this);
        }
    }

    private void onStopTrackingTouch() {
        OnSeekArcChangeListener onSeekArcChangeListener = this.mOnSeekArcChangeListener;
        if (onSeekArcChangeListener != null) {
            onSeekArcChangeListener.onStopTrackingTouch(this);
        }
    }

    private void updateOnTouch(MotionEvent motionEvent) {
        if (ignoreTouch(motionEvent.getX(), motionEvent.getY())) {
            return;
        }
        setPressed(true);
        double touchDegrees = getTouchDegrees(motionEvent.getX(), motionEvent.getY());
        this.mTouchAngle = touchDegrees;
        onProgressRefresh(getProgressForAngle(touchDegrees), true);
    }

    private boolean ignoreTouch(float f, float f2) {
        float f3 = f - this.mTranslateX;
        float f4 = f2 - this.mTranslateY;
        return ((float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)))) < this.mTouchIgnoreRadius;
    }

    private double getTouchDegrees(float f, float f2) {
        float f3 = f - this.mTranslateX;
        float f4 = f2 - this.mTranslateY;
        if (!this.mClockwise) {
            f3 = -f3;
        }
        double degrees = Math.toDegrees((Math.atan2(f4, f3) + 1.5707963267948966d) - Math.toRadians(this.mRotation));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        }
        double d = this.mStartAngle;
        Double.isNaN(d);
        return degrees - d;
    }

    private int getProgressForAngle(double d) {
        double valuePerDegree = valuePerDegree();
        Double.isNaN(valuePerDegree);
        int round = (int) Math.round(valuePerDegree * d);
        if (round < 0) {
            round = INVALID_PROGRESS_VALUE;
        }
        return round > this.mMax ? INVALID_PROGRESS_VALUE : round;
    }

    private float valuePerDegree() {
        return this.mMax / this.mSweepAngle;
    }

    private void onProgressRefresh(int i, boolean z) {
        updateProgress(i, z);
    }

    private void updateThumbPosition() {
        double d = this.mArcRadius;
        double d2 = (int) (this.mStartAngle + this.mProgressSweep + this.mRotation + 90.0f);
        double cos = Math.cos(Math.toRadians(d2));
        Double.isNaN(d);
        this.mThumbXPos = (int) (d * cos);
        double d3 = this.mArcRadius;
        double sin = Math.sin(Math.toRadians(d2));
        Double.isNaN(d3);
        this.mThumbYPos = (int) (d3 * sin);
    }

    private void updateProgress(int i, boolean z) {
        if (i == INVALID_PROGRESS_VALUE) {
            return;
        }
        OnSeekArcChangeListener onSeekArcChangeListener = this.mOnSeekArcChangeListener;
        if (onSeekArcChangeListener != null) {
            onSeekArcChangeListener.onProgressChanged(this, i, z);
        }
        int i2 = this.mMax;
        if (i > i2) {
            i = i2;
        }
        if (this.mProgress < 0) {
            i = 0;
        }
        this.mProgress = i;
        this.mProgressSweep = (i / this.mMax) * this.mSweepAngle;
        updateThumbPosition();
        invalidate();
    }

    public void setOnSeekArcChangeListener(OnSeekArcChangeListener onSeekArcChangeListener) {
        this.mOnSeekArcChangeListener = onSeekArcChangeListener;
    }

    public void setProgress(int i) {
        updateProgress(i, false);
    }

    public int getProgressWidth() {
        return this.mProgressWidth;
    }

    public void setProgressWidth(int i) {
        this.mProgressWidth = i;
        this.mProgressPaint.setStrokeWidth(i);
    }

    public int getArcWidth() {
        return this.mArcWidth;
    }

    public void setArcWidth(int i) {
        this.mArcWidth = i;
        this.mArcPaint.setStrokeWidth(i);
    }

    public int getArcRotation() {
        return this.mRotation;
    }

    public void setArcRotation(int i) {
        this.mRotation = i;
        updateThumbPosition();
    }

    public int getStartAngle() {
        return this.mStartAngle;
    }

    public void setStartAngle(int i) {
        this.mStartAngle = i;
        updateThumbPosition();
    }

    public int getSweepAngle() {
        return this.mSweepAngle;
    }

    public void setSweepAngle(int i) {
        this.mSweepAngle = i;
        updateThumbPosition();
    }

    public void setRoundedEdges(boolean z) {
        this.mRoundedEdges = z;
        if (z) {
            this.mArcPaint.setStrokeCap(Paint.Cap.ROUND);
            this.mProgressPaint.setStrokeCap(Paint.Cap.ROUND);
            return;
        }
        this.mArcPaint.setStrokeCap(Paint.Cap.SQUARE);
        this.mProgressPaint.setStrokeCap(Paint.Cap.SQUARE);
    }

    public void setTouchInSide(boolean z) {
        int intrinsicHeight = this.mThumb.getIntrinsicHeight() / 2;
        int intrinsicWidth = this.mThumb.getIntrinsicWidth() / 2;
        this.mTouchInside = z;
        if (z) {
            this.mTouchIgnoreRadius = this.mArcRadius / 4.0f;
        } else {
            this.mTouchIgnoreRadius = this.mArcRadius - Math.min(intrinsicWidth, intrinsicHeight);
        }
    }

    public void setClockwise(boolean z) {
        this.mClockwise = z;
    }
}
