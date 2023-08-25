package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
/* loaded from: classes.dex */
public class p4 extends RatingBar {
    public final n4 p;

    public p4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.ratingBarStyle);
    }

    public p4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yk1.a(this, getContext());
        n4 n4Var = new n4(this);
        this.p = n4Var;
        n4Var.c(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b = this.p.b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
