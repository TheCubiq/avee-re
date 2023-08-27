package com.flask.colorpicker.slider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.flask.colorpicker.R;
/* loaded from: classes.dex */
public abstract class AbsCustomSlider extends View {
    protected Bitmap bar;
    protected Canvas barCanvas;
    protected int barHeight;
    protected int barOffsetX;
    protected Bitmap bitmap;
    protected Canvas bitmapCanvas;
    protected int handleRadius;
    private boolean inVerticalOrientation;
    protected OnValueChangedListener onValueChangedListener;
    protected boolean showBorder;
    protected float value;

    protected abstract void drawBar(Canvas canvas);

    protected abstract void drawHandle(Canvas canvas, float f, float f2);

    protected abstract void onValueChanged(float f);

    public AbsCustomSlider(Context context) {
        super(context);
        this.handleRadius = 20;
        this.barHeight = 5;
        this.value = 1.0f;
        this.showBorder = false;
        this.inVerticalOrientation = false;
        init(context, null);
    }

    public AbsCustomSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.handleRadius = 20;
        this.barHeight = 5;
        this.value = 1.0f;
        this.showBorder = false;
        this.inVerticalOrientation = false;
        init(context, attributeSet);
    }

    public AbsCustomSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.handleRadius = 20;
        this.barHeight = 5;
        this.value = 1.0f;
        this.showBorder = false;
        this.inVerticalOrientation = false;
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AbsCustomSlider, 0, 0);
        try {
            this.inVerticalOrientation = obtainStyledAttributes.getBoolean(R.styleable.AbsCustomSlider_inVerticalOrientation, this.inVerticalOrientation);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void updateBar() {
        this.handleRadius = getDimension(R.dimen.default_slider_handler_radius);
        this.barHeight = getDimension(R.dimen.default_slider_bar_height);
        this.barOffsetX = this.handleRadius;
        if (this.bar == null) {
            createBitmaps();
        }
        drawBar(this.barCanvas);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void createBitmaps() {
        int width;
        int height;
        if (this.inVerticalOrientation) {
            width = getHeight();
            height = getWidth();
        } else {
            width = getWidth();
            height = getHeight();
        }
        this.bar = Bitmap.createBitmap(Math.max(width - (this.barOffsetX * 2), 1), this.barHeight, Bitmap.Config.ARGB_8888);
        this.barCanvas = new Canvas(this.bar);
        Bitmap bitmap = this.bitmap;
        if (bitmap != null && bitmap.getWidth() == width && this.bitmap.getHeight() == height) {
            return;
        }
        Bitmap bitmap2 = this.bitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.bitmapCanvas = new Canvas(this.bitmap);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        int height;
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.inVerticalOrientation) {
            width = getHeight();
            height = getWidth();
            canvas.rotate(-90.0f);
            canvas.translate(-width, 0.0f);
        } else {
            width = getWidth();
            height = getHeight();
        }
        if (this.bar == null || (canvas2 = this.bitmapCanvas) == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        Canvas canvas3 = this.bitmapCanvas;
        Bitmap bitmap = this.bar;
        canvas3.drawBitmap(bitmap, this.barOffsetX, (height - bitmap.getHeight()) / 2, (Paint) null);
        int i = this.handleRadius;
        drawHandle(this.bitmapCanvas, i + (this.value * (width - (i * 2))), height / 2.0f);
        canvas.drawBitmap(this.bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        updateBar();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        if (mode != 0) {
            if (mode == Integer.MIN_VALUE) {
                i = View.MeasureSpec.getSize(i);
            } else {
                i = mode == 1073741824 ? View.MeasureSpec.getSize(i) : 0;
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != 0) {
            if (mode2 == Integer.MIN_VALUE) {
                i2 = View.MeasureSpec.getSize(i2);
            } else {
                i2 = mode2 == 1073741824 ? View.MeasureSpec.getSize(i2) : 0;
            }
        }
        setMeasuredDimension(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r0 != 2) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                onValueChanged(this.value);
                OnValueChangedListener onValueChangedListener = this.onValueChangedListener;
                if (onValueChangedListener != null) {
                    onValueChangedListener.onValueChanged(this.value);
                }
                invalidate();
            }
            return true;
        }
        if (this.bar != null) {
            if (this.inVerticalOrientation) {
                this.value = 1.0f - ((motionEvent.getY() - this.barOffsetX) / this.bar.getWidth());
            } else {
                this.value = (motionEvent.getX() - this.barOffsetX) / this.bar.getWidth();
            }
            float max = Math.max(0.0f, Math.min(this.value, 1.0f));
            this.value = max;
            onValueChanged(max);
            invalidate();
        }
        return true;
    }

    protected int getDimension(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    public void setShowBorder(boolean z) {
        this.showBorder = z;
    }

    public void setOnValueChangedListener(OnValueChangedListener onValueChangedListener) {
        this.onValueChangedListener = onValueChangedListener;
    }
}
