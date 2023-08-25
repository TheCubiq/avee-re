package com.daaw;

import android.os.Bundle;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class n56 implements i76 {
    public final g77 a;
    public final Bundle b;

    public n56(g77 g77Var, Bundle bundle) {
        this.a = g77Var;
        this.b = bundle;
    }

    public final /* synthetic */ o56 a() {
        return new o56(this.b);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 30;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.a.M(new Callable() { // from class: com.daaw.m56
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return n56.this.a();
            }
        });
    }
}
