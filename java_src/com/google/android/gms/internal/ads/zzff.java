package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzff implements zzfo {
    private final Context mContext;
    private final zzet zzafq;
    private final com.google.android.gms.ads.internal.gmsg.zzab zzafw;
    private zzvs zzafx;
    private boolean zzafy;
    private final com.google.android.gms.ads.internal.gmsg.zzv<zzwb> zzafs = new zzfk(this);
    private final com.google.android.gms.ads.internal.gmsg.zzv<zzwb> zzaft = new zzfl(this);
    private final com.google.android.gms.ads.internal.gmsg.zzv<zzwb> zzafu = new zzfm(this);
    private final com.google.android.gms.ads.internal.gmsg.zzv<zzwb> zzafz = new zzfn(this);

    public zzff(zzet zzetVar, zzvf zzvfVar, Context context) {
        this.zzafq = zzetVar;
        this.mContext = context;
        this.zzafw = new com.google.android.gms.ads.internal.gmsg.zzab(context);
        zzvs zzb = zzvfVar.zzb((zzci) null);
        this.zzafx = zzb;
        zzb.zza(new zzfg(this), new zzfh(this));
        String valueOf = String.valueOf(this.zzafq.zzaet.zzfy());
        zzakb.zzck(valueOf.length() != 0 ? "Core JS tracking ad unit: ".concat(valueOf) : new String("Core JS tracking ad unit: "));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zza(zzff zzffVar, boolean z) {
        zzffVar.zzafy = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzwb zzwbVar) {
        zzwbVar.zza("/updateActiveView", this.zzafs);
        zzwbVar.zza("/untrackActiveViewUnit", this.zzaft);
        zzwbVar.zza("/visibilityChanged", this.zzafu);
        if (com.google.android.gms.ads.internal.zzbv.zzfh().zzs(this.mContext)) {
            zzwbVar.zza("/logScionEvent", this.zzafz);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzwb zzwbVar) {
        zzwbVar.zzb("/visibilityChanged", this.zzafu);
        zzwbVar.zzb("/untrackActiveViewUnit", this.zzaft);
        zzwbVar.zzb("/updateActiveView", this.zzafs);
        if (com.google.android.gms.ads.internal.zzbv.zzfh().zzs(this.mContext)) {
            zzwbVar.zzb("/logScionEvent", this.zzafz);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfo
    public final void zzb(JSONObject jSONObject, boolean z) {
        this.zzafx.zza(new zzfi(this, jSONObject), new zzaon());
    }

    @Override // com.google.android.gms.internal.ads.zzfo
    public final boolean zzgk() {
        return this.zzafy;
    }

    @Override // com.google.android.gms.internal.ads.zzfo
    public final void zzgl() {
        this.zzafx.zza(new zzfj(this), new zzaon());
        this.zzafx.release();
    }
}
