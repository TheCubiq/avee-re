package com.daaw;
/* loaded from: classes2.dex */
public final class tl8 implements rl8 {
    public static final j38 a;
    public static final j38 b;
    public static final j38 c;
    public static final j38 d;
    public static final j38 e;

    static {
        r28 a2 = new r28(t18.a("com.google.android.gms.measurement")).a();
        a = a2.f("measurement.test.boolean_flag", false);
        b = a2.c("measurement.test.double_flag", -3.0d);
        c = a2.d("measurement.test.int_flag", -2L);
        d = a2.d("measurement.test.long_flag", -1L);
        e = a2.e("measurement.test.string_flag", "---");
    }

    @Override // com.daaw.rl8
    public final double zza() {
        return ((Double) b.b()).doubleValue();
    }

    @Override // com.daaw.rl8
    public final long zzb() {
        return ((Long) c.b()).longValue();
    }

    @Override // com.daaw.rl8
    public final long zzc() {
        return ((Long) d.b()).longValue();
    }

    @Override // com.daaw.rl8
    public final String zzd() {
        return (String) e.b();
    }

    @Override // com.daaw.rl8
    public final boolean zze() {
        return ((Boolean) a.b()).booleanValue();
    }
}
