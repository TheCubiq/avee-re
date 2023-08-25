package com.daaw;

import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class ka6 implements i76 {

    /* renamed from: a */
    public final g77 f16085a;

    /* renamed from: b */
    public final List f16086b;

    /* renamed from: c */
    public final n83 f16087c;

    public ka6(n83 n83Var, g77 g77Var, List list, byte[] bArr) {
        this.f16087c = n83Var;
        this.f16085a = g77Var;
        this.f16086b = list;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 48;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f16085a.mo20112M(new Callable() { // from class: com.daaw.ja6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new la6(ka6.this.f16086b);
            }
        });
    }
}
