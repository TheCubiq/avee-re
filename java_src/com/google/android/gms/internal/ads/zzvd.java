package com.google.android.gms.internal.ads;

import java.util.Map;
/* loaded from: classes2.dex */
final class zzvd implements com.google.android.gms.ads.internal.gmsg.zzv<zzaqw> {
    private final /* synthetic */ zzuw zzbpu;
    private final com.google.android.gms.ads.internal.gmsg.zzv<? super zzwb> zzbpw;

    public zzvd(zzuw zzuwVar, com.google.android.gms.ads.internal.gmsg.zzv<? super zzwb> zzvVar) {
        this.zzbpu = zzuwVar;
        this.zzbpw = zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final /* synthetic */ void zza(zzaqw zzaqwVar, Map map) {
        this.zzbpw.zza(this.zzbpu, map);
    }
}
