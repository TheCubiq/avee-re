package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
@zzadh
/* loaded from: classes2.dex */
public final class zzabt extends zzajx {
    private final Object mLock;
    private final zzabm zzbzd;
    private final zzaji zzbze;
    private final zzaej zzbzf;
    private final zzabv zzbzu;
    private Future<zzajh> zzbzv;

    public zzabt(Context context, com.google.android.gms.ads.internal.zzbc zzbcVar, zzaji zzajiVar, zzci zzciVar, zzabm zzabmVar, zznx zznxVar) {
        this(zzajiVar, zzabmVar, new zzabv(context, zzbcVar, new zzalt(context), zzciVar, zzajiVar, zznxVar));
    }

    private zzabt(zzaji zzajiVar, zzabm zzabmVar, zzabv zzabvVar) {
        this.mLock = new Object();
        this.zzbze = zzajiVar;
        this.zzbzf = zzajiVar.zzcos;
        this.zzbzd = zzabmVar;
        this.zzbzu = zzabvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void onStop() {
        synchronized (this.mLock) {
            if (this.zzbzv != null) {
                this.zzbzv.cancel(true);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zzdn() {
        int i;
        zzanz zza;
        zzajh zzajhVar = null;
        try {
            try {
                synchronized (this.mLock) {
                    zza = zzaki.zza(this.zzbzu);
                    this.zzbzv = zza;
                }
                zzajhVar = (zzajh) zza.get(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, TimeUnit.MILLISECONDS);
                i = -2;
            } catch (TimeoutException unused) {
                zzakb.zzdk("Timed out waiting for native ad.");
                this.zzbzv.cancel(true);
                i = 2;
            }
        } catch (InterruptedException | CancellationException | ExecutionException unused2) {
            i = 0;
        }
        if (zzajhVar == null) {
            zzajhVar = new zzajh(this.zzbze.zzcgs.zzccv, null, null, i, null, null, this.zzbzf.orientation, this.zzbzf.zzbsu, this.zzbze.zzcgs.zzccy, false, null, null, null, null, null, this.zzbzf.zzcer, this.zzbze.zzacv, this.zzbzf.zzcep, this.zzbze.zzcoh, this.zzbzf.zzceu, this.zzbzf.zzcev, this.zzbze.zzcob, null, null, null, null, this.zzbze.zzcos.zzcfh, this.zzbze.zzcos.zzcfi, null, null, this.zzbzf.zzcfl, this.zzbze.zzcoq, this.zzbze.zzcos.zzzl, false, this.zzbze.zzcos.zzcfp, null, this.zzbze.zzcos.zzzm, this.zzbze.zzcos.zzcfq);
        }
        zzakk.zzcrm.post(new zzabu(this, zzajhVar));
    }
}
