package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzcz;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzaw;
/* loaded from: classes.dex */
public final class yp2 extends zzcz {

    /* renamed from: p */
    public final /* synthetic */ Context f33923p;

    /* renamed from: q */
    public final /* synthetic */ zzaw f33924q;

    public yp2(zzaw zzawVar, Context context) {
        this.f33924q = zzawVar;
        this.f33923p = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzda
    public final void zze(zze zzeVar) {
        if (zzeVar == null) {
            return;
        }
        this.f33924q.m1357a(this.f33923p, zzeVar.zzb, true, true);
    }
}
