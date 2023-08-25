package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import com.daaw.a30;
import com.daaw.b30;
import com.daaw.j51;
/* loaded from: classes.dex */
public class to1 {

    /* renamed from: a */
    public static final zo1 f27913a;

    /* renamed from: b */
    public static final wl0<String, Typeface> f27914b;

    /* renamed from: com.daaw.to1$a */
    /* loaded from: classes.dex */
    public static class C3105a extends b30.C0806c {

        /* renamed from: a */
        public j51.AbstractC1794f f27915a;

        public C3105a(j51.AbstractC1794f abstractC1794f) {
            this.f27915a = abstractC1794f;
        }

        @Override // com.daaw.b30.C0806c
        /* renamed from: a */
        public void mo8908a(int i) {
            j51.AbstractC1794f abstractC1794f = this.f27915a;
            if (abstractC1794f != null) {
                abstractC1794f.m18876f(i);
            }
        }

        @Override // com.daaw.b30.C0806c
        /* renamed from: b */
        public void mo8907b(Typeface typeface) {
            j51.AbstractC1794f abstractC1794f = this.f27915a;
            if (abstractC1794f != null) {
                abstractC1794f.m18875g(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f27913a = i >= 29 ? new yo1() : i >= 28 ? new xo1() : i >= 26 ? new wo1() : (i < 24 || !vo1.m6972m()) ? i >= 21 ? new uo1() : new zo1() : new vo1();
        f27914b = new wl0<>(16);
    }

    /* renamed from: a */
    public static Typeface m8916a(Context context, Typeface typeface, int i) {
        Typeface m8910g;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (m8910g = m8910g(context, typeface, i)) == null) ? Typeface.create(typeface, i) : m8910g;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m8915b(Context context, CancellationSignal cancellationSignal, b30.C0805b[] c0805bArr, int i) {
        return f27913a.mo2058c(context, cancellationSignal, c0805bArr, i);
    }

    /* renamed from: c */
    public static Typeface m8914c(Context context, a30.InterfaceC0569b interfaceC0569b, Resources resources, int i, String str, int i2, int i3, j51.AbstractC1794f abstractC1794f, Handler handler, boolean z) {
        Typeface mo2059b;
        if (interfaceC0569b instanceof a30.C0572e) {
            a30.C0572e c0572e = (a30.C0572e) interfaceC0569b;
            Typeface m8909h = m8909h(c0572e.m27726c());
            if (m8909h != null) {
                if (abstractC1794f != null) {
                    abstractC1794f.m18878d(m8909h, handler);
                }
                return m8909h;
            }
            mo2059b = b30.m26511c(context, c0572e.m27727b(), i3, !z ? abstractC1794f != null : c0572e.m27728a() != 0, z ? c0572e.m27725d() : -1, j51.AbstractC1794f.m18877e(handler), new C3105a(abstractC1794f));
        } else {
            mo2059b = f27913a.mo2059b(context, (a30.C0570c) interfaceC0569b, resources, i3);
            if (abstractC1794f != null) {
                if (mo2059b != null) {
                    abstractC1794f.m18878d(mo2059b, handler);
                } else {
                    abstractC1794f.m18879c(-3, handler);
                }
            }
        }
        if (mo2059b != null) {
            f27914b.m6022d(m8912e(resources, i, str, i2, i3), mo2059b);
        }
        return mo2059b;
    }

    /* renamed from: d */
    public static Typeface m8913d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface mo2056e = f27913a.mo2056e(context, resources, i, str, i3);
        if (mo2056e != null) {
            f27914b.m6022d(m8912e(resources, i, str, i2, i3), mo2056e);
        }
        return mo2056e;
    }

    /* renamed from: e */
    public static String m8912e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* renamed from: f */
    public static Typeface m8911f(Resources resources, int i, String str, int i2, int i3) {
        return f27914b.m6023c(m8912e(resources, i, str, i2, i3));
    }

    /* renamed from: g */
    public static Typeface m8910g(Context context, Typeface typeface, int i) {
        zo1 zo1Var = f27913a;
        a30.C0570c m2052i = zo1Var.m2052i(typeface);
        if (m2052i == null) {
            return null;
        }
        return zo1Var.mo2059b(context, m2052i, context.getResources(), i);
    }

    /* renamed from: h */
    public static Typeface m8909h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
