package com.google.android.gms.internal.ads;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzvl implements com.google.android.gms.ads.internal.gmsg.zzv<zzwb> {
    private final /* synthetic */ zzuu zzbqj;
    private final /* synthetic */ zzvf zzbqk;
    private final /* synthetic */ zzci zzbql;
    private final /* synthetic */ zzamk zzbqm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvl(zzvf zzvfVar, zzci zzciVar, zzuu zzuuVar, zzamk zzamkVar) {
        this.zzbqk = zzvfVar;
        this.zzbql = zzciVar;
        this.zzbqj = zzuuVar;
        this.zzbqm = zzamkVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final /* synthetic */ void zza(zzwb zzwbVar, Map map) {
        Object obj;
        int i;
        obj = this.zzbqk.mLock;
        synchronized (obj) {
            zzakb.zzdj("JS Engine is requesting an update");
            i = this.zzbqk.zzbqb;
            if (i == 0) {
                zzakb.zzdj("Starting reload.");
                this.zzbqk.zzbqb = 2;
                this.zzbqk.zza(this.zzbql);
            }
            this.zzbqj.zzb("/requestReload", (com.google.android.gms.ads.internal.gmsg.zzv) this.zzbqm.get());
        }
    }
}
