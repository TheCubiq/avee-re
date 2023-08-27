package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzabl;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzajh;
import com.google.android.gms.internal.ads.zzaji;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzakk;
import com.google.android.gms.internal.ads.zzane;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzlo;
import com.google.android.gms.internal.ads.zznx;
import com.google.android.gms.internal.ads.zzod;
import com.google.android.gms.internal.ads.zzoo;
import com.google.android.gms.internal.ads.zzoq;
import com.google.android.gms.internal.ads.zzov;
import com.google.android.gms.internal.ads.zzox;
import com.google.android.gms.internal.ads.zzoy;
import com.google.android.gms.internal.ads.zzoz;
import com.google.android.gms.internal.ads.zzpa;
import com.google.android.gms.internal.ads.zzqs;
import com.google.android.gms.internal.ads.zzrc;
import com.google.android.gms.internal.ads.zzwy;
import com.google.android.gms.internal.ads.zzxn;
import com.google.android.gms.internal.ads.zzxz;
import com.google.android.gms.internal.ads.zzyc;
import com.google.android.gms.internal.ads.zzyf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzq extends zzd implements zzpa {
    private boolean zzvm;
    private zzajh zzwr;
    private boolean zzws;

    public zzq(Context context, zzw zzwVar, zzjn zzjnVar, String str, zzxn zzxnVar, zzang zzangVar) {
        super(context, zzjnVar, str, zzxnVar, zzangVar, zzwVar);
        this.zzws = false;
    }

    private static zzajh zza(zzaji zzajiVar, int i) {
        return new zzajh(zzajiVar.zzcgs.zzccv, null, zzajiVar.zzcos.zzbsn, i, zzajiVar.zzcos.zzbso, zzajiVar.zzcos.zzces, zzajiVar.zzcos.orientation, zzajiVar.zzcos.zzbsu, zzajiVar.zzcgs.zzccy, zzajiVar.zzcos.zzceq, null, null, null, zzajiVar.zzcod, null, zzajiVar.zzcos.zzcer, zzajiVar.zzacv, zzajiVar.zzcos.zzcep, zzajiVar.zzcoh, zzajiVar.zzcoi, zzajiVar.zzcos.zzcev, zzajiVar.zzcob, null, zzajiVar.zzcos.zzcfe, zzajiVar.zzcos.zzcff, zzajiVar.zzcos.zzcff, zzajiVar.zzcos.zzcfh, zzajiVar.zzcos.zzcfi, null, zzajiVar.zzcos.zzbsr, zzajiVar.zzcos.zzcfl, zzajiVar.zzcoq, zzajiVar.zzcos.zzzl, zzajiVar.zzcor, zzajiVar.zzcos.zzcfp, zzajiVar.zzcos.zzbsp, zzajiVar.zzcos.zzzm, zzajiVar.zzcos.zzcfq);
    }

    private final void zza(zzov zzovVar) {
        zzakk.zzcrm.post(new zzs(this, zzovVar));
    }

    private final boolean zzb(zzajh zzajhVar, zzajh zzajhVar2) {
        Handler handler;
        Runnable zzuVar;
        zzov zzovVar;
        zzd(null);
        if (this.zzvw.zzfo()) {
            try {
                zzyf zzmu = zzajhVar2.zzbtx != null ? zzajhVar2.zzbtx.zzmu() : null;
                zzxz zzmo = zzajhVar2.zzbtx != null ? zzajhVar2.zzbtx.zzmo() : null;
                zzyc zzmp = zzajhVar2.zzbtx != null ? zzajhVar2.zzbtx.zzmp() : null;
                zzqs zzmt = zzajhVar2.zzbtx != null ? zzajhVar2.zzbtx.zzmt() : null;
                String zzc = zzc(zzajhVar2);
                if (zzmu != null && this.zzvw.zzadg != null) {
                    zzovVar = new zzov(zzmu.getHeadline(), zzmu.getImages(), zzmu.getBody(), zzmu.zzjz() != null ? zzmu.zzjz() : null, zzmu.getCallToAction(), zzmu.getAdvertiser(), zzmu.getStarRating(), zzmu.getStore(), zzmu.getPrice(), null, zzmu.getVideoController(), zzmu.zzmw() != null ? (View) ObjectWrapper.unwrap(zzmu.zzmw()) : null, zzmu.zzke(), zzc, zzmu.getExtras());
                    zzovVar.zzb(new zzoy(this.zzvw.zzrt, this, this.zzvw.zzacq, zzmu, zzovVar));
                } else if (zzmo == null || this.zzvw.zzadg == null) {
                    if (zzmo != null && this.zzvw.zzade != null) {
                        zzoo zzooVar = new zzoo(zzmo.getHeadline(), zzmo.getImages(), zzmo.getBody(), zzmo.zzjz() != null ? zzmo.zzjz() : null, zzmo.getCallToAction(), zzmo.getStarRating(), zzmo.getStore(), zzmo.getPrice(), null, zzmo.getExtras(), zzmo.getVideoController(), zzmo.zzmw() != null ? (View) ObjectWrapper.unwrap(zzmo.zzmw()) : null, zzmo.zzke(), zzc);
                        zzooVar.zzb(new zzoy(this.zzvw.zzrt, this, this.zzvw.zzacq, zzmo, zzooVar));
                        handler = zzakk.zzcrm;
                        zzuVar = new zzt(this, zzooVar);
                    } else if (zzmp != null && this.zzvw.zzadg != null) {
                        zzov zzovVar2 = new zzov(zzmp.getHeadline(), zzmp.getImages(), zzmp.getBody(), zzmp.zzkg() != null ? zzmp.zzkg() : null, zzmp.getCallToAction(), zzmp.getAdvertiser(), -1.0d, null, null, null, zzmp.getVideoController(), zzmp.zzmw() != null ? (View) ObjectWrapper.unwrap(zzmp.zzmw()) : null, zzmp.zzke(), zzc, zzmp.getExtras());
                        zzyc zzycVar = zzmp;
                        zzovVar = zzovVar2;
                        zzovVar.zzb(new zzoy(this.zzvw.zzrt, this, this.zzvw.zzacq, zzycVar, zzovVar2));
                    } else if (zzmp == null || this.zzvw.zzadf == null) {
                        if (zzmt != null && this.zzvw.zzadi != null && this.zzvw.zzadi.get(zzmt.getCustomTemplateId()) != null) {
                            zzakk.zzcrm.post(new zzv(this, zzmt));
                            return super.zza(zzajhVar, zzajhVar2);
                        }
                        zzakb.zzdk("No matching mapper/listener for retrieved native ad template.");
                        zzi(0);
                        return false;
                    } else {
                        zzoq zzoqVar = new zzoq(zzmp.getHeadline(), zzmp.getImages(), zzmp.getBody(), zzmp.zzkg() != null ? zzmp.zzkg() : null, zzmp.getCallToAction(), zzmp.getAdvertiser(), null, zzmp.getExtras(), zzmp.getVideoController(), zzmp.zzmw() != null ? (View) ObjectWrapper.unwrap(zzmp.zzmw()) : null, zzmp.zzke(), zzc);
                        zzoqVar.zzb(new zzoy(this.zzvw.zzrt, this, this.zzvw.zzacq, zzmp, zzoqVar));
                        handler = zzakk.zzcrm;
                        zzuVar = new zzu(this, zzoqVar);
                    }
                    handler.post(zzuVar);
                    return super.zza(zzajhVar, zzajhVar2);
                } else {
                    zzovVar = new zzov(zzmo.getHeadline(), zzmo.getImages(), zzmo.getBody(), zzmo.zzjz() != null ? zzmo.zzjz() : null, zzmo.getCallToAction(), null, zzmo.getStarRating(), zzmo.getStore(), zzmo.getPrice(), null, zzmo.getVideoController(), zzmo.zzmw() != null ? (View) ObjectWrapper.unwrap(zzmo.zzmw()) : null, zzmo.zzke(), zzc, zzmo.getExtras());
                    zzovVar.zzb(new zzoy(this.zzvw.zzrt, this, this.zzvw.zzacq, zzmo, zzovVar));
                }
                zza(zzovVar);
                return super.zza(zzajhVar, zzajhVar2);
            } catch (RemoteException e) {
                zzakb.zzd("#007 Could not call remote method.", e);
            }
        } else {
            zzakb.zzdk("Native ad does not have custom rendering mode.");
        }
        zzi(0);
        return false;
    }

    private final boolean zzc(zzajh zzajhVar, zzajh zzajhVar2) {
        View zze = zzas.zze(zzajhVar2);
        if (zze == null) {
            return false;
        }
        View nextView = this.zzvw.zzacs.getNextView();
        if (nextView != null) {
            if (nextView instanceof zzaqw) {
                ((zzaqw) nextView).destroy();
            }
            this.zzvw.zzacs.removeView(nextView);
        }
        if (!zzas.zzf(zzajhVar2)) {
            try {
                zzg(zze);
            } catch (Throwable th) {
                zzbv.zzeo().zza(th, "AdLoaderManager.swapBannerViews");
                zzakb.zzc("Could not add mediation view to view hierarchy.", th);
                return false;
            }
        }
        if (this.zzvw.zzacs.getChildCount() > 1) {
            this.zzvw.zzacs.showNext();
        }
        if (zzajhVar != null) {
            View nextView2 = this.zzvw.zzacs.getNextView();
            if (nextView2 != null) {
                this.zzvw.zzacs.removeView(nextView2);
            }
            this.zzvw.zzfn();
        }
        this.zzvw.zzacs.setMinimumWidth(zzbk().widthPixels);
        this.zzvw.zzacs.setMinimumHeight(zzbk().heightPixels);
        this.zzvw.zzacs.requestLayout();
        this.zzvw.zzacs.setVisibility(0);
        return true;
    }

    private final zzwy zzcw() {
        if (this.zzvw.zzacw == null || !this.zzvw.zzacw.zzceq) {
            return null;
        }
        return this.zzvw.zzacw.zzcod;
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.ads.zzks
    public final zzlo getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.ads.zzks
    public final void pause() {
        if (!this.zzws) {
            throw new IllegalStateException("Native Ad does not support pause().");
        }
        super.pause();
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.ads.zzks
    public final void resume() {
        if (!this.zzws) {
            throw new IllegalStateException("Native Ad does not support resume().");
        }
        super.resume();
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.ads.zzks
    public final void setManualImpressionsEnabled(boolean z) {
        Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        this.zzvm = z;
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.internal.ads.zzks
    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // com.google.android.gms.ads.internal.zza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzaji zzajiVar, zznx zznxVar) {
        zzajh zza;
        this.zzwr = null;
        if (zzajiVar.errorCode == -2) {
            if (!zzajiVar.zzcos.zzceq) {
                zzakb.zzdk("partialAdState is not mediation");
                zza = zza(zzajiVar, 0);
            }
            if (this.zzwr == null) {
                zzakk.zzcrm.post(new zzr(this));
                return;
            }
            if (zzajiVar.zzacv != null) {
                this.zzvw.zzacv = zzajiVar.zzacv;
            }
            this.zzvw.zzadv = 0;
            zzbw zzbwVar = this.zzvw;
            zzbv.zzej();
            zzbwVar.zzacu = zzabl.zza(this.zzvw.zzrt, this, zzajiVar, this.zzvw.zzacq, null, this.zzwh, this, zznxVar);
            return;
        }
        zza = zza(zzajiVar, zzajiVar.errorCode);
        this.zzwr = zza;
        if (this.zzwr == null) {
        }
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.ads.zzks
    public final void zza(zzod zzodVar) {
        throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final void zza(zzox zzoxVar) {
        zzane.zzd("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final void zza(zzoz zzozVar) {
        zzane.zzd("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzajh zzajhVar, zzajh zzajhVar2) {
        String str;
        boolean z;
        if (this.zzvw.zzfo()) {
            if (zzajhVar2.zzceq) {
                if (zzajhVar2.zzbtw != null && zzajhVar2.zzbtw.zzmf()) {
                    if (this.zzvw.zzfo() && this.zzvw.zzacs != null) {
                        this.zzvw.zzacs.zzfr().zzdb(zzajhVar2.zzcev);
                    }
                    if (super.zza(zzajhVar, zzajhVar2)) {
                        if (!this.zzvw.zzfo() || zzc(zzajhVar, zzajhVar2)) {
                            if (!this.zzvw.zzfp()) {
                                super.zza(zzajhVar2, false);
                            }
                            z = true;
                            if (z) {
                                return false;
                            }
                            this.zzws = true;
                        } else {
                            zzi(0);
                        }
                    }
                    z = false;
                    if (z) {
                    }
                } else if (zzajhVar2.zzbtw == null || !zzajhVar2.zzbtw.zzmg()) {
                    zzi(0);
                    str = "Response is neither banner nor native.";
                } else if (!zzb(zzajhVar, zzajhVar2)) {
                    return false;
                }
                zze(new ArrayList(Arrays.asList(2)));
                return true;
            }
            zzi(0);
            str = "newState is not mediation.";
            zzakb.zzdk(str);
            return false;
        }
        throw new IllegalStateException("AdLoader API does not support custom rendering.");
    }

    @Override // com.google.android.gms.ads.internal.zzd
    protected final boolean zza(zzjj zzjjVar, zzajh zzajhVar, boolean z) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzb(IObjectWrapper iObjectWrapper) {
        Object unwrap = iObjectWrapper != null ? ObjectWrapper.unwrap(iObjectWrapper) : null;
        if (unwrap instanceof zzoz) {
            ((zzoz) unwrap).zzkl();
        }
        super.zzb(this.zzvw.zzacw, false);
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.ads.zzks
    public final boolean zzb(zzjj zzjjVar) {
        zzjj zzjjVar2 = zzjjVar;
        if (this.zzvw.zzadn != null && this.zzvw.zzadn.size() == 1 && this.zzvw.zzadn.get(0).intValue() == 2) {
            zzakb.e("Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported");
            zzi(0);
            return false;
        } else if (this.zzvw.zzadm != null) {
            if (zzjjVar2.zzaqb != this.zzvm) {
                zzjjVar2 = new zzjj(zzjjVar2.versionCode, zzjjVar2.zzapw, zzjjVar2.extras, zzjjVar2.zzapx, zzjjVar2.zzapy, zzjjVar2.zzapz, zzjjVar2.zzaqa, zzjjVar2.zzaqb || this.zzvm, zzjjVar2.zzaqc, zzjjVar2.zzaqd, zzjjVar2.zzaqe, zzjjVar2.zzaqf, zzjjVar2.zzaqg, zzjjVar2.zzaqh, zzjjVar2.zzaqi, zzjjVar2.zzaqj, zzjjVar2.zzaqk, zzjjVar2.zzaql);
            }
            return super.zzb(zzjjVar2);
        } else {
            return super.zzb(zzjjVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.zza
    public final void zzbq() {
        super.zzbq();
        zzajh zzajhVar = this.zzvw.zzacw;
        if (zzajhVar == null || zzajhVar.zzbtw == null || !zzajhVar.zzbtw.zzmf() || this.zzvw.zzadm == null) {
            return;
        }
        try {
            this.zzvw.zzadm.zza(this, ObjectWrapper.wrap(this.zzvw.zzrt));
            super.zzb(this.zzvw.zzacw, false);
        } catch (RemoteException e) {
            zzakb.zzd("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.internal.ads.zzwz
    public final void zzce() {
        if (this.zzvw.zzacw == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzvw.zzacw.zzbty) || this.zzvw.zzacw.zzbtw == null || !this.zzvw.zzacw.zzbtw.zzmg()) {
            super.zzce();
        } else {
            zzbs();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.internal.ads.zzwz
    public final void zzcj() {
        if (this.zzvw.zzacw == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzvw.zzacw.zzbty) || this.zzvw.zzacw.zzbtw == null || !this.zzvw.zzacw.zzbtw.zzmg()) {
            super.zzcj();
        } else {
            zzbr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final void zzcr() {
        zzane.zzd("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final void zzcs() {
        zzane.zzd("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final void zzct() {
        zzane.zzd("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final boolean zzcu() {
        if (zzcw() != null) {
            return zzcw().zzbta;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final boolean zzcv() {
        if (zzcw() != null) {
            return zzcw().zzbtb;
        }
        return false;
    }

    public final void zzd(List<String> list) {
        Preconditions.checkMainThread("setNativeTemplates must be called on the main UI thread.");
        this.zzvw.zzads = list;
    }

    public final void zze(List<Integer> list) {
        Preconditions.checkMainThread("setAllowedAdTypes must be called on the main UI thread.");
        this.zzvw.zzadn = list;
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final void zzi(View view) {
        zzane.zzd("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final zzrc zzr(String str) {
        Preconditions.checkMainThread("getOnCustomClickListener must be called on the main UI thread.");
        return this.zzvw.zzadh.get(str);
    }
}
