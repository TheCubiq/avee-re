package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzafc implements Runnable {
    private final /* synthetic */ zzafa zzcgj;
    final /* synthetic */ JSONObject zzcgk;
    final /* synthetic */ String zzcgl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafc(zzafa zzafaVar, JSONObject jSONObject, String str) {
        this.zzcgj = zzafaVar;
        this.zzcgk = jSONObject;
        this.zzcgl = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzvf zzvfVar;
        zzvs zzvsVar;
        zzafa zzafaVar = this.zzcgj;
        zzvfVar = zzafa.zzcge;
        zzafaVar.zzcgi = zzvfVar.zzb((zzci) null);
        zzvsVar = this.zzcgj.zzcgi;
        zzvsVar.zza(new zzafd(this), new zzafe(this));
    }
}
