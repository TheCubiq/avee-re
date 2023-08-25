package com.daaw;
/* loaded from: classes.dex */
public final class xz7 implements wz7, qz7 {
    public static final xz7 b = new xz7(null);
    public final Object a;

    public xz7(Object obj) {
        this.a = obj;
    }

    public static wz7 a(Object obj) {
        e08.a(obj, "instance cannot be null");
        return new xz7(obj);
    }

    public static wz7 b(Object obj) {
        return obj == null ? b : new xz7(obj);
    }

    @Override // com.daaw.m08
    public final Object zzb() {
        return this.a;
    }
}
