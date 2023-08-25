package com.daaw;
/* loaded from: classes2.dex */
public final class oj8 implements mj8 {
    public static final j38 a;
    public static final j38 b;
    public static final j38 c;

    static {
        r28 a2 = new r28(t18.a("com.google.android.gms.measurement")).b().a();
        a = a2.f("measurement.collection.event_safelist", true);
        b = a2.f("measurement.service.store_null_safelist", true);
        c = a2.f("measurement.service.store_safelist", true);
    }

    @Override // com.daaw.mj8
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.mj8
    public final boolean zzb() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // com.daaw.mj8
    public final boolean zzc() {
        return ((Boolean) c.b()).booleanValue();
    }
}
