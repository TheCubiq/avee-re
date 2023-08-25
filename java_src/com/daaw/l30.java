package com.daaw;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
/* loaded from: classes.dex */
public abstract class l30 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: p */
    public final float f16984p;

    /* renamed from: q */
    public final int f16985q;

    /* renamed from: r */
    public final int f16986r;

    /* renamed from: s */
    public final View f16987s;

    /* renamed from: t */
    public Runnable f16988t;

    /* renamed from: u */
    public Runnable f16989u;

    /* renamed from: v */
    public boolean f16990v;

    /* renamed from: w */
    public int f16991w;

    /* renamed from: x */
    public final int[] f16992x = new int[2];

    /* renamed from: com.daaw.l30$a */
    /* loaded from: classes.dex */
    public class RunnableC2010a implements Runnable {
        public RunnableC2010a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = l30.this.f16987s.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: com.daaw.l30$b */
    /* loaded from: classes.dex */
    public class RunnableC2011b implements Runnable {
        public RunnableC2011b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l30.this.m17185e();
        }
    }

    public l30(View view) {
        this.f16987s = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f16984p = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f16985q = tapTimeout;
        this.f16986r = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: h */
    public static boolean m17182h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    public final void m17189a() {
        Runnable runnable = this.f16989u;
        if (runnable != null) {
            this.f16987s.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f16988t;
        if (runnable2 != null) {
            this.f16987s.removeCallbacks(runnable2);
        }
    }

    /* renamed from: b */
    public abstract vc1 mo17188b();

    /* renamed from: c */
    public abstract boolean mo17187c();

    /* renamed from: d */
    public boolean mo17186d() {
        vc1 mo17188b = mo17188b();
        if (mo17188b == null || !mo17188b.mo7286a()) {
            return true;
        }
        mo17188b.dismiss();
        return true;
    }

    /* renamed from: e */
    public void m17185e() {
        m17189a();
        View view = this.f16987s;
        if (view.isEnabled() && !view.isLongClickable() && mo17187c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f16990v = true;
        }
    }

    /* renamed from: f */
    public final boolean m17184f(MotionEvent motionEvent) {
        C3899zu c3899zu;
        View view = this.f16987s;
        vc1 mo17188b = mo17188b();
        if (mo17188b == null || !mo17188b.mo7286a() || (c3899zu = (C3899zu) mo17188b.mo7284k()) == null || !c3899zu.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m17181i(view, obtainNoHistory);
        m17180j(c3899zu, obtainNoHistory);
        boolean mo1890e = c3899zu.mo1890e(obtainNoHistory, this.f16991w);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return mo1890e && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != 3) goto L13;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m17183g(MotionEvent motionEvent) {
        View view = this.f16987s;
        if (view.isEnabled()) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f16991w);
                        if (findPointerIndex >= 0 && !m17182h(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f16984p)) {
                            m17189a();
                            view.getParent().requestDisallowInterceptTouchEvent(true);
                            return true;
                        }
                    }
                }
                m17189a();
            } else {
                this.f16991w = motionEvent.getPointerId(0);
                if (this.f16988t == null) {
                    this.f16988t = new RunnableC2010a();
                }
                view.postDelayed(this.f16988t, this.f16985q);
                if (this.f16989u == null) {
                    this.f16989u = new RunnableC2011b();
                }
                view.postDelayed(this.f16989u, this.f16986r);
            }
            return false;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m17181i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f16992x;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    /* renamed from: j */
    public final boolean m17180j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f16992x;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f16990v;
        if (z2) {
            z = m17184f(motionEvent) || !mo17186d();
        } else {
            z = m17183g(motionEvent) && mo17187c();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f16987s.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f16990v = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f16990v = false;
        this.f16991w = -1;
        Runnable runnable = this.f16988t;
        if (runnable != null) {
            this.f16987s.removeCallbacks(runnable);
        }
    }
}
