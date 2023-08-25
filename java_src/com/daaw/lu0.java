package com.daaw;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
public class lu0 implements View.OnTouchListener {

    /* renamed from: p */
    public ViewParent f17798p;

    public lu0(ViewParent viewParent) {
        this.f17798p = viewParent;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f17798p.requestDisallowInterceptTouchEvent(true);
        return view.onTouchEvent(motionEvent);
    }
}
