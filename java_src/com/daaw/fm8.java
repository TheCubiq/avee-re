package com.daaw;
/* loaded from: classes2.dex */
public final class fm8 implements dm8 {

    /* renamed from: a */
    public static final j38 f9687a;

    /* renamed from: b */
    public static final j38 f9688b;

    /* renamed from: c */
    public static final j38 f9689c;

    /* renamed from: d */
    public static final j38 f9690d;

    /* renamed from: e */
    public static final j38 f9691e;

    /* renamed from: f */
    public static final j38 f9692f;

    /* renamed from: g */
    public static final j38 f9693g;

    /* renamed from: h */
    public static final j38 f9694h;

    /* renamed from: i */
    public static final j38 f9695i;

    /* renamed from: j */
    public static final j38 f9696j;

    /* renamed from: k */
    public static final j38 f9697k;

    /* renamed from: l */
    public static final j38 f9698l;

    /* renamed from: m */
    public static final j38 f9699m;

    /* renamed from: n */
    public static final j38 f9700n;

    static {
        r28 m11828a = new r28(t18.m9649a("com.google.android.gms.measurement")).m11827b().m11828a();
        f9687a = m11828a.m11823f("measurement.redaction.app_instance_id", true);
        f9688b = m11828a.m11823f("measurement.redaction.client_ephemeral_aiid_generation", true);
        f9689c = m11828a.m11823f("measurement.redaction.config_redacted_fields", true);
        f9690d = m11828a.m11823f("measurement.redaction.device_info", true);
        f9691e = m11828a.m11823f("measurement.redaction.e_tag", true);
        f9692f = m11828a.m11823f("measurement.redaction.enhanced_uid", true);
        f9693g = m11828a.m11823f("measurement.redaction.populate_ephemeral_app_instance_id", true);
        f9694h = m11828a.m11823f("measurement.redaction.google_signals", true);
        f9695i = m11828a.m11823f("measurement.redaction.no_aiid_in_config_request", true);
        f9696j = m11828a.m11823f("measurement.redaction.retain_major_os_version", true);
        f9697k = m11828a.m11823f("measurement.redaction.scion_payload_generator", true);
        f9698l = m11828a.m11823f("measurement.redaction.upload_redacted_fields", true);
        f9699m = m11828a.m11823f("measurement.redaction.upload_subdomain_override", true);
        f9700n = m11828a.m11823f("measurement.redaction.user_id", true);
    }

    @Override // com.daaw.dm8
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.dm8
    public final boolean zzb() {
        return ((Boolean) f9688b.m19095b()).booleanValue();
    }

    @Override // com.daaw.dm8
    public final boolean zzc() {
        return ((Boolean) f9691e.m19095b()).booleanValue();
    }

    @Override // com.daaw.dm8
    public final boolean zzd() {
        return ((Boolean) f9696j.m19095b()).booleanValue();
    }

    @Override // com.daaw.dm8
    public final boolean zze() {
        return ((Boolean) f9697k.m19095b()).booleanValue();
    }
}
