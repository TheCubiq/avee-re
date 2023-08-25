package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import com.daaw.a30;
import com.daaw.j51;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class j51 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f14342a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<C1793e, SparseArray<C1792d>> f14343b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f14344c = new Object();

    /* renamed from: com.daaw.j51$a */
    /* loaded from: classes.dex */
    public static class C1789a {
        /* renamed from: a */
        public static Drawable m18886a(Resources resources, int i, int i2) {
            return resources.getDrawableForDensity(i, i2);
        }
    }

    /* renamed from: com.daaw.j51$b */
    /* loaded from: classes.dex */
    public static class C1790b {
        /* renamed from: a */
        public static Drawable m18885a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        /* renamed from: b */
        public static Drawable m18884b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* renamed from: com.daaw.j51$c */
    /* loaded from: classes.dex */
    public static class C1791c {
        /* renamed from: a */
        public static int m18883a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        /* renamed from: b */
        public static ColorStateList m18882b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* renamed from: com.daaw.j51$d */
    /* loaded from: classes.dex */
    public static class C1792d {

        /* renamed from: a */
        public final ColorStateList f14345a;

        /* renamed from: b */
        public final Configuration f14346b;

        /* renamed from: c */
        public final int f14347c;

        public C1792d(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f14345a = colorStateList;
            this.f14346b = configuration;
            this.f14347c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* renamed from: com.daaw.j51$e */
    /* loaded from: classes.dex */
    public static final class C1793e {

        /* renamed from: a */
        public final Resources f14348a;

        /* renamed from: b */
        public final Resources.Theme f14349b;

        public C1793e(Resources resources, Resources.Theme theme) {
            this.f14348a = resources;
            this.f14349b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1793e.class != obj.getClass()) {
                return false;
            }
            C1793e c1793e = (C1793e) obj;
            return this.f14348a.equals(c1793e.f14348a) && pt0.m13160a(this.f14349b, c1793e.f14349b);
        }

        public int hashCode() {
            return pt0.m13159b(this.f14348a, this.f14349b);
        }
    }

    /* renamed from: com.daaw.j51$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1794f {
        /* renamed from: e */
        public static Handler m18877e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: c */
        public final void m18879c(final int i, Handler handler) {
            m18877e(handler).post(new Runnable() { // from class: com.daaw.k51
                @Override // java.lang.Runnable
                public final void run() {
                    j51.AbstractC1794f.this.m18876f(i);
                }
            });
        }

        /* renamed from: d */
        public final void m18878d(final Typeface typeface, Handler handler) {
            m18877e(handler).post(new Runnable() { // from class: com.daaw.l51
                @Override // java.lang.Runnable
                public final void run() {
                    j51.AbstractC1794f.this.m18875g(typeface);
                }
            });
        }

        /* renamed from: h */
        public abstract void m18876f(int i);

        /* renamed from: i */
        public abstract void m18875g(Typeface typeface);
    }

    /* renamed from: com.daaw.j51$g */
    /* loaded from: classes.dex */
    public static final class C1795g {

        /* renamed from: com.daaw.j51$g$a */
        /* loaded from: classes.dex */
        public static class C1796a {

            /* renamed from: a */
            public static final Object f14350a = new Object();

            /* renamed from: b */
            public static Method f14351b;

            /* renamed from: c */
            public static boolean f14352c;

            @SuppressLint({"BanUncheckedReflection"})
            /* renamed from: a */
            public static void m18873a(Resources.Theme theme) {
                synchronized (f14350a) {
                    if (!f14352c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f14351b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
                        f14352c = true;
                    }
                    Method method = f14351b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            f14351b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: com.daaw.j51$g$b */
        /* loaded from: classes.dex */
        public static class C1797b {
            /* renamed from: a */
            public static void m18872a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m18874a(Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                C1797b.m18872a(theme);
            } else if (i >= 23) {
                C1796a.m18873a(theme);
            }
        }
    }

    /* renamed from: a */
    public static void m18899a(C1793e c1793e, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f14344c) {
            WeakHashMap<C1793e, SparseArray<C1792d>> weakHashMap = f14343b;
            SparseArray<C1792d> sparseArray = weakHashMap.get(c1793e);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(c1793e, sparseArray);
            }
            sparseArray.append(i, new C1792d(colorStateList, c1793e.f14348a.getConfiguration(), theme));
        }
    }

    /* renamed from: b */
    public static ColorStateList m18898b(C1793e c1793e, int i) {
        C1792d c1792d;
        Resources.Theme theme;
        synchronized (f14344c) {
            SparseArray<C1792d> sparseArray = f14343b.get(c1793e);
            if (sparseArray != null && sparseArray.size() > 0 && (c1792d = sparseArray.get(i)) != null) {
                if (c1792d.f14346b.equals(c1793e.f14348a.getConfiguration()) && (((theme = c1793e.f14349b) == null && c1792d.f14347c == 0) || (theme != null && c1792d.f14347c == theme.hashCode()))) {
                    return c1792d.f14345a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static ColorStateList m18897c(Resources resources, int i, Resources.Theme theme) {
        C1793e c1793e = new C1793e(resources, theme);
        ColorStateList m18898b = m18898b(c1793e, i);
        if (m18898b != null) {
            return m18898b;
        }
        ColorStateList m18890j = m18890j(resources, i, theme);
        if (m18890j == null) {
            return Build.VERSION.SDK_INT >= 23 ? C1791c.m18882b(resources, i, theme) : resources.getColorStateList(i);
        }
        m18899a(c1793e, i, m18890j, theme);
        return m18890j;
    }

    /* renamed from: d */
    public static Drawable m18896d(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? C1790b.m18885a(resources, i, theme) : resources.getDrawable(i);
    }

    /* renamed from: e */
    public static Drawable m18895e(Resources resources, int i, int i2, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? C1790b.m18884b(resources, i, i2, theme) : C1789a.m18886a(resources, i, i2);
    }

    /* renamed from: f */
    public static Typeface m18894f(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m18888l(context, i, new TypedValue(), 0, null, null, false, false);
    }

    /* renamed from: g */
    public static Typeface m18893g(Context context, int i, TypedValue typedValue, int i2, AbstractC1794f abstractC1794f) {
        if (context.isRestricted()) {
            return null;
        }
        return m18888l(context, i, typedValue, i2, abstractC1794f, null, true, false);
    }

    /* renamed from: h */
    public static void m18892h(Context context, int i, AbstractC1794f abstractC1794f, Handler handler) {
        ty0.m8699f(abstractC1794f);
        if (context.isRestricted()) {
            abstractC1794f.m18879c(-4, handler);
        } else {
            m18888l(context, i, new TypedValue(), 0, abstractC1794f, handler, false, false);
        }
    }

    /* renamed from: i */
    public static TypedValue m18891i() {
        ThreadLocal<TypedValue> threadLocal = f14342a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* renamed from: j */
    public static ColorStateList m18890j(Resources resources, int i, Resources.Theme theme) {
        if (m18889k(resources, i)) {
            return null;
        }
        try {
            return C3706yg.m3772a(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static boolean m18889k(Resources resources, int i) {
        TypedValue m18891i = m18891i();
        resources.getValue(i, m18891i, true);
        int i2 = m18891i.type;
        return i2 >= 28 && i2 <= 31;
    }

    /* renamed from: l */
    public static Typeface m18888l(Context context, int i, TypedValue typedValue, int i2, AbstractC1794f abstractC1794f, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface m18887m = m18887m(context, resources, typedValue, i, i2, abstractC1794f, handler, z, z2);
        if (m18887m == null && abstractC1794f == null && !z2) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        return m18887m;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m18887m(Context context, Resources resources, TypedValue typedValue, int i, int i2, AbstractC1794f abstractC1794f, Handler handler, boolean z, boolean z2) {
        StringBuilder sb;
        String str;
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        if (!charSequence2.startsWith("res/")) {
            if (abstractC1794f != null) {
                abstractC1794f.m18879c(-3, handler);
            }
            return null;
        }
        Typeface m8911f = to1.m8911f(resources, i, charSequence2, typedValue.assetCookie, i2);
        if (m8911f != null) {
            if (abstractC1794f != null) {
                abstractC1794f.m18878d(m8911f, handler);
            }
            return m8911f;
        } else if (z2) {
            return null;
        } else {
            try {
                if (charSequence2.toLowerCase().endsWith(".xml")) {
                    a30.InterfaceC0569b m27743b = a30.m27743b(resources.getXml(i), resources);
                    if (m27743b == null) {
                        if (abstractC1794f != null) {
                            abstractC1794f.m18879c(-3, handler);
                        }
                        return null;
                    }
                    return to1.m8914c(context, m27743b, resources, i, charSequence2, typedValue.assetCookie, i2, abstractC1794f, handler, z);
                }
                Typeface m8913d = to1.m8913d(context, resources, i, charSequence2, typedValue.assetCookie, i2);
                if (abstractC1794f != null) {
                    if (m8913d != null) {
                        abstractC1794f.m18878d(m8913d, handler);
                    } else {
                        abstractC1794f.m18879c(-3, handler);
                    }
                }
                return m8913d;
            } catch (IOException unused) {
                sb = new StringBuilder();
                str = "Failed to read xml resource ";
                sb.append(str);
                sb.append(charSequence2);
                if (abstractC1794f != null) {
                    abstractC1794f.m18879c(-3, handler);
                }
                return null;
            } catch (XmlPullParserException unused2) {
                sb = new StringBuilder();
                str = "Failed to parse xml resource ";
                sb.append(str);
                sb.append(charSequence2);
                if (abstractC1794f != null) {
                }
                return null;
            }
        }
    }
}
