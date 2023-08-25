package com.daaw;

import com.daaw.fs7;
import com.daaw.ls7;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public abstract class ls7<MessageType extends ls7<MessageType, BuilderType>, BuilderType extends fs7<MessageType, BuilderType>> extends hq7<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    public uv7 zzc = uv7.m7679c();

    /* renamed from: C */
    public static void m16597C(Class cls, ls7 ls7Var) {
        ls7Var.m16598B();
        zzb.put(cls, ls7Var);
    }

    /* renamed from: J */
    public static ls7 m16591J(ls7 ls7Var) {
        if (ls7Var == null || ls7Var.m16595E()) {
            return ls7Var;
        }
        xs7 m9798a = new sv7(ls7Var).m9798a();
        m9798a.m4536h(ls7Var);
        throw m9798a;
    }

    /* renamed from: K */
    public static ls7 m16590K(ls7 ls7Var, byte[] bArr, int i, int i2, vr7 vr7Var) {
        ls7 m16585n = ls7Var.m16585n();
        try {
            cv7 m22254b = fu7.m22255a().m22254b(m16585n.getClass());
            m22254b.mo24955g(m16585n, bArr, 0, i2, new kq7(vr7Var));
            m22254b.mo24960b(m16585n);
            return m16585n;
        } catch (sv7 e) {
            xs7 m9798a = e.m9798a();
            m9798a.m4536h(m16585n);
            throw m9798a;
        } catch (xs7 e2) {
            e = e2;
            if (e.m4532l()) {
                e = new xs7(e);
            }
            e.m4536h(m16585n);
            throw e;
        } catch (IOException e3) {
            if (e3.getCause() instanceof xs7) {
                throw ((xs7) e3.getCause());
            }
            xs7 xs7Var = new xs7(e3);
            xs7Var.m4536h(m16585n);
            throw xs7Var;
        } catch (IndexOutOfBoundsException unused) {
            xs7 m4534j = xs7.m4534j();
            m4534j.m4536h(m16585n);
            throw m4534j;
        }
    }

    /* renamed from: m */
    public static ls7 m16586m(Class cls) {
        Map map = zzb;
        ls7 ls7Var = (ls7) map.get(cls);
        if (ls7Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ls7Var = (ls7) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (ls7Var == null) {
            ls7Var = (ls7) ((ls7) gw7.m21171o(cls)).mo1768I(6, null, null);
            if (ls7Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, ls7Var);
        }
        return ls7Var;
    }

    /* renamed from: o */
    public static ls7 m16584o(ls7 ls7Var, yq7 yq7Var) {
        vr7 vr7Var = vr7.f30539c;
        jr7 mo3404v = yq7Var.mo3404v();
        ls7 m16585n = ls7Var.m16585n();
        try {
            cv7 m22254b = fu7.m22255a().m22254b(m16585n.getClass());
            m22254b.mo24954h(m16585n, kr7.m17478A(mo3404v), vr7Var);
            m22254b.mo24960b(m16585n);
            try {
                mo3404v.mo18306B(0);
                m16591J(m16585n);
                m16591J(m16585n);
                return m16585n;
            } catch (xs7 e) {
                e.m4536h(m16585n);
                throw e;
            }
        } catch (sv7 e2) {
            xs7 m9798a = e2.m9798a();
            m9798a.m4536h(m16585n);
            throw m9798a;
        } catch (xs7 e3) {
            e = e3;
            if (e.m4532l()) {
                e = new xs7(e);
            }
            e.m4536h(m16585n);
            throw e;
        } catch (IOException e4) {
            if (e4.getCause() instanceof xs7) {
                throw ((xs7) e4.getCause());
            }
            xs7 xs7Var = new xs7(e4);
            xs7Var.m4536h(m16585n);
            throw xs7Var;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof xs7) {
                throw ((xs7) e5.getCause());
            }
            throw e5;
        }
    }

    /* renamed from: p */
    public static ls7 m16583p(ls7 ls7Var, byte[] bArr) {
        ls7 m16590K = m16590K(ls7Var, bArr, 0, bArr.length, vr7.f30539c);
        m16591J(m16590K);
        return m16590K;
    }

    /* renamed from: q */
    public static ls7 m16582q(ls7 ls7Var, yq7 yq7Var, vr7 vr7Var) {
        jr7 mo3404v = yq7Var.mo3404v();
        ls7 m16585n = ls7Var.m16585n();
        try {
            cv7 m22254b = fu7.m22255a().m22254b(m16585n.getClass());
            m22254b.mo24954h(m16585n, kr7.m17478A(mo3404v), vr7Var);
            m22254b.mo24960b(m16585n);
            try {
                mo3404v.mo18306B(0);
                m16591J(m16585n);
                return m16585n;
            } catch (xs7 e) {
                e.m4536h(m16585n);
                throw e;
            }
        } catch (sv7 e2) {
            xs7 m9798a = e2.m9798a();
            m9798a.m4536h(m16585n);
            throw m9798a;
        } catch (xs7 e3) {
            e = e3;
            if (e.m4532l()) {
                e = new xs7(e);
            }
            e.m4536h(m16585n);
            throw e;
        } catch (IOException e4) {
            if (e4.getCause() instanceof xs7) {
                throw ((xs7) e4.getCause());
            }
            xs7 xs7Var = new xs7(e4);
            xs7Var.m4536h(m16585n);
            throw xs7Var;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof xs7) {
                throw ((xs7) e5.getCause());
            }
            throw e5;
        }
    }

    /* renamed from: r */
    public static ls7 m16581r(ls7 ls7Var, InputStream inputStream, vr7 vr7Var) {
        jr7 m18299g = jr7.m18299g(inputStream, 4096);
        ls7 m16585n = ls7Var.m16585n();
        try {
            cv7 m22254b = fu7.m22255a().m22254b(m16585n.getClass());
            m22254b.mo24954h(m16585n, kr7.m17478A(m18299g), vr7Var);
            m22254b.mo24960b(m16585n);
            m16591J(m16585n);
            return m16585n;
        } catch (sv7 e) {
            xs7 m9798a = e.m9798a();
            m9798a.m4536h(m16585n);
            throw m9798a;
        } catch (xs7 e2) {
            e = e2;
            if (e.m4532l()) {
                e = new xs7(e);
            }
            e.m4536h(m16585n);
            throw e;
        } catch (IOException e3) {
            if (e3.getCause() instanceof xs7) {
                throw ((xs7) e3.getCause());
            }
            xs7 xs7Var = new xs7(e3);
            xs7Var.m4536h(m16585n);
            throw xs7Var;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof xs7) {
                throw ((xs7) e4.getCause());
            }
            throw e4;
        }
    }

    /* renamed from: s */
    public static ls7 m16580s(ls7 ls7Var, byte[] bArr, vr7 vr7Var) {
        ls7 m16590K = m16590K(ls7Var, bArr, 0, bArr.length, vr7Var);
        m16591J(m16590K);
        return m16590K;
    }

    /* renamed from: t */
    public static qs7 m16579t() {
        return ms7.m15789f();
    }

    /* renamed from: u */
    public static qs7 m16578u(qs7 qs7Var) {
        int size = qs7Var.size();
        return qs7Var.mo12227c(size == 0 ? 10 : size + size);
    }

    /* renamed from: v */
    public static ts7 m16577v() {
        return mt7.m15768f();
    }

    /* renamed from: w */
    public static us7 m16576w() {
        return gu7.m21213e();
    }

    /* renamed from: x */
    public static us7 m16575x(us7 us7Var) {
        int size = us7Var.size();
        return us7Var.mo7741b(size == 0 ? 10 : size + size);
    }

    /* renamed from: y */
    public static Object m16574y(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* renamed from: z */
    public static Object m16573z(xt7 xt7Var, String str, Object[] objArr) {
        return new hu7(xt7Var, str, objArr);
    }

    /* renamed from: A */
    public final void m16599A() {
        fu7.m22255a().m22254b(getClass()).mo24960b(this);
        m16598B();
    }

    /* renamed from: B */
    public final void m16598B() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* renamed from: D */
    public final void m16596D(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* renamed from: E */
    public final boolean m16595E() {
        byte byteValue = ((Byte) mo1768I(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo24959c = fu7.m22255a().m22254b(getClass()).mo24959c(this);
        mo1768I(2, true != mo24959c ? null : this, null);
        return mo24959c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public final boolean m16594F() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* renamed from: G */
    public final int m16593G() {
        return fu7.m22255a().m22254b(getClass()).mo24961a(this);
    }

    /* renamed from: H */
    public final fs7 m16592H() {
        return (fs7) mo1768I(5, null, null);
    }

    /* renamed from: I */
    public abstract Object mo1768I(int i, Object obj, Object obj2);

    @Override // com.daaw.xt7
    /* renamed from: b */
    public final /* synthetic */ wt7 mo4515b() {
        return (fs7) mo1768I(5, null, null);
    }

    @Override // com.daaw.yt7
    /* renamed from: c */
    public final /* synthetic */ xt7 mo3229c() {
        return (ls7) mo1768I(6, null, null);
    }

    @Override // com.daaw.xt7
    /* renamed from: e */
    public final void mo4513e(qr7 qr7Var) {
        fu7.m22255a().m22254b(getClass()).mo24956f(this, rr7.m11023l(qr7Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return fu7.m22255a().m22254b(getClass()).mo24957e(this, (ls7) obj);
        }
        return false;
    }

    @Override // com.daaw.hq7
    /* renamed from: f */
    public final int mo16589f(cv7 cv7Var) {
        if (m16594F()) {
            int m16588j = m16588j(cv7Var);
            if (m16588j >= 0) {
                return m16588j;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + m16588j);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int m16588j2 = m16588j(cv7Var);
        if (m16588j2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | m16588j2;
            return m16588j2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + m16588j2);
    }

    public final int hashCode() {
        if (m16594F()) {
            return m16593G();
        }
        int i = this.zza;
        if (i == 0) {
            int m16593G = m16593G();
            this.zza = m16593G;
            return m16593G;
        }
        return i;
    }

    @Override // com.daaw.xt7
    /* renamed from: i */
    public final int mo4512i() {
        int i;
        if (m16594F()) {
            i = m16588j(null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = m16588j(null);
                if (i < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
            }
        }
        return i;
    }

    /* renamed from: j */
    public final int m16588j(cv7 cv7Var) {
        return cv7Var == null ? fu7.m22255a().m22254b(getClass()).zza(this) : cv7Var.zza(this);
    }

    /* renamed from: k */
    public final fs7 m16587k() {
        fs7 fs7Var = (fs7) mo1768I(5, null, null);
        fs7Var.m22317k(this);
        return fs7Var;
    }

    /* renamed from: n */
    public final ls7 m16585n() {
        return (ls7) mo1768I(4, null, null);
    }

    public final String toString() {
        return zt7.m1898a(this, super.toString());
    }
}
