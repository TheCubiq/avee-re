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

    /* renamed from: i */
    public static g51 f10266i;

    /* renamed from: a */
    public WeakHashMap<Context, me1<ColorStateList>> f10268a;

    /* renamed from: b */
    public cd1<String, InterfaceC1367e> f10269b;

    /* renamed from: c */
    public me1<String> f10270c;

    /* renamed from: d */
    public final WeakHashMap<Context, sl0<WeakReference<Drawable.ConstantState>>> f10271d = new WeakHashMap<>(0);

    /* renamed from: e */
    public TypedValue f10272e;

    /* renamed from: f */
    public boolean f10273f;

    /* renamed from: g */
    public InterfaceC1368f f10274g;

    /* renamed from: h */
    public static final PorterDuff.Mode f10265h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    public static final C1365c f10267j = new C1365c(6);

    /* renamed from: com.daaw.g51$a */
    /* loaded from: classes.dex */
    public static class C1363a implements InterfaceC1367e {
        @Override // com.daaw.g51.InterfaceC1367e
        /* renamed from: a */
        public Drawable mo21911a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1038d3.m24754m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.daaw.g51$b */
    /* loaded from: classes.dex */
    public static class C1364b implements InterfaceC1367e {
        @Override // com.daaw.g51.InterfaceC1367e
        /* renamed from: a */
        public Drawable mo21911a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1156e3.m23784a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.daaw.g51$c */
    /* loaded from: classes.dex */
    public static class C1365c extends wl0<Integer, PorterDuffColorFilter> {
        public C1365c(int i) {
            super(i);
        }

        /* renamed from: j */
        public static int m21919j(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* renamed from: k */
        public PorterDuffColorFilter m21918k(int i, PorterDuff.Mode mode) {
            return m6023c(Integer.valueOf(m21919j(i, mode)));
        }

        /* renamed from: l */
        public PorterDuffColorFilter m21917l(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m6022d(Integer.valueOf(m21919j(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: com.daaw.g51$d */
    /* loaded from: classes.dex */
    public static class C1366d implements InterfaceC1367e {
        @Override // com.daaw.g51.InterfaceC1367e
        /* renamed from: a */
        public Drawable mo21911a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) C1366d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        C1947kh.m17750c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
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

    /* renamed from: com.daaw.g51$e */
    /* loaded from: classes.dex */
    public interface InterfaceC1367e {
        /* renamed from: a */
        Drawable mo21911a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: com.daaw.g51$f */
    /* loaded from: classes.dex */
    public interface InterfaceC1368f {
        /* renamed from: a */
        Drawable mo21916a(g51 g51Var, Context context, int i);

        /* renamed from: b */
        boolean mo21915b(Context context, int i, Drawable drawable);

        /* renamed from: c */
        PorterDuff.Mode mo21914c(int i);

        /* renamed from: d */
        ColorStateList mo21913d(Context context, int i);

        /* renamed from: e */
        boolean mo21912e(Context context, int i, Drawable drawable);
    }

    /* renamed from: com.daaw.g51$g */
    /* loaded from: classes.dex */
    public static class C1369g implements InterfaceC1367e {
        @Override // com.daaw.g51.InterfaceC1367e
        /* renamed from: a */
        public Drawable mo21911a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return gs1.m21292c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: e */
    public static long m21939e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: g */
    public static PorterDuffColorFilter m21937g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m21932l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized g51 m21936h() {
        g51 g51Var;
        synchronized (g51.class) {
            if (f10266i == null) {
                g51 g51Var2 = new g51();
                f10266i = g51Var2;
                m21928p(g51Var2);
            }
            g51Var = f10266i;
        }
        return g51Var;
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m21932l(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m21918k;
        synchronized (g51.class) {
            C1365c c1365c = f10267j;
            m21918k = c1365c.m21918k(i, mode);
            if (m21918k == null) {
                m21918k = new PorterDuffColorFilter(i, mode);
                c1365c.m21917l(i, mode, m21918k);
            }
        }
        return m21918k;
    }

    /* renamed from: p */
    public static void m21928p(g51 g51Var) {
        if (Build.VERSION.SDK_INT < 24) {
            g51Var.m21943a("vector", new C1369g());
            g51Var.m21943a("animated-vector", new C1364b());
            g51Var.m21943a("animated-selector", new C1363a());
            g51Var.m21943a("drawable", new C1366d());
        }
    }

    /* renamed from: q */
    public static boolean m21927q(Drawable drawable) {
        return (drawable instanceof gs1) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: w */
    public static void m21921w(Drawable drawable, sl1 sl1Var, int[] iArr) {
        if (!C3373vu.m6789a(drawable) || drawable.mutate() == drawable) {
            boolean z = sl1Var.f26352d;
            if (z || sl1Var.f26351c) {
                drawable.setColorFilter(m21937g(z ? sl1Var.f26349a : null, sl1Var.f26351c ? sl1Var.f26350b : f10265h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    /* renamed from: a */
    public final void m21943a(String str, InterfaceC1367e interfaceC1367e) {
        if (this.f10269b == null) {
            this.f10269b = new cd1<>();
        }
        this.f10269b.put(str, interfaceC1367e);
    }

    /* renamed from: b */
    public final synchronized boolean m21942b(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            sl0<WeakReference<Drawable.ConstantState>> sl0Var = this.f10271d.get(context);
            if (sl0Var == null) {
                sl0Var = new sl0<>();
                this.f10271d.put(context, sl0Var);
            }
            sl0Var.m10210k(j, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public final void m21941c(Context context, int i, ColorStateList colorStateList) {
        if (this.f10268a == null) {
            this.f10268a = new WeakHashMap<>();
        }
        me1<ColorStateList> me1Var = this.f10268a.get(context);
        if (me1Var == null) {
            me1Var = new me1<>();
            this.f10268a.put(context, me1Var);
        }
        me1Var.m16060a(i, colorStateList);
    }

    /* renamed from: d */
    public final void m21940d(Context context) {
        if (this.f10273f) {
            return;
        }
        this.f10273f = true;
        Drawable m21934j = m21934j(context, h11.abc_vector_test);
        if (m21934j == null || !m21927q(m21934j)) {
            this.f10273f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* renamed from: f */
    public final Drawable m21938f(Context context, int i) {
        if (this.f10272e == null) {
            this.f10272e = new TypedValue();
        }
        TypedValue typedValue = this.f10272e;
        context.getResources().getValue(i, typedValue, true);
        long m21939e = m21939e(typedValue);
        Drawable m21935i = m21935i(context, m21939e);
        if (m21935i != null) {
            return m21935i;
        }
        InterfaceC1368f interfaceC1368f = this.f10274g;
        Drawable mo21916a = interfaceC1368f == null ? null : interfaceC1368f.mo21916a(this, context, i);
        if (mo21916a != null) {
            mo21916a.setChangingConfigurations(typedValue.changingConfigurations);
            m21942b(context, m21939e, mo21916a);
        }
        return mo21916a;
    }

    /* renamed from: i */
    public final synchronized Drawable m21935i(Context context, long j) {
        sl0<WeakReference<Drawable.ConstantState>> sl0Var = this.f10271d.get(context);
        if (sl0Var == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> m10214e = sl0Var.m10214e(j);
        if (m10214e != null) {
            Drawable.ConstantState constantState = m10214e.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            sl0Var.m10209m(j);
        }
        return null;
    }

    /* renamed from: j */
    public synchronized Drawable m21934j(Context context, int i) {
        return m21933k(context, i, false);
    }

    /* renamed from: k */
    public synchronized Drawable m21933k(Context context, int i, boolean z) {
        Drawable m21926r;
        m21940d(context);
        m21926r = m21926r(context, i);
        if (m21926r == null) {
            m21926r = m21938f(context, i);
        }
        if (m21926r == null) {
            m21926r = C3866zk.m2178e(context, i);
        }
        if (m21926r != null) {
            m21926r = m21922v(context, i, z, m21926r);
        }
        if (m21926r != null) {
            C3373vu.m6788b(m21926r);
        }
        return m21926r;
    }

    /* renamed from: m */
    public synchronized ColorStateList m21931m(Context context, int i) {
        ColorStateList m21930n;
        m21930n = m21930n(context, i);
        if (m21930n == null) {
            InterfaceC1368f interfaceC1368f = this.f10274g;
            m21930n = interfaceC1368f == null ? null : interfaceC1368f.mo21913d(context, i);
            if (m21930n != null) {
                m21941c(context, i, m21930n);
            }
        }
        return m21930n;
    }

    /* renamed from: n */
    public final ColorStateList m21930n(Context context, int i) {
        me1<ColorStateList> me1Var;
        WeakHashMap<Context, me1<ColorStateList>> weakHashMap = this.f10268a;
        if (weakHashMap == null || (me1Var = weakHashMap.get(context)) == null) {
            return null;
        }
        return me1Var.m16056e(i);
    }

    /* renamed from: o */
    public PorterDuff.Mode m21929o(int i) {
        InterfaceC1368f interfaceC1368f = this.f10274g;
        if (interfaceC1368f == null) {
            return null;
        }
        return interfaceC1368f.mo21914c(i);
    }

    /* renamed from: r */
    public final Drawable m21926r(Context context, int i) {
        int next;
        cd1<String, InterfaceC1367e> cd1Var = this.f10269b;
        if (cd1Var == null || cd1Var.isEmpty()) {
            return null;
        }
        me1<String> me1Var = this.f10270c;
        if (me1Var != null) {
            String m16056e = me1Var.m16056e(i);
            if ("appcompat_skip_skip".equals(m16056e) || (m16056e != null && this.f10269b.get(m16056e) == null)) {
                return null;
            }
        } else {
            this.f10270c = new me1<>();
        }
        if (this.f10272e == null) {
            this.f10272e = new TypedValue();
        }
        TypedValue typedValue = this.f10272e;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long m21939e = m21939e(typedValue);
        Drawable m21935i = m21935i(context, m21939e);
        if (m21935i != null) {
            return m21935i;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
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
                this.f10270c.m16060a(i, name);
                InterfaceC1367e interfaceC1367e = this.f10269b.get(name);
                if (interfaceC1367e != null) {
                    m21935i = interfaceC1367e.mo21911a(context, xml, asAttributeSet, context.getTheme());
                }
                if (m21935i != null) {
                    m21935i.setChangingConfigurations(typedValue.changingConfigurations);
                    m21942b(context, m21939e, m21935i);
                }
            } catch (Exception unused) {
            }
        }
        if (m21935i == null) {
            this.f10270c.m16060a(i, "appcompat_skip_skip");
        }
        return m21935i;
    }

    /* renamed from: s */
    public synchronized void m21925s(Context context) {
        sl0<WeakReference<Drawable.ConstantState>> sl0Var = this.f10271d.get(context);
        if (sl0Var != null) {
            sl0Var.m10217b();
        }
    }

    /* renamed from: t */
    public synchronized Drawable m21924t(Context context, hs1 hs1Var, int i) {
        Drawable m21926r = m21926r(context, i);
        if (m21926r == null) {
            m21926r = hs1Var.m15521a(i);
        }
        if (m21926r != null) {
            return m21922v(context, i, false, m21926r);
        }
        return null;
    }

    /* renamed from: u */
    public synchronized void m21923u(InterfaceC1368f interfaceC1368f) {
        this.f10274g = interfaceC1368f;
    }

    /* renamed from: v */
    public final Drawable m21922v(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m21931m = m21931m(context, i);
        if (m21931m == null) {
            InterfaceC1368f interfaceC1368f = this.f10274g;
            if ((interfaceC1368f == null || !interfaceC1368f.mo21912e(context, i, drawable)) && !m21920x(context, i, drawable) && z) {
                return null;
            }
            return drawable;
        }
        if (C3373vu.m6789a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable m14809r = C2366nu.m14809r(drawable);
        C2366nu.m14812o(m14809r, m21931m);
        PorterDuff.Mode m21929o = m21929o(i);
        if (m21929o != null) {
            C2366nu.m14811p(m14809r, m21929o);
            return m14809r;
        }
        return m14809r;
    }

    /* renamed from: x */
    public boolean m21920x(Context context, int i, Drawable drawable) {
        InterfaceC1368f interfaceC1368f = this.f10274g;
        return interfaceC1368f != null && interfaceC1368f.mo21915b(context, i, drawable);
    }
}
