package com.daaw;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
/* loaded from: classes.dex */
public class at1 {

    /* renamed from: w */
    public static final Interpolator f3553w = new animationInterpolatorC0671a();

    /* renamed from: a */
    public int f3554a;

    /* renamed from: b */
    public int f3555b;

    /* renamed from: d */
    public float[] f3557d;

    /* renamed from: e */
    public float[] f3558e;

    /* renamed from: f */
    public float[] f3559f;

    /* renamed from: g */
    public float[] f3560g;

    /* renamed from: h */
    public int[] f3561h;

    /* renamed from: i */
    public int[] f3562i;

    /* renamed from: j */
    public int[] f3563j;

    /* renamed from: k */
    public int f3564k;

    /* renamed from: l */
    public VelocityTracker f3565l;

    /* renamed from: m */
    public float f3566m;

    /* renamed from: n */
    public float f3567n;

    /* renamed from: o */
    public int f3568o;

    /* renamed from: p */
    public int f3569p;

    /* renamed from: q */
    public OverScroller f3570q;

    /* renamed from: r */
    public final AbstractC0673c f3571r;

    /* renamed from: s */
    public View f3572s;

    /* renamed from: t */
    public boolean f3573t;

    /* renamed from: u */
    public final ViewGroup f3574u;

    /* renamed from: c */
    public int f3556c = -1;

    /* renamed from: v */
    public final Runnable f3575v = new RunnableC0672b();

