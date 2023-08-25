package com.daaw;
/* loaded from: classes2.dex */
public final class jk8 implements hk8 {

    /* renamed from: a */
    public static final j38 f15171a;

    /* renamed from: b */
    public static final j38 f15172b;

    /* renamed from: c */
    public static final j38 f15173c;

    /* renamed from: d */
    public static final j38 f15174d;

    static {
        r28 m11828a = new r28(t18.m9649a("com.google.android.gms.measurement")).m11828a();
        f15171a = m11828a.m11823f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f15172b = m11828a.m11823f("measurement.audience.refresh_event_count_filters_timestamp", false);
        f15173c = m11828a.m11823f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f15174d = m11828a.m11823f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.daaw.hk8
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.hk8
    public final boolean zzb() {
        return ((Boolean) f15172b.m19095b()).booleanValue();
    }

    @Override // com.daaw.hk8
    public final boolean zzc() {
        return ((Boolean) f15173c.m19095b()).booleanValue();
    }

    @Override // com.daaw.hk8
    public final boolean zzd() {
        return ((Boolean) f15174d.m19095b()).booleanValue();
    }
}
