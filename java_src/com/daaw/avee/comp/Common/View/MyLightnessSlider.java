package com.daaw.avee.comp.Common.View;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.daaw.vj0;
/* loaded from: classes.dex */
public class MyLightnessSlider extends vj0 {
    public MyLightnessSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void h() {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // com.daaw.d, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if ((action == 0 || action == 2) && onTouchEvent) {
            h();
        }
        return onTouchEvent;
    }
}
