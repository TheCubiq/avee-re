package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzarc {
    public static zzanz<zzaqw> zza(final Context context, final zzang zzangVar, final String str, final zzci zzciVar, final com.google.android.gms.ads.internal.zzw zzwVar) {
        return zzano.zza(zzano.zzi(null), new zzanj(context, zzciVar, zzangVar, zzwVar, str) { // from class: com.google.android.gms.internal.ads.zzard
            private final zzci zzbqd;
            private final Context zzdck;
            private final zzang zzdcl;
            private final com.google.android.gms.ads.internal.zzw zzdcm;
            private final String zzdcn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdck = context;
                this.zzbqd = zzciVar;
                this.zzdcl = zzangVar;
                this.zzdcm = zzwVar;
                this.zzdcn = str;
            }

            @Override // com.google.android.gms.internal.ads.zzanj
            public final zzanz zzc(Object obj) {
                Context context2 = this.zzdck;
                zzci zzciVar2 = this.zzbqd;
                zzang zzangVar2 = this.zzdcl;
                com.google.android.gms.ads.internal.zzw zzwVar2 = this.zzdcm;
                String str2 = this.zzdcn;
                com.google.android.gms.ads.internal.zzbv.zzel();
                zzaqw zza = zzarc.zza(context2, zzasi.zzvq(), "", false, false, zzciVar2, zzangVar2, null, null, zzwVar2, zzhs.zzhm());
                final zzaoi zzj = zzaoi.zzj(zza);
                zza.zzuf().zza(new zzasd(zzj) { // from class: com.google.android.gms.internal.ads.zzarf
                    private final zzaoi zzdcx;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdcx = zzj;
                    }

                    @Override // com.google.android.gms.internal.ads.zzasd
                    public final void zze(boolean z) {
                        this.zzdcx.zzsn();
                    }
                });
                zza.loadUrl(str2);
                return zzj;
            }
        }, zzaoe.zzcvy);
    }

    public static zzaqw zza(final Context context, final zzasi zzasiVar, final String str, final boolean z, final boolean z2, final zzci zzciVar, final zzang zzangVar, final zznx zznxVar, final com.google.android.gms.ads.internal.zzbo zzboVar, final com.google.android.gms.ads.internal.zzw zzwVar, final zzhs zzhsVar) throws zzarg {
        zznk.initialize(context);
        if (((Boolean) zzkb.zzik().zzd(zznk.zzaxy)).booleanValue()) {
            return zzaso.zza(context, zzasiVar, str, z2, z, zzciVar, zzangVar, zznxVar, zzboVar, zzwVar, zzhsVar);
        }
        try {
            return (zzaqw) zzaml.zzb(new Callable(context, zzasiVar, str, z, z2, zzciVar, zzangVar, zznxVar, zzboVar, zzwVar, zzhsVar) { // from class: com.google.android.gms.internal.ads.zzare
                private final String zzcah;
                private final Context zzdck;
                private final zzasi zzdco;
                private final boolean zzdcp;
                private final boolean zzdcq;
                private final zzci zzdcr;
                private final zzang zzdcs;
                private final zznx zzdct;
                private final com.google.android.gms.ads.internal.zzbo zzdcu;
                private final com.google.android.gms.ads.internal.zzw zzdcv;
                private final zzhs zzdcw;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdck = context;
                    this.zzdco = zzasiVar;
                    this.zzcah = str;
                    this.zzdcp = z;
                    this.zzdcq = z2;
                    this.zzdcr = zzciVar;
                    this.zzdcs = zzangVar;
                    this.zzdct = zznxVar;
                    this.zzdcu = zzboVar;
                    this.zzdcv = zzwVar;
                    this.zzdcw = zzhsVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = this.zzdck;
                    zzasi zzasiVar2 = this.zzdco;
                    String str2 = this.zzcah;
                    boolean z3 = this.zzdcp;
                    boolean z4 = this.zzdcq;
                    zzarh zzarhVar = new zzarh(zzari.zzb(context2, zzasiVar2, str2, z3, z4, this.zzdcr, this.zzdcs, this.zzdct, this.zzdcu, this.zzdcv, this.zzdcw));
                    zzarhVar.setWebViewClient(com.google.android.gms.ads.internal.zzbv.zzem().zza(zzarhVar, z4));
                    zzarhVar.setWebChromeClient(new zzaqo(zzarhVar));
                    return zzarhVar;
                }
            });
        } catch (Throwable th) {
            throw new zzarg("Webview initialization failed.", th);
        }
    }
}
