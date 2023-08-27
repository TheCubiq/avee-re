package com.google.android.gms.internal.ads;

import android.content.Context;
@zzadh
/* loaded from: classes2.dex */
public final class zzaec extends zzadz {
    private final Context mContext;

    public zzaec(Context context, zzaol<zzaef> zzaolVar, zzadx zzadxVar) {
        super(zzaolVar, zzadxVar);
        this.mContext = context;
    }

    @Override // com.google.android.gms.internal.ads.zzadz
    public final void zznz() {
    }

    @Override // com.google.android.gms.internal.ads.zzadz
    public final zzaen zzoa() {
        Context context = this.mContext;
        return zzafn.zza(context, zzafm.zzm(context));
    }
}
