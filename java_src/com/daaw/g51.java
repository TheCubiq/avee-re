package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class g51 {
    public static g51 i;
    public WeakHashMap<Context, me1<ColorStateList>> a;
    public cd1<String, e> b;
    public me1<String> c;
    public final WeakHashMap<Context, sl0<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    public TypedValue e;
    public boolean f;
    public f g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final c j = new c(6);

    /* loaded from: classes.dex */
    public static class a implements e {
        @Override // com.daaw.g51.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return d3.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements e {
        @Override // com.daaw.g51.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return e3.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends wl0<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }

        public static int j(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter k(int i, PorterDuff.Mode mode) {
            return c(Integer.valueOf(j(i, mode)));
        }

        public PorterDuffColorFilter l(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return d(Integer.valueOf(j(i, mode)), porterDuffColorFilter);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements e {
        @Override // com.daaw.g51.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        kh.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* loaded from: classes.dex */
    public interface f {
        Drawable a(g51 g51Var, Context context, int i);

        boolean b(Context context, int i, Drawable drawable);

        PorterDuff.Mode c(int i);

        ColorStateList d(Context context, int i);

        boolean e(Context context, int i, Drawable drawable);
    }

    /* loaded from: classes.dex */
    public static class g implements e {
        @Override // com.daaw.g51.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return gs1.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    public static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized g51 h() {
        g51 g51Var;
        synchronized (g51.class) {
            if (i == null) {
                g51 g51Var2 = new g51();
                i = g51Var2;
                p(g51Var2);
            }
            g51Var = i;
        }
        return g51Var;
    }

    public static synchronized PorterDuffColorFilter l(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter k;
        synchronized (g51.class) {
            c cVar = j;
            k = cVar.k(i2, mode);
            if (k == null) {
                k = new PorterDuffColorFilter(i2, mode);
                cVar.l(i2, mode, k);
            }
        }
        return k;
    }

    public static void p(g51 g51Var) {
        if (Build.VERSION.SDK_INT < 24) {
            g51Var.a("vector", new g());
            g51Var.a("animated-vector", new b());
            g51Var.a("animated-selector", new a());
            g51Var.a("drawable", new d());
        }
    }

    public static boolean q(Drawable drawable) {
        return (drawable instanceof gs1) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static void w(Drawable drawable, sl1 sl1Var, int[] iArr) {
        if (!vu.a(drawable) || drawable.mutate() == drawable) {
            boolean z = sl1Var.d;
            if (z || sl1Var.c) {
                drawable.setColorFilter(g(z ? sl1Var.a : null, sl1Var.c ? sl1Var.b : h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public final void a(String str, e eVar) {
        if (this.b == null) {
            this.b = new cd1<>();
        }
        this.b.put(str, eVar);
    }

    public final synchronized boolean b(Context context, long j2, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            sl0<WeakReference<Drawable.ConstantState>> sl0Var = this.d.get(context);
            if (sl0Var == null) {
                sl0Var = new sl0<>();
                this.d.put(context, sl0Var);
            }
            sl0Var.k(j2, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final void c(Context context, int i2, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap<>();
        }
        me1<ColorStateList> me1Var = this.a.get(context);
        if (me1Var == null) {
            me1Var = new me1<>();
            this.a.put(context, me1Var);
        }
        me1Var.a(i2, colorStateList);
    }

    public final void d(Context context) {
        if (this.f) {
            return;
        }
        this.f = true;
        Drawable j2 = j(context, h11.abc_vector_test);
        if (j2 == null || !q(j2)) {
            this.f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable f(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long e2 = e(typedValue);
        Drawable i3 = i(context, e2);
        if (i3 != null) {
            return i3;
        }
        f fVar = this.g;
        Drawable a2 = fVar == null ? null : fVar.a(this, context, i2);
        if (a2 != null) {
            a2.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e2, a2);
        }
        return a2;
    }

    public final synchronized Drawable i(Context context, long j2) {
        sl0<WeakReference<Drawable.ConstantState>> sl0Var = this.d.get(context);
        if (sl0Var == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> e2 = sl0Var.e(j2);
        if (e2 != null) {
            Drawable.ConstantState constantState = e2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            sl0Var.m(j2);
        }
        return null;
    }

    public synchronized Drawable j(Context context, int i2) {
        return k(context, i2, false);
    }

    public synchronized Drawable k(Context context, int i2, boolean z) {
        Drawable r;
        d(context);
        r = r(context, i2);
        if (r == null) {
            r = f(context, i2);
        }
        if (r == null) {
            r = zk.e(context, i2);
        }
        if (r != null) {
            r = v(context, i2, z, r);
        }
        if (r != null) {
            vu.b(r);
        }
        return r;
    }

    public synchronized ColorStateList m(Context context, int i2) {
        ColorStateList n;
        n = n(context, i2);
        if (n == null) {
            f fVar = this.g;
            n = fVar == null ? null : fVar.d(context, i2);
            if (n != null) {
                c(context, i2, n);
            }
        }
        return n;
    }

    public final ColorStateList n(Context context, int i2) {
        me1<ColorStateList> me1Var;
        WeakHashMap<Context, me1<ColorStateList>> weakHashMap = this.a;
        if (weakHashMap == null || (me1Var = weakHashMap.get(context)) == null) {
            return null;
        }
        return me1Var.e(i2);
    }

    public PorterDuff.Mode o(int i2) {
        f fVar = this.g;
        if (fVar == null) {
            return null;
        }
        return fVar.c(i2);
    }

    public final Drawable r(Context context, int i2) {
        int next;
        cd1<String, e> cd1Var = this.b;
        if (cd1Var == null || cd1Var.isEmpty()) {
            return null;
        }
        me1<String> me1Var = this.c;
        if (me1Var != null) {
            String e2 = me1Var.e(i2);
            if ("appcompat_skip_skip".equals(e2) || (e2 != null && this.b.get(e2) == null)) {
                return null;
            }
        } else {
            this.c = new me1<>();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long e3 = e(typedValue);
        Drawable i3 = i(context, e3);
        if (i3 != null) {
            return i3;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.c.a(i2, name);
                e eVar = this.b.get(name);
                if (eVar != null) {
                    i3 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (i3 != null) {
                    i3.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, e3, i3);
                }
            } catch (Exception unused) {
            }
        }
        if (i3 == null) {
            this.c.a(i2, "appcompat_skip_skip");
        }
        return i3;
    }

    public synchronized void s(Context context) {
        sl0<WeakReference<Drawable.ConstantState>> sl0Var = this.d.get(context);
        if (sl0Var != null) {
            sl0Var.b();
        }
    }

    public synchronized Drawable t(Context context, hs1 hs1Var, int i2) {
        Drawable r = r(context, i2);
        if (r == null) {
            r = hs1Var.a(i2);
        }
        if (r != null) {
            return v(context, i2, false, r);
        }
        return null;
    }

    public synchronized void u(f fVar) {
        this.g = fVar;
    }

    public final Drawable v(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList m = m(context, i2);
        if (m == null) {
            f fVar = this.g;
            if ((fVar == null || !fVar.e(context, i2, drawable)) && !x(context, i2, drawable) && z) {
                return null;
            }
            return drawable;
        }
        if (vu.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable r = nu.r(drawable);
        nu.o(r, m);
        PorterDuff.Mode o = o(i2);
        if (o != null) {
            nu.p(r, o);
            return r;
        }
        return r;
    }

    public boolean x(Context context, int i2, Drawable drawable) {
        f fVar = this.g;
        return fVar != null && fVar.b(context, i2, drawable);
    }
}
