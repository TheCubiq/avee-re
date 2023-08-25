package com.daaw;
/* loaded from: classes2.dex */
public final class cn8 implements bn8 {
    public static final j38 a;
    public static final j38 b;
    public static final j38 c;
    public static final j38 d;
    public static final j38 e;

    static {
        r28 a2 = new r28(t18.a("com.google.android.gms.measurement")).b().a();
        a = a2.f("measurement.collection.enable_session_stitching_token.client.dev", true);
        b = a2.f("measurement.session_stitching_token_enabled", false);
        c = a2.f("measurement.collection.enable_session_stitching_token.service", false);
        d = a2.f("measurement.collection.enable_session_stitching_token.service_new", true);
        e = a2.d("measurement.id.collection.enable_session_stitching_token.client.dev", 0L);
    }

    @Override // com.daaw.bn8
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.bn8
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // com.daaw.bn8
    public final boolean zzc() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // com.daaw.bn8
    public final boolean zzd() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // com.daaw.bn8
    public final boolean zze() {
        return ((Boolean) d.b()).booleanValue();
    }
}
