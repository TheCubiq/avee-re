package com.daaw;

import android.os.Bundle;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class n56 implements i76 {

    /* renamed from: a */
    public final g77 f19493a;

    /* renamed from: b */
    public final Bundle f19494b;

    public n56(g77 g77Var, Bundle bundle) {
        this.f19493a = g77Var;
        this.f19494b = bundle;
    }

    /* renamed from: a */
    public final /* synthetic */ o56 m15513a() {
        return new o56(this.f19494b);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 30;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f19493a.mo20112M(new Callable() { // from class: com.daaw.m56
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return n56.this.m15513a();
            }
        });
    }
}
