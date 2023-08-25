package com.daaw;
/* loaded from: classes2.dex */
public final class bl8 implements zk8 {
    public static final j38 a;
    public static final j38 b;
    public static final j38 c;
    public static final j38 d;
    public static final j38 e;

    static {
        r28 a2 = new r28(t18.a("com.google.android.gms.measurement")).b().a();
        a = a2.f("measurement.client.global_params", true);
        b = a2.f("measurement.service.global_params_in_payload", true);
        c = a2.f("measurement.service.clear_global_params_on_uninstall", true);
        d = a2.f("measurement.service.global_params", true);
        e = a2.d("measurement.id.service.global_params", 0L);
    }

    @Override // com.daaw.zk8
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.zk8
    public final boolean zzb() {
        return ((Boolean) c.b()).booleanValue();
    }
}
