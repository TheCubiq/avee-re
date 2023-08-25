package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import com.daaw.a30;
import com.daaw.b30;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
/* loaded from: classes.dex */
public class vo1 extends zo1 {

    /* renamed from: b */
    public static final Class<?> f30387b;

    /* renamed from: c */
    public static final Constructor<?> f30388c;

    /* renamed from: d */
    public static final Method f30389d;

    /* renamed from: e */
    public static final Method f30390e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            method2 = null;
        }
        f30388c = constructor;
        f30387b = cls;
        f30389d = method2;
        f30390e = method;
    }

    /* renamed from: k */
    public static boolean m6974k(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f30389d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    public static Typeface m6973l(Object obj) {
        try {
            Object newInstance = Array.newInstance(f30387b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f30390e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m6972m() {
        return f30389d != null;
    }

    /* renamed from: n */
    public static Object m6971n() {
        try {
            return f30388c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // com.daaw.zo1
    /* renamed from: b */
    public Typeface mo2059b(Context context, a30.C0570c c0570c, Resources resources, int i) {
        a30.C0571d[] m27735a;
        Object m6971n = m6971n();
        if (m6971n == null) {
            return null;
        }
        for (a30.C0571d c0571d : c0570c.m27735a()) {
            ByteBuffer m27273b = ap1.m27273b(context, resources, c0571d.m27733b());
            if (m27273b == null || !m6974k(m6971n, m27273b, c0571d.m27732c(), c0571d.m27730e(), c0571d.m27729f())) {
                return null;
            }
        }
        return m6973l(m6971n);
    }

    @Override // com.daaw.zo1
    /* renamed from: c */
    public Typeface mo2058c(Context context, CancellationSignal cancellationSignal, b30.C0805b[] c0805bArr, int i) {
        Object m6971n = m6971n();
        if (m6971n == null) {
            return null;
        }
        cd1 cd1Var = new cd1();
        for (b30.C0805b c0805b : c0805bArr) {
            Uri m26504d = c0805b.m26504d();
            ByteBuffer byteBuffer = (ByteBuffer) cd1Var.get(m26504d);
            if (byteBuffer == null) {
                byteBuffer = ap1.m27269f(context, cancellationSignal, m26504d);
                cd1Var.put(m26504d, byteBuffer);
            }
            if (byteBuffer == null || !m6974k(m6971n, byteBuffer, c0805b.m26505c(), c0805b.m26503e(), c0805b.m26502f())) {
                return null;
            }
        }
        Typeface m6973l = m6973l(m6971n);
        if (m6973l == null) {
            return null;
        }
        return Typeface.create(m6973l, i);
    }
}
