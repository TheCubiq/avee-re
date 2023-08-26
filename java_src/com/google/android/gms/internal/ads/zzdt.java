package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class zzdt implements Callable {
    private final zzcz zzps;
    private final zzba zztq;

    public zzdt(zzcz zzczVar, zzba zzbaVar) {
        this.zzps = zzczVar;
        this.zztq = zzbaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: zzat */
    public final Void call() throws Exception {
        if (this.zzps.zzak() != null) {
            this.zzps.zzak().get();
        }
        zzba zzaj = this.zzps.zzaj();
        if (zzaj != null) {
            try {
                synchronized (this.zztq) {
                    zzbfi.zza(this.zztq, zzbfi.zzb(zzaj));
                }
                return null;
            } catch (zzbfh unused) {
                return null;
            }
        }
        return null;
    }
}
