package com.daaw;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class z96 implements i76 {

    /* renamed from: a */
    public final g77 f34625a;

    /* renamed from: b */
    public final Context f34626b;

    /* renamed from: c */
    public final m33 f34627c;

    public z96(m33 m33Var, g77 g77Var, Context context, byte[] bArr) {
        this.f34627c = m33Var;
        this.f34625a = g77Var;
        this.f34626b = context;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 45;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f34625a.mo20112M(new Callable() { // from class: com.daaw.y96
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new aa6(new JSONObject());
            }
        });
    }
}
