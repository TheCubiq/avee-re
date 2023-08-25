package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.daaw.a30;
import com.daaw.b30;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class uo1 extends zo1 {

    /* renamed from: b */
    public static Class<?> f29374b;

    /* renamed from: c */
    public static Constructor<?> f29375c;

    /* renamed from: d */
    public static Method f29376d;

    /* renamed from: e */
    public static Method f29377e;

    /* renamed from: f */
    public static boolean f29378f;

    /* renamed from: k */
    public static boolean m7883k(Object obj, String str, int i, boolean z) {
        m7880n();
        try {
            return ((Boolean) f29376d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: l */
    public static Typeface m7882l(Object obj) {
        m7880n();
        try {
            Object newInstance = Array.newInstance(f29374b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f29377e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: n */
    public static void m7880n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f29378f) {
            return;
        }
        f29378f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        f29375c = constructor;
        f29374b = cls;
        f29376d = method2;
        f29377e = method;
    }

    /* renamed from: o */
    public static Object m7879o() {
        m7880n();
        try {
            return f29375c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.daaw.zo1
    /* renamed from: b */
    public Typeface mo2059b(Context context, a30.C0570c c0570c, Resources resources, int i) {
        a30.C0571d[] m27735a;
        Object m7879o = m7879o();
        for (a30.C0571d c0571d : c0570c.m27735a()) {
            File m27270e = ap1.m27270e(context);
            if (m27270e == null) {
                return null;
            }
            try {
                if (!ap1.m27272c(m27270e, resources, c0571d.m27733b())) {
                    return null;
                }
                if (!m7883k(m7879o, m27270e.getPath(), c0571d.m27730e(), c0571d.m27729f())) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                m27270e.delete();
            }
        }
        return m7882l(m7879o);
    }

    @Override // com.daaw.zo1
    /* renamed from: c */
    public Typeface mo2058c(Context context, CancellationSignal cancellationSignal, b30.C0805b[] c0805bArr, int i) {
        if (c0805bArr.length < 1) {
            return null;
        }
        b30.C0805b mo2053h = mo2053h(c0805bArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo2053h.m26504d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File m7881m = m7881m(openFileDescriptor);
            if (m7881m != null && m7881m.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(m7881m);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface mo2057d = super.mo2057d(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return mo2057d;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final File m7881m(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
