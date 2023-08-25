package com.daaw;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* loaded from: classes2.dex */
public abstract class gh8 {

    /* renamed from: a */
    public final Unsafe f11285a;

    public gh8(Unsafe unsafe) {
        this.f11285a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo21605a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo21604b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo21603c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo21602d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo21601e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo21600f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo21599g(Object obj, long j);

    /* renamed from: h */
    public final int m21598h(Class cls) {
        return this.f11285a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int m21597i(Class cls) {
        return this.f11285a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int m21596j(Object obj, long j) {
        return this.f11285a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long m21595k(Object obj, long j) {
        return this.f11285a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long m21594l(Field field) {
        return this.f11285a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object m21593m(Object obj, long j) {
        return this.f11285a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void m21592n(Object obj, long j, int i) {
        this.f11285a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void m21591o(Object obj, long j, long j2) {
        this.f11285a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void m21590p(Object obj, long j, Object obj2) {
        this.f11285a.putObject(obj, j, obj2);
    }
}
