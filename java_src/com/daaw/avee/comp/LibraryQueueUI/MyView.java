package com.daaw.avee.comp.LibraryQueueUI;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes.dex */
public class MyView extends View {
    private View.OnLayoutChangeListener onSizeChangedListener;

    public MyView(Context context) {
        super(context);
        this.onSizeChangedListener = null;
    }

    public MyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onSizeChangedListener = null;
    }

    public MyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onSizeChangedListener = null;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View.OnLayoutChangeListener onLayoutChangeListener = this.onSizeChangedListener;
        if (onLayoutChangeListener != null) {
            onLayoutChangeListener.onLayoutChange(this, 0, 0, i, i2, 0, 0, 0, 0);
        }
    }

    public void setOnSizeChangeListener(View.OnLayoutChangeListener onLayoutChangeListener) {
        this.onSizeChangedListener = onLayoutChangeListener;
    }
}
