package com.google.android.gms.internal.ads;

import android.content.Context;
@zzadh
/* loaded from: classes2.dex */
public final class zzaio implements zzaiu {
    private zzaiv zzcnc;

    public zzaio(zzaiv zzaivVar) {
        this.zzcnc = zzaivVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final zzait zza(Context context, zzang zzangVar, zzaej zzaejVar) {
        if (zzaejVar.zzcfk == null) {
            return null;
        }
        return new zzaii(context, zzangVar, zzaejVar.zzcfk, zzaejVar.zzbyq, this.zzcnc);
    }
}
