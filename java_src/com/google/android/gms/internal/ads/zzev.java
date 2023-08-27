package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public final class zzev implements zzgd {
    private WeakReference<zzoz> zzafl;

    public zzev(zzoz zzozVar) {
        this.zzafl = new WeakReference<>(zzozVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final View zzgh() {
        zzoz zzozVar = this.zzafl.get();
        if (zzozVar != null) {
            return zzozVar.zzkr();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final boolean zzgi() {
        return this.zzafl.get() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final zzgd zzgj() {
        return new zzex(this.zzafl.get());
    }
}
