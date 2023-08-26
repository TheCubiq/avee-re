package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicBoolean;
@zzadh
/* loaded from: classes2.dex */
public abstract class zzabf implements zzalc<Void>, zzasd {
    protected final Context mContext;
    protected final zzaqw zzbnd;
    private final zzabm zzbzd;
    private final zzaji zzbze;
    protected zzaej zzbzf;
    private Runnable zzbzg;
    private final Object zzbzh = new Object();
    private AtomicBoolean zzbzi = new AtomicBoolean(true);

    /* JADX INFO: Access modifiers changed from: protected */
    public zzabf(Context context, zzaji zzajiVar, zzaqw zzaqwVar, zzabm zzabmVar) {
        this.mContext = context;
        this.zzbze = zzajiVar;
        this.zzbzf = zzajiVar.zzcos;
        this.zzbnd = zzaqwVar;
        this.zzbzd = zzabmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalc
    public void cancel() {
        if (this.zzbzi.getAndSet(false)) {
            this.zzbnd.stopLoading();
            com.google.android.gms.ads.internal.zzbv.zzem();
            zzakq.zzi(this.zzbnd);
            zzz(-1);
            zzakk.zzcrm.removeCallbacks(this.zzbzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasd
    public final void zze(boolean z) {
        zzakb.zzck("WebView finished loading.");
        if (this.zzbzi.getAndSet(false)) {
            zzz(z ? -2 : 0);
            zzakk.zzcrm.removeCallbacks(this.zzbzg);
        }
    }

    protected abstract void zzns();

    @Override // com.google.android.gms.internal.ads.zzalc
    public final /* synthetic */ Void zznt() {
        Preconditions.checkMainThread("Webview render task needs to be called on UI thread.");
        this.zzbzg = new zzabg(this);
        zzakk.zzcrm.postDelayed(this.zzbzg, ((Long) zzkb.zzik().zzd(zznk.zzbao)).longValue());
        zzns();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzz(int i) {
        if (i != -2) {
            this.zzbzf = new zzaej(i, this.zzbzf.zzbsu);
        }
        this.zzbnd.zztz();
        zzabm zzabmVar = this.zzbzd;
        zzaef zzaefVar = this.zzbze.zzcgs;
        zzabmVar.zzb(new zzajh(zzaefVar.zzccv, this.zzbnd, this.zzbzf.zzbsn, i, this.zzbzf.zzbso, this.zzbzf.zzces, this.zzbzf.orientation, this.zzbzf.zzbsu, zzaefVar.zzccy, this.zzbzf.zzceq, null, null, null, null, null, this.zzbzf.zzcer, this.zzbze.zzacv, this.zzbzf.zzcep, this.zzbze.zzcoh, this.zzbzf.zzceu, this.zzbzf.zzcev, this.zzbze.zzcob, null, this.zzbzf.zzcfe, this.zzbzf.zzcff, this.zzbzf.zzcfg, this.zzbzf.zzcfh, this.zzbzf.zzcfi, null, this.zzbzf.zzbsr, this.zzbzf.zzcfl, this.zzbze.zzcoq, this.zzbze.zzcos.zzzl, this.zzbze.zzcor, this.zzbze.zzcos.zzcfp, this.zzbzf.zzbsp, this.zzbze.zzcos.zzzm, this.zzbze.zzcos.zzcfq));
    }
}
