package com.daaw;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class is1 {

    /* renamed from: a */
    public final C1370g6<String, Method> f13966a;

    /* renamed from: b */
    public final C1370g6<String, Method> f13967b;

    /* renamed from: c */
    public final C1370g6<String, Class> f13968c;

    public is1(C1370g6<String, Method> c1370g6, C1370g6<String, Method> c1370g62, C1370g6<String, Class> c1370g63) {
        this.f13966a = c1370g6;
        this.f13967b = c1370g62;
        this.f13968c = c1370g63;
    }

    /* renamed from: A */
    public abstract void mo18275A(byte[] bArr);

    /* renamed from: B */
    public void m19471B(byte[] bArr, int i) {
        mo18261w(i);
        mo18275A(bArr);
    }

    /* renamed from: C */
    public abstract void mo18274C(CharSequence charSequence);

    /* renamed from: D */
    public void m19470D(CharSequence charSequence, int i) {
        mo18261w(i);
        mo18274C(charSequence);
    }

    /* renamed from: E */
    public abstract void mo18273E(int i);

    /* renamed from: F */
    public void m19469F(int i, int i2) {
        mo18261w(i2);
        mo18273E(i);
    }

    /* renamed from: G */
    public abstract void mo18272G(Parcelable parcelable);

    /* renamed from: H */
    public void m19468H(Parcelable parcelable, int i) {
        mo18261w(i);
        mo18272G(parcelable);
    }

    /* renamed from: I */
    public abstract void mo18271I(String str);

    /* renamed from: J */
    public void m19467J(String str, int i) {
        mo18261w(i);
        mo18271I(str);
    }

    /* renamed from: K */
    public <T extends ks1> void m19466K(T t, is1 is1Var) {
        try {
            m19460e(t.getClass()).invoke(null, t, is1Var);
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

    /* renamed from: L */
    public void m19465L(ks1 ks1Var) {
        if (ks1Var == null) {
            mo18271I(null);
            return;
        }
        m19463N(ks1Var);
        is1 mo18269b = mo18269b();
        m19466K(ks1Var, mo18269b);
        mo18269b.mo18270a();
    }

    /* renamed from: M */
    public void m19464M(ks1 ks1Var, int i) {
        mo18261w(i);
        m19465L(ks1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    public final void m19463N(ks1 ks1Var) {
        try {
            mo18271I(m19462c(ks1Var.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(ks1Var.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: a */
    public abstract void mo18270a();

    /* renamed from: b */
    public abstract is1 mo18269b();

    /* renamed from: c */
    public final Class m19462c(Class<? extends ks1> cls) {
        Class cls2 = this.f13968c.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.f13968c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    /* renamed from: d */
    public final Method m19461d(String str) {
        Method method = this.f13966a.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, is1.class.getClassLoader()).getDeclaredMethod("read", is1.class);
            this.f13966a.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* renamed from: e */
    public final Method m19460e(Class cls) {
        Method method = this.f13967b.get(cls.getName());
        if (method == null) {
            Class m19462c = m19462c(cls);
            System.currentTimeMillis();
            Method declaredMethod = m19462c.getDeclaredMethod("write", cls, is1.class);
            this.f13967b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* renamed from: f */
    public boolean m19459f() {
        return false;
    }

    /* renamed from: g */
    public abstract boolean mo18268g();

    /* renamed from: h */
    public boolean m19458h(boolean z, int i) {
        return !mo18265m(i) ? z : mo18268g();
    }

    /* renamed from: i */
    public abstract byte[] mo18267i();

    /* renamed from: j */
    public byte[] m19457j(byte[] bArr, int i) {
        return !mo18265m(i) ? bArr : mo18267i();
    }

    /* renamed from: k */
    public abstract CharSequence mo18266k();

    /* renamed from: l */
    public CharSequence m19456l(CharSequence charSequence, int i) {
        return !mo18265m(i) ? charSequence : mo18266k();
    }

    /* renamed from: m */
    public abstract boolean mo18265m(int i);

    /* renamed from: n */
    public <T extends ks1> T m19455n(String str, is1 is1Var) {
        try {
            return (T) m19461d(str).invoke(null, is1Var);
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

    /* renamed from: o */
    public abstract int mo18264o();

    /* renamed from: p */
    public int m19454p(int i, int i2) {
        return !mo18265m(i2) ? i : mo18264o();
    }

    /* renamed from: q */
    public abstract <T extends Parcelable> T mo18263q();

    /* renamed from: r */
    public <T extends Parcelable> T m19453r(T t, int i) {
        return !mo18265m(i) ? t : (T) mo18263q();
    }

    /* renamed from: s */
    public abstract String mo18262s();

    /* renamed from: t */
    public String m19452t(String str, int i) {
        return !mo18265m(i) ? str : mo18262s();
    }

    /* renamed from: u */
    public <T extends ks1> T m19451u() {
        String mo18262s = mo18262s();
        if (mo18262s == null) {
            return null;
        }
        return (T) m19455n(mo18262s, mo18269b());
    }

    /* renamed from: v */
    public <T extends ks1> T m19450v(T t, int i) {
        return !mo18265m(i) ? t : (T) m19451u();
    }

    /* renamed from: w */
    public abstract void mo18261w(int i);

    /* renamed from: x */
    public void m19449x(boolean z, boolean z2) {
    }

    /* renamed from: y */
    public abstract void mo18260y(boolean z);

    /* renamed from: z */
    public void m19448z(boolean z, int i) {
        mo18261w(i);
        mo18260y(z);
    }
}
