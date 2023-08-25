package com.daaw;

import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
public class fs0 {

    /* renamed from: a */
    public ViewParent f9843a;

    /* renamed from: b */
    public ViewParent f9844b;

    /* renamed from: c */
    public final View f9845c;

    /* renamed from: d */
    public boolean f9846d;

    /* renamed from: e */
    public int[] f9847e;

    public fs0(View view) {
        this.f9845c = view;
    }

    /* renamed from: a */
    public boolean m22354a(float f, float f2, boolean z) {
        ViewParent m22347h;
        if (!m22343l() || (m22347h = m22347h(0)) == null) {
            return false;
        }
        return st1.m9901a(m22347h, this.f9845c, f, f2, z);
    }

    /* renamed from: b */
    public boolean m22353b(float f, float f2) {
        ViewParent m22347h;
        if (!m22343l() || (m22347h = m22347h(0)) == null) {
            return false;
        }
        return st1.m9900b(m22347h, this.f9845c, f, f2);
    }

    /* renamed from: c */
    public boolean m22352c(int i, int i2, int[] iArr, int[] iArr2) {
        return m22351d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean m22351d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent m22347h;
        int i4;
        int i5;
        if (!m22343l() || (m22347h = m22347h(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f9845c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = m22346i();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        st1.m9899c(m22347h, this.f9845c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f9845c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: e */
    public void m22350e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m22348g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: f */
    public boolean m22349f(int i, int i2, int i3, int i4, int[] iArr) {
        return m22348g(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: g */
    public final boolean m22348g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent m22347h;
        int i6;
        int i7;
        int[] iArr3;
        if (!m22343l() || (m22347h = m22347h(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f9845c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] m22346i = m22346i();
            m22346i[0] = 0;
            m22346i[1] = 0;
            iArr3 = m22346i;
        } else {
            iArr3 = iArr2;
        }
        st1.m9898d(m22347h, this.f9845c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f9845c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: h */
    public final ViewParent m22347h(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.f9844b;
        }
        return this.f9843a;
    }

    /* renamed from: i */
    public final int[] m22346i() {
        if (this.f9847e == null) {
            this.f9847e = new int[2];
        }
        return this.f9847e;
    }

    /* renamed from: j */
    public boolean m22345j() {
        return m22344k(0);
    }

    /* renamed from: k */
    public boolean m22344k(int i) {
        return m22347h(i) != null;
    }

    /* renamed from: l */
    public boolean m22343l() {
        return this.f9846d;
    }

    /* renamed from: m */
    public void m22342m(boolean z) {
        if (this.f9846d) {
            xs1.m4753L0(this.f9845c);
        }
        this.f9846d = z;
    }

    /* renamed from: n */
    public final void m22341n(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f9843a = viewParent;
        } else if (i != 1) {
        } else {
            this.f9844b = viewParent;
        }
    }

    /* renamed from: o */
    public boolean m22340o(int i) {
        return m22339p(i, 0);
    }

    /* renamed from: p */
    public boolean m22339p(int i, int i2) {
        if (m22344k(i2)) {
            return true;
        }
        if (m22343l()) {
            View view = this.f9845c;
            for (ViewParent parent = this.f9845c.getParent(); parent != null; parent = parent.getParent()) {
                if (st1.m9896f(parent, view, this.f9845c, i, i2)) {
                    m22341n(i2, parent);
                    st1.m9897e(parent, view, this.f9845c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: q */
    public void m22338q() {
        m22337r(0);
    }

    /* renamed from: r */
    public void m22337r(int i) {
        ViewParent m22347h = m22347h(i);
        if (m22347h != null) {
            st1.m9895g(m22347h, this.f9845c, i);
            m22341n(i, null);
        }
    }
}
