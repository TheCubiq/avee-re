package com.daaw;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class h96 implements i76 {
    public final Context a;
    public final String b;
    public final g77 c;

    public h96(ou3 ou3Var, Context context, String str, g77 g77Var) {
        this.a = context;
        this.b = str;
        this.c = g77Var;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 42;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.c.M(new Callable() { // from class: com.daaw.g96
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new i96(new JSONObject());
            }
        });
    }
}
