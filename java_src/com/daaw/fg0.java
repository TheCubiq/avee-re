package com.daaw;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* loaded from: classes2.dex */
public class fg0 implements View.OnTouchListener {
    public final Dialog p;
    public final int q;
    public final int r;
    public final int s;

    public fg0(Dialog dialog, Rect rect) {
        this.p = dialog;
        this.q = rect.left;
        this.r = rect.top;
        this.s = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.q + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.r + findViewById.getTop();
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.s;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.p.onTouchEvent(obtain);
    }
}
