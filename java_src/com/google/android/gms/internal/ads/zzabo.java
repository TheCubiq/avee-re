package com.google.android.gms.internal.ads;
@zzadh
/* loaded from: classes2.dex */
public final class zzabo extends zzajx {
    private final zzabm zzbzd;
    private final zzaji zzbze;
    private final zzaej zzbzf;

    public zzabo(zzaji zzajiVar, zzabm zzabmVar) {
        this.zzbze = zzajiVar;
        this.zzbzf = zzajiVar.zzcos;
        this.zzbzd = zzabmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void onStop() {
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zzdn() {
        zzakk.zzcrm.post(new zzabp(this, new zzajh(this.zzbze.zzcgs.zzccv, null, null, 0, null, null, this.zzbzf.orientation, this.zzbzf.zzbsu, this.zzbze.zzcgs.zzccy, false, null, null, null, null, null, this.zzbzf.zzcer, this.zzbze.zzacv, this.zzbzf.zzcep, this.zzbze.zzcoh, this.zzbzf.zzceu, this.zzbzf.zzcev, this.zzbze.zzcob, null, null, null, null, this.zzbze.zzcos.zzcfh, this.zzbze.zzcos.zzcfi, null, null, null, this.zzbze.zzcoq, this.zzbze.zzcos.zzzl, this.zzbze.zzcor, this.zzbze.zzcos.zzcfp, null, this.zzbze.zzcos.zzzm, this.zzbze.zzcos.zzcfq)));
    }
}
