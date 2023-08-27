package com.daaw.avee.Common;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
/* compiled from: OnSwipeTouchDisallowListener.java */
/* loaded from: classes.dex */
class OnSwipeTouchDisallowParentListener implements View.OnTouchListener {
    ViewParent disallowParent;

    public OnSwipeTouchDisallowParentListener(ViewParent viewParent) {
        this.disallowParent = viewParent;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.disallowParent.requestDisallowInterceptTouchEvent(true);
        return view.onTouchEvent(motionEvent);
    }
}
