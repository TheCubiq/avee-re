package com.daaw.avee.Common;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import com.daaw.C2910s4;
/* loaded from: classes.dex */
public class VerticalSeekBar extends C2910s4 {

    /* renamed from: q */
    public SeekBar.OnSeekBarChangeListener f3695q;

    public VerticalSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void m26952a() {
        onSizeChanged(getWidth(), getHeight(), 0, 0);
    }

    @Override // com.daaw.C2910s4, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.rotate(-90.0f);
        canvas.translate(-getHeight(), 0.0f);
        super.onDraw(canvas);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i2, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i2, i, i4, i3);
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            int action = motionEvent.getAction();
            if (action == 0 || action == 1 || action == 2) {
                int max = getMax() - ((int) ((getMax() * motionEvent.getY()) / getHeight()));
                setProgress(max);
                onSizeChanged(getWidth(), getHeight(), 0, 0);
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f3695q;
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onProgressChanged(this, max, true);
                }
            }
            return true;
        }
        return false;
    }

    public void setOnSeekBarChangeFromUserListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f3695q = onSeekBarChangeListener;
    }
}
