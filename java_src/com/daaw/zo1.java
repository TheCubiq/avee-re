package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.daaw.a30;
import com.daaw.b30;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class zo1 {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a */
    public ConcurrentHashMap<Long, a30.C0570c> f35301a = new ConcurrentHashMap<>();

    /* renamed from: com.daaw.zo1$a */
    /* loaded from: classes.dex */
    public class C3884a implements InterfaceC3886c<b30.C0805b> {
        public C3884a() {
        }

        @Override // com.daaw.zo1.InterfaceC3886c
        /* renamed from: c */
        public int mo2046a(b30.C0805b c0805b) {
            return c0805b.m26503e();
        }

        @Override // com.daaw.zo1.InterfaceC3886c
        /* renamed from: d */
        public boolean mo2045b(b30.C0805b c0805b) {
            return c0805b.m26502f();
        }
    }

    /* renamed from: com.daaw.zo1$b */
    /* loaded from: classes.dex */
    public class C3885b implements InterfaceC3886c<a30.C0571d> {
        public C3885b() {
        }

        @Override // com.daaw.zo1.InterfaceC3886c
        /* renamed from: c */
        public int mo2046a(a30.C0571d c0571d) {
            return c0571d.m27730e();
        }

        @Override // com.daaw.zo1.InterfaceC3886c
        /* renamed from: d */
        public boolean mo2045b(a30.C0571d c0571d) {
            return c0571d.m27729f();
        }
    }

    /* renamed from: com.daaw.zo1$c */
    /* loaded from: classes.dex */
    public interface InterfaceC3886c<T> {
        /* renamed from: a */
        int mo2046a(T t);

        /* renamed from: b */
        boolean mo2045b(T t);
    }

    /* renamed from: g */
    public static <T> T m2054g(T[] tArr, int i, InterfaceC3886c<T> interfaceC3886c) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(interfaceC3886c.mo2046a(t2) - i2) * 2) + (interfaceC3886c.mo2045b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: j */
    public static long m2051j(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0L;
        }
    }

    /* renamed from: a */
    public final void m2060a(Typeface typeface, a30.C0570c c0570c) {
        long m2051j = m2051j(typeface);
        if (m2051j != 0) {
            this.f35301a.put(Long.valueOf(m2051j), c0570c);
        }
    }

    /* renamed from: b */
    public Typeface mo2059b(Context context, a30.C0570c c0570c, Resources resources, int i) {
        a30.C0571d m2055f = m2055f(c0570c, i);
        if (m2055f == null) {
            return null;
        }
        Typeface m8913d = to1.m8913d(context, resources, m2055f.m27733b(), m2055f.m27734a(), 0, i);
        m2060a(m8913d, c0570c);
        return m8913d;
    }

    /* renamed from: c */
    public Typeface mo2058c(Context context, CancellationSignal cancellationSignal, b30.C0805b[] c0805bArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (c0805bArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo2053h(c0805bArr, i).m26504d());
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface mo2057d = mo2057d(context, inputStream);
            ap1.m27274a(inputStream);
            return mo2057d;
        } catch (IOException unused2) {
            ap1.m27274a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            ap1.m27274a(inputStream2);
            throw th;
        }
    }

    /* renamed from: d */
    public Typeface mo2057d(Context context, InputStream inputStream) {
        File m27270e = ap1.m27270e(context);
        if (m27270e == null) {
            return null;
        }
        try {
            if (ap1.m27271d(m27270e, inputStream)) {
                return Typeface.createFromFile(m27270e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m27270e.delete();
        }
    }

    /* renamed from: e */
    public Typeface mo2056e(Context context, Resources resources, int i, String str, int i2) {
        File m27270e = ap1.m27270e(context);
        if (m27270e == null) {
            return null;
        }
        try {
            if (ap1.m27272c(m27270e, resources, i)) {
                return Typeface.createFromFile(m27270e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m27270e.delete();
        }
    }

    /* renamed from: f */
    public final a30.C0571d m2055f(a30.C0570c c0570c, int i) {
        return (a30.C0571d) m2054g(c0570c.m27735a(), i, new C3885b());
    }

    /* renamed from: h */
    public b30.C0805b mo2053h(b30.C0805b[] c0805bArr, int i) {
        return (b30.C0805b) m2054g(c0805bArr, i, new C3884a());
    }

    /* renamed from: i */
    public a30.C0570c m2052i(Typeface typeface) {
        long m2051j = m2051j(typeface);
        if (m2051j == 0) {
            return null;
        }
        return this.f35301a.get(Long.valueOf(m2051j));
    }
}