    /* renamed from: com.daaw.at1$a  reason: invalid class name */
    /* loaded from: classes.dex */
    public static class animationInterpolatorC0671a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: com.daaw.at1$b */
    /* loaded from: classes.dex */
    public class RunnableC0672b implements Runnable {
        public RunnableC0672b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            at1.this.m27079J(0);
        }
    }

    /* renamed from: com.daaw.at1$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0673c {
        /* renamed from: a */
        public abstract int mo872a(View view, int i, int i2);

        /* renamed from: b */
        public abstract int mo871b(View view, int i, int i2);

        /* renamed from: c */
        public int m27046c(int i) {
            return i;
        }

        /* renamed from: d */
        public int mo981d(View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo870e(View view) {
            return 0;
        }

        /* renamed from: f */
        public void mo27045f(int i, int i2) {
        }

        /* renamed from: g */
        public boolean mo27044g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo27043h(int i, int i2) {
        }

        /* renamed from: i */
        public void mo980i(View view, int i) {
        }

        /* renamed from: j */
        public abstract void mo869j(int i);

        /* renamed from: k */
        public abstract void mo868k(View view, int i, int i2, int i3, int i4);

        /* renamed from: l */
        public abstract void mo867l(View view, float f, float f2);

        /* renamed from: m */
        public abstract boolean mo866m(View view, int i);
    }

    public at1(Context context, ViewGroup viewGroup, AbstractC0673c abstractC0673c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0673c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f3574u = viewGroup;
        this.f3571r = abstractC0673c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3568o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f3555b = viewConfiguration.getScaledTouchSlop();
        this.f3566m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3567n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3570q = new OverScroller(context, f3553w);
    }

    /* renamed from: n */
    public static at1 m27059n(ViewGroup viewGroup, float f, AbstractC0673c abstractC0673c) {
        at1 m27058o = m27058o(viewGroup, abstractC0673c);
        m27058o.f3555b = (int) (m27058o.f3555b * (1.0f / f));
        return m27058o;
    }

    /* renamed from: o */
    public static at1 m27058o(ViewGroup viewGroup, AbstractC0673c abstractC0673c) {
        return new at1(viewGroup.getContext(), viewGroup, abstractC0673c);
    }

    /* renamed from: A */
    public boolean m27088A(int i, int i2) {
        return m27085D(this.f3572s, i, i2);
    }

    /* renamed from: B */
    public boolean m27087B(int i) {
        return ((1 << i) & this.f3564k) != 0;
    }

    /* renamed from: C */
    public final boolean m27086C(int i) {
        if (m27087B(i)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignoring pointerId=");
        sb.append(i);
        sb.append(" because ACTION_DOWN was not received ");
        sb.append("for this pointer before ACTION_MOVE. It likely happened because ");
        sb.append(" ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: D */
    public boolean m27085D(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: E */
    public void m27084E(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m27072a();
        }
        if (this.f3565l == null) {
            this.f3565l = VelocityTracker.obtain();
        }
        this.f3565l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View m27053t = m27053t((int) x, (int) y);
            m27081H(x, y, pointerId);
            m27073P(m27053t, pointerId);
            int i3 = this.f3561h[pointerId];
            int i4 = this.f3569p;
            if ((i3 & i4) != 0) {
                this.f3571r.mo27043h(i3 & i4, pointerId);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f3554a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (m27086C(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.f3557d[pointerId2];
                            float f2 = y2 - this.f3558e[pointerId2];
                            m27082G(f, f2, pointerId2);
                            if (this.f3554a != 1) {
                                View m27053t2 = m27053t((int) x2, (int) y2);
                                if (m27067f(m27053t2, f, f2) && m27073P(m27053t2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i2++;
                    }
                } else if (!m27086C(this.f3556c)) {
                    return;
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3556c);
                    float x3 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f3559f;
                    int i5 = this.f3556c;
                    int i6 = (int) (x3 - fArr[i5]);
                    int i7 = (int) (y3 - this.f3560g[i5]);
                    m27055r(this.f3572s.getLeft() + i6, this.f3572s.getTop() + i7, i6, i7);
                }
                m27080I(motionEvent);
                return;
            } else if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x4 = motionEvent.getX(actionIndex);
                    float y4 = motionEvent.getY(actionIndex);
                    m27081H(x4, y4, pointerId3);
                    if (this.f3554a != 0) {
                        if (m27088A((int) x4, (int) y4)) {
                            m27073P(this.f3572s, pointerId3);
                            return;
                        }
                        return;
                    }
                    m27073P(m27053t((int) x4, (int) y4), pointerId3);
                    int i8 = this.f3561h[pointerId3];
                    int i9 = this.f3569p;
                    if ((i8 & i9) != 0) {
                        this.f3571r.mo27043h(i8 & i9, pointerId3);
                        return;
                    }
                    return;
                } else if (actionMasked != 6) {
                    return;
                } else {
                    int pointerId4 = motionEvent.getPointerId(actionIndex);
                    if (this.f3554a == 1 && pointerId4 == this.f3556c) {
                        int pointerCount2 = motionEvent.getPointerCount();
                        while (true) {
                            if (i2 >= pointerCount2) {
                                i = -1;
                                break;
                            }
                            int pointerId5 = motionEvent.getPointerId(i2);
                            if (pointerId5 != this.f3556c) {
                                View m27053t3 = m27053t((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                View view = this.f3572s;
                                if (m27053t3 == view && m27073P(view, pointerId5)) {
                                    i = this.f3556c;
                                    break;
                                }
                            }
                            i2++;
                        }
                        if (i == -1) {
                            m27083F();
                        }
                    }
                    m27063j(pointerId4);
                    return;
                }
            } else if (this.f3554a == 1) {
                m27057p(0.0f, 0.0f);
            }
        } else if (this.f3554a == 1) {
            m27083F();
        }
        m27072a();
    }

    /* renamed from: F */
    public final void m27083F() {
        this.f3565l.computeCurrentVelocity(1000, this.f3566m);
        m27057p(m27066g(this.f3565l.getXVelocity(this.f3556c), this.f3567n, this.f3566m), m27066g(this.f3565l.getYVelocity(this.f3556c), this.f3567n, this.f3566m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.daaw.at1$c] */
    /* renamed from: G */
    public final void m27082G(float f, float f2, int i) {
        boolean m27070c = m27070c(f, f2, i, 1);
        boolean z = m27070c;
        if (m27070c(f2, f, i, 4)) {
            z = m27070c | true;
        }
        boolean z2 = z;
        if (m27070c(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | true;
        }
        ?? r0 = z2;
        if (m27070c(f2, f, i, 8)) {
            r0 = (z2 ? 1 : 0) | true;
        }
        if (r0 != 0) {
            int[] iArr = this.f3562i;
            iArr[i] = iArr[i] | r0;
            this.f3571r.mo27045f(r0, i);
        }
    }

    /* renamed from: H */
    public final void m27081H(float f, float f2, int i) {
        m27054s(i);
        float[] fArr = this.f3557d;
        this.f3559f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f3558e;
        this.f3560g[i] = f2;
        fArr2[i] = f2;
        this.f3561h[i] = m27049x((int) f, (int) f2);
        this.f3564k |= 1 << i;
    }

    /* renamed from: I */
    public final void m27080I(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m27086C(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f3559f[pointerId] = x;
                this.f3560g[pointerId] = y;
            }
        }
    }

    /* renamed from: J */
    public void m27079J(int i) {
        this.f3574u.removeCallbacks(this.f3575v);
        if (this.f3554a != i) {
            this.f3554a = i;
            this.f3571r.mo869j(i);
            if (this.f3554a == 0) {
                this.f3572s = null;
            }
        }
    }

    /* renamed from: K */
    public void m27078K(int i) {
        this.f3569p = i;
    }

    /* renamed from: L */
    public void m27077L(float f) {
        this.f3567n = f;
    }

    /* renamed from: M */
    public boolean m27076M(int i, int i2) {
        if (this.f3573t) {
            return m27052u(i, i2, (int) this.f3565l.getXVelocity(this.f3556c), (int) this.f3565l.getYVelocity(this.f3556c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r12 != r11) goto L57;
     */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m27075N(MotionEvent motionEvent) {
        boolean z;
        View m27053t;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m27072a();
        }
        if (this.f3565l == null) {
            this.f3565l = VelocityTracker.obtain();
        }
        this.f3565l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x = motionEvent.getX(actionIndex);
                            float y = motionEvent.getY(actionIndex);
                            m27081H(x, y, pointerId);
                            int i = this.f3554a;
                            if (i == 0) {
                                int i2 = this.f3561h[pointerId];
                                int i3 = this.f3569p;
                                if ((i2 & i3) != 0) {
                                    this.f3571r.mo27043h(i2 & i3, pointerId);
                                }
                            } else if (i == 2 && (m27053t = m27053t((int) x, (int) y)) == this.f3572s) {
                                m27073P(m27053t, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            m27063j(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.f3557d != null && this.f3558e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i4 = 0; i4 < pointerCount; i4++) {
                        int pointerId2 = motionEvent.getPointerId(i4);
                        if (m27086C(pointerId2)) {
                            float x2 = motionEvent.getX(i4);
                            float y2 = motionEvent.getY(i4);
                            float f = x2 - this.f3557d[pointerId2];
                            float f2 = y2 - this.f3558e[pointerId2];
                            View m27053t2 = m27053t((int) x2, (int) y2);
                            boolean z2 = m27053t2 != null && m27067f(m27053t2, f, f2);
                            if (z2) {
                                int left = m27053t2.getLeft();
                                int i5 = (int) f;
                                int mo872a = this.f3571r.mo872a(m27053t2, left + i5, i5);
                                int top = m27053t2.getTop();
                                int i6 = (int) f2;
                                int mo871b = this.f3571r.mo871b(m27053t2, top + i6, i6);
                                int mo981d = this.f3571r.mo981d(m27053t2);
                                int mo870e = this.f3571r.mo870e(m27053t2);
                                if (mo981d != 0) {
                                    if (mo981d > 0) {
                                    }
                                }
                                if (mo870e == 0) {
                                    break;
                                } else if (mo870e > 0 && mo871b == top) {
                                    break;
                                }
                            }
                            m27082G(f, f2, pointerId2);
                            if (this.f3554a != 1) {
                                if (z2 && m27073P(m27053t2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    m27080I(motionEvent);
                }
                z = false;
            }
            m27072a();
            z = false;
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            z = false;
            int pointerId3 = motionEvent.getPointerId(0);
            m27081H(x3, y3, pointerId3);
            View m27053t3 = m27053t((int) x3, (int) y3);
            if (m27053t3 == this.f3572s && this.f3554a == 2) {
                m27073P(m27053t3, pointerId3);
            }
            int i7 = this.f3561h[pointerId3];
            int i8 = this.f3569p;
            if ((i7 & i8) != 0) {
                this.f3571r.mo27043h(i7 & i8, pointerId3);
            }
        }
        if (this.f3554a == 1) {
            return true;
        }
        return z;
    }

    /* renamed from: O */
    public boolean m27074O(View view, int i, int i2) {
        this.f3572s = view;
        this.f3556c = -1;
        boolean m27052u = m27052u(i, i2, 0, 0);
        if (!m27052u && this.f3554a == 0 && this.f3572s != null) {
            this.f3572s = null;
        }
        return m27052u;
    }

    /* renamed from: P */
    public boolean m27073P(View view, int i) {
        if (view == this.f3572s && this.f3556c == i) {
            return true;
        }
        if (view == null || !this.f3571r.mo866m(view, i)) {
            return false;
        }
        this.f3556c = i;
        m27071b(view, i);
        return true;
    }

    /* renamed from: a */
    public void m27072a() {
        this.f3556c = -1;
        m27064i();
        VelocityTracker velocityTracker = this.f3565l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3565l = null;
        }
    }

    /* renamed from: b */
    public void m27071b(View view, int i) {
        if (view.getParent() == this.f3574u) {
            this.f3572s = view;
            this.f3556c = i;
            this.f3571r.mo980i(view, i);
            m27079J(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f3574u + ")");
    }

    /* renamed from: c */
    public final boolean m27070c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f3561h[i] & i2) != i2 || (this.f3569p & i2) == 0 || (this.f3563j[i] & i2) == i2 || (this.f3562i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f3555b;
        if (abs > i3 || abs2 > i3) {
            if (abs >= abs2 * 0.5f || !this.f3571r.mo27044g(i2)) {
                return (this.f3562i[i] & i2) == 0 && abs > ((float) this.f3555b);
            }
            int[] iArr = this.f3563j;
            iArr[i] = iArr[i] | i2;
            return false;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m27069d(int i) {
        int length = this.f3557d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m27068e(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean m27068e(int i, int i2) {
        if (m27087B(i2)) {
            boolean z = (i & 1) == 1;
            boolean z2 = (i & 2) == 2;
            float f = this.f3559f[i2] - this.f3557d[i2];
            float f2 = this.f3560g[i2] - this.f3558e[i2];
            if (!z || !z2) {
                return z ? Math.abs(f) > ((float) this.f3555b) : z2 && Math.abs(f2) > ((float) this.f3555b);
            }
            int i3 = this.f3555b;
            return (f * f) + (f2 * f2) > ((float) (i3 * i3));
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m27067f(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f3571r.mo981d(view) > 0;
        boolean z2 = this.f3571r.mo870e(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f3555b) : z2 && Math.abs(f2) > ((float) this.f3555b);
        }
        int i = this.f3555b;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    /* renamed from: g */
    public final float m27066g(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: h */
    public final int m27065h(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: i */
    public final void m27064i() {
        float[] fArr = this.f3557d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f3558e, 0.0f);
        Arrays.fill(this.f3559f, 0.0f);
        Arrays.fill(this.f3560g, 0.0f);
        Arrays.fill(this.f3561h, 0);
        Arrays.fill(this.f3562i, 0);
        Arrays.fill(this.f3563j, 0);
        this.f3564k = 0;
    }

    /* renamed from: j */
    public final void m27063j(int i) {
        if (this.f3557d == null || !m27087B(i)) {
            return;
        }
        this.f3557d[i] = 0.0f;
        this.f3558e[i] = 0.0f;
        this.f3559f[i] = 0.0f;
        this.f3560g[i] = 0.0f;
        this.f3561h[i] = 0;
        this.f3562i[i] = 0;
        this.f3563j[i] = 0;
        this.f3564k = ((1 << i) ^ (-1)) & this.f3564k;
    }

    /* renamed from: k */
    public final int m27062k(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f3574u.getWidth();
        float f = width / 2;
        float m27056q = f + (m27056q(Math.min(1.0f, Math.abs(i) / width)) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(m27056q / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: l */
    public final int m27061l(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int m27065h = m27065h(i3, (int) this.f3567n, (int) this.f3566m);
        int m27065h2 = m27065h(i4, (int) this.f3567n, (int) this.f3566m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(m27065h);
        int abs4 = Math.abs(m27065h2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (m27065h != 0) {
            f = abs3;
            f2 = i5;
        } else {
            f = abs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (m27065h2 != 0) {
            f3 = abs4;
            f4 = i5;
        } else {
            f3 = abs2;
            f4 = i6;
        }
        return (int) ((m27062k(i, m27065h, this.f3571r.mo981d(view)) * f5) + (m27062k(i2, m27065h2, this.f3571r.mo870e(view)) * (f3 / f4)));
    }

    /* renamed from: m */
    public boolean m27060m(boolean z) {
        if (this.f3554a == 2) {
            boolean computeScrollOffset = this.f3570q.computeScrollOffset();
            int currX = this.f3570q.getCurrX();
            int currY = this.f3570q.getCurrY();
            int left = currX - this.f3572s.getLeft();
            int top = currY - this.f3572s.getTop();
            if (left != 0) {
                xs1.m4734b0(this.f3572s, left);
            }
            if (top != 0) {
                xs1.m4732c0(this.f3572s, top);
            }
            if (left != 0 || top != 0) {
                this.f3571r.mo868k(this.f3572s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f3570q.getFinalX() && currY == this.f3570q.getFinalY()) {
                this.f3570q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f3574u.post(this.f3575v);
                } else {
                    m27079J(0);
                }
            }
        }
        return this.f3554a == 2;
    }

    /* renamed from: p */
    public final void m27057p(float f, float f2) {
        this.f3573t = true;
        this.f3571r.mo867l(this.f3572s, f, f2);
        this.f3573t = false;
        if (this.f3554a == 1) {
            m27079J(0);
        }
    }

    /* renamed from: q */
    public final float m27056q(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: r */
    public final void m27055r(int i, int i2, int i3, int i4) {
        int left = this.f3572s.getLeft();
        int top = this.f3572s.getTop();
        if (i3 != 0) {
            i = this.f3571r.mo872a(this.f3572s, i, i3);
            xs1.m4734b0(this.f3572s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f3571r.mo871b(this.f3572s, i2, i4);
            xs1.m4732c0(this.f3572s, i2 - top);
        }
        int i6 = i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.f3571r.mo868k(this.f3572s, i5, i6, i5 - left, i6 - top);
    }

    /* renamed from: s */
    public final void m27054s(int i) {
        float[] fArr = this.f3557d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f3558e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3559f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3560g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3561h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3562i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3563j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3557d = fArr2;
            this.f3558e = fArr3;
            this.f3559f = fArr4;
            this.f3560g = fArr5;
            this.f3561h = iArr;
            this.f3562i = iArr2;
            this.f3563j = iArr3;
        }
    }

    /* renamed from: t */
    public View m27053t(int i, int i2) {
        for (int childCount = this.f3574u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f3574u.getChildAt(this.f3571r.m27046c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: u */
    public final boolean m27052u(int i, int i2, int i3, int i4) {
        int left = this.f3572s.getLeft();
        int top = this.f3572s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f3570q.abortAnimation();
            m27079J(0);
            return false;
        }
        this.f3570q.startScroll(left, top, i5, i6, m27061l(this.f3572s, i5, i6, i3, i4));
        m27079J(2);
        return true;
    }

    /* renamed from: v */
    public View m27051v() {
        return this.f3572s;
    }

    /* renamed from: w */
    public int m27050w() {
        return this.f3568o;
    }

    /* renamed from: x */
    public final int m27049x(int i, int i2) {
        int i3 = i < this.f3574u.getLeft() + this.f3568o ? 1 : 0;
        if (i2 < this.f3574u.getTop() + this.f3568o) {
            i3 |= 4;
        }
        if (i > this.f3574u.getRight() - this.f3568o) {
            i3 |= 2;
        }
        return i2 > this.f3574u.getBottom() - this.f3568o ? i3 | 8 : i3;
    }

    /* renamed from: y */
    public int m27048y() {
        return this.f3555b;
    }

    /* renamed from: z */
    public int m27047z() {
        return this.f3554a;
    }
}
