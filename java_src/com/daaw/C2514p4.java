package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
/* renamed from: com.daaw.p4 */
/* loaded from: classes.dex */
public class C2514p4 extends RatingBar {

    /* renamed from: p */
    public final C2241n4 f22578p;

    public C2514p4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.ratingBarStyle);
    }

    public C2514p4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yk1.m3617a(this, getContext());
        C2241n4 c2241n4 = new C2241n4(this);
        this.f22578p = c2241n4;
        c2241n4.mo9546c(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap m15539b = this.f22578p.m15539b();
        if (m15539b != null) {
            setMeasuredDimension(View.resolveSizeAndState(m15539b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
