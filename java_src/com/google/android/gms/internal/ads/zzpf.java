package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
final class zzpf {
    private final WeakReference<zzaqw> zzbjg;
    private String zzbjh;

    public zzpf(zzaqw zzaqwVar) {
        this.zzbjg = new WeakReference<>(zzaqwVar);
    }

    public final void zza(zzacm zzacmVar) {
        zzacmVar.zza("/loadHtml", new zzpg(this, zzacmVar));
        zzacmVar.zza("/showOverlay", new zzpi(this, zzacmVar));
        zzacmVar.zza("/hideOverlay", new zzpj(this, zzacmVar));
        zzaqw zzaqwVar = this.zzbjg.get();
        if (zzaqwVar != null) {
            zzaqwVar.zza("/sendMessageToSdk", new zzpk(this, zzacmVar));
        }
    }
}
