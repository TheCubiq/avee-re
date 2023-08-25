package com.daaw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes2.dex */
public abstract class z80<V extends View> extends ot1<V> {

    /* renamed from: d */
    public Runnable f34574d;

    /* renamed from: e */
    public OverScroller f34575e;

    /* renamed from: f */
    public boolean f34576f;

    /* renamed from: g */
    public int f34577g;

    /* renamed from: h */
    public int f34578h;

    /* renamed from: i */
    public int f34579i;

    /* renamed from: j */
    public VelocityTracker f34580j;

    /* renamed from: com.daaw.z80$a */
    /* loaded from: classes2.dex */
    public class RunnableC3821a implements Runnable {

        /* renamed from: p */
        public final CoordinatorLayout f34581p;

        /* renamed from: q */
        public final V f34582q;

        public RunnableC3821a(CoordinatorLayout coordinatorLayout, V v) {
            this.f34581p = coordinatorLayout;
            this.f34582q = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f34582q == null || (overScroller = z80.this.f34575e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                z80.this.mo1045N(this.f34581p, this.f34582q);
                return;
            }
            z80 z80Var = z80.this;
            z80Var.m2636P(this.f34581p, this.f34582q, z80Var.f34575e.getCurrY());
            xs1.m4718j0(this.f34582q, this);
        }
    }

    public z80() {
        this.f34577g = -1;
        this.f34579i = -1;
    }

    public z80(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34577g = -1;
        this.f34579i = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo102D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f34577g);
                if (findPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(findPointerIndex);
                this.f34578h = y;
                m2637O(coordinatorLayout, v, this.f34578h - y, mo1048K(v), 0);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f34577g = motionEvent.getPointerId(i);
                    this.f34578h = (int) (motionEvent.getY(i) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.f34580j;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f34576f || z;
        }
        VelocityTracker velocityTracker3 = this.f34580j;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f34580j.computeCurrentVelocity(1000);
            m2638J(coordinatorLayout, v, -mo1047L(v), 0, this.f34580j.getYVelocity(this.f34577g));
            z = true;
            this.f34576f = false;
            this.f34577g = -1;
            velocityTracker = this.f34580j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f34580j = null;
            }
            velocityTracker2 = this.f34580j;
            if (velocityTracker2 != null) {
            }
            if (this.f34576f) {
                return true;
            }
        }
        z = false;
        this.f34576f = false;
        this.f34577g = -1;
        velocityTracker = this.f34580j;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.f34580j;
        if (velocityTracker2 != null) {
        }
        if (this.f34576f) {
        }
    }

    /* renamed from: H */
    public boolean mo1049H(V v) {
        return false;
    }

    /* renamed from: I */
    public final void m2639I() {
        if (this.f34580j == null) {
            this.f34580j = VelocityTracker.obtain();
        }
    }

    /* renamed from: J */
    public final boolean m2638J(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        Runnable runnable = this.f34574d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f34574d = null;
        }
        if (this.f34575e == null) {
            this.f34575e = new OverScroller(v.getContext());
        }
        this.f34575e.fling(0, mo1020E(), 0, Math.round(f), 0, 0, i, i2);
        if (!this.f34575e.computeScrollOffset()) {
            mo1045N(coordinatorLayout, v);
            return false;
        }
        RunnableC3821a runnableC3821a = new RunnableC3821a(coordinatorLayout, v);
        this.f34574d = runnableC3821a;
        xs1.m4718j0(v, runnableC3821a);
        return true;
    }

    /* renamed from: K */
    public int mo1048K(V v) {
        return -v.getHeight();
    }

    /* renamed from: L */
    public int mo1047L(V v) {
        return v.getHeight();
    }

    /* renamed from: M */
    public int mo1046M() {
        return mo1020E();
    }

    /* renamed from: N */
    public void mo1045N(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* renamed from: O */
    public final int m2637O(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo1044Q(coordinatorLayout, v, mo1046M() - i, i2, i3);
    }

    /* renamed from: P */
    public int m2636P(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo1044Q(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: Q */
    public int mo1044Q(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int m10152b;
        int mo1020E = mo1020E();
        if (i2 == 0 || mo1020E < i2 || mo1020E > i3 || mo1020E == (m10152b = sn0.m10152b(i, i2, i3))) {
            return 0;
        }
        mo1019G(m10152b);
        return mo1020E - m10152b;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: k */
    public boolean mo326k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f34579i < 0) {
            this.f34579i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f34576f) {
            int i = this.f34577g;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f34578h) > this.f34579i) {
                this.f34578h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f34577g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = mo1049H(v) && coordinatorLayout.m29823B(v, x, y2);
            this.f34576f = z;
            if (z) {
                this.f34578h = y2;
                this.f34577g = motionEvent.getPointerId(0);
                m2639I();
                OverScroller overScroller = this.f34575e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f34575e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f34580j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }
}
