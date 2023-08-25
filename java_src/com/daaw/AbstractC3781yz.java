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
/* renamed from: com.daaw.yz */
/* loaded from: classes.dex */
public abstract class AbstractC3781yz extends C3388w {

    /* renamed from: n */
    public static final Rect f34269n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    public static final u20.InterfaceC3156a<C3654y> f34270o = new C3782a();

    /* renamed from: p */
    public static final u20.InterfaceC3157b<me1<C3654y>, C3654y> f34271p = new C3783b();

    /* renamed from: h */
    public final AccessibilityManager f34276h;

    /* renamed from: i */
    public final View f34277i;

    /* renamed from: j */
    public C3784c f34278j;

    /* renamed from: d */
    public final Rect f34272d = new Rect();

    /* renamed from: e */
    public final Rect f34273e = new Rect();

    /* renamed from: f */
    public final Rect f34274f = new Rect();

    /* renamed from: g */
    public final int[] f34275g = new int[2];

    /* renamed from: k */
    public int f34279k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f34280l = Integer.MIN_VALUE;

    /* renamed from: m */
    public int f34281m = Integer.MIN_VALUE;

    /* renamed from: com.daaw.yz$a */
    /* loaded from: classes.dex */
    public static class C3782a implements u20.InterfaceC3156a<C3654y> {
        @Override // com.daaw.u20.InterfaceC3156a
        /* renamed from: b */
        public void mo3034a(C3654y c3654y, Rect rect) {
            c3654y.m4314m(rect);
        }
    }

    /* renamed from: com.daaw.yz$b */
    /* loaded from: classes.dex */
    public static class C3783b implements u20.InterfaceC3157b<me1<C3654y>, C3654y> {
        @Override // com.daaw.u20.InterfaceC3157b
        /* renamed from: c */
        public C3654y mo3032a(me1<C3654y> me1Var, int i) {
            return me1Var.m16050n(i);
        }

        @Override // com.daaw.u20.InterfaceC3157b
        /* renamed from: d */
        public int mo3031b(me1<C3654y> me1Var) {
            return me1Var.m16051m();
        }
    }

    /* renamed from: com.daaw.yz$c */
    /* loaded from: classes.dex */
    public class C3784c extends C3786z {
        public C3784c() {
        }

        @Override // com.daaw.C3786z
        /* renamed from: b */
        public C3654y mo3016b(int i) {
            return C3654y.m4348Q(AbstractC3781yz.this.m3059H(i));
        }

        @Override // com.daaw.C3786z
        /* renamed from: d */
        public C3654y mo3014d(int i) {
            int i2 = i == 2 ? AbstractC3781yz.this.f34279k : AbstractC3781yz.this.f34280l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo3016b(i2);
        }

        @Override // com.daaw.C3786z
        /* renamed from: f */
        public boolean mo3012f(int i, int i2, Bundle bundle) {
            return AbstractC3781yz.this.m3055P(i, i2, bundle);
        }
    }

    public AbstractC3781yz(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f34277i = view;
        this.f34276h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (xs1.m4772C(view) == 0) {
            xs1.m4773B0(view, 1);
        }
    }

    /* renamed from: D */
    public static Rect m3063D(View view, int i, Rect rect) {
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

    /* renamed from: F */
    public static int m3061F(int i) {
        if (i != 19) {
            if (i != 21) {
                return i != 22 ? 130 : 66;
            }
            return 17;
        }
        return 33;
    }

    /* renamed from: A */
    public final int m3064A() {
        return this.f34280l;
    }

    /* renamed from: B */
    public abstract int mo782B(float f, float f2);

    /* renamed from: C */
    public abstract void mo781C(List<Integer> list);

    /* renamed from: E */
    public final boolean m3062E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f34277i.getWindowVisibility() != 0) {
            return false;
        }
        View view = this.f34277i;
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

