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
import com.daaw.j51;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class j51 {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public static final WeakHashMap<e, SparseArray<d>> b = new WeakHashMap<>(0);
    public static final Object c = new Object();

    /* loaded from: classes.dex */
    public static class a {
        public static Drawable a(Resources resources, int i, int i2) {
            return resources.getDrawableForDensity(i, i2);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Drawable a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        public static Drawable b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static int a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        public static ColorStateList b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final ColorStateList a;
        public final Configuration b;
        public final int c;

        public d(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.a = colorStateList;
            this.b = configuration;
            this.c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public final Resources a;
        public final Resources.Theme b;

        public e(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && pt0.a(this.b, eVar.b);
        }

        public int hashCode() {
            return pt0.b(this.a, this.b);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i, Handler handler) {
            e(handler).post(new Runnable() { // from class: com.daaw.k51
                @Override // java.lang.Runnable
                public final void run() {
                    j51.f.this.f(i);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: com.daaw.l51
                @Override // java.lang.Runnable
                public final void run() {
                    j51.f.this.g(typeface);
                }
            });
        }

        /* renamed from: h */
        public abstract void f(int i);

        /* renamed from: i */
        public abstract void g(Typeface typeface);
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* loaded from: classes.dex */
        public static class a {
            public static final Object a = new Object();
            public static Method b;
            public static boolean c;

            @SuppressLint({"BanUncheckedReflection"})
            public static void a(Resources.Theme theme) {
                synchronized (a) {
                    if (!c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
                        c = true;
                    }
                    Method method = b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            b = null;
                        }
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        public static class b {
            public static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                b.a(theme);
            } else if (i >= 23) {
                a.a(theme);
            }
        }
    }

    public static void a(e eVar, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (c) {
            WeakHashMap<e, SparseArray<d>> weakHashMap = b;
            SparseArray<d> sparseArray = weakHashMap.get(eVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(eVar, sparseArray);
            }
            sparseArray.append(i, new d(colorStateList, eVar.a.getConfiguration(), theme));
        }
    }

    public static ColorStateList b(e eVar, int i) {
        d dVar;
        Resources.Theme theme;
        synchronized (c) {
            SparseArray<d> sparseArray = b.get(eVar);
            if (sparseArray != null && sparseArray.size() > 0 && (dVar = sparseArray.get(i)) != null) {
                if (dVar.b.equals(eVar.a.getConfiguration()) && (((theme = eVar.b) == null && dVar.c == 0) || (theme != null && dVar.c == theme.hashCode()))) {
                    return dVar.a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    public static ColorStateList c(Resources resources, int i, Resources.Theme theme) {
        e eVar = new e(resources, theme);
        ColorStateList b2 = b(eVar, i);
        if (b2 != null) {
            return b2;
        }
        ColorStateList j = j(resources, i, theme);
        if (j == null) {
            return Build.VERSION.SDK_INT >= 23 ? c.b(resources, i, theme) : resources.getColorStateList(i);
        }
        a(eVar, i, j, theme);
        return j;
    }

    public static Drawable d(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? b.a(resources, i, theme) : resources.getDrawable(i);
    }

    public static Drawable e(Resources resources, int i, int i2, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? b.b(resources, i, i2, theme) : a.a(resources, i, i2);
    }

    public static Typeface f(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return l(context, i, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface g(Context context, int i, TypedValue typedValue, int i2, f fVar) {
        if (context.isRestricted()) {
            return null;
        }
        return l(context, i, typedValue, i2, fVar, null, true, false);
    }

    public static void h(Context context, int i, f fVar, Handler handler) {
        ty0.f(fVar);
        if (context.isRestricted()) {
            fVar.c(-4, handler);
        } else {
            l(context, i, new TypedValue(), 0, fVar, handler, false, false);
        }
    }

    public static TypedValue i() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    public static ColorStateList j(Resources resources, int i, Resources.Theme theme) {
        if (k(resources, i)) {
            return null;
        }
        try {
            return yg.a(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean k(Resources resources, int i) {
        TypedValue i2 = i();
        resources.getValue(i, i2, true);
        int i3 = i2.type;
        return i3 >= 28 && i3 <= 31;
    }

    public static Typeface l(Context context, int i, TypedValue typedValue, int i2, f fVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface m = m(context, resources, typedValue, i, i2, fVar, handler, z, z2);
        if (m == null && fVar == null && !z2) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        return m;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface m(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, com.daaw.j51.f r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r2 = r16
            r0 = r17
            r3 = r18
            r10 = r20
            r11 = r21
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L9b
            java.lang.String r12 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = -3
            r14 = 0
            if (r1 != 0) goto L22
            if (r10 == 0) goto L21
            r10.c(r13, r11)
        L21:
            return r14
        L22:
            int r1 = r0.assetCookie
            r6 = r19
            android.graphics.Typeface r1 = com.daaw.to1.f(r2, r3, r12, r1, r6)
            if (r1 == 0) goto L32
            if (r10 == 0) goto L31
            r10.d(r1, r11)
        L31:
            return r1
        L32:
            if (r23 == 0) goto L35
            return r14
        L35:
            java.lang.String r1 = r12.toLowerCase()     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L88
            java.lang.String r4 = ".xml"
            boolean r1 = r1.endsWith(r4)     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L88
            if (r1 == 0) goto L66
            android.content.res.XmlResourceParser r1 = r2.getXml(r3)     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L88
            com.daaw.a30$b r1 = com.daaw.a30.b(r1, r2)     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L88
            if (r1 != 0) goto L51
            if (r10 == 0) goto L50
            r10.c(r13, r11)     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L88
        L50:
            return r14
        L51:
            int r5 = r0.assetCookie     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L88
            r0 = r15
            r2 = r16
            r3 = r18
            r4 = r12
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            android.graphics.Typeface r0 = com.daaw.to1.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L88
            return r0
        L66:
            int r4 = r0.assetCookie     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L88
            r0 = r15
            r1 = r16
            r2 = r18
            r3 = r12
            r5 = r19
            android.graphics.Typeface r0 = com.daaw.to1.d(r0, r1, r2, r3, r4, r5)     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L88
            if (r10 == 0) goto L7f
            if (r0 == 0) goto L7c
            r10.d(r0, r11)     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L88
            goto L7f
        L7c:
            r10.c(r13, r11)     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L88
        L7f:
            return r0
        L80:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to read xml resource "
            goto L8f
        L88:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to parse xml resource "
        L8f:
            r0.append(r1)
            r0.append(r12)
            if (r10 == 0) goto L9a
            r10.c(r13, r11)
        L9a:
            return r14
        L9b:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Resource \""
            r4.append(r5)
            java.lang.String r2 = r2.getResourceName(r3)
            r4.append(r2)
            java.lang.String r2 = "\" ("
            r4.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r18)
            r4.append(r2)
            java.lang.String r2 = ") is not a Font: "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.j51.m(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, com.daaw.j51$f, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
