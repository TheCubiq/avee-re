package com.daaw;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class h96 implements i76 {

    /* renamed from: a */
    public final Context f12212a;

    /* renamed from: b */
    public final String f12213b;

    /* renamed from: c */
    public final g77 f12214c;

    public h96(ou3 ou3Var, Context context, String str, g77 g77Var) {
        this.f12212a = context;
        this.f12213b = str;
        this.f12214c = g77Var;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 42;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f12214c.mo20112M(new Callable() { // from class: com.daaw.g96
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new i96(new JSONObject());
            }
        });
    }
}
