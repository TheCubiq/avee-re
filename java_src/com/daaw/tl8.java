package com.daaw;
/* loaded from: classes2.dex */
public final class tl8 implements rl8 {

    /* renamed from: a */
    public static final j38 f27850a;

    /* renamed from: b */
    public static final j38 f27851b;

    /* renamed from: c */
    public static final j38 f27852c;

    /* renamed from: d */
    public static final j38 f27853d;

    /* renamed from: e */
    public static final j38 f27854e;

    static {
        r28 m11828a = new r28(t18.m9649a("com.google.android.gms.measurement")).m11828a();
        f27850a = m11828a.m11823f("measurement.test.boolean_flag", false);
        f27851b = m11828a.m11826c("measurement.test.double_flag", -3.0d);
        f27852c = m11828a.m11825d("measurement.test.int_flag", -2L);
        f27853d = m11828a.m11825d("measurement.test.long_flag", -1L);
        f27854e = m11828a.m11824e("measurement.test.string_flag", "---");
    }

    @Override // com.daaw.rl8
    public final double zza() {
        return ((Double) f27851b.m19095b()).doubleValue();
    }

    @Override // com.daaw.rl8
    public final long zzb() {
        return ((Long) f27852c.m19095b()).longValue();
    }

    @Override // com.daaw.rl8
    public final long zzc() {
        return ((Long) f27853d.m19095b()).longValue();
    }

    @Override // com.daaw.rl8
    public final String zzd() {
        return (String) f27854e.m19095b();
    }

    @Override // com.daaw.rl8
    public final boolean zze() {
        return ((Boolean) f27850a.m19095b()).booleanValue();
    }
}
