package com.daaw;
/* loaded from: classes2.dex */
public final class jk8 implements hk8 {
    public static final j38 a;
    public static final j38 b;
    public static final j38 c;
    public static final j38 d;

    static {
        r28 a2 = new r28(t18.a("com.google.android.gms.measurement")).a();
        a = a2.f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        b = a2.f("measurement.audience.refresh_event_count_filters_timestamp", false);
        c = a2.f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        d = a2.f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.daaw.hk8
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.hk8
    public final boolean zzb() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // com.daaw.hk8
    public final boolean zzc() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // com.daaw.hk8
    public final boolean zzd() {
        return ((Boolean) d.b()).booleanValue();
    }
}
