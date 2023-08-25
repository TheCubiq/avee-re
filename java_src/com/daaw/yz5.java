package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class yz5 implements i76 {

    /* renamed from: a */
    public final Context f34296a;

    public yz5(Context context) {
        this.f34296a = context;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 2;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        d06 d06Var;
        if (((Boolean) zzba.zzc().m23658b(g93.f10866w2)).booleanValue()) {
            d06Var = new d06(C3866zk.m2182a(this.f34296a, "com.google.android.gms.permission.AD_ID") == 0);
        } else {
            d06Var = null;
        }
        return s67.m10634i(d06Var);
    }
}
