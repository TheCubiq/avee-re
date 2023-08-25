package com.daaw;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
public class lu0 implements View.OnTouchListener {
    public ViewParent p;

    public lu0(ViewParent viewParent) {
        this.p = viewParent;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.p.requestDisallowInterceptTouchEvent(true);
        return view.onTouchEvent(motionEvent);
    }
}
