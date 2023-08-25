package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
/* loaded from: classes2.dex */
public class gc1 {

    /* renamed from: m */
    public static final InterfaceC2055ll f11023m = new o31(0.5f);

    /* renamed from: a */
    public C2193ml f11024a;

    /* renamed from: b */
    public C2193ml f11025b;

    /* renamed from: c */
    public C2193ml f11026c;

    /* renamed from: d */
    public C2193ml f11027d;

    /* renamed from: e */
    public InterfaceC2055ll f11028e;

    /* renamed from: f */
    public InterfaceC2055ll f11029f;

    /* renamed from: g */
    public InterfaceC2055ll f11030g;

    /* renamed from: h */
    public InterfaceC2055ll f11031h;

    /* renamed from: i */
    public C2889rv f11032i;

    /* renamed from: j */
    public C2889rv f11033j;

    /* renamed from: k */
    public C2889rv f11034k;

    /* renamed from: l */
    public C2889rv f11035l;

    /* renamed from: com.daaw.gc1$b */
    /* loaded from: classes2.dex */
    public static final class C1393b {

        /* renamed from: a */
        public C2193ml f11036a;

        /* renamed from: b */
        public C2193ml f11037b;

        /* renamed from: c */
        public C2193ml f11038c;

        /* renamed from: d */
        public C2193ml f11039d;

        /* renamed from: e */
        public InterfaceC2055ll f11040e;

        /* renamed from: f */
        public InterfaceC2055ll f11041f;

        /* renamed from: g */
        public InterfaceC2055ll f11042g;

        /* renamed from: h */
        public InterfaceC2055ll f11043h;

        /* renamed from: i */
        public C2889rv f11044i;

        /* renamed from: j */
        public C2889rv f11045j;

        /* renamed from: k */
        public C2889rv f11046k;

        /* renamed from: l */
        public C2889rv f11047l;

        public C1393b() {
            this.f11036a = on0.m14144b();
            this.f11037b = on0.m14144b();
            this.f11038c = on0.m14144b();
            this.f11039d = on0.m14144b();
            this.f11040e = new C1152e(0.0f);
            this.f11041f = new C1152e(0.0f);
            this.f11042g = new C1152e(0.0f);
            this.f11043h = new C1152e(0.0f);
            this.f11044i = on0.m14143c();
            this.f11045j = on0.m14143c();
            this.f11046k = on0.m14143c();
            this.f11047l = on0.m14143c();
        }

        public C1393b(gc1 gc1Var) {
            this.f11036a = on0.m14144b();
            this.f11037b = on0.m14144b();
            this.f11038c = on0.m14144b();
            this.f11039d = on0.m14144b();
            this.f11040e = new C1152e(0.0f);
            this.f11041f = new C1152e(0.0f);
            this.f11042g = new C1152e(0.0f);
            this.f11043h = new C1152e(0.0f);
            this.f11044i = on0.m14143c();
            this.f11045j = on0.m14143c();
            this.f11046k = on0.m14143c();
            this.f11047l = on0.m14143c();
            this.f11036a = gc1Var.f11024a;
            this.f11037b = gc1Var.f11025b;
            this.f11038c = gc1Var.f11026c;
            this.f11039d = gc1Var.f11027d;
            this.f11040e = gc1Var.f11028e;
            this.f11041f = gc1Var.f11029f;
            this.f11042g = gc1Var.f11030g;
            this.f11043h = gc1Var.f11031h;
            this.f11044i = gc1Var.f11032i;
            this.f11045j = gc1Var.f11033j;
            this.f11046k = gc1Var.f11034k;
            this.f11047l = gc1Var.f11035l;
        }

