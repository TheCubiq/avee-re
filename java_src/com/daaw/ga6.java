package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class ga6 implements i76 {

    /* renamed from: a */
    public final g77 f10978a;

    /* renamed from: b */
    public final String f10979b;

    /* renamed from: c */
    public final ez3 f10980c;

    public ga6(ez3 ez3Var, g77 g77Var, String str, byte[] bArr) {
        this.f10980c = ez3Var;
        this.f10978a = g77Var;
        this.f10979b = str;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 47;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        final f77 m10634i = s67.m10634i(null);
        if (((Boolean) zzba.zzc().m23658b(g93.f10748l5)).booleanValue()) {
            m10634i = s67.m10634i(null);
        }
        final f77 m10634i2 = s67.m10634i(null);
        return s67.m10639d(m10634i, m10634i2).m11710a(new Callable() { // from class: com.daaw.fa6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ha6((String) f77.this.get(), (String) m10634i2.get());
            }
        }, z04.f34305a);
    }
}
