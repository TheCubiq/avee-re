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
    public final Class<?> g;
    public final Constructor<?> h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;

    public wo1() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> y = y();
            constructor = z(y);
            method2 = v(y);
            method3 = w(y);
            method4 = A(y);
            method5 = u(y);
            method = x(y);
            cls = y;
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
        this.g = cls;
        this.h = constructor;
        this.i = method2;
        this.j = method3;
        this.k = method4;
        this.l = method5;
        this.m = method;
    }

    private Object o() {
        try {
            return this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method A(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    @Override // com.daaw.uo1, com.daaw.zo1
    public Typeface b(Context context, a30.c cVar, Resources resources, int i) {
        a30.d[] a;
        if (t()) {
            Object o = o();
            if (o == null) {
                return null;
            }
            for (a30.d dVar : cVar.a()) {
                if (!q(context, o, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                    p(o);
                    return null;
                }
            }
            if (s(o)) {
                return l(o);
            }
            return null;
        }
        return super.b(context, cVar, resources, i);
    }

    @Override // com.daaw.uo1, com.daaw.zo1
    public Typeface c(Context context, CancellationSignal cancellationSignal, b30.b[] bVarArr, int i) {
        Typeface l;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!t()) {
            b30.b h = h(bVarArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h.e()).setItalic(h.f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> h2 = ap1.h(context, bVarArr, cancellationSignal);
        Object o = o();
        if (o == null) {
            return null;
        }
        boolean z = false;
        for (b30.b bVar : bVarArr) {
            ByteBuffer byteBuffer = h2.get(bVar.d());
            if (byteBuffer != null) {
                if (!r(o, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    p(o);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            p(o);
            return null;
        } else if (s(o) && (l = l(o)) != null) {
            return Typeface.create(l, i);
        } else {
            return null;
        }
    }

    @Override // com.daaw.zo1
    public Typeface e(Context context, Resources resources, int i, String str, int i2) {
        if (t()) {
            Object o = o();
            if (o == null) {
                return null;
            }
            if (!q(context, o, str, 0, -1, -1, null)) {
                p(o);
                return null;
            } else if (s(o)) {
                return l(o);
            } else {
                return null;
            }
        }
        return super.e(context, resources, i, str, i2);
    }

    public Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void p(Object obj) {
        try {
            this.l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean q(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean r(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean s(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean t() {
        return this.i != null;
    }

    public Method u(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    public Method v(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method w(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method x(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class<?> y() {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor<?> z(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }
}
