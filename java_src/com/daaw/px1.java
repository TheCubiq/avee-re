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
    public static final px1 b;
    public final l a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: classes.dex */
    public static class a {
        public static Field a;
        public static Field b;
        public static Field c;
        public static boolean d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets from AttachInfo ");
                sb.append(e.getMessage());
            }
        }

        public static px1 a(View view) {
            if (d && view.isAttachedToWindow()) {
                try {
                    Object obj = a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) b.get(obj);
                        Rect rect2 = (Rect) c.get(obj);
                        if (rect != null && rect2 != null) {
                            px1 a2 = new b().b(gg0.c(rect)).c(gg0.c(rect2)).a();
                            a2.t(a2);
                            a2.d(view.getRootView());
                            return a2;
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

    /* loaded from: classes.dex */
    public static final class b {
        public final f a;

        public b() {
            int i = Build.VERSION.SDK_INT;
            this.a = i >= 30 ? new e() : i >= 29 ? new d() : i >= 20 ? new c() : new f();
        }

        public b(px1 px1Var) {
            int i = Build.VERSION.SDK_INT;
            this.a = i >= 30 ? new e(px1Var) : i >= 29 ? new d(px1Var) : i >= 20 ? new c(px1Var) : new f(px1Var);
        }

        public px1 a() {
            return this.a.b();
        }

        @Deprecated
        public b b(gg0 gg0Var) {
            this.a.d(gg0Var);
            return this;
        }

        @Deprecated
        public b c(gg0 gg0Var) {
            this.a.f(gg0Var);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f {
        public static Field e;
        public static boolean f;
        public static Constructor<WindowInsets> g;
        public static boolean h;
        public WindowInsets c;
        public gg0 d;

        public c() {
            this.c = h();
        }

        public c(px1 px1Var) {
            super(px1Var);
            this.c = px1Var.v();
        }

        private static WindowInsets h() {
            if (!f) {
                try {
                    e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!h) {
                try {
                    g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                h = true;
            }
            Constructor<WindowInsets> constructor = g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // com.daaw.px1.f
        public px1 b() {
            a();
            px1 w = px1.w(this.c);
            w.r(this.b);
            w.u(this.d);
            return w;
        }

        @Override // com.daaw.px1.f
        public void d(gg0 gg0Var) {
            this.d = gg0Var;
        }

        @Override // com.daaw.px1.f
        public void f(gg0 gg0Var) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(gg0Var.a, gg0Var.b, gg0Var.c, gg0Var.d);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends f {
        public final WindowInsets.Builder c;

        public d() {
            this.c = new WindowInsets.Builder();
        }

        public d(px1 px1Var) {
            super(px1Var);
            WindowInsets v = px1Var.v();
            this.c = v != null ? new WindowInsets.Builder(v) : new WindowInsets.Builder();
        }

        @Override // com.daaw.px1.f
        public px1 b() {
            a();
            px1 w = px1.w(this.c.build());
            w.r(this.b);
            return w;
        }

        @Override // com.daaw.px1.f
        public void c(gg0 gg0Var) {
            this.c.setMandatorySystemGestureInsets(gg0Var.e());
        }

        @Override // com.daaw.px1.f
        public void d(gg0 gg0Var) {
            this.c.setStableInsets(gg0Var.e());
        }

        @Override // com.daaw.px1.f
        public void e(gg0 gg0Var) {
            this.c.setSystemGestureInsets(gg0Var.e());
        }

        @Override // com.daaw.px1.f
        public void f(gg0 gg0Var) {
            this.c.setSystemWindowInsets(gg0Var.e());
        }

        @Override // com.daaw.px1.f
        public void g(gg0 gg0Var) {
            this.c.setTappableElementInsets(gg0Var.e());
        }
    }

    /* loaded from: classes.dex */
    public static class e extends d {
        public e() {
        }

        public e(px1 px1Var) {
            super(px1Var);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public final px1 a;
        public gg0[] b;

        public f() {
            this(new px1((px1) null));
        }

        public f(px1 px1Var) {
            this.a = px1Var;
        }

        public final void a() {
            gg0[] gg0VarArr = this.b;
            if (gg0VarArr != null) {
                gg0 gg0Var = gg0VarArr[m.a(1)];
                gg0 gg0Var2 = this.b[m.a(2)];
                if (gg0Var2 == null) {
                    gg0Var2 = this.a.f(2);
                }
                if (gg0Var == null) {
                    gg0Var = this.a.f(1);
                }
                f(gg0.a(gg0Var, gg0Var2));
                gg0 gg0Var3 = this.b[m.a(16)];
                if (gg0Var3 != null) {
                    e(gg0Var3);
                }
                gg0 gg0Var4 = this.b[m.a(32)];
                if (gg0Var4 != null) {
                    c(gg0Var4);
                }
                gg0 gg0Var5 = this.b[m.a(64)];
                if (gg0Var5 != null) {
                    g(gg0Var5);
                }
            }
        }

        public px1 b() {
            a();
            return this.a;
        }

        public void c(gg0 gg0Var) {
        }

        public void d(gg0 gg0Var) {
        }

        public void e(gg0 gg0Var) {
        }

        public void f(gg0 gg0Var) {
        }

        public void g(gg0 gg0Var) {
        }
    }

    /* loaded from: classes.dex */
    public static class g extends l {
        public static boolean h;
        public static Method i;
        public static Class<?> j;
        public static Field k;
        public static Field l;
        public final WindowInsets c;
        public gg0[] d;
        public gg0 e;
        public px1 f;
        public gg0 g;

        public g(px1 px1Var, WindowInsets windowInsets) {
            super(px1Var);
            this.e = null;
            this.c = windowInsets;
        }

        public g(px1 px1Var, g gVar) {
            this(px1Var, new WindowInsets(gVar.c));
        }

        @SuppressLint({"WrongConstant"})
        private gg0 t(int i2, boolean z) {
            gg0 gg0Var = gg0.e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    gg0Var = gg0.a(gg0Var, u(i3, z));
                }
            }
            return gg0Var;
        }

        private gg0 v() {
            px1 px1Var = this.f;
            return px1Var != null ? px1Var.h() : gg0.e;
        }

        private gg0 w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!h) {
                    x();
                }
                Method method = i;
                if (method != null && j != null && k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            return null;
                        }
                        Rect rect = (Rect) k.get(l.get(invoke));
                        if (rect != null) {
                            return gg0.c(rect);
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
        private static void x() {
            try {
                i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                j = cls;
                k = cls.getDeclaredField("mVisibleInsets");
                l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                k.setAccessible(true);
                l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets. (Reflection error). ");
                sb.append(e.getMessage());
            }
            h = true;
        }

        @Override // com.daaw.px1.l
        public void d(View view) {
            gg0 w = w(view);
            if (w == null) {
                w = gg0.e;
            }
            q(w);
        }

        @Override // com.daaw.px1.l
        public void e(px1 px1Var) {
            px1Var.t(this.f);
            px1Var.s(this.g);
        }

        @Override // com.daaw.px1.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.g, ((g) obj).g);
            }
            return false;
        }

        @Override // com.daaw.px1.l
        public gg0 g(int i2) {
            return t(i2, false);
        }

        @Override // com.daaw.px1.l
        public final gg0 k() {
            if (this.e == null) {
                this.e = gg0.b(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override // com.daaw.px1.l
        public px1 m(int i2, int i3, int i4, int i5) {
            b bVar = new b(px1.w(this.c));
            bVar.c(px1.o(k(), i2, i3, i4, i5));
            bVar.b(px1.o(i(), i2, i3, i4, i5));
            return bVar.a();
        }

        @Override // com.daaw.px1.l
        public boolean o() {
            return this.c.isRound();
        }

        @Override // com.daaw.px1.l
        public void p(gg0[] gg0VarArr) {
            this.d = gg0VarArr;
        }

        @Override // com.daaw.px1.l
        public void q(gg0 gg0Var) {
            this.g = gg0Var;
        }

        @Override // com.daaw.px1.l
        public void r(px1 px1Var) {
            this.f = px1Var;
        }

        public gg0 u(int i2, boolean z) {
            gg0 h2;
            int i3;
            if (i2 == 1) {
                return z ? gg0.b(0, Math.max(v().b, k().b), 0, 0) : gg0.b(0, k().b, 0, 0);
            }
            if (i2 == 2) {
                if (z) {
                    gg0 v = v();
                    gg0 i4 = i();
                    return gg0.b(Math.max(v.a, i4.a), 0, Math.max(v.c, i4.c), Math.max(v.d, i4.d));
                }
                gg0 k2 = k();
                px1 px1Var = this.f;
                h2 = px1Var != null ? px1Var.h() : null;
                int i5 = k2.d;
                if (h2 != null) {
                    i5 = Math.min(i5, h2.d);
                }
                return gg0.b(k2.a, 0, k2.c, i5);
            } else if (i2 != 8) {
                if (i2 != 16) {
                    if (i2 != 32) {
                        if (i2 != 64) {
                            if (i2 != 128) {
                                return gg0.e;
                            }
                            px1 px1Var2 = this.f;
                            hu e = px1Var2 != null ? px1Var2.e() : f();
                            return e != null ? gg0.b(e.b(), e.d(), e.c(), e.a()) : gg0.e;
                        }
                        return l();
                    }
                    return h();
                }
                return j();
            } else {
                gg0[] gg0VarArr = this.d;
                h2 = gg0VarArr != null ? gg0VarArr[m.a(8)] : null;
                if (h2 != null) {
                    return h2;
                }
                gg0 k3 = k();
                gg0 v2 = v();
                int i6 = k3.d;
                if (i6 > v2.d) {
                    return gg0.b(0, 0, 0, i6);
                }
                gg0 gg0Var = this.g;
                return (gg0Var == null || gg0Var.equals(gg0.e) || (i3 = this.g.d) <= v2.d) ? gg0.e : gg0.b(0, 0, 0, i3);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class h extends g {
        public gg0 m;

        public h(px1 px1Var, WindowInsets windowInsets) {
            super(px1Var, windowInsets);
            this.m = null;
        }

        public h(px1 px1Var, h hVar) {
            super(px1Var, hVar);
            this.m = null;
            this.m = hVar.m;
        }

        @Override // com.daaw.px1.l
        public px1 b() {
            return px1.w(this.c.consumeStableInsets());
        }

        @Override // com.daaw.px1.l
        public px1 c() {
            return px1.w(this.c.consumeSystemWindowInsets());
        }

        @Override // com.daaw.px1.l
        public final gg0 i() {
            if (this.m == null) {
                this.m = gg0.b(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.m;
        }

        @Override // com.daaw.px1.l
        public boolean n() {
            return this.c.isConsumed();
        }

        @Override // com.daaw.px1.l
        public void s(gg0 gg0Var) {
            this.m = gg0Var;
        }
    }

    /* loaded from: classes.dex */
    public static class i extends h {
        public i(px1 px1Var, WindowInsets windowInsets) {
            super(px1Var, windowInsets);
        }

        public i(px1 px1Var, i iVar) {
            super(px1Var, iVar);
        }

        @Override // com.daaw.px1.l
        public px1 a() {
            return px1.w(this.c.consumeDisplayCutout());
        }

        @Override // com.daaw.px1.g, com.daaw.px1.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return Objects.equals(this.c, iVar.c) && Objects.equals(this.g, iVar.g);
            }
            return false;
        }

        @Override // com.daaw.px1.l
        public hu f() {
            return hu.e(this.c.getDisplayCutout());
        }

        @Override // com.daaw.px1.l
        public int hashCode() {
            return this.c.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static class j extends i {
        public gg0 n;
        public gg0 o;
        public gg0 p;

        public j(px1 px1Var, WindowInsets windowInsets) {
            super(px1Var, windowInsets);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        public j(px1 px1Var, j jVar) {
            super(px1Var, jVar);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        @Override // com.daaw.px1.l
        public gg0 h() {
            if (this.o == null) {
                this.o = gg0.d(this.c.getMandatorySystemGestureInsets());
            }
            return this.o;
        }

        @Override // com.daaw.px1.l
        public gg0 j() {
            if (this.n == null) {
                this.n = gg0.d(this.c.getSystemGestureInsets());
            }
            return this.n;
        }

        @Override // com.daaw.px1.l
        public gg0 l() {
            if (this.p == null) {
                this.p = gg0.d(this.c.getTappableElementInsets());
            }
            return this.p;
        }

        @Override // com.daaw.px1.g, com.daaw.px1.l
        public px1 m(int i, int i2, int i3, int i4) {
            return px1.w(this.c.inset(i, i2, i3, i4));
        }

        @Override // com.daaw.px1.h, com.daaw.px1.l
        public void s(gg0 gg0Var) {
        }
    }

    /* loaded from: classes.dex */
    public static class k extends j {
        public static final px1 q = px1.w(WindowInsets.CONSUMED);

        public k(px1 px1Var, WindowInsets windowInsets) {
            super(px1Var, windowInsets);
        }

        public k(px1 px1Var, k kVar) {
            super(px1Var, kVar);
        }

        @Override // com.daaw.px1.g, com.daaw.px1.l
        public final void d(View view) {
        }

        @Override // com.daaw.px1.g, com.daaw.px1.l
        public gg0 g(int i) {
            return gg0.d(this.c.getInsets(n.a(i)));
        }
    }

    /* loaded from: classes.dex */
    public static class l {
        public static final px1 b = new b().a().a().b().c();
        public final px1 a;

        public l(px1 px1Var) {
            this.a = px1Var;
        }

        public px1 a() {
            return this.a;
        }

        public px1 b() {
            return this.a;
        }

        public px1 c() {
            return this.a;
        }

        public void d(View view) {
        }

        public void e(px1 px1Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return o() == lVar.o() && n() == lVar.n() && pt0.a(k(), lVar.k()) && pt0.a(i(), lVar.i()) && pt0.a(f(), lVar.f());
            }
            return false;
        }

        public hu f() {
            return null;
        }

        public gg0 g(int i) {
            return gg0.e;
        }

        public gg0 h() {
            return k();
        }

        public int hashCode() {
            return pt0.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        public gg0 i() {
            return gg0.e;
        }

        public gg0 j() {
            return k();
        }

        public gg0 k() {
            return gg0.e;
        }

        public gg0 l() {
            return k();
        }

        public px1 m(int i, int i2, int i3, int i4) {
            return b;
        }

        public boolean n() {
            return false;
        }

        public boolean o() {
            return false;
        }

        public void p(gg0[] gg0VarArr) {
        }

        public void q(gg0 gg0Var) {
        }

        public void r(px1 px1Var) {
        }

        public void s(gg0 gg0Var) {
        }
    }

    /* loaded from: classes.dex */
    public static final class m {
        public static int a(int i) {
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

    /* loaded from: classes.dex */
    public static final class n {
        public static int a(int i) {
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
        b = Build.VERSION.SDK_INT >= 30 ? k.q : l.b;
    }

    public px1(WindowInsets windowInsets) {
        l gVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            gVar = new k(this, windowInsets);
        } else if (i2 >= 29) {
            gVar = new j(this, windowInsets);
        } else if (i2 >= 28) {
            gVar = new i(this, windowInsets);
        } else if (i2 >= 21) {
            gVar = new h(this, windowInsets);
        } else if (i2 < 20) {
            this.a = new l(this);
            return;
        } else {
            gVar = new g(this, windowInsets);
        }
        this.a = gVar;
    }

    public px1(px1 px1Var) {
        if (px1Var == null) {
            this.a = new l(this);
            return;
        }
        l lVar = px1Var.a;
        int i2 = Build.VERSION.SDK_INT;
        this.a = (i2 < 30 || !(lVar instanceof k)) ? (i2 < 29 || !(lVar instanceof j)) ? (i2 < 28 || !(lVar instanceof i)) ? (i2 < 21 || !(lVar instanceof h)) ? (i2 < 20 || !(lVar instanceof g)) ? new l(this) : new g(this, (g) lVar) : new h(this, (h) lVar) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.e(this);
    }

    public static gg0 o(gg0 gg0Var, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, gg0Var.a - i2);
        int max2 = Math.max(0, gg0Var.b - i3);
        int max3 = Math.max(0, gg0Var.c - i4);
        int max4 = Math.max(0, gg0Var.d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? gg0Var : gg0.b(max, max2, max3, max4);
    }

    public static px1 w(WindowInsets windowInsets) {
        return x(windowInsets, null);
    }

    public static px1 x(WindowInsets windowInsets, View view) {
        px1 px1Var = new px1((WindowInsets) ty0.f(windowInsets));
        if (view != null && xs1.U(view)) {
            px1Var.t(xs1.L(view));
            px1Var.d(view.getRootView());
        }
        return px1Var;
    }

    @Deprecated
    public px1 a() {
        return this.a.a();
    }

    @Deprecated
    public px1 b() {
        return this.a.b();
    }

    @Deprecated
    public px1 c() {
        return this.a.c();
    }

    public void d(View view) {
        this.a.d(view);
    }

    public hu e() {
        return this.a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof px1) {
            return pt0.a(this.a, ((px1) obj).a);
        }
        return false;
    }

    public gg0 f(int i2) {
        return this.a.g(i2);
    }

    @Deprecated
    public gg0 g() {
        return this.a.h();
    }

    @Deprecated
    public gg0 h() {
        return this.a.i();
    }

    public int hashCode() {
        l lVar = this.a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.a.k().d;
    }

    @Deprecated
    public int j() {
        return this.a.k().a;
    }

    @Deprecated
    public int k() {
        return this.a.k().c;
    }

    @Deprecated
    public int l() {
        return this.a.k().b;
    }

    @Deprecated
    public boolean m() {
        return !this.a.k().equals(gg0.e);
    }

    public px1 n(int i2, int i3, int i4, int i5) {
        return this.a.m(i2, i3, i4, i5);
    }

    public boolean p() {
        return this.a.n();
    }

    @Deprecated
    public px1 q(int i2, int i3, int i4, int i5) {
        return new b(this).c(gg0.b(i2, i3, i4, i5)).a();
    }

    public void r(gg0[] gg0VarArr) {
        this.a.p(gg0VarArr);
    }

    public void s(gg0 gg0Var) {
        this.a.q(gg0Var);
    }

    public void t(px1 px1Var) {
        this.a.r(px1Var);
    }

    public void u(gg0 gg0Var) {
        this.a.s(gg0Var);
    }

    public WindowInsets v() {
        l lVar = this.a;
        if (lVar instanceof g) {
            return ((g) lVar).c;
        }
        return null;
    }
}
