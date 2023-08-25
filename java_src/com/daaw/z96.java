package com.daaw;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class z96 implements i76 {
    public final g77 a;
    public final Context b;
    public final m33 c;

    public z96(m33 m33Var, g77 g77Var, Context context, byte[] bArr) {
        this.c = m33Var;
        this.a = g77Var;
        this.b = context;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 45;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.a.M(new Callable() { // from class: com.daaw.y96
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new aa6(new JSONObject());
            }
        });
    }
}
