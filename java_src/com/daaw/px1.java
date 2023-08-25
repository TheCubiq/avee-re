package com.daaw;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
/* loaded from: classes.dex */
public class px1 {

    /* renamed from: b */
    public static final px1 f23475b;

    /* renamed from: a */
    public final C2662l f23476a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: com.daaw.px1$a */
    /* loaded from: classes.dex */
    public static class C2651a {

        /* renamed from: a */
        public static Field f23477a;

        /* renamed from: b */
        public static Field f23478b;

        /* renamed from: c */
        public static Field f23479c;

        /* renamed from: d */
        public static boolean f23480d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f23477a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f23478b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f23479c = declaredField3;
                declaredField3.setAccessible(true);
                f23480d = true;
            } catch (ReflectiveOperationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets from AttachInfo ");
                sb.append(e.getMessage());
            }
        }

        /* renamed from: a */
        public static px1 m12936a(View view) {
            if (f23480d && view.isAttachedToWindow()) {
                try {
                    Object obj = f23477a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f23478b.get(obj);
                        Rect rect2 = (Rect) f23479c.get(obj);
                        if (rect != null && rect2 != null) {
                            px1 m12935a = new C2652b().m12934b(gg0.m21659c(rect)).m12933c(gg0.m21659c(rect2)).m12935a();
                            m12935a.m12941t(m12935a);
                            m12935a.m12957d(view.getRootView());
                            return m12935a;
                        }
                    }
                } catch (IllegalAccessException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get insets from AttachInfo. ");
                    sb.append(e.getMessage());
                }
            }
            return null;
        }
    }

    /* renamed from: com.daaw.px1$b */
    /* loaded from: classes.dex */
    public static final class C2652b {

        /* renamed from: a */
        public final C2656f f23481a;

        public C2652b() {
            int i = Build.VERSION.SDK_INT;
            this.f23481a = i >= 30 ? new C2655e() : i >= 29 ? new C2654d() : i >= 20 ? new C2653c() : new C2656f();
        }

        public C2652b(px1 px1Var) {
            int i = Build.VERSION.SDK_INT;
            this.f23481a = i >= 30 ? new C2655e(px1Var) : i >= 29 ? new C2654d(px1Var) : i >= 20 ? new C2653c(px1Var) : new C2656f(px1Var);
        }

        /* renamed from: a */
        public px1 m12935a() {
            return this.f23481a.mo12930b();
        }

        @Deprecated
        /* renamed from: b */
        public C2652b m12934b(gg0 gg0Var) {
            this.f23481a.mo12928d(gg0Var);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C2652b m12933c(gg0 gg0Var) {
            this.f23481a.mo12926f(gg0Var);
            return this;
        }
    }

    /* renamed from: com.daaw.px1$c */
    /* loaded from: classes.dex */
    public static class C2653c extends C2656f {

        /* renamed from: e */
        public static Field f23482e;

        /* renamed from: f */
        public static boolean f23483f;

        /* renamed from: g */
        public static Constructor<WindowInsets> f23484g;

        /* renamed from: h */
        public static boolean f23485h;

        /* renamed from: c */
        public WindowInsets f23486c;

        /* renamed from: d */
        public gg0 f23487d;

        public C2653c() {
            this.f23486c = m12932h();
        }

        public C2653c(px1 px1Var) {
            super(px1Var);
            this.f23486c = px1Var.m12939v();
        }

        /* renamed from: h */
        private static WindowInsets m12932h() {
            if (!f23483f) {
                try {
                    f23482e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f23483f = true;
            }
            Field field = f23482e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f23485h) {
                try {
                    f23484g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f23485h = true;
            }
            Constructor<WindowInsets> constructor = f23484g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // com.daaw.px1.C2656f
        /* renamed from: b */
        public px1 mo12930b() {
            m12931a();
            px1 m12938w = px1.m12938w(this.f23486c);
            m12938w.m12943r(this.f23490b);
            m12938w.m12940u(this.f23487d);
            return m12938w;
        }

        @Override // com.daaw.px1.C2656f
        /* renamed from: d */
        public void mo12928d(gg0 gg0Var) {
            this.f23487d = gg0Var;
        }

        @Override // com.daaw.px1.C2656f
        /* renamed from: f */
        public void mo12926f(gg0 gg0Var) {
            WindowInsets windowInsets = this.f23486c;
            if (windowInsets != null) {
                this.f23486c = windowInsets.replaceSystemWindowInsets(gg0Var.f11215a, gg0Var.f11216b, gg0Var.f11217c, gg0Var.f11218d);
            }
        }
    }

    /* renamed from: com.daaw.px1$d */
    /* loaded from: classes.dex */
    public static class C2654d extends C2656f {

        /* renamed from: c */
        public final WindowInsets.Builder f23488c;

        public C2654d() {
            this.f23488c = new WindowInsets.Builder();
        }

        public C2654d(px1 px1Var) {
            super(px1Var);
            WindowInsets m12939v = px1Var.m12939v();
            this.f23488c = m12939v != null ? new WindowInsets.Builder(m12939v) : new WindowInsets.Builder();
        }

        @Override // com.daaw.px1.C2656f
        /* renamed from: b */
        public px1 mo12930b() {
            m12931a();
            px1 m12938w = px1.m12938w(this.f23488c.build());
            m12938w.m12943r(this.f23490b);
            return m12938w;
        }

        @Override // com.daaw.px1.C2656f
        /* renamed from: c */
        public void mo12929c(gg0 gg0Var) {
            this.f23488c.setMandatorySystemGestureInsets(gg0Var.m21657e());
        }

        @Override // com.daaw.px1.C2656f
        /* renamed from: d */
        public void mo12928d(gg0 gg0Var) {
            this.f23488c.setStableInsets(gg0Var.m21657e());
        }

        @Override // com.daaw.px1.C2656f
        /* renamed from: e */
        public void mo12927e(gg0 gg0Var) {
            this.f23488c.setSystemGestureInsets(gg0Var.m21657e());
        }

        @Override // com.daaw.px1.C2656f
        /* renamed from: f */
        public void mo12926f(gg0 gg0Var) {
            this.f23488c.setSystemWindowInsets(gg0Var.m21657e());
        }

        @Override // com.daaw.px1.C2656f
        /* renamed from: g */
        public void mo12925g(gg0 gg0Var) {
            this.f23488c.setTappableElementInsets(gg0Var.m21657e());
        }
    }

    /* renamed from: com.daaw.px1$e */
    /* loaded from: classes.dex */
    public static class C2655e extends C2654d {
        public C2655e() {
        }

        public C2655e(px1 px1Var) {
            super(px1Var);
        }
    }

    /* renamed from: com.daaw.px1$f */
    /* loaded from: classes.dex */
    public static class C2656f {

        /* renamed from: a */
        public final px1 f23489a;

        /* renamed from: b */
        public gg0[] f23490b;

        public C2656f() {
            this(new px1((px1) null));
        }

        public C2656f(px1 px1Var) {
            this.f23489a = px1Var;
        }

        /* renamed from: a */
        public final void m12931a() {
            gg0[] gg0VarArr = this.f23490b;
            if (gg0VarArr != null) {
                gg0 gg0Var = gg0VarArr[C2663m.m12900a(1)];
                gg0 gg0Var2 = this.f23490b[C2663m.m12900a(2)];
                if (gg0Var2 == null) {
                    gg0Var2 = this.f23489a.m12955f(2);
                }
                if (gg0Var == null) {
                    gg0Var = this.f23489a.m12955f(1);
                }
                mo12926f(gg0.m21661a(gg0Var, gg0Var2));
                gg0 gg0Var3 = this.f23490b[C2663m.m12900a(16)];
                if (gg0Var3 != null) {
                    mo12927e(gg0Var3);
                }
                gg0 gg0Var4 = this.f23490b[C2663m.m12900a(32)];
                if (gg0Var4 != null) {
                    mo12929c(gg0Var4);
                }
                gg0 gg0Var5 = this.f23490b[C2663m.m12900a(64)];
                if (gg0Var5 != null) {
                    mo12925g(gg0Var5);
                }
            }
        }

        /* renamed from: b */
        public px1 mo12930b() {
            m12931a();
            return this.f23489a;
        }

        /* renamed from: c */
        public void mo12929c(gg0 gg0Var) {
        }

        /* renamed from: d */
        public void mo12928d(gg0 gg0Var) {
        }

        /* renamed from: e */
        public void mo12927e(gg0 gg0Var) {
        }

        /* renamed from: f */
        public void mo12926f(gg0 gg0Var) {
        }

        /* renamed from: g */
        public void mo12925g(gg0 gg0Var) {
        }
    }

    /* renamed from: com.daaw.px1$g */
    /* loaded from: classes.dex */
    public static class C2657g extends C2662l {

        /* renamed from: h */
        public static boolean f23491h;

        /* renamed from: i */
        public static Method f23492i;

        /* renamed from: j */
        public static Class<?> f23493j;

        /* renamed from: k */
        public static Field f23494k;

        /* renamed from: l */
        public static Field f23495l;

        /* renamed from: c */
        public final WindowInsets f23496c;

        /* renamed from: d */
        public gg0[] f23497d;

        /* renamed from: e */
        public gg0 f23498e;

        /* renamed from: f */
        public px1 f23499f;

        /* renamed from: g */
        public gg0 f23500g;

        public C2657g(px1 px1Var, WindowInsets windowInsets) {
            super(px1Var);
            this.f23498e = null;
            this.f23496c = windowInsets;
        }

        public C2657g(px1 px1Var, C2657g c2657g) {
            this(px1Var, new WindowInsets(c2657g.f23496c));
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: t */
        private gg0 m12924t(int i, boolean z) {
            gg0 gg0Var = gg0.f11214e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    gg0Var = gg0.m21661a(gg0Var, m12923u(i2, z));
                }
            }
            return gg0Var;
        }

        /* renamed from: v */
        private gg0 m12922v() {
            px1 px1Var = this.f23499f;
            return px1Var != null ? px1Var.m12953h() : gg0.f11214e;
        }

        /* renamed from: w */
        private gg0 m12921w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f23491h) {
                    m12920x();
                }
                Method method = f23492i;
                if (method != null && f23493j != null && f23494k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            return null;
                        }
                        Rect rect = (Rect) f23494k.get(f23495l.get(invoke));
                        if (rect != null) {
                            return gg0.m21659c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to get visible insets. (Reflection error). ");
                        sb.append(e.getMessage());
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: x */
        private static void m12920x() {
            try {
                f23492i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f23493j = cls;
                f23494k = cls.getDeclaredField("mVisibleInsets");
                f23495l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f23494k.setAccessible(true);
                f23495l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets. (Reflection error). ");
                sb.append(e.getMessage());
            }
            f23491h = true;
        }

        @Override // com.daaw.px1.C2662l
        /* renamed from: d */
        public void mo12916d(View view) {
            gg0 m12921w = m12921w(view);
            if (m12921w == null) {
                m12921w = gg0.f11214e;
            }
            mo12903q(m12921w);
        }

        @Override // com.daaw.px1.C2662l
        /* renamed from: e */
        public void mo12915e(px1 px1Var) {
            px1Var.m12941t(this.f23499f);
            px1Var.m12942s(this.f23500g);
        }

        @Override // com.daaw.px1.C2662l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f23500g, ((C2657g) obj).f23500g);
            }
            return false;
        }

        @Override // com.daaw.px1.C2662l
        /* renamed from: g */
        public gg0 mo12913g(int i) {
            return m12924t(i, false);
        }

        @Override // com.daaw.px1.C2662l
        /* renamed from: k */
        public final gg0 mo12909k() {
            if (this.f23498e == null) {
                this.f23498e = gg0.m21660b(this.f23496c.getSystemWindowInsetLeft(), this.f23496c.getSystemWindowInsetTop(), this.f23496c.getSystemWindowInsetRight(), this.f23496c.getSystemWindowInsetBottom());
            }
            return this.f23498e;
        }

        @Override // com.daaw.px1.C2662l
        /* renamed from: m */
        public px1 mo12907m(int i, int i2, int i3, int i4) {
            C2652b c2652b = new C2652b(px1.m12938w(this.f23496c));
            c2652b.m12933c(px1.m12946o(mo12909k(), i, i2, i3, i4));
            c2652b.m12934b(px1.m12946o(mo12911i(), i, i2, i3, i4));
            return c2652b.m12935a();
        }

        @Override // com.daaw.px1.C2662l
        /* renamed from: o */
        public boolean mo12905o() {
            return this.f23496c.isRound();
        }

        @Override // com.daaw.px1.C2662l
        /* renamed from: p */
        public void mo12904p(gg0[] gg0VarArr) {
            this.f23497d = gg0VarArr;
        }

        @Override // com.daaw.px1.C2662l
        /* renamed from: q */
        public void mo12903q(gg0 gg0Var) {
            this.f23500g = gg0Var;
        }

        @Override // com.daaw.px1.C2662l
        /* renamed from: r */
        public void mo12902r(px1 px1Var) {
            this.f23499f = px1Var;
        }

        /* renamed from: u */
        public gg0 m12923u(int i, boolean z) {
            gg0 m12953h;
            int i2;
            if (i == 1) {
                return z ? gg0.m21660b(0, Math.max(m12922v().f11216b, mo12909k().f11216b), 0, 0) : gg0.m21660b(0, mo12909k().f11216b, 0, 0);
            }
            if (i == 2) {
                if (z) {
                    gg0 m12922v = m12922v();
                    gg0 mo12911i = mo12911i();
                    return gg0.m21660b(Math.max(m12922v.f11215a, mo12911i.f11215a), 0, Math.max(m12922v.f11217c, mo12911i.f11217c), Math.max(m12922v.f11218d, mo12911i.f11218d));
                }
                gg0 mo12909k = mo12909k();
                px1 px1Var = this.f23499f;
                m12953h = px1Var != null ? px1Var.m12953h() : null;
                int i3 = mo12909k.f11218d;
                if (m12953h != null) {
                    i3 = Math.min(i3, m12953h.f11218d);
                }
                return gg0.m21660b(mo12909k.f11215a, 0, mo12909k.f11217c, i3);
            } else if (i != 8) {
                if (i != 16) {
                    if (i != 32) {
                        if (i != 64) {
                            if (i != 128) {
                                return gg0.f11214e;
                            }
                            px1 px1Var2 = this.f23499f;
                            C1611hu m12956e = px1Var2 != null ? px1Var2.m12956e() : mo12914f();
                            return m12956e != null ? gg0.m21660b(m12956e.m20428b(), m12956e.m20426d(), m12956e.m20427c(), m12956e.m20429a()) : gg0.f11214e;
                        }
                        return mo12908l();
                    }
                    return mo12912h();
                }
                return mo12910j();
            } else {
                gg0[] gg0VarArr = this.f23497d;
                m12953h = gg0VarArr != null ? gg0VarArr[C2663m.m12900a(8)] : null;
                if (m12953h != null) {
                    return m12953h;
                }
                gg0 mo12909k2 = mo12909k();
                gg0 m12922v2 = m12922v();
                int i4 = mo12909k2.f11218d;
                if (i4 > m12922v2.f11218d) {
                    return gg0.m21660b(0, 0, 0, i4);
                }
                gg0 gg0Var = this.f23500g;
                return (gg0Var == null || gg0Var.equals(gg0.f11214e) || (i2 = this.f23500g.f11218d) <= m12922v2.f11218d) ? gg0.f11214e : gg0.m21660b(0, 0, 0, i2);
            }
        }
    }

    /* renamed from: com.daaw.px1$h */
    /* loaded from: classes.dex */
    public static class C2658h extends C2657g {

        /* renamed from: m */
        public gg0 f23501m;

        public C2658h(px1 px1Var, WindowInsets windowInsets) {
            super(px1Var, windowInsets);
            this.f23501m = null;
        }

        public C2658h(px1 px1Var, C2658h c2658h) {
            super(px1Var, c2658h);
            this.f23501m = null;
            this.f23501m = c2658h.f23501m;
        }

        @Override // com.daaw.px1.C2662l
        /* renamed from: b */
        public px1 mo12918b() {
            return px1.m12938w(this.f23496c.consumeStableInsets());
        }

        @Override // com.daaw.px1.C2662l
        /* renamed from: c */
        public px1 mo12917c() {
            return px1.m12938w(this.f23496c.consumeSystemWindowInsets());
        }

        @Override // com.daaw.px1.C2662l
        /* renamed from: i */
        public final gg0 mo12911i() {
            if (this.f23501m == null) {
                this.f23501m = gg0.m21660b(this.f23496c.getStableInsetLeft(), this.f23496c.getStableInsetTop(), this.f23496c.getStableInsetRight(), this.f23496c.getStableInsetBottom());
            }
            return this.f23501m;
        }

        @Override // com.daaw.px1.C2662l
        /* renamed from: n */
        public boolean mo12906n() {
            return this.f23496c.isConsumed();
        }

        @Override // com.daaw.px1.C2662l
        /* renamed from: s */
        public void mo12901s(gg0 gg0Var) {
            this.f23501m = gg0Var;
        }
    }

    /* renamed from: com.daaw.px1$i */
    /* loaded from: classes.dex */
    public static class C2659i extends C2658h {
        public C2659i(px1 px1Var, WindowInsets windowInsets) {
            super(px1Var, windowInsets);
        }

        public C2659i(px1 px1Var, C2659i c2659i) {
            super(px1Var, c2659i);
        }

        @Override // com.daaw.px1.C2662l
        /* renamed from: a */
        public px1 mo12919a() {
            return px1.m12938w(this.f23496c.consumeDisplayCutout());
        }

        @Override // com.daaw.px1.C2657g, com.daaw.px1.C2662l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2659i) {
                C2659i c2659i = (C2659i) obj;
                return Objects.equals(this.f23496c, c2659i.f23496c) && Objects.equals(this.f23500g, c2659i.f23500g);
            }
            return false;
        }

        @Override // com.daaw.px1.C2662l
        /* renamed from: f */
        public C1611hu mo12914f() {
            return C1611hu.m20425e(this.f23496c.getDisplayCutout());
        }

        @Override // com.daaw.px1.C2662l
        public int hashCode() {
            return this.f23496c.hashCode();
        }
    }

    /* renamed from: com.daaw.px1$j */
    /* loaded from: classes.dex */
    public static class C2660j extends C2659i {

        /* renamed from: n */
        public gg0 f23502n;

        /* renamed from: o */
        public gg0 f23503o;

        /* renamed from: p */
        public gg0 f23504p;

        public C2660j(px1 px1Var, WindowInsets windowInsets) {
            super(px1Var, windowInsets);
            this.f23502n = null;
            this.f23503o = null;
            this.f23504p = null;
        }

        public C2660j(px1 px1Var, C2660j c2660j) {
            super(px1Var, c2660j);
            this.f23502n = null;
            this.f23503o = null;
            this.f23504p = null;
        }

        @Override // com.daaw.px1.C2662l
        /* renamed from: h */
        public gg0 mo12912h() {
            if (this.f23503o == null) {
                this.f23503o = gg0.m21658d(this.f23496c.getMandatorySystemGestureInsets());
            }
            return this.f23503o;
        }

        @Override // com.daaw.px1.C2662l
        /* renamed from: j */
        public gg0 mo12910j() {
            if (this.f23502n == null) {
                this.f23502n = gg0.m21658d(this.f23496c.getSystemGestureInsets());
            }
            return this.f23502n;
        }

        @Override // com.daaw.px1.C2662l
        /* renamed from: l */
        public gg0 mo12908l() {
            if (this.f23504p == null) {
                this.f23504p = gg0.m21658d(this.f23496c.getTappableElementInsets());
            }
            return this.f23504p;
        }

        @Override // com.daaw.px1.C2657g, com.daaw.px1.C2662l
        /* renamed from: m */
        public px1 mo12907m(int i, int i2, int i3, int i4) {
            return px1.m12938w(this.f23496c.inset(i, i2, i3, i4));
        }

        @Override // com.daaw.px1.C2658h, com.daaw.px1.C2662l
        /* renamed from: s */
        public void mo12901s(gg0 gg0Var) {
        }
    }

    /* renamed from: com.daaw.px1$k */
    /* loaded from: classes.dex */
    public static class C2661k extends C2660j {

        /* renamed from: q */
        public static final px1 f23505q = px1.m12938w(WindowInsets.CONSUMED);

        public C2661k(px1 px1Var, WindowInsets windowInsets) {
            super(px1Var, windowInsets);
        }

        public C2661k(px1 px1Var, C2661k c2661k) {
            super(px1Var, c2661k);
        }

        @Override // com.daaw.px1.C2657g, com.daaw.px1.C2662l
        /* renamed from: d */
        public final void mo12916d(View view) {
        }

        @Override // com.daaw.px1.C2657g, com.daaw.px1.C2662l
        /* renamed from: g */
        public gg0 mo12913g(int i) {
            return gg0.m21658d(this.f23496c.getInsets(C2664n.m12899a(i)));
        }
    }

    /* renamed from: com.daaw.px1$l */
    /* loaded from: classes.dex */
    public static class C2662l {

        /* renamed from: b */
        public static final px1 f23506b = new C2652b().m12935a().m12960a().m12959b().m12958c();

        /* renamed from: a */
        public final px1 f23507a;

        public C2662l(px1 px1Var) {
            this.f23507a = px1Var;
        }

        /* renamed from: a */
        public px1 mo12919a() {
            return this.f23507a;
        }

        /* renamed from: b */
        public px1 mo12918b() {
            return this.f23507a;
        }

        /* renamed from: c */
        public px1 mo12917c() {
            return this.f23507a;
        }

        /* renamed from: d */
        public void mo12916d(View view) {
        }

        /* renamed from: e */
        public void mo12915e(px1 px1Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2662l) {
                C2662l c2662l = (C2662l) obj;
                return mo12905o() == c2662l.mo12905o() && mo12906n() == c2662l.mo12906n() && pt0.m13160a(mo12909k(), c2662l.mo12909k()) && pt0.m13160a(mo12911i(), c2662l.mo12911i()) && pt0.m13160a(mo12914f(), c2662l.mo12914f());
            }
            return false;
        }

        /* renamed from: f */
        public C1611hu mo12914f() {
            return null;
        }

        /* renamed from: g */
        public gg0 mo12913g(int i) {
            return gg0.f11214e;
        }

        /* renamed from: h */
        public gg0 mo12912h() {
            return mo12909k();
        }

        public int hashCode() {
            return pt0.m13159b(Boolean.valueOf(mo12905o()), Boolean.valueOf(mo12906n()), mo12909k(), mo12911i(), mo12914f());
        }

        /* renamed from: i */
        public gg0 mo12911i() {
            return gg0.f11214e;
        }

        /* renamed from: j */
        public gg0 mo12910j() {
            return mo12909k();
        }

        /* renamed from: k */
        public gg0 mo12909k() {
            return gg0.f11214e;
        }

        /* renamed from: l */
        public gg0 mo12908l() {
            return mo12909k();
        }

        /* renamed from: m */
        public px1 mo12907m(int i, int i2, int i3, int i4) {
            return f23506b;
        }

        /* renamed from: n */
        public boolean mo12906n() {
            return false;
        }

        /* renamed from: o */
        public boolean mo12905o() {
            return false;
        }

        /* renamed from: p */
        public void mo12904p(gg0[] gg0VarArr) {
        }

        /* renamed from: q */
        public void mo12903q(gg0 gg0Var) {
        }

        /* renamed from: r */
        public void mo12902r(px1 px1Var) {
        }

        /* renamed from: s */
        public void mo12901s(gg0 gg0Var) {
        }
    }

    /* renamed from: com.daaw.px1$m */
    /* loaded from: classes.dex */
    public static final class C2663m {
        /* renamed from: a */
        public static int m12900a(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            if (i != 16) {
                                if (i != 32) {
                                    if (i != 64) {
                                        if (i != 128) {
                                            if (i == 256) {
                                                return 8;
                                            }
                                            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
                                        }
                                        return 7;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: com.daaw.px1$n */
    /* loaded from: classes.dex */
    public static final class C2664n {
        /* renamed from: a */
        public static int m12899a(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    static {
        f23475b = Build.VERSION.SDK_INT >= 30 ? C2661k.f23505q : C2662l.f23506b;
    }

    public px1(WindowInsets windowInsets) {
        C2662l c2657g;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            c2657g = new C2661k(this, windowInsets);
        } else if (i >= 29) {
            c2657g = new C2660j(this, windowInsets);
        } else if (i >= 28) {
            c2657g = new C2659i(this, windowInsets);
        } else if (i >= 21) {
            c2657g = new C2658h(this, windowInsets);
        } else if (i < 20) {
            this.f23476a = new C2662l(this);
            return;
        } else {
            c2657g = new C2657g(this, windowInsets);
        }
        this.f23476a = c2657g;
    }

    public px1(px1 px1Var) {
        if (px1Var == null) {
            this.f23476a = new C2662l(this);
            return;
        }
        C2662l c2662l = px1Var.f23476a;
        int i = Build.VERSION.SDK_INT;
        this.f23476a = (i < 30 || !(c2662l instanceof C2661k)) ? (i < 29 || !(c2662l instanceof C2660j)) ? (i < 28 || !(c2662l instanceof C2659i)) ? (i < 21 || !(c2662l instanceof C2658h)) ? (i < 20 || !(c2662l instanceof C2657g)) ? new C2662l(this) : new C2657g(this, (C2657g) c2662l) : new C2658h(this, (C2658h) c2662l) : new C2659i(this, (C2659i) c2662l) : new C2660j(this, (C2660j) c2662l) : new C2661k(this, (C2661k) c2662l);
        c2662l.mo12915e(this);
    }

    /* renamed from: o */
    public static gg0 m12946o(gg0 gg0Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, gg0Var.f11215a - i);
        int max2 = Math.max(0, gg0Var.f11216b - i2);
        int max3 = Math.max(0, gg0Var.f11217c - i3);
        int max4 = Math.max(0, gg0Var.f11218d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? gg0Var : gg0.m21660b(max, max2, max3, max4);
    }

    /* renamed from: w */
    public static px1 m12938w(WindowInsets windowInsets) {
        return m12937x(windowInsets, null);
    }

    /* renamed from: x */
    public static px1 m12937x(WindowInsets windowInsets, View view) {
        px1 px1Var = new px1((WindowInsets) ty0.m8699f(windowInsets));
        if (view != null && xs1.m4743U(view)) {
            px1Var.m12941t(xs1.m4754L(view));
            px1Var.m12957d(view.getRootView());
        }
        return px1Var;
    }

    @Deprecated
    /* renamed from: a */
    public px1 m12960a() {
        return this.f23476a.mo12919a();
    }

    @Deprecated
    /* renamed from: b */
    public px1 m12959b() {
        return this.f23476a.mo12918b();
    }

    @Deprecated
    /* renamed from: c */
    public px1 m12958c() {
        return this.f23476a.mo12917c();
    }

    /* renamed from: d */
    public void m12957d(View view) {
        this.f23476a.mo12916d(view);
    }

    /* renamed from: e */
    public C1611hu m12956e() {
        return this.f23476a.mo12914f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof px1) {
            return pt0.m13160a(this.f23476a, ((px1) obj).f23476a);
        }
        return false;
    }

    /* renamed from: f */
    public gg0 m12955f(int i) {
        return this.f23476a.mo12913g(i);
    }

    @Deprecated
    /* renamed from: g */
    public gg0 m12954g() {
        return this.f23476a.mo12912h();
    }

    @Deprecated
    /* renamed from: h */
    public gg0 m12953h() {
        return this.f23476a.mo12911i();
    }

    public int hashCode() {
        C2662l c2662l = this.f23476a;
        if (c2662l == null) {
            return 0;
        }
        return c2662l.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int m12952i() {
        return this.f23476a.mo12909k().f11218d;
    }

    @Deprecated
    /* renamed from: j */
    public int m12951j() {
        return this.f23476a.mo12909k().f11215a;
    }

    @Deprecated
    /* renamed from: k */
    public int m12950k() {
        return this.f23476a.mo12909k().f11217c;
    }

    @Deprecated
    /* renamed from: l */
    public int m12949l() {
        return this.f23476a.mo12909k().f11216b;
    }

    @Deprecated
    /* renamed from: m */
    public boolean m12948m() {
        return !this.f23476a.mo12909k().equals(gg0.f11214e);
    }

    /* renamed from: n */
    public px1 m12947n(int i, int i2, int i3, int i4) {
        return this.f23476a.mo12907m(i, i2, i3, i4);
    }

    /* renamed from: p */
    public boolean m12945p() {
        return this.f23476a.mo12906n();
    }

    @Deprecated
    /* renamed from: q */
    public px1 m12944q(int i, int i2, int i3, int i4) {
        return new C2652b(this).m12933c(gg0.m21660b(i, i2, i3, i4)).m12935a();
    }

    /* renamed from: r */
    public void m12943r(gg0[] gg0VarArr) {
        this.f23476a.mo12904p(gg0VarArr);
    }

    /* renamed from: s */
    public void m12942s(gg0 gg0Var) {
        this.f23476a.mo12903q(gg0Var);
    }

    /* renamed from: t */
    public void m12941t(px1 px1Var) {
        this.f23476a.mo12902r(px1Var);
    }

    /* renamed from: u */
    public void m12940u(gg0 gg0Var) {
        this.f23476a.mo12901s(gg0Var);
    }

    /* renamed from: v */
    public WindowInsets m12939v() {
        C2662l c2662l = this.f23476a;
        if (c2662l instanceof C2657g) {
            return ((C2657g) c2662l).f23496c;
        }
        return null;
    }
}
