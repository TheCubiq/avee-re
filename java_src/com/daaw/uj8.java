package com.daaw;
/* loaded from: classes2.dex */
public final class uj8 implements sj8 {
    public static final j38 a = new r28(t18.a("com.google.android.gms.measurement")).a().f("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.daaw.sj8
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.sj8
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }
}