        /* renamed from: n */
        public static float m21768n(C2193ml c2193ml) {
            if (c2193ml instanceof j61) {
                return ((j61) c2193ml).f14446a;
            }
            if (c2193ml instanceof C2743qo) {
                return ((C2743qo) c2193ml).f24209a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public C1393b m21787A(float f) {
            this.f11040e = new C1152e(f);
            return this;
        }

        /* renamed from: B */
        public C1393b m21786B(InterfaceC2055ll interfaceC2055ll) {
            this.f11040e = interfaceC2055ll;
            return this;
        }

        /* renamed from: C */
        public C1393b m21785C(int i, InterfaceC2055ll interfaceC2055ll) {
            return m21784D(on0.m14145a(i)).m21782F(interfaceC2055ll);
        }

        /* renamed from: D */
        public C1393b m21784D(C2193ml c2193ml) {
            this.f11037b = c2193ml;
            float m21768n = m21768n(c2193ml);
            if (m21768n != -1.0f) {
                m21783E(m21768n);
            }
            return this;
        }

        /* renamed from: E */
        public C1393b m21783E(float f) {
            this.f11041f = new C1152e(f);
            return this;
        }

        /* renamed from: F */
        public C1393b m21782F(InterfaceC2055ll interfaceC2055ll) {
            this.f11041f = interfaceC2055ll;
            return this;
        }

        /* renamed from: m */
        public gc1 m21769m() {
            return new gc1(this);
        }

        /* renamed from: o */
        public C1393b m21767o(float f) {
            return m21787A(f).m21783E(f).m21759w(f).m21763s(f);
        }

        /* renamed from: p */
        public C1393b m21766p(InterfaceC2055ll interfaceC2055ll) {
            return m21786B(interfaceC2055ll).m21782F(interfaceC2055ll).m21758x(interfaceC2055ll).m21762t(interfaceC2055ll);
        }

        /* renamed from: q */
        public C1393b m21765q(int i, InterfaceC2055ll interfaceC2055ll) {
            return m21764r(on0.m14145a(i)).m21762t(interfaceC2055ll);
        }

        /* renamed from: r */
        public C1393b m21764r(C2193ml c2193ml) {
            this.f11039d = c2193ml;
            float m21768n = m21768n(c2193ml);
            if (m21768n != -1.0f) {
                m21763s(m21768n);
            }
            return this;
        }

        /* renamed from: s */
        public C1393b m21763s(float f) {
            this.f11043h = new C1152e(f);
            return this;
        }

        /* renamed from: t */
        public C1393b m21762t(InterfaceC2055ll interfaceC2055ll) {
            this.f11043h = interfaceC2055ll;
            return this;
        }

        /* renamed from: u */
        public C1393b m21761u(int i, InterfaceC2055ll interfaceC2055ll) {
            return m21760v(on0.m14145a(i)).m21758x(interfaceC2055ll);
        }

        /* renamed from: v */
        public C1393b m21760v(C2193ml c2193ml) {
            this.f11038c = c2193ml;
            float m21768n = m21768n(c2193ml);
            if (m21768n != -1.0f) {
                m21759w(m21768n);
            }
            return this;
        }

        /* renamed from: w */
        public C1393b m21759w(float f) {
            this.f11042g = new C1152e(f);
            return this;
        }

        /* renamed from: x */
        public C1393b m21758x(InterfaceC2055ll interfaceC2055ll) {
            this.f11042g = interfaceC2055ll;
            return this;
        }

        /* renamed from: y */
        public C1393b m21757y(int i, InterfaceC2055ll interfaceC2055ll) {
            return m21756z(on0.m14145a(i)).m21786B(interfaceC2055ll);
        }

        /* renamed from: z */
        public C1393b m21756z(C2193ml c2193ml) {
            this.f11036a = c2193ml;
            float m21768n = m21768n(c2193ml);
            if (m21768n != -1.0f) {
                m21787A(m21768n);
            }
            return this;
        }
    }

    /* renamed from: com.daaw.gc1$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC1394c {
        /* renamed from: a */
        InterfaceC2055ll mo14958a(InterfaceC2055ll interfaceC2055ll);
    }

    public gc1() {
        this.f11024a = on0.m14144b();
        this.f11025b = on0.m14144b();
        this.f11026c = on0.m14144b();
        this.f11027d = on0.m14144b();
        this.f11028e = new C1152e(0.0f);
        this.f11029f = new C1152e(0.0f);
        this.f11030g = new C1152e(0.0f);
        this.f11031h = new C1152e(0.0f);
        this.f11032i = on0.m14143c();
        this.f11033j = on0.m14143c();
        this.f11034k = on0.m14143c();
        this.f11035l = on0.m14143c();
    }

    public gc1(C1393b c1393b) {
        this.f11024a = c1393b.f11036a;
        this.f11025b = c1393b.f11037b;
        this.f11026c = c1393b.f11038c;
        this.f11027d = c1393b.f11039d;
        this.f11028e = c1393b.f11040e;
        this.f11029f = c1393b.f11041f;
        this.f11030g = c1393b.f11042g;
        this.f11031h = c1393b.f11043h;
        this.f11032i = c1393b.f11044i;
        this.f11033j = c1393b.f11045j;
        this.f11034k = c1393b.f11046k;
        this.f11035l = c1393b.f11047l;
    }

    /* renamed from: a */
    public static C1393b m21812a() {
        return new C1393b();
    }

    /* renamed from: b */
    public static C1393b m21811b(Context context, int i, int i2) {
        return m21810c(context, i, i2, 0);
    }

    /* renamed from: c */
    public static C1393b m21810c(Context context, int i, int i2, int i3) {
        return m21809d(context, i, i2, new C1152e(i3));
    }

