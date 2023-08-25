package com.daaw;
/* loaded from: classes2.dex */
public final class nl8 implements ll8 {
    public static final j38 a;
    public static final j38 b;
    public static final j38 c;
    public static final j38 d;

    static {
        r28 a2 = new r28(t18.a("com.google.android.gms.measurement")).a();
        a = a2.d("measurement.id.lifecycle.app_in_background_parameter", 0L);
        b = a2.f("measurement.lifecycle.app_backgrounded_tracking", true);
        c = a2.f("measurement.lifecycle.app_in_background_parameter", false);
        d = a2.d("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // com.daaw.ll8
    public final boolean zza() {
        return ((Boolean) c.b()).booleanValue();
    }
}
