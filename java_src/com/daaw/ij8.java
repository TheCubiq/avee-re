package com.daaw;
/* loaded from: classes2.dex */
public final class ij8 implements gj8 {

    /* renamed from: a */
    public static final j38 f13689a;

    /* renamed from: b */
    public static final j38 f13690b;

    /* renamed from: c */
    public static final j38 f13691c;

    /* renamed from: d */
    public static final j38 f13692d;

    static {
        r28 m11828a = new r28(t18.m9649a("com.google.android.gms.measurement")).m11828a();
        f13689a = m11828a.m11823f("measurement.client.consent_state_v1", true);
        f13690b = m11828a.m11823f("measurement.client.3p_consent_state_v1", true);
        f13691c = m11828a.m11823f("measurement.service.consent_state_v1_W36", true);
        f13692d = m11828a.m11825d("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.daaw.gj8
    public final long zza() {
        return ((Long) f13692d.m19095b()).longValue();
    }
}
