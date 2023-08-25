package com.daaw;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* loaded from: classes2.dex */
public abstract class gh8 {
    public final Unsafe a;

    public gh8(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract double a(Object obj, long j);

    public abstract float b(Object obj, long j);

    public abstract void c(Object obj, long j, boolean z);

    public abstract void d(Object obj, long j, byte b);

    public abstract void e(Object obj, long j, double d);

    public abstract void f(Object obj, long j, float f);

    public abstract boolean g(Object obj, long j);

    public final int h(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int i(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public final int j(Object obj, long j) {
        return this.a.getInt(obj, j);
    }

    public final long k(Object obj, long j) {
        return this.a.getLong(obj, j);
    }

    public final long l(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public final Object m(Object obj, long j) {
        return this.a.getObject(obj, j);
    }

    public final void n(Object obj, long j, int i) {
        this.a.putInt(obj, j, i);
    }

    public final void o(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }

    public final void p(Object obj, long j, Object obj2) {
        this.a.putObject(obj, j, obj2);
    }
}
