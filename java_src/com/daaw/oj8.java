package com.daaw;
/* loaded from: classes2.dex */
public final class oj8 implements mj8 {

    /* renamed from: a */
    public static final j38 f21595a;

    /* renamed from: b */
    public static final j38 f21596b;

    /* renamed from: c */
    public static final j38 f21597c;

    static {
        r28 m11828a = new r28(t18.m9649a("com.google.android.gms.measurement")).m11827b().m11828a();
        f21595a = m11828a.m11823f("measurement.collection.event_safelist", true);
        f21596b = m11828a.m11823f("measurement.service.store_null_safelist", true);
        f21597c = m11828a.m11823f("measurement.service.store_safelist", true);
    }

    @Override // com.daaw.mj8
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.mj8
    public final boolean zzb() {
        return ((Boolean) f21596b.m19095b()).booleanValue();
    }

    @Override // com.daaw.mj8
    public final boolean zzc() {
        return ((Boolean) f21597c.m19095b()).booleanValue();
    }
}
