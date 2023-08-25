package com.daaw;
/* loaded from: classes2.dex */
public final class ij8 implements gj8 {
    public static final j38 a;
    public static final j38 b;
    public static final j38 c;
    public static final j38 d;

    static {
        r28 a2 = new r28(t18.a("com.google.android.gms.measurement")).a();
        a = a2.f("measurement.client.consent_state_v1", true);
        b = a2.f("measurement.client.3p_consent_state_v1", true);
        c = a2.f("measurement.service.consent_state_v1_W36", true);
        d = a2.d("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.daaw.gj8
    public final long zza() {
        return ((Long) d.b()).longValue();
    }
}
