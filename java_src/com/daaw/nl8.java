package com.daaw;
/* loaded from: classes2.dex */
public final class nl8 implements ll8 {

    /* renamed from: a */
    public static final j38 f20242a;

    /* renamed from: b */
    public static final j38 f20243b;

    /* renamed from: c */
    public static final j38 f20244c;

    /* renamed from: d */
    public static final j38 f20245d;

    static {
        r28 m11828a = new r28(t18.m9649a("com.google.android.gms.measurement")).m11828a();
        f20242a = m11828a.m11825d("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f20243b = m11828a.m11823f("measurement.lifecycle.app_backgrounded_tracking", true);
        f20244c = m11828a.m11823f("measurement.lifecycle.app_in_background_parameter", false);
        f20245d = m11828a.m11825d("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // com.daaw.ll8
    public final boolean zza() {
        return ((Boolean) f20244c.m19095b()).booleanValue();
    }
}
