package com.daaw;
/* loaded from: classes2.dex */
public final class xm8 implements vm8 {
    public static final j38 a = new r28(t18.a("com.google.android.gms.measurement")).b().a().f("measurement.sessionid.enable_client_session_id", true);

    @Override // com.daaw.vm8
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.vm8
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }
}
