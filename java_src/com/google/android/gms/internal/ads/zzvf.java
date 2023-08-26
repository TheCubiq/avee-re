package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzvf {
    private final Context mContext;
    private final Object mLock;
    private final String zzbpx;
    private zzalo<zzuu> zzbpy;
    private zzalo<zzuu> zzbpz;
    private zzvw zzbqa;
    private int zzbqb;
    private final zzang zzyf;

    public zzvf(Context context, zzang zzangVar, String str) {
        this.mLock = new Object();
        this.zzbqb = 1;
        this.zzbpx = str;
        this.mContext = context.getApplicationContext();
        this.zzyf = zzangVar;
        this.zzbpy = new zzvr();
        this.zzbpz = new zzvr();
    }

    public zzvf(Context context, zzang zzangVar, String str, zzalo<zzuu> zzaloVar, zzalo<zzuu> zzaloVar2) {
        this(context, zzangVar, str);
        this.zzbpy = zzaloVar;
        this.zzbpz = zzaloVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzvw zza(final zzci zzciVar) {
        final zzvw zzvwVar = new zzvw(this.zzbpz);
        zzaoe.zzcvy.execute(new Runnable(this, zzciVar, zzvwVar) { // from class: com.google.android.gms.internal.ads.zzvg
            private final zzvf zzbqc;
            private final zzci zzbqd;
            private final zzvw zzbqe;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbqc = this;
                this.zzbqd = zzciVar;
                this.zzbqe = zzvwVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzbqc.zza(this.zzbqd, this.zzbqe);
            }
        });
        zzvwVar.zza(new zzvo(this, zzvwVar), new zzvp(this, zzvwVar));
        return zzvwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzci zzciVar, final zzvw zzvwVar) {
        try {
            Context context = this.mContext;
            zzang zzangVar = this.zzyf;
            final zzuu zzufVar = ((Boolean) zzkb.zzik().zzd(zznk.zzaxz)).booleanValue() ? new zzuf(context, zzangVar) : new zzuw(context, zzangVar, zzciVar, null);
            zzufVar.zza(new zzuv(this, zzvwVar, zzufVar) { // from class: com.google.android.gms.internal.ads.zzvh
                private final zzvf zzbqc;
                private final zzvw zzbqf;
                private final zzuu zzbqg;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbqc = this;
                    this.zzbqf = zzvwVar;
                    this.zzbqg = zzufVar;
                }

                @Override // com.google.android.gms.internal.ads.zzuv
                public final void zzlx() {
                    final zzvf zzvfVar = this.zzbqc;
                    final zzvw zzvwVar2 = this.zzbqf;
                    final zzuu zzuuVar = this.zzbqg;
                    zzakk.zzcrm.postDelayed(new Runnable(zzvfVar, zzvwVar2, zzuuVar) { // from class: com.google.android.gms.internal.ads.zzvi
                        private final zzvf zzbqc;
                        private final zzvw zzbqf;
                        private final zzuu zzbqg;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzbqc = zzvfVar;
                            this.zzbqf = zzvwVar2;
                            this.zzbqg = zzuuVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzbqc.zza(this.zzbqf, this.zzbqg);
                        }
                    }, zzvq.zzbqp);
                }
            });
            zzufVar.zza("/jsLoaded", new zzvk(this, zzvwVar, zzufVar));
            zzamk zzamkVar = new zzamk();
            zzvl zzvlVar = new zzvl(this, zzciVar, zzufVar, zzamkVar);
            zzamkVar.set(zzvlVar);
            zzufVar.zza("/requestReload", zzvlVar);
            if (this.zzbpx.endsWith(".js")) {
                zzufVar.zzbb(this.zzbpx);
            } else if (this.zzbpx.startsWith("<html>")) {
                zzufVar.zzbc(this.zzbpx);
            } else {
                zzufVar.zzbd(this.zzbpx);
            }
            zzakk.zzcrm.postDelayed(new zzvm(this, zzvwVar, zzufVar), zzvq.zzbqo);
        } catch (Throwable th) {
            zzakb.zzb("Error creating webview.", th);
            com.google.android.gms.ads.internal.zzbv.zzeo().zza(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzvwVar.reject();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzvw zzvwVar, zzuu zzuuVar) {
        synchronized (this.mLock) {
            if (zzvwVar.getStatus() != -1 && zzvwVar.getStatus() != 1) {
                zzvwVar.reject();
                Executor executor = zzaoe.zzcvy;
                zzuuVar.getClass();
                executor.execute(zzvj.zza(zzuuVar));
                zzakb.v("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }

    public final zzvs zzb(zzci zzciVar) {
        synchronized (this.mLock) {
            if (this.zzbqa != null && this.zzbqa.getStatus() != -1) {
                if (this.zzbqb == 0) {
                    return this.zzbqa.zzlz();
                } else if (this.zzbqb == 1) {
                    this.zzbqb = 2;
                    zza((zzci) null);
                    return this.zzbqa.zzlz();
                } else if (this.zzbqb == 2) {
                    return this.zzbqa.zzlz();
                } else {
                    return this.zzbqa.zzlz();
                }
            }
            this.zzbqb = 2;
            zzvw zza = zza((zzci) null);
            this.zzbqa = zza;
            return zza.zzlz();
        }
    }
}
