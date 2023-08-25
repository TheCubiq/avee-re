package com.daaw;
/* loaded from: classes2.dex */
public final class hl8 implements fl8 {
    public static final j38 a;
    public static final j38 b;
    public static final j38 c;
    public static final j38 d;

    static {
        r28 a2 = new r28(t18.a("com.google.android.gms.measurement")).a();
        a = a2.f("measurement.sdk.collection.enable_extend_user_property_size", true);
        b = a2.f("measurement.sdk.collection.last_deep_link_referrer2", true);
        c = a2.f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        d = a2.d("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.daaw.fl8
    public final boolean zza() {
        return ((Boolean) c.b()).booleanValue();
    }
}