    /* renamed from: G */
    public final boolean m3060G(int i, Rect rect) {
        Object m8620d;
        me1<C3654y> m3036y = m3036y();
        int i2 = this.f34280l;
        C3654y m16056e = i2 == Integer.MIN_VALUE ? null : m3036y.m16056e(i2);
        if (i == 1 || i == 2) {
            m8620d = u20.m8620d(m3036y, f34271p, f34270o, m16056e, i, xs1.m4768E(this.f34277i) == 1, false);
        } else if (i != 17 && i != 33 && i != 66 && i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            Rect rect2 = new Rect();
            int i3 = this.f34280l;
            if (i3 != Integer.MIN_VALUE) {
                m3035z(i3, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m3063D(this.f34277i, i, rect2);
            }
            m8620d = u20.m8621c(m3036y, f34271p, f34270o, m16056e, rect2, i);
        }
        C3654y c3654y = (C3654y) m8620d;
        return m3051T(c3654y != null ? m3036y.m16053j(m3036y.m16054i(c3654y)) : Integer.MIN_VALUE);
    }

    /* renamed from: H */
    public C3654y m3059H(int i) {
        return i == -1 ? m3040u() : m3041t(i);
    }

    /* renamed from: I */
    public final void m3058I(boolean z, int i, Rect rect) {
        int i2 = this.f34280l;
        if (i2 != Integer.MIN_VALUE) {
            m3046o(i2);
        }
        if (z) {
            m3060G(i, rect);
        }
    }

    /* renamed from: J */
    public abstract boolean mo780J(int i, int i2, Bundle bundle);

    /* renamed from: K */
    public void m3057K(AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: L */
    public void m3056L(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: M */
    public void mo779M(C3654y c3654y) {
    }

    /* renamed from: N */
    public abstract void mo778N(int i, C3654y c3654y);

    /* renamed from: O */
    public void mo777O(int i, boolean z) {
    }

    /* renamed from: P */
    public boolean m3055P(int i, int i2, Bundle bundle) {
        return i != -1 ? m3054Q(i, i2, bundle) : m3053R(i2, bundle);
    }

    /* renamed from: Q */
    public final boolean m3054Q(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? mo780J(i, i2, bundle) : m3047n(i) : m3052S(i) : m3046o(i) : m3051T(i);
    }

    /* renamed from: R */
    public final boolean m3053R(int i, Bundle bundle) {
        return xs1.m4724g0(this.f34277i, i, bundle);
    }

    /* renamed from: S */
    public final boolean m3052S(int i) {
        int i2;
        if (this.f34276h.isEnabled() && this.f34276h.isTouchExplorationEnabled() && (i2 = this.f34279k) != i) {
            if (i2 != Integer.MIN_VALUE) {
                m3047n(i2);
            }
            this.f34279k = i;
            this.f34277i.invalidate();
            m3050U(i, 32768);
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public final boolean m3051T(int i) {
        int i2;
        if ((this.f34277i.isFocused() || this.f34277i.requestFocus()) && (i2 = this.f34280l) != i) {
            if (i2 != Integer.MIN_VALUE) {
                m3046o(i2);
            }
            this.f34280l = i;
            mo777O(i, true);
            m3050U(i, 8);
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public final boolean m3050U(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f34276h.isEnabled() || (parent = this.f34277i.getParent()) == null) {
            return false;
        }
        return st1.m9894h(parent, this.f34277i, m3044q(i, i2));
    }

    /* renamed from: V */
    public final void m3049V(int i) {
        int i2 = this.f34281m;
        if (i2 == i) {
            return;
        }
        this.f34281m = i;
        m3050U(i, 128);
        m3050U(i2, 256);
    }

    @Override // com.daaw.C3388w
    /* renamed from: b */
    public C3786z mo3048b(View view) {
        if (this.f34278j == null) {
            this.f34278j = new C3784c();
        }
        return this.f34278j;
    }

    @Override // com.daaw.C3388w
    /* renamed from: f */
    public void mo354f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo354f(view, accessibilityEvent);
        m3057K(accessibilityEvent);
    }

    @Override // com.daaw.C3388w
    /* renamed from: g */
    public void mo161g(View view, C3654y c3654y) {
        super.mo161g(view, c3654y);
        mo779M(c3654y);
    }

    /* renamed from: n */
    public final boolean m3047n(int i) {
        if (this.f34279k == i) {
            this.f34279k = Integer.MIN_VALUE;
            this.f34277i.invalidate();
            m3050U(i, 65536);
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m3046o(int i) {
        if (this.f34280l != i) {
            return false;
        }
        this.f34280l = Integer.MIN_VALUE;
        mo777O(i, false);
        m3050U(i, 8);
        return true;
    }

    /* renamed from: p */
    public final boolean m3045p() {
        int i = this.f34280l;
        return i != Integer.MIN_VALUE && mo780J(i, 16, null);
    }

    /* renamed from: q */
    public final AccessibilityEvent m3044q(int i, int i2) {
        return i != -1 ? m3043r(i, i2) : m3042s(i2);
    }

    /* renamed from: r */
    public final AccessibilityEvent m3043r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C3654y m3059H = m3059H(i);
        obtain.getText().add(m3059H.m4294w());
        obtain.setContentDescription(m3059H.m4304r());
        obtain.setScrollable(m3059H.m4354K());
        obtain.setPassword(m3059H.m4355J());
        obtain.setEnabled(m3059H.m4359F());
        obtain.setChecked(m3059H.m4362D());
        m3056L(i, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(m3059H.m4308p());
        C0560a0.m27782c(obtain, this.f34277i, i);
        obtain.setPackageName(this.f34277i.getContext().getPackageName());
        return obtain;
    }

    /* renamed from: s */
    public final AccessibilityEvent m3042s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f34277i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: t */
    public final C3654y m3041t(int i) {
        C3654y m4350O = C3654y.m4350O();
        m4350O.m4325g0(true);
        m4350O.m4321i0(true);
        m4350O.m4335b0("android.view.View");
        Rect rect = f34269n;
        m4350O.m4341X(rect);
        m4350O.m4340Y(rect);
        m4350O.m4305q0(this.f34277i);
        mo778N(i, m4350O);
        if (m4350O.m4294w() == null && m4350O.m4304r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        m4350O.m4314m(this.f34273e);
        if (this.f34273e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int m4318k = m4350O.m4318k();
        if ((m4318k & 64) == 0) {
            if ((m4318k & 128) == 0) {
                m4350O.m4309o0(this.f34277i.getContext().getPackageName());
                m4350O.m4291x0(this.f34277i, i);
                if (this.f34279k == i) {
                    m4350O.m4343V(true);
                    m4350O.m4338a(128);
                } else {
                    m4350O.m4343V(false);
                    m4350O.m4338a(64);
                }
                boolean z = this.f34280l == i;
                if (z) {
                    m4350O.m4338a(2);
                } else if (m4350O.m4358G()) {
                    m4350O.m4338a(1);
                }
                m4350O.m4319j0(z);
                this.f34277i.getLocationOnScreen(this.f34275g);
                m4350O.m4312n(this.f34272d);
                if (this.f34272d.equals(rect)) {
                    m4350O.m4314m(this.f34272d);
                    if (m4350O.f33147b != -1) {
                        C3654y m4350O2 = C3654y.m4350O();
                        for (int i2 = m4350O.f33147b; i2 != -1; i2 = m4350O2.f33147b) {
                            m4350O2.m4303r0(this.f34277i, -1);
                            m4350O2.m4341X(f34269n);
                            mo778N(i2, m4350O2);
                            m4350O2.m4314m(this.f34273e);
                            Rect rect2 = this.f34272d;
                            Rect rect3 = this.f34273e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        m4350O2.m4346S();
                    }
                    this.f34272d.offset(this.f34275g[0] - this.f34277i.getScrollX(), this.f34275g[1] - this.f34277i.getScrollY());
                }
                if (this.f34277i.getLocalVisibleRect(this.f34274f)) {
                    this.f34274f.offset(this.f34275g[0] - this.f34277i.getScrollX(), this.f34275g[1] - this.f34277i.getScrollY());
                    if (this.f34272d.intersect(this.f34274f)) {
                        m4350O.m4340Y(this.f34272d);
                        if (m3062E(this.f34272d)) {
                            m4350O.m4365B0(true);
                        }
                    }
                }
                return m4350O;
            }
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }

    /* renamed from: u */
    public final C3654y m3040u() {
        C3654y m4349P = C3654y.m4349P(this.f34277i);
        xs1.m4728e0(this.f34277i, m4349P);
        ArrayList arrayList = new ArrayList();
        mo781C(arrayList);
        if (m4349P.m4310o() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m4349P.m4332d(this.f34277i, ((Integer) arrayList.get(i)).intValue());
            }
            return m4349P;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: v */
    public final boolean m3039v(MotionEvent motionEvent) {
        if (this.f34276h.isEnabled() && this.f34276h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int mo782B = mo782B(motionEvent.getX(), motionEvent.getY());
                m3049V(mo782B);
                return mo782B != Integer.MIN_VALUE;
            } else if (action == 10 && this.f34281m != Integer.MIN_VALUE) {
                m3049V(Integer.MIN_VALUE);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /* renamed from: w */
    public final boolean m3038w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m3060G(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return m3060G(1, null);
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
                            int m3061F = m3061F(keyCode);
                            int repeatCount = keyEvent.getRepeatCount() + 1;
                            boolean z = false;
                            while (i < repeatCount && m3060G(m3061F, null)) {
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
                m3045p();
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: x */
    public final int m3037x() {
        return this.f34279k;
    }

    /* renamed from: y */
    public final me1<C3654y> m3036y() {
        ArrayList arrayList = new ArrayList();
        mo781C(arrayList);
        me1<C3654y> me1Var = new me1<>();
        for (int i = 0; i < arrayList.size(); i++) {
            me1Var.m16052k(i, m3041t(i));
        }
        return me1Var;
    }

    /* renamed from: z */
    public final void m3035z(int i, Rect rect) {
        m3059H(i).m4314m(rect);
    }
}
