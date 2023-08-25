package com.daaw.avee.comp.Common.View;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.daaw.C3538xg;
/* loaded from: classes.dex */
public class MyColorPickerView extends C3538xg {
    public MyColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: k */
    public final void m26860k() {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // com.daaw.C3538xg, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if ((action == 0 || action == 2) && onTouchEvent) {
            m26860k();
        }
        return onTouchEvent;
    }
}
