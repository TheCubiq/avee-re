package com.daaw;
/* loaded from: classes.dex */
public final class xz7 implements wz7, qz7 {

    /* renamed from: b */
    public static final xz7 f33141b = new xz7(null);

    /* renamed from: a */
    public final Object f33142a;

    public xz7(Object obj) {
        this.f33142a = obj;
    }

    /* renamed from: a */
    public static wz7 m4374a(Object obj) {
        e08.m23802a(obj, "instance cannot be null");
        return new xz7(obj);
    }

    /* renamed from: b */
    public static wz7 m4373b(Object obj) {
        return obj == null ? f33141b : new xz7(obj);
    }

    @Override // com.daaw.m08
    public final Object zzb() {
        return this.f33142a;
    }
}
