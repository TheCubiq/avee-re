package com.daaw.avee.Common;

import android.view.MotionEvent;
import android.view.View;
/* loaded from: classes.dex */
public class OnSwipeTouchDisallowListener implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        attemptClaimDrag(view);
        return view.onTouchEvent(motionEvent);
    }

    private void attemptClaimDrag(View view) {
        if (view.getParent() != null) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
    }
}
