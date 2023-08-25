package com.daaw;

import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class ka6 implements i76 {
    public final g77 a;
    public final List b;
    public final n83 c;

    public ka6(n83 n83Var, g77 g77Var, List list, byte[] bArr) {
        this.c = n83Var;
        this.a = g77Var;
        this.b = list;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 48;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.a.M(new Callable() { // from class: com.daaw.ja6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new la6(ka6.this.b);
            }
        });
    }
}
