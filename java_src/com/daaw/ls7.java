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
    public uv7 zzc = uv7.c();

    public static void C(Class cls, ls7 ls7Var) {
        ls7Var.B();
        zzb.put(cls, ls7Var);
    }

    public static ls7 J(ls7 ls7Var) {
        if (ls7Var == null || ls7Var.E()) {
            return ls7Var;
        }
        xs7 a = new sv7(ls7Var).a();
        a.h(ls7Var);
        throw a;
    }

    public static ls7 K(ls7 ls7Var, byte[] bArr, int i, int i2, vr7 vr7Var) {
        ls7 n = ls7Var.n();
        try {
            cv7 b = fu7.a().b(n.getClass());
            b.g(n, bArr, 0, i2, new kq7(vr7Var));
            b.b(n);
            return n;
        } catch (sv7 e) {
            xs7 a = e.a();
            a.h(n);
            throw a;
        } catch (xs7 e2) {
            e = e2;
            if (e.l()) {
                e = new xs7(e);
            }
            e.h(n);
            throw e;
        } catch (IOException e3) {
            if (e3.getCause() instanceof xs7) {
                throw ((xs7) e3.getCause());
            }
            xs7 xs7Var = new xs7(e3);
            xs7Var.h(n);
            throw xs7Var;
        } catch (IndexOutOfBoundsException unused) {
            xs7 j = xs7.j();
            j.h(n);
            throw j;
        }
    }

    public static ls7 m(Class cls) {
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
            ls7Var = (ls7) ((ls7) gw7.o(cls)).I(6, null, null);
            if (ls7Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, ls7Var);
        }
        return ls7Var;
    }

    public static ls7 o(ls7 ls7Var, yq7 yq7Var) {
        vr7 vr7Var = vr7.c;
        jr7 v = yq7Var.v();
        ls7 n = ls7Var.n();
        try {
            cv7 b = fu7.a().b(n.getClass());
            b.h(n, kr7.A(v), vr7Var);
            b.b(n);
            try {
                v.B(0);
                J(n);
                J(n);
                return n;
            } catch (xs7 e) {
                e.h(n);
                throw e;
            }
        } catch (sv7 e2) {
            xs7 a = e2.a();
            a.h(n);
            throw a;
        } catch (xs7 e3) {
            e = e3;
            if (e.l()) {
                e = new xs7(e);
            }
            e.h(n);
            throw e;
        } catch (IOException e4) {
            if (e4.getCause() instanceof xs7) {
                throw ((xs7) e4.getCause());
            }
            xs7 xs7Var = new xs7(e4);
            xs7Var.h(n);
            throw xs7Var;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof xs7) {
                throw ((xs7) e5.getCause());
            }
            throw e5;
        }
    }

    public static ls7 p(ls7 ls7Var, byte[] bArr) {
        ls7 K = K(ls7Var, bArr, 0, bArr.length, vr7.c);
        J(K);
        return K;
    }

    public static ls7 q(ls7 ls7Var, yq7 yq7Var, vr7 vr7Var) {
        jr7 v = yq7Var.v();
        ls7 n = ls7Var.n();
        try {
            cv7 b = fu7.a().b(n.getClass());
            b.h(n, kr7.A(v), vr7Var);
            b.b(n);
            try {
                v.B(0);
                J(n);
                return n;
            } catch (xs7 e) {
                e.h(n);
                throw e;
            }
        } catch (sv7 e2) {
            xs7 a = e2.a();
            a.h(n);
            throw a;
        } catch (xs7 e3) {
            e = e3;
            if (e.l()) {
                e = new xs7(e);
            }
            e.h(n);
            throw e;
        } catch (IOException e4) {
            if (e4.getCause() instanceof xs7) {
                throw ((xs7) e4.getCause());
            }
            xs7 xs7Var = new xs7(e4);
            xs7Var.h(n);
            throw xs7Var;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof xs7) {
                throw ((xs7) e5.getCause());
            }
            throw e5;
        }
    }

    public static ls7 r(ls7 ls7Var, InputStream inputStream, vr7 vr7Var) {
        jr7 g = jr7.g(inputStream, 4096);
        ls7 n = ls7Var.n();
        try {
            cv7 b = fu7.a().b(n.getClass());
            b.h(n, kr7.A(g), vr7Var);
            b.b(n);
            J(n);
            return n;
        } catch (sv7 e) {
            xs7 a = e.a();
            a.h(n);
            throw a;
        } catch (xs7 e2) {
            e = e2;
            if (e.l()) {
                e = new xs7(e);
            }
            e.h(n);
            throw e;
        } catch (IOException e3) {
            if (e3.getCause() instanceof xs7) {
                throw ((xs7) e3.getCause());
            }
            xs7 xs7Var = new xs7(e3);
            xs7Var.h(n);
            throw xs7Var;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof xs7) {
                throw ((xs7) e4.getCause());
            }
            throw e4;
        }
    }

    public static ls7 s(ls7 ls7Var, byte[] bArr, vr7 vr7Var) {
        ls7 K = K(ls7Var, bArr, 0, bArr.length, vr7Var);
        J(K);
        return K;
    }

    public static qs7 t() {
        return ms7.f();
    }

    public static qs7 u(qs7 qs7Var) {
        int size = qs7Var.size();
        return qs7Var.c(size == 0 ? 10 : size + size);
    }

    public static ts7 v() {
        return mt7.f();
    }

    public static us7 w() {
        return gu7.e();
    }

    public static us7 x(us7 us7Var) {
        int size = us7Var.size();
        return us7Var.b(size == 0 ? 10 : size + size);
    }

    public static Object y(Method method, Object obj, Object... objArr) {
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

    public static Object z(xt7 xt7Var, String str, Object[] objArr) {
        return new hu7(xt7Var, str, objArr);
    }

    public final void A() {
        fu7.a().b(getClass()).b(this);
        B();
    }

    public final void B() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void D(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean E() {
        byte byteValue = ((Byte) I(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c = fu7.a().b(getClass()).c(this);
        I(2, true != c ? null : this, null);
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean F() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int G() {
        return fu7.a().b(getClass()).a(this);
    }

    public final fs7 H() {
        return (fs7) I(5, null, null);
    }

    public abstract Object I(int i, Object obj, Object obj2);

    @Override // com.daaw.xt7
    public final /* synthetic */ wt7 b() {
        return (fs7) I(5, null, null);
    }

    @Override // com.daaw.yt7
    public final /* synthetic */ xt7 c() {
        return (ls7) I(6, null, null);
    }

    @Override // com.daaw.xt7
    public final void e(qr7 qr7Var) {
        fu7.a().b(getClass()).f(this, rr7.l(qr7Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return fu7.a().b(getClass()).e(this, (ls7) obj);
        }
        return false;
    }

    @Override // com.daaw.hq7
    public final int f(cv7 cv7Var) {
        if (F()) {
            int j = j(cv7Var);
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + j);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int j2 = j(cv7Var);
        if (j2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | j2;
            return j2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + j2);
    }

    public final int hashCode() {
        if (F()) {
            return G();
        }
        int i = this.zza;
        if (i == 0) {
            int G = G();
            this.zza = G;
            return G;
        }
        return i;
    }

    @Override // com.daaw.xt7
    public final int i() {
        int i;
        if (F()) {
            i = j(null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = j(null);
                if (i < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
            }
        }
        return i;
    }

    public final int j(cv7 cv7Var) {
        return cv7Var == null ? fu7.a().b(getClass()).zza(this) : cv7Var.zza(this);
    }

    public final fs7 k() {
        fs7 fs7Var = (fs7) I(5, null, null);
        fs7Var.k(this);
        return fs7Var;
    }

    public final ls7 n() {
        return (ls7) I(4, null, null);
    }

    public final String toString() {
        return zt7.a(this, super.toString());
    }
}