    /* renamed from: d */
    public static C1393b m21809d(Context context, int i, int i2, InterfaceC2055ll interfaceC2055ll) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, m21.f18151U3);
        try {
            int i3 = obtainStyledAttributes.getInt(m21.f18158V3, 0);
            int i4 = obtainStyledAttributes.getInt(m21.f18179Y3, i3);
            int i5 = obtainStyledAttributes.getInt(m21.f18186Z3, i3);
            int i6 = obtainStyledAttributes.getInt(m21.f18172X3, i3);
            int i7 = obtainStyledAttributes.getInt(m21.f18165W3, i3);
            InterfaceC2055ll m21800m = m21800m(obtainStyledAttributes, m21.f18194a4, interfaceC2055ll);
            InterfaceC2055ll m21800m2 = m21800m(obtainStyledAttributes, m21.f18218d4, m21800m);
            InterfaceC2055ll m21800m3 = m21800m(obtainStyledAttributes, m21.f18226e4, m21800m);
            InterfaceC2055ll m21800m4 = m21800m(obtainStyledAttributes, m21.f18210c4, m21800m);
            return new C1393b().m21757y(i4, m21800m2).m21785C(i5, m21800m3).m21761u(i6, m21800m4).m21765q(i7, m21800m(obtainStyledAttributes, m21.f18202b4, m21800m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static C1393b m21808e(Context context, AttributeSet attributeSet, int i, int i2) {
        return m21807f(context, attributeSet, i, i2, 0);
    }

    /* renamed from: f */
    public static C1393b m21807f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return m21806g(context, attributeSet, i, i2, new C1152e(i3));
    }

    /* renamed from: g */
    public static C1393b m21806g(Context context, AttributeSet attributeSet, int i, int i2, InterfaceC2055ll interfaceC2055ll) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m21.f18094M2, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(m21.f18101N2, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(m21.f18108O2, 0);
        obtainStyledAttributes.recycle();
        return m21809d(context, resourceId, resourceId2, interfaceC2055ll);
    }

    /* renamed from: m */
    public static InterfaceC2055ll m21800m(TypedArray typedArray, int i, InterfaceC2055ll interfaceC2055ll) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return interfaceC2055ll;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new C1152e(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new o31(peekValue.getFraction(1.0f, 1.0f)) : interfaceC2055ll;
    }

    /* renamed from: h */
    public C2889rv m21805h() {
        return this.f11034k;
    }

    /* renamed from: i */
    public C2193ml m21804i() {
        return this.f11027d;
    }

    /* renamed from: j */
    public InterfaceC2055ll m21803j() {
        return this.f11031h;
    }

    /* renamed from: k */
    public C2193ml m21802k() {
        return this.f11026c;
    }

    /* renamed from: l */
    public InterfaceC2055ll m21801l() {
        return this.f11030g;
    }

    /* renamed from: n */
    public C2889rv m21799n() {
        return this.f11035l;
    }

    /* renamed from: o */
    public C2889rv m21798o() {
        return this.f11033j;
    }

    /* renamed from: p */
    public C2889rv m21797p() {
        return this.f11032i;
    }

    /* renamed from: q */
    public C2193ml m21796q() {
        return this.f11024a;
    }

    /* renamed from: r */
    public InterfaceC2055ll m21795r() {
        return this.f11028e;
    }

    /* renamed from: s */
    public C2193ml m21794s() {
        return this.f11025b;
    }

    /* renamed from: t */
    public InterfaceC2055ll m21793t() {
        return this.f11029f;
    }

    /* renamed from: u */
    public boolean m21792u(RectF rectF) {
        boolean z = this.f11035l.getClass().equals(C2889rv.class) && this.f11033j.getClass().equals(C2889rv.class) && this.f11032i.getClass().equals(C2889rv.class) && this.f11034k.getClass().equals(C2889rv.class);
        float mo14583a = this.f11028e.mo14583a(rectF);
        return z && ((this.f11029f.mo14583a(rectF) > mo14583a ? 1 : (this.f11029f.mo14583a(rectF) == mo14583a ? 0 : -1)) == 0 && (this.f11031h.mo14583a(rectF) > mo14583a ? 1 : (this.f11031h.mo14583a(rectF) == mo14583a ? 0 : -1)) == 0 && (this.f11030g.mo14583a(rectF) > mo14583a ? 1 : (this.f11030g.mo14583a(rectF) == mo14583a ? 0 : -1)) == 0) && ((this.f11025b instanceof j61) && (this.f11024a instanceof j61) && (this.f11026c instanceof j61) && (this.f11027d instanceof j61));
    }

    /* renamed from: v */
    public C1393b m21791v() {
        return new C1393b(this);
    }

    /* renamed from: w */
    public gc1 m21790w(float f) {
        return m21791v().m21767o(f).m21769m();
    }

    /* renamed from: x */
    public gc1 m21789x(InterfaceC2055ll interfaceC2055ll) {
        return m21791v().m21766p(interfaceC2055ll).m21769m();
    }

    /* renamed from: y */
    public gc1 m21788y(InterfaceC1394c interfaceC1394c) {
        return m21791v().m21786B(interfaceC1394c.mo14958a(m21795r())).m21782F(interfaceC1394c.mo14958a(m21793t())).m21762t(interfaceC1394c.mo14958a(m21803j())).m21758x(interfaceC1394c.mo14958a(m21801l())).m21769m();
    }
}
