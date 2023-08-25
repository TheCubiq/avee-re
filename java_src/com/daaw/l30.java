package com.daaw;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
/* loaded from: classes.dex */
public abstract class l30 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float p;
    public final int q;
    public final int r;
    public final View s;
    public Runnable t;
    public Runnable u;
    public boolean v;
    public int w;
    public final int[] x = new int[2];

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = l30.this.s.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l30.this.e();
        }
    }

    public l30(View view) {
        this.s = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.p = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.q = tapTimeout;
        this.r = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    public final void a() {
        Runnable runnable = this.u;
        if (runnable != null) {
            this.s.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.t;
        if (runnable2 != null) {
            this.s.removeCallbacks(runnable2);
        }
    }

    public abstract vc1 b();

    public abstract boolean c();

    public boolean d() {
        vc1 b2 = b();
        if (b2 == null || !b2.a()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    public void e() {
        a();
        View view = this.s;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.v = true;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        zu zuVar;
        View view = this.s;
        vc1 b2 = b();
        if (b2 == null || !b2.a() || (zuVar = (zu) b2.k()) == null || !zuVar.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(zuVar, obtainNoHistory);
        boolean e = zuVar.e(obtainNoHistory, this.w);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != 3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.s
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.w
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.p
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.w = r6
            java.lang.Runnable r6 = r5.t
            if (r6 != 0) goto L52
            com.daaw.l30$a r6 = new com.daaw.l30$a
            r6.<init>()
            r5.t = r6
        L52:
            java.lang.Runnable r6 = r5.t
            int r1 = r5.q
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.u
            if (r6 != 0) goto L65
            com.daaw.l30$b r6 = new com.daaw.l30$b
            r6.<init>()
            r5.u = r6
        L65:
            java.lang.Runnable r6 = r5.u
            int r1 = r5.r
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.l30.g(android.view.MotionEvent):boolean");
    }

    public final boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.x;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    public final boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.x;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.v;
        if (z2) {
            z = f(motionEvent) || !d();
        } else {
            z = g(motionEvent) && c();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.s.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.v = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.v = false;
        this.w = -1;
        Runnable runnable = this.t;
        if (runnable != null) {
            this.s.removeCallbacks(runnable);
        }
    }
}
