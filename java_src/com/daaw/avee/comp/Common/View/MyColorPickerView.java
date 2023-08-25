package com.daaw.avee.comp.Common.View;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.daaw.xg;
/* loaded from: classes.dex */
public class MyColorPickerView extends xg {
    public MyColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void k() {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // com.daaw.xg, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if ((action == 0 || action == 2) && onTouchEvent) {
            k();
        }
        return onTouchEvent;
    }
}
