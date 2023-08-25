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
    public qg8 zzc = qg8.m12544c();

    /* renamed from: B */
    public static ja8 m18674B(Class cls) {
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
            ja8Var = (ja8) ((ja8) ih8.m19803j(cls)).mo4853C(6, null, null);
            if (ja8Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, ja8Var);
        }
        return ja8Var;
    }

    /* renamed from: l */
    public static xa8 m18670l() {
        return ma8.m16125f();
    }

    /* renamed from: m */
    public static ab8 m18669m() {
        return cd8.m25415e();
    }

    /* renamed from: n */
    public static ab8 m18668n(ab8 ab8Var) {
        int size = ab8Var.size();
        return ab8Var.zze(size == 0 ? 10 : size + size);
    }

    /* renamed from: o */
    public static db8 m18667o() {
        return re8.m11356e();
    }

    /* renamed from: p */
    public static db8 m18666p(db8 db8Var) {
        int size = db8Var.size();
        return db8Var.mo5295b(size == 0 ? 10 : size + size);
    }

    /* renamed from: r */
    public static Object m18665r(Method method, Object obj, Object... objArr) {
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

    /* renamed from: s */
    public static Object m18664s(zd8 zd8Var, String str, Object[] objArr) {
        return new te8(zd8Var, str, objArr);
    }

    /* renamed from: v */
    public static void m18661v(Class cls, ja8 ja8Var) {
        zza.put(cls, ja8Var);
        ja8Var.m18663t();
    }

    /* renamed from: A */
    public final y98 m18675A() {
        y98 y98Var = (y98) mo4853C(5, null, null);
        y98Var.m3977j(this);
        return y98Var;
    }

    /* renamed from: C */
    public abstract Object mo4853C(int i, Object obj, Object obj2);

    @Override // com.daaw.zd8
    /* renamed from: a */
    public final /* synthetic */ xd8 mo2463a() {
        return (y98) mo4853C(5, null, null);
    }

    @Override // com.daaw.zd8
    /* renamed from: b */
    public final void mo2462b(w78 w78Var) {
        pe8.m13418a().m13417b(getClass()).mo7200f(this, z78.m2669J(w78Var));
    }

    @Override // com.daaw.zd8
    /* renamed from: c */
    public final int mo2461c() {
        int i;
        if (m18659x()) {
            i = m18672j(null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = m18672j(null);
                if (i < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
            }
        }
        return i;
    }

    @Override // com.daaw.be8
    /* renamed from: d */
    public final /* synthetic */ zd8 mo18673d() {
        return (ja8) mo4853C(6, null, null);
    }

    @Override // com.daaw.w48
    /* renamed from: e */
    public final int mo6533e(ve8 ve8Var) {
        if (m18659x()) {
            int m18672j = m18672j(ve8Var);
            if (m18672j >= 0) {
                return m18672j;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + m18672j);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int m18672j2 = m18672j(ve8Var);
        if (m18672j2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | m18672j2;
            return m18672j2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + m18672j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return pe8.m13418a().m13417b(getClass()).mo7201e(this, (ja8) obj);
        }
        return false;
    }

    public final int hashCode() {
        if (m18659x()) {
            return m18658y();
        }
        int i = this.zzb;
        if (i == 0) {
            int m18658y = m18658y();
            this.zzb = m18658y;
            return m18658y;
        }
        return i;
    }

    /* renamed from: j */
    public final int m18672j(ve8 ve8Var) {
        return ve8Var == null ? pe8.m13418a().m13417b(getClass()).zza(this) : ve8Var.zza(this);
    }

    /* renamed from: k */
    public final ja8 m18671k() {
        return (ja8) mo4853C(4, null, null);
    }

    /* renamed from: t */
    public final void m18663t() {
        pe8.m13418a().m13417b(getClass()).mo7204b(this);
        m18662u();
    }

    public final String toString() {
        return de8.m24440a(this, super.toString());
    }

    /* renamed from: u */
    public final void m18662u() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* renamed from: w */
    public final void m18660w(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* renamed from: x */
    public final boolean m18659x() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* renamed from: y */
    public final int m18658y() {
        return pe8.m13418a().m13417b(getClass()).mo7205a(this);
    }

    /* renamed from: z */
    public final y98 m18657z() {
        return (y98) mo4853C(5, null, null);
    }
}
