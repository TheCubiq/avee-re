package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
@zzadh
/* loaded from: classes2.dex */
public final class zzaei extends zzaer {
    private final WeakReference<zzadx> zzcen;

    public zzaei(zzadx zzadxVar) {
        this.zzcen = new WeakReference<>(zzadxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeq
    public final void zza(zzaej zzaejVar) {
        zzadx zzadxVar = this.zzcen.get();
        if (zzadxVar != null) {
            zzadxVar.zza(zzaejVar);
        }
    }
}
