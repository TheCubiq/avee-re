package com.google.android.gms.internal.ads;

import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzfb implements zzfo {
    private final zzet zzafq;
    private final zzaqw zzafr;
    private final com.google.android.gms.ads.internal.gmsg.zzv<zzaqw> zzafs = new zzfc(this);
    private final com.google.android.gms.ads.internal.gmsg.zzv<zzaqw> zzaft = new zzfd(this);
    private final com.google.android.gms.ads.internal.gmsg.zzv<zzaqw> zzafu = new zzfe(this);

    public zzfb(zzet zzetVar, zzaqw zzaqwVar) {
        this.zzafq = zzetVar;
        this.zzafr = zzaqwVar;
        zzaqwVar.zza("/updateActiveView", this.zzafs);
        zzaqwVar.zza("/untrackActiveViewUnit", this.zzaft);
        zzaqwVar.zza("/visibilityChanged", this.zzafu);
        String valueOf = String.valueOf(this.zzafq.zzaet.zzfy());
        zzakb.zzck(valueOf.length() != 0 ? "Custom JS tracking ad unit: ".concat(valueOf) : new String("Custom JS tracking ad unit: "));
    }

    @Override // com.google.android.gms.internal.ads.zzfo
    public final void zzb(JSONObject jSONObject, boolean z) {
        if (z) {
            this.zzafq.zzb(this);
        } else {
            this.zzafr.zzb("AFMA_updateActiveView", jSONObject);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfo
    public final boolean zzgk() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfo
    public final void zzgl() {
        zzaqw zzaqwVar = this.zzafr;
        zzaqwVar.zzb("/visibilityChanged", this.zzafu);
        zzaqwVar.zzb("/untrackActiveViewUnit", this.zzaft);
        zzaqwVar.zzb("/updateActiveView", this.zzafs);
    }
}
