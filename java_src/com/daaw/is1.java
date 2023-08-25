package com.daaw;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class is1 {
    public final g6<String, Method> a;
    public final g6<String, Method> b;
    public final g6<String, Class> c;

    public is1(g6<String, Method> g6Var, g6<String, Method> g6Var2, g6<String, Class> g6Var3) {
        this.a = g6Var;
        this.b = g6Var2;
        this.c = g6Var3;
    }

    public abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i) {
        w(i);
        A(bArr);
    }

    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i) {
        w(i);
        C(charSequence);
    }

    public abstract void E(int i);

    public void F(int i, int i2) {
        w(i2);
        E(i);
    }

    public abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i) {
        w(i);
        G(parcelable);
    }

    public abstract void I(String str);

    public void J(String str, int i) {
        w(i);
        I(str);
    }

    public <T extends ks1> void K(T t, is1 is1Var) {
        try {
            e(t.getClass()).invoke(null, t, is1Var);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    public void L(ks1 ks1Var) {
        if (ks1Var == null) {
            I(null);
            return;
        }
        N(ks1Var);
        is1 b = b();
        K(ks1Var, b);
        b.a();
    }

    public void M(ks1 ks1Var, int i) {
        w(i);
        L(ks1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(ks1 ks1Var) {
        try {
            I(c(ks1Var.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(ks1Var.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    public abstract void a();

    public abstract is1 b();

    public final Class c(Class<? extends ks1> cls) {
        Class cls2 = this.c.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method d(String str) {
        Method method = this.a.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, is1.class.getClassLoader()).getDeclaredMethod("read", is1.class);
            this.a.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method e(Class cls) {
        Method method = this.b.get(cls.getName());
        if (method == null) {
            Class c = c(cls);
            System.currentTimeMillis();
            Method declaredMethod = c.getDeclaredMethod("write", cls, is1.class);
            this.b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public boolean h(boolean z, int i) {
        return !m(i) ? z : g();
    }

    public abstract byte[] i();

    public byte[] j(byte[] bArr, int i) {
        return !m(i) ? bArr : i();
    }

    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i) {
        return !m(i) ? charSequence : k();
    }

    public abstract boolean m(int i);

    public <T extends ks1> T n(String str, is1 is1Var) {
        try {
            return (T) d(str).invoke(null, is1Var);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract int o();

    public int p(int i, int i2) {
        return !m(i2) ? i : o();
    }

    public abstract <T extends Parcelable> T q();

    public <T extends Parcelable> T r(T t, int i) {
        return !m(i) ? t : (T) q();
    }

    public abstract String s();

    public String t(String str, int i) {
        return !m(i) ? str : s();
    }

    public <T extends ks1> T u() {
        String s = s();
        if (s == null) {
            return null;
        }
        return (T) n(s, b());
    }

    public <T extends ks1> T v(T t, int i) {
        return !m(i) ? t : (T) u();
    }

    public abstract void w(int i);

    public void x(boolean z, boolean z2) {
    }

    public abstract void y(boolean z);

    public void z(boolean z, int i) {
        w(i);
        y(z);
    }
}
