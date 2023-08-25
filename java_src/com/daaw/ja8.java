package com.daaw;

import com.daaw.ja8;
import com.daaw.y98;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public abstract class ja8<MessageType extends ja8<MessageType, BuilderType>, BuilderType extends y98<MessageType, BuilderType>> extends w48<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    public qg8 zzc = qg8.c();

    public static ja8 B(Class cls) {
        Map map = zza;
        ja8 ja8Var = (ja8) map.get(cls);
        if (ja8Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ja8Var = (ja8) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (ja8Var == null) {
            ja8Var = (ja8) ((ja8) ih8.j(cls)).C(6, null, null);
            if (ja8Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, ja8Var);
        }
        return ja8Var;
    }

    public static xa8 l() {
        return ma8.f();
    }

    public static ab8 m() {
        return cd8.e();
    }

    public static ab8 n(ab8 ab8Var) {
        int size = ab8Var.size();
        return ab8Var.zze(size == 0 ? 10 : size + size);
    }

    public static db8 o() {
        return re8.e();
    }

    public static db8 p(db8 db8Var) {
        int size = db8Var.size();
        return db8Var.b(size == 0 ? 10 : size + size);
    }

    public static Object r(Method method, Object obj, Object... objArr) {
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

    public static Object s(zd8 zd8Var, String str, Object[] objArr) {
        return new te8(zd8Var, str, objArr);
    }

    public static void v(Class cls, ja8 ja8Var) {
        zza.put(cls, ja8Var);
        ja8Var.t();
    }

    public final y98 A() {
        y98 y98Var = (y98) C(5, null, null);
        y98Var.j(this);
        return y98Var;
    }

    public abstract Object C(int i, Object obj, Object obj2);

    @Override // com.daaw.zd8
    public final /* synthetic */ xd8 a() {
        return (y98) C(5, null, null);
    }

    @Override // com.daaw.zd8
    public final void b(w78 w78Var) {
        pe8.a().b(getClass()).f(this, z78.J(w78Var));
    }

    @Override // com.daaw.zd8
    public final int c() {
        int i;
        if (x()) {
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

    @Override // com.daaw.be8
    public final /* synthetic */ zd8 d() {
        return (ja8) C(6, null, null);
    }

    @Override // com.daaw.w48
    public final int e(ve8 ve8Var) {
        if (x()) {
            int j = j(ve8Var);
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + j);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int j2 = j(ve8Var);
        if (j2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | j2;
            return j2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return pe8.a().b(getClass()).e(this, (ja8) obj);
        }
        return false;
    }

    public final int hashCode() {
        if (x()) {
            return y();
        }
        int i = this.zzb;
        if (i == 0) {
            int y = y();
            this.zzb = y;
            return y;
        }
        return i;
    }

    public final int j(ve8 ve8Var) {
        return ve8Var == null ? pe8.a().b(getClass()).zza(this) : ve8Var.zza(this);
    }

    public final ja8 k() {
        return (ja8) C(4, null, null);
    }

    public final void t() {
        pe8.a().b(getClass()).b(this);
        u();
    }

    public final String toString() {
        return de8.a(this, super.toString());
    }

    public final void u() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void w(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean x() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int y() {
        return pe8.a().b(getClass()).a(this);
    }

    public final y98 z() {
        return (y98) C(5, null, null);
    }
}
