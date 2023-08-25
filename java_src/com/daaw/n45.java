package com.daaw;

import android.view.GestureDetector;
import android.view.MotionEvent;
/* loaded from: classes.dex */
public final class n45 implements GestureDetector.OnGestureListener {

    /* renamed from: a */
    public final e35 f19474a;

    /* renamed from: b */
    public final h45 f19475b;

    public n45(e35 e35Var, h45 h45Var) {
        this.f19474a = e35Var;
        this.f19475b = h45Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0008, B:12:0x001c, B:23:0x0066, B:27:0x0070, B:15:0x002f, B:18:0x0042, B:21:0x0056), top: B:33:0x0001 }] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int y;
        if (this.f19474a == null) {
            return false;
        }
        int i = -1;
        if (Math.abs(f) > Math.abs(f2)) {
            if (f > 0.0f) {
                y = (int) (((motionEvent2.getX() - motionEvent.getX()) / f) * 1000.0f);
                i = 1;
            } else {
                if (f < 0.0f) {
                    y = (int) (((motionEvent2.getX() - motionEvent.getX()) / f) * 1000.0f);
                    i = 2;
                }
                y = 0;
            }
            if (i == this.f19474a.m23771H()) {
                return false;
            }
            this.f19474a.m23752h(this.f19475b.m21034g3(), y);
            return false;
        }
        if (f2 > 0.0f) {
            y = (int) (((motionEvent2.getY() - motionEvent.getY()) / f2) * 1000.0f);
            i = 8;
        } else {
            if (f2 < 0.0f) {
                y = (int) (((motionEvent2.getY() - motionEvent.getY()) / f2) * 1000.0f);
                i = 4;
            }
            y = 0;
        }
        if (i == this.f19474a.m23771H()) {
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
