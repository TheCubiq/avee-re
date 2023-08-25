package com.daaw;
/* loaded from: classes2.dex */
public final class cn8 implements bn8 {

    /* renamed from: a */
    public static final j38 f5974a;

    /* renamed from: b */
    public static final j38 f5975b;

    /* renamed from: c */
    public static final j38 f5976c;

    /* renamed from: d */
    public static final j38 f5977d;

    /* renamed from: e */
    public static final j38 f5978e;

    static {
        r28 m11828a = new r28(t18.m9649a("com.google.android.gms.measurement")).m11827b().m11828a();
        f5974a = m11828a.m11823f("measurement.collection.enable_session_stitching_token.client.dev", true);
        f5975b = m11828a.m11823f("measurement.session_stitching_token_enabled", false);
        f5976c = m11828a.m11823f("measurement.collection.enable_session_stitching_token.service", false);
        f5977d = m11828a.m11823f("measurement.collection.enable_session_stitching_token.service_new", true);
        f5978e = m11828a.m11825d("measurement.id.collection.enable_session_stitching_token.client.dev", 0L);
    }

    @Override // com.daaw.bn8
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.bn8
    public final boolean zzb() {
        return ((Boolean) f5974a.m19095b()).booleanValue();
    }

    @Override // com.daaw.bn8
    public final boolean zzc() {
        return ((Boolean) f5975b.m19095b()).booleanValue();
    }

    @Override // com.daaw.bn8
    public final boolean zzd() {
        return ((Boolean) f5976c.m19095b()).booleanValue();
    }

    @Override // com.daaw.bn8
    public final boolean zze() {
        return ((Boolean) f5977d.m19095b()).booleanValue();
    }
}
