package com.daaw;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public abstract class fw7 {

    /* renamed from: a */
    public final Unsafe f10039a;

    public fw7(Unsafe unsafe) {
        this.f10039a = unsafe;
    }

    /* renamed from: a */
    public abstract byte mo22200a(long j);

    /* renamed from: b */
    public abstract double mo22199b(Object obj, long j);

    /* renamed from: c */
    public abstract float mo22198c(Object obj, long j);

    /* renamed from: d */
    public abstract void mo22197d(long j, byte[] bArr, long j2, long j3);

    /* renamed from: e */
    public abstract void mo22196e(Object obj, long j, boolean z);

    /* renamed from: f */
    public abstract void mo22195f(Object obj, long j, byte b);

    /* renamed from: g */
    public abstract void mo22194g(Object obj, long j, double d);

    /* renamed from: h */
    public abstract void mo22193h(Object obj, long j, float f);

    /* renamed from: i */
    public abstract boolean mo22192i(Object obj, long j);

    /* renamed from: j */
    public final int m22191j(Class cls) {
        return this.f10039a.arrayBaseOffset(cls);
    }

    /* renamed from: k */
    public final int m22190k(Class cls) {
        return this.f10039a.arrayIndexScale(cls);
    }

    /* renamed from: l */
    public final int m22189l(Object obj, long j) {
        return this.f10039a.getInt(obj, j);
    }

    /* renamed from: m */
    public final long m22188m(Object obj, long j) {
        return this.f10039a.getLong(obj, j);
    }

    /* renamed from: n */
    public final long m22187n(Field field) {
        return this.f10039a.objectFieldOffset(field);
    }

    /* renamed from: o */
    public final Object m22186o(Object obj, long j) {
        return this.f10039a.getObject(obj, j);
    }

    /* renamed from: p */
    public final void m22185p(Object obj, long j, int i) {
        this.f10039a.putInt(obj, j, i);
    }

    /* renamed from: q */
    public final void m22184q(Object obj, long j, long j2) {
        this.f10039a.putLong(obj, j, j2);
    }

    /* renamed from: r */
    public final void m22183r(Object obj, long j, Object obj2) {
        this.f10039a.putObject(obj, j, obj2);
    }
}
