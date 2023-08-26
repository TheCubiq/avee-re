package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzny extends zzob {
    private final com.google.android.gms.ads.internal.zzaf zzbgs;
    private final String zzbgt;
    private final String zzbgu;

    public zzny(com.google.android.gms.ads.internal.zzaf zzafVar, String str, String str2) {
        this.zzbgs = zzafVar;
        this.zzbgt = str;
        this.zzbgu = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzoa
    public final String getContent() {
        return this.zzbgu;
    }

    @Override // com.google.android.gms.internal.ads.zzoa
    public final void recordClick() {
        this.zzbgs.zzcn();
    }

    @Override // com.google.android.gms.internal.ads.zzoa
    public final void recordImpression() {
        this.zzbgs.zzco();
    }

    @Override // com.google.android.gms.internal.ads.zzoa
    public final void zzg(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return;
        }
        this.zzbgs.zzh((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzoa
    public final String zzjn() {
        return this.zzbgt;
    }
}
