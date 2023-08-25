package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class ga6 implements i76 {
    public final g77 a;
    public final String b;
    public final ez3 c;

    public ga6(ez3 ez3Var, g77 g77Var, String str, byte[] bArr) {
        this.c = ez3Var;
        this.a = g77Var;
        this.b = str;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 47;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        final f77 i = s67.i(null);
        if (((Boolean) zzba.zzc().b(g93.l5)).booleanValue()) {
            i = s67.i(null);
        }
        final f77 i2 = s67.i(null);
        return s67.d(i, i2).a(new Callable() { // from class: com.daaw.fa6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ha6((String) f77.this.get(), (String) i2.get());
            }
        }, z04.a);
    }
}
