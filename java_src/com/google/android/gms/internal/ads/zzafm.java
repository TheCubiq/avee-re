package com.google.android.gms.internal.ads;

import android.content.Context;
@zzadh
/* loaded from: classes2.dex */
public final class zzafm {
    public final zzhn zzcgx;
    public final zzajc zzcgy;
    public final zzmz zzcgz;
    public final zzagh zzcha;
    public final zzwu zzchb;
    public final zzagi zzchc;
    public final zzagj zzchd;
    public final zzaav zzche;
    public final zzajg zzchf;
    public final zzafr zzchg;
    public final zzafy zzcgw = null;
    public final boolean zzcgv = true;

    private zzafm(zzafy zzafyVar, zzhn zzhnVar, zzajc zzajcVar, zzmz zzmzVar, zzagh zzaghVar, zzwu zzwuVar, zzagi zzagiVar, zzagj zzagjVar, zzaav zzaavVar, zzajg zzajgVar, boolean z, zzafr zzafrVar) {
        this.zzcgx = zzhnVar;
        this.zzcgy = zzajcVar;
        this.zzcgz = zzmzVar;
        this.zzcha = zzaghVar;
        this.zzchb = zzwuVar;
        this.zzchc = zzagiVar;
        this.zzchd = zzagjVar;
        this.zzche = zzaavVar;
        this.zzchf = zzajgVar;
        this.zzchg = zzafrVar;
    }

    public static zzafm zzm(Context context) {
        com.google.android.gms.ads.internal.zzbv.zzfi().initialize(context);
        zzagn zzagnVar = new zzagn(context);
        return new zzafm(null, new zzhq(), new zzajd(), new zzmy(), new zzagf(context, zzagnVar.zzog()), new zzwv(), new zzagl(), new zzagm(), new zzaau(), new zzaje(), true, zzagnVar);
    }
}
