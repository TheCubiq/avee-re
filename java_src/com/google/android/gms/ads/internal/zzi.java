package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzaam;
import com.google.android.gms.internal.ads.zzabl;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzait;
import com.google.android.gms.internal.ads.zzajh;
import com.google.android.gms.internal.ads.zzaji;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzakk;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzarc;
import com.google.android.gms.internal.ads.zzarg;
import com.google.android.gms.internal.ads.zzasi;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zznk;
import com.google.android.gms.internal.ads.zznx;
import com.google.android.gms.internal.ads.zzod;
import com.google.android.gms.internal.ads.zzxn;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public abstract class zzi extends zzd implements zzaf, zzaam {
    private boolean zzwl;

    public zzi(Context context, zzjn zzjnVar, String str, zzxn zzxnVar, zzang zzangVar, zzw zzwVar) {
        super(context, zzjnVar, str, zzxnVar, zzangVar, zzwVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zzaqw zza(zzaji zzajiVar, zzx zzxVar, zzait zzaitVar) throws zzarg {
        View nextView = this.zzvw.zzacs.getNextView();
        if (nextView instanceof zzaqw) {
            ((zzaqw) nextView).destroy();
        }
        if (nextView != null) {
            this.zzvw.zzacs.removeView(nextView);
        }
        zzbv.zzel();
        zzaqw zza = zzarc.zza(this.zzvw.zzrt, zzasi.zzb(this.zzvw.zzacv), this.zzvw.zzacv.zzarb, false, false, this.zzvw.zzacq, this.zzvw.zzacr, this.zzvr, this, this.zzwc, zzajiVar.zzcoq);
        if (this.zzvw.zzacv.zzard == null) {
            zzg(zza.getView());
        }
        zza.zzuf().zza(this, this, this, this, this, false, null, zzxVar, this, zzaitVar);
        zza(zza);
        zza.zzdr(zzajiVar.zzcgs.zzcdi);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final void zza(int i, int i2, int i3, int i4) {
        zzbp();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.zza
    public void zza(zzaji zzajiVar, zznx zznxVar) {
        if (zzajiVar.errorCode != -2) {
            zzakk.zzcrm.post(new zzk(this, zzajiVar));
            return;
        }
        if (zzajiVar.zzacv != null) {
            this.zzvw.zzacv = zzajiVar.zzacv;
        }
        if (!zzajiVar.zzcos.zzceq || zzajiVar.zzcos.zzarg) {
            zzakk.zzcrm.post(new zzl(this, zzajiVar, this.zzwc.zzxa.zza(this.zzvw.zzrt, this.zzvw.zzacr, zzajiVar.zzcos), zznxVar));
            return;
        }
        this.zzvw.zzadv = 0;
        zzbw zzbwVar = this.zzvw;
        zzbv.zzej();
        zzbwVar.zzacu = zzabl.zza(this.zzvw.zzrt, this, zzajiVar, this.zzvw.zzacq, null, this.zzwh, this, zznxVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(zzaqw zzaqwVar) {
        zzaqwVar.zza("/trackActiveViewUnit", new zzj(this));
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.ads.zzks
    public final void zza(zzod zzodVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzvw.zzado = zzodVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza
    public boolean zza(zzajh zzajhVar, zzajh zzajhVar2) {
        if (this.zzvw.zzfo() && this.zzvw.zzacs != null) {
            this.zzvw.zzacs.zzfr().zzdb(zzajhVar2.zzcev);
        }
        try {
            if (zzajhVar2.zzbyo != null && !zzajhVar2.zzceq && zzajhVar2.zzcor) {
                if (((Boolean) zzkb.zzik().zzd(zznk.zzbfq)).booleanValue() && !zzajhVar2.zzccv.extras.containsKey("sdk_less_server_data")) {
                    zzajhVar2.zzbyo.zzus();
                }
            }
        } catch (RuntimeException unused) {
            zzakb.v("Could not render test AdLabel.");
        }
        return super.zza(zzajhVar, zzajhVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzaqw zzaqwVar) {
        if (this.zzvw.zzacw != null) {
            this.zzvy.zza(this.zzvw.zzacv, this.zzvw.zzacw, zzaqwVar.getView(), zzaqwVar);
            this.zzwl = false;
            return;
        }
        this.zzwl = true;
        zzakb.zzdk("Request to enable ActiveView before adState is available.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.zza
    public void zzbq() {
        super.zzbq();
        if (this.zzwl) {
            if (((Boolean) zzkb.zzik().zzd(zznk.zzbcb)).booleanValue()) {
                zzb(this.zzvw.zzacw.zzbyo);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.zzaf
    public final void zzcn() {
        onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzaf
    public final void zzco() {
        recordImpression();
        zzbm();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzcp() {
        return (this.zzvw.zzacx == null || this.zzvw.zzacx.zzcos == null || !this.zzvw.zzacx.zzcos.zzcfp) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final void zzcq() {
        zzbn();
    }

    @Override // com.google.android.gms.ads.internal.zzaf
    public final void zzh(View view) {
        this.zzvw.zzadu = view;
        zzb(new zzajh(this.zzvw.zzacx, null, null, null, null, null, null, null));
    }
}
