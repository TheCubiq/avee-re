package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class yz5 implements i76 {
    public final Context a;

    public yz5(Context context) {
        this.a = context;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 2;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        d06 d06Var;
        if (((Boolean) zzba.zzc().b(g93.w2)).booleanValue()) {
            d06Var = new d06(zk.a(this.a, "com.google.android.gms.permission.AD_ID") == 0);
        } else {
            d06Var = null;
        }
        return s67.i(d06Var);
    }
}
