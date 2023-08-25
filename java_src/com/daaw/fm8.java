package com.daaw;
/* loaded from: classes2.dex */
public final class fm8 implements dm8 {
    public static final j38 a;
    public static final j38 b;
    public static final j38 c;
    public static final j38 d;
    public static final j38 e;
    public static final j38 f;
    public static final j38 g;
    public static final j38 h;
    public static final j38 i;
    public static final j38 j;
    public static final j38 k;
    public static final j38 l;
    public static final j38 m;
    public static final j38 n;

    static {
        r28 a2 = new r28(t18.a("com.google.android.gms.measurement")).b().a();
        a = a2.f("measurement.redaction.app_instance_id", true);
        b = a2.f("measurement.redaction.client_ephemeral_aiid_generation", true);
        c = a2.f("measurement.redaction.config_redacted_fields", true);
        d = a2.f("measurement.redaction.device_info", true);
        e = a2.f("measurement.redaction.e_tag", true);
        f = a2.f("measurement.redaction.enhanced_uid", true);
        g = a2.f("measurement.redaction.populate_ephemeral_app_instance_id", true);
        h = a2.f("measurement.redaction.google_signals", true);
        i = a2.f("measurement.redaction.no_aiid_in_config_request", true);
        j = a2.f("measurement.redaction.retain_major_os_version", true);
        k = a2.f("measurement.redaction.scion_payload_generator", true);
        l = a2.f("measurement.redaction.upload_redacted_fields", true);
        m = a2.f("measurement.redaction.upload_subdomain_override", true);
        n = a2.f("measurement.redaction.user_id", true);
    }

    @Override // com.daaw.dm8
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.dm8
    public final boolean zzb() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // com.daaw.dm8
    public final boolean zzc() {
        return ((Boolean) e.b()).booleanValue();
    }

    @Override // com.daaw.dm8
    public final boolean zzd() {
        return ((Boolean) j.b()).booleanValue();
    }

    @Override // com.daaw.dm8
    public final boolean zze() {
        return ((Boolean) k.b()).booleanValue();
    }
}
