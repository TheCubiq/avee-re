package com.daaw;
/* loaded from: classes2.dex */
public final class bl8 implements zk8 {

    /* renamed from: a */
    public static final j38 f4900a;

    /* renamed from: b */
    public static final j38 f4901b;

    /* renamed from: c */
    public static final j38 f4902c;

    /* renamed from: d */
    public static final j38 f4903d;

    /* renamed from: e */
    public static final j38 f4904e;

    static {
        r28 m11828a = new r28(t18.m9649a("com.google.android.gms.measurement")).m11827b().m11828a();
        f4900a = m11828a.m11823f("measurement.client.global_params", true);
        f4901b = m11828a.m11823f("measurement.service.global_params_in_payload", true);
        f4902c = m11828a.m11823f("measurement.service.clear_global_params_on_uninstall", true);
        f4903d = m11828a.m11823f("measurement.service.global_params", true);
        f4904e = m11828a.m11825d("measurement.id.service.global_params", 0L);
    }

    @Override // com.daaw.zk8
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.zk8
    public final boolean zzb() {
        return ((Boolean) f4902c.m19095b()).booleanValue();
    }
}
