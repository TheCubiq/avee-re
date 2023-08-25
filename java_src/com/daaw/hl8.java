package com.daaw;
/* loaded from: classes2.dex */
public final class hl8 implements fl8 {

    /* renamed from: a */
    public static final j38 f12650a;

    /* renamed from: b */
    public static final j38 f12651b;

    /* renamed from: c */
    public static final j38 f12652c;

    /* renamed from: d */
    public static final j38 f12653d;

    static {
        r28 m11828a = new r28(t18.m9649a("com.google.android.gms.measurement")).m11828a();
        f12650a = m11828a.m11823f("measurement.sdk.collection.enable_extend_user_property_size", true);
        f12651b = m11828a.m11823f("measurement.sdk.collection.last_deep_link_referrer2", true);
        f12652c = m11828a.m11823f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f12653d = m11828a.m11825d("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.daaw.fl8
    public final boolean zza() {
        return ((Boolean) f12652c.m19095b()).booleanValue();
    }
}
