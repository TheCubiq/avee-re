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

    /* renamed from: p */
    public final Dialog f9549p;

    /* renamed from: q */
    public final int f9550q;

    /* renamed from: r */
    public final int f9551r;

    /* renamed from: s */
    public final int f9552s;

    public fg0(Dialog dialog, Rect rect) {
        this.f9549p = dialog;
        this.f9550q = rect.left;
        this.f9551r = rect.top;
        this.f9552s = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f9550q + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f9551r + findViewById.getTop();
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f9552s;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f9549p.onTouchEvent(obtain);
    }
}
