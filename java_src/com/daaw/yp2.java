package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzcz;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzaw;
/* loaded from: classes.dex */
public final class yp2 extends zzcz {
    public final /* synthetic */ Context p;
    public final /* synthetic */ zzaw q;

    public yp2(zzaw zzawVar, Context context) {
        this.q = zzawVar;
        this.p = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzda
    public final void zze(zze zzeVar) {
        if (zzeVar == null) {
            return;
        }
        this.q.a(this.p, zzeVar.zzb, true, true);
    }
}
