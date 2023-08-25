package com.daaw;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.daaw.u20;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class yz extends w {
    public static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final u20.a<y> o = new a();
    public static final u20.b<me1<y>, y> p = new b();
    public final AccessibilityManager h;
    public final View i;
    public c j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    /* loaded from: classes.dex */
    public static class a implements u20.a<y> {
        @Override // com.daaw.u20.a
        /* renamed from: b */
        public void a(y yVar, Rect rect) {
            yVar.m(rect);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements u20.b<me1<y>, y> {
        @Override // com.daaw.u20.b
        /* renamed from: c */
        public y a(me1<y> me1Var, int i) {
            return me1Var.n(i);
        }

        @Override // com.daaw.u20.b
        /* renamed from: d */
        public int b(me1<y> me1Var) {
            return me1Var.m();
        }
    }

    /* loaded from: classes.dex */
    public class c extends z {
        public c() {
        }

        @Override // com.daaw.z
        public y b(int i) {
            return y.Q(yz.this.H(i));
        }

        @Override // com.daaw.z
        public y d(int i) {
            int i2 = i == 2 ? yz.this.k : yz.this.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i2);
        }

        @Override // com.daaw.z
        public boolean f(int i, int i2, Bundle bundle) {
            return yz.this.P(i, i2, bundle);
        }
    }

    public yz(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (xs1.C(view) == 0) {
            xs1.B0(view, 1);
        }
    }

    public static Rect D(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    public static int F(int i) {
        if (i != 19) {
            if (i != 21) {
                return i != 22 ? 130 : 66;
            }
            return 17;
        }
        return 33;
    }

    public final int A() {
        return this.l;
    }

    public abstract int B(float f, float f2);

    public abstract void C(List<Integer> list);

    public final boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.i.getWindowVisibility() != 0) {
            return false;
        }
        View view = this.i;
        do {
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return parent != null;
            }
            view = (View) parent;
            if (view.getAlpha() <= 0.0f) {
                break;
            }
        } while (view.getVisibility() == 0);
        return false;
    }

    public final boolean G(int i, Rect rect) {
        Object d;
        me1<y> y = y();
        int i2 = this.l;
        y e = i2 == Integer.MIN_VALUE ? null : y.e(i2);
        if (i == 1 || i == 2) {
            d = u20.d(y, p, o, e, i, xs1.E(this.i) == 1, false);
        } else if (i != 17 && i != 33 && i != 66 && i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            Rect rect2 = new Rect();
            int i3 = this.l;
            if (i3 != Integer.MIN_VALUE) {
                z(i3, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.i, i, rect2);
            }
            d = u20.c(y, p, o, e, rect2, i);
        }
        y yVar = (y) d;
        return T(yVar != null ? y.j(y.i(yVar)) : Integer.MIN_VALUE);
    }

    public y H(int i) {
        return i == -1 ? u() : t(i);
    }

    public final void I(boolean z, int i, Rect rect) {
        int i2 = this.l;
        if (i2 != Integer.MIN_VALUE) {
            o(i2);
        }
        if (z) {
            G(i, rect);
        }
    }

    public abstract boolean J(int i, int i2, Bundle bundle);

    public void K(AccessibilityEvent accessibilityEvent) {
    }

    public void L(int i, AccessibilityEvent accessibilityEvent) {
    }

    public void M(y yVar) {
    }

    public abstract void N(int i, y yVar);

    public void O(int i, boolean z) {
    }

    public boolean P(int i, int i2, Bundle bundle) {
        return i != -1 ? Q(i, i2, bundle) : R(i2, bundle);
    }

    public final boolean Q(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? J(i, i2, bundle) : n(i) : S(i) : o(i) : T(i);
    }

    public final boolean R(int i, Bundle bundle) {
        return xs1.g0(this.i, i, bundle);
    }

    public final boolean S(int i) {
        int i2;
        if (this.h.isEnabled() && this.h.isTouchExplorationEnabled() && (i2 = this.k) != i) {
            if (i2 != Integer.MIN_VALUE) {
                n(i2);
            }
            this.k = i;
            this.i.invalidate();
            U(i, 32768);
            return true;
        }
        return false;
    }

    public final boolean T(int i) {
        int i2;
        if ((this.i.isFocused() || this.i.requestFocus()) && (i2 = this.l) != i) {
            if (i2 != Integer.MIN_VALUE) {
                o(i2);
            }
            this.l = i;
            O(i, true);
            U(i, 8);
            return true;
        }
        return false;
    }

    public final boolean U(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        return st1.h(parent, this.i, q(i, i2));
    }

    public final void V(int i) {
        int i2 = this.m;
        if (i2 == i) {
            return;
        }
        this.m = i;
        U(i, 128);
        U(i2, 256);
    }

    @Override // com.daaw.w
    public z b(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    @Override // com.daaw.w
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // com.daaw.w
    public void g(View view, y yVar) {
        super.g(view, yVar);
        M(yVar);
    }

    public final boolean n(int i) {
        if (this.k == i) {
            this.k = Integer.MIN_VALUE;
            this.i.invalidate();
            U(i, 65536);
            return true;
        }
        return false;
    }

    public final boolean o(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        O(i, false);
        U(i, 8);
        return true;
    }

    public final boolean p() {
        int i = this.l;
        return i != Integer.MIN_VALUE && J(i, 16, null);
    }

    public final AccessibilityEvent q(int i, int i2) {
        return i != -1 ? r(i, i2) : s(i2);
    }

    public final AccessibilityEvent r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        y H = H(i);
        obtain.getText().add(H.w());
        obtain.setContentDescription(H.r());
        obtain.setScrollable(H.K());
        obtain.setPassword(H.J());
        obtain.setEnabled(H.F());
        obtain.setChecked(H.D());
        L(i, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(H.p());
        a0.c(obtain, this.i, i);
        obtain.setPackageName(this.i.getContext().getPackageName());
        return obtain;
    }

    public final AccessibilityEvent s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    public final y t(int i) {
        y O = y.O();
        O.g0(true);
        O.i0(true);
        O.b0("android.view.View");
        Rect rect = n;
        O.X(rect);
        O.Y(rect);
        O.q0(this.i);
        N(i, O);
        if (O.w() == null && O.r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        O.m(this.e);
        if (this.e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int k = O.k();
        if ((k & 64) == 0) {
            if ((k & 128) == 0) {
                O.o0(this.i.getContext().getPackageName());
                O.x0(this.i, i);
                if (this.k == i) {
                    O.V(true);
                    O.a(128);
                } else {
                    O.V(false);
                    O.a(64);
                }
                boolean z = this.l == i;
                if (z) {
                    O.a(2);
                } else if (O.G()) {
                    O.a(1);
                }
                O.j0(z);
                this.i.getLocationOnScreen(this.g);
                O.n(this.d);
                if (this.d.equals(rect)) {
                    O.m(this.d);
                    if (O.b != -1) {
                        y O2 = y.O();
                        for (int i2 = O.b; i2 != -1; i2 = O2.b) {
                            O2.r0(this.i, -1);
                            O2.X(n);
                            N(i2, O2);
                            O2.m(this.e);
                            Rect rect2 = this.d;
                            Rect rect3 = this.e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        O2.S();
                    }
                    this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                }
                if (this.i.getLocalVisibleRect(this.f)) {
                    this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                    if (this.d.intersect(this.f)) {
                        O.Y(this.d);
                        if (E(this.d)) {
                            O.B0(true);
                        }
                    }
                }
                return O;
            }
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }

    public final y u() {
        y P = y.P(this.i);
        xs1.e0(this.i, P);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (P.o() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                P.d(this.i, ((Integer) arrayList.get(i)).intValue());
            }
            return P;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public final boolean v(MotionEvent motionEvent) {
        if (this.h.isEnabled() && this.h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int B = B(motionEvent.getX(), motionEvent.getY());
                V(B);
                return B != Integer.MIN_VALUE;
            } else if (action == 10 && this.m != Integer.MIN_VALUE) {
                V(Integer.MIN_VALUE);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final boolean w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return G(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return G(1, null);
                }
                return false;
            }
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (keyEvent.hasNoModifiers()) {
                            int F = F(keyCode);
                            int repeatCount = keyEvent.getRepeatCount() + 1;
                            boolean z = false;
                            while (i < repeatCount && G(F, null)) {
                                i++;
                                z = true;
                            }
                            return z;
                        }
                        return false;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                p();
                return true;
            }
            return false;
        }
        return false;
    }

    public final int x() {
        return this.k;
    }

    public final me1<y> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        me1<y> me1Var = new me1<>();
        for (int i = 0; i < arrayList.size(); i++) {
            me1Var.k(i, t(i));
        }
        return me1Var;
    }

    public final void z(int i, Rect rect) {
        H(i).m(rect);
    }
}
