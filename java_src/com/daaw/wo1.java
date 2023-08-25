package com.daaw;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.daaw.a30;
import com.daaw.b30;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
/* loaded from: classes.dex */
public class wo1 extends uo1 {

    /* renamed from: g */
    public final Class<?> f31415g;

    /* renamed from: h */
    public final Constructor<?> f31416h;

    /* renamed from: i */
    public final Method f31417i;

    /* renamed from: j */
    public final Method f31418j;

    /* renamed from: k */
    public final Method f31419k;

    /* renamed from: l */
    public final Method f31420l;

    /* renamed from: m */
    public final Method f31421m;

    public wo1() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> m5896y = m5896y();
            constructor = m5895z(m5896y);
            method2 = m5898v(m5896y);
            method3 = m5897w(m5896y);
            method4 = m5906A(m5896y);
            method5 = m5899u(m5896y);
            method = mo4883x(m5896y);
            cls = m5896y;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to collect necessary methods for class ");
            sb.append(e.getClass().getName());
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f31415g = cls;
        this.f31416h = constructor;
        this.f31417i = method2;
        this.f31418j = method3;
        this.f31419k = method4;
        this.f31420l = method5;
        this.f31421m = method;
    }

    /* renamed from: o */
    private Object m5905o() {
        try {
            return this.f31416h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: A */
    public Method m5906A(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    @Override // com.daaw.uo1, com.daaw.zo1
    /* renamed from: b */
    public Typeface mo2059b(Context context, a30.C0570c c0570c, Resources resources, int i) {
        a30.C0571d[] m27735a;
        if (m5900t()) {
            Object m5905o = m5905o();
            if (m5905o == null) {
                return null;
            }
            for (a30.C0571d c0571d : c0570c.m27735a()) {
                if (!m5903q(context, m5905o, c0571d.m27734a(), c0571d.m27732c(), c0571d.m27730e(), c0571d.m27729f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0571d.m27731d()))) {
                    m5904p(m5905o);
                    return null;
                }
            }
            if (m5901s(m5905o)) {
                return mo4884l(m5905o);
            }
            return null;
        }
        return super.mo2059b(context, c0570c, resources, i);
    }

    @Override // com.daaw.uo1, com.daaw.zo1
    /* renamed from: c */
    public Typeface mo2058c(Context context, CancellationSignal cancellationSignal, b30.C0805b[] c0805bArr, int i) {
        Typeface mo4884l;
        if (c0805bArr.length < 1) {
            return null;
        }
        if (!m5900t()) {
            b30.C0805b mo2053h = mo2053h(c0805bArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo2053h.m26504d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(mo2053h.m26503e()).setItalic(mo2053h.m26502f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> m27267h = ap1.m27267h(context, c0805bArr, cancellationSignal);
        Object m5905o = m5905o();
        if (m5905o == null) {
            return null;
        }
        boolean z = false;
        for (b30.C0805b c0805b : c0805bArr) {
            ByteBuffer byteBuffer = m27267h.get(c0805b.m26504d());
            if (byteBuffer != null) {
                if (!m5902r(m5905o, byteBuffer, c0805b.m26505c(), c0805b.m26503e(), c0805b.m26502f() ? 1 : 0)) {
                    m5904p(m5905o);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            m5904p(m5905o);
            return null;
        } else if (m5901s(m5905o) && (mo4884l = mo4884l(m5905o)) != null) {
            return Typeface.create(mo4884l, i);
        } else {
            return null;
        }
    }

    @Override // com.daaw.zo1
    /* renamed from: e */
    public Typeface mo2056e(Context context, Resources resources, int i, String str, int i2) {
        if (m5900t()) {
            Object m5905o = m5905o();
            if (m5905o == null) {
                return null;
            }
            if (!m5903q(context, m5905o, str, 0, -1, -1, null)) {
                m5904p(m5905o);
                return null;
            } else if (m5901s(m5905o)) {
                return mo4884l(m5905o);
            } else {
                return null;
            }
        }
        return super.mo2056e(context, resources, i, str, i2);
    }

    /* renamed from: l */
    public Typeface mo4884l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f31415g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f31421m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: p */
    public final void m5904p(Object obj) {
        try {
            this.f31420l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: q */
    public final boolean m5903q(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f31417i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: r */
    public final boolean m5902r(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f31418j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s */
    public final boolean m5901s(Object obj) {
        try {
            return ((Boolean) this.f31419k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: t */
    public final boolean m5900t() {
        return this.f31417i != null;
    }

    /* renamed from: u */
    public Method m5899u(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: v */
    public Method m5898v(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: w */
    public Method m5897w(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: x */
    public Method mo4883x(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: y */
    public Class<?> m5896y() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: z */
    public Constructor<?> m5895z(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }
}
