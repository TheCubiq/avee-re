package com.google.android.gms.ads.internal;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzh implements Callable<String> {
    private final /* synthetic */ zzd zzwk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzh(zzd zzdVar) {
        this.zzwk = zzdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        return this.zzwk.zzvw.zzacq.zzaa().zza(this.zzwk.zzvw.zzrt);
    }
}
