package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzpi implements com.google.android.gms.ads.internal.gmsg.zzv<Object> {
    private final /* synthetic */ zzacm zzbji;
    private final /* synthetic */ zzpf zzbjj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpi(zzpf zzpfVar, zzacm zzacmVar) {
        this.zzbjj = zzpfVar;
        this.zzbji = zzacmVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final void zza(Object obj, Map<String, String> map) {
        WeakReference weakReference;
        weakReference = this.zzbjj.zzbjg;
        zzaqw zzaqwVar = (zzaqw) weakReference.get();
        if (zzaqwVar == null) {
            this.zzbji.zzb("/showOverlay", this);
        } else {
            zzaqwVar.getView().setVisibility(0);
        }
    }
}
