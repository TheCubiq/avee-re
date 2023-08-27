package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaaw;
import com.google.android.gms.internal.ads.zzabc;
import com.google.android.gms.internal.ads.zzabm;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzadj;
import com.google.android.gms.internal.ads.zzagp;
import com.google.android.gms.internal.ads.zzagx;
import com.google.android.gms.internal.ads.zzahe;
import com.google.android.gms.internal.ads.zzaig;
import com.google.android.gms.internal.ads.zzajb;
import com.google.android.gms.internal.ads.zzajh;
import com.google.android.gms.internal.ads.zzaji;
import com.google.android.gms.internal.ads.zzajj;
import com.google.android.gms.internal.ads.zzajs;
import com.google.android.gms.internal.ads.zzaju;
import com.google.android.gms.internal.ads.zzajz;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzakk;
import com.google.android.gms.internal.ads.zzamu;
import com.google.android.gms.internal.ads.zzane;
import com.google.android.gms.internal.ads.zzasi;
import com.google.android.gms.internal.ads.zzes;
import com.google.android.gms.internal.ads.zzhs;
import com.google.android.gms.internal.ads.zzhu;
import com.google.android.gms.internal.ads.zzjd;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjk;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zzke;
import com.google.android.gms.internal.ads.zzkh;
import com.google.android.gms.internal.ads.zzkt;
import com.google.android.gms.internal.ads.zzkx;
import com.google.android.gms.internal.ads.zzla;
import com.google.android.gms.internal.ads.zzlg;
import com.google.android.gms.internal.ads.zzlo;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzms;
import com.google.android.gms.internal.ads.zzmu;
import com.google.android.gms.internal.ads.zznk;
import com.google.android.gms.internal.ads.zznv;
import com.google.android.gms.internal.ads.zznx;
import com.google.android.gms.internal.ads.zzod;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public abstract class zza extends zzkt implements com.google.android.gms.ads.internal.gmsg.zzb, com.google.android.gms.ads.internal.gmsg.zzd, com.google.android.gms.ads.internal.overlay.zzt, zzabm, zzadj, zzajs, zzjd {
    protected zznx zzvr;
    protected zznv zzvs;
    private zznv zzvt;
    protected final zzbw zzvw;
    protected transient zzjj zzvx;
    protected final zzes zzvy;
    protected IObjectWrapper zzwb;
    protected final zzw zzwc;
    protected boolean zzvu = false;
    private final Bundle zzvz = new Bundle();
    private boolean zzwa = false;
    protected final zzbl zzvv = new zzbl(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(zzbw zzbwVar, zzbl zzblVar, zzw zzwVar) {
        this.zzvw = zzbwVar;
        this.zzwc = zzwVar;
        zzbv.zzek().zzak(this.zzvw.zzrt);
        zzbv.zzek().zzal(this.zzvw.zzrt);
        zzajz.zzai(this.zzvw.zzrt);
        zzbv.zzfi().initialize(this.zzvw.zzrt);
        zzbv.zzeo().zzd(this.zzvw.zzrt, this.zzvw.zzacr);
        zzbv.zzeq().initialize(this.zzvw.zzrt);
        this.zzvy = zzbv.zzeo().zzqd();
        zzbv.zzen().initialize(this.zzvw.zzrt);
        zzbv.zzfk().initialize(this.zzvw.zzrt);
        if (((Boolean) zzkb.zzik().zzd(zznk.zzbci)).booleanValue()) {
            Timer timer = new Timer();
            timer.schedule(new zzb(this, new CountDownLatch(((Integer) zzkb.zzik().zzd(zznk.zzbck)).intValue()), timer), 0L, ((Long) zzkb.zzik().zzd(zznk.zzbcj)).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean zza(zzjj zzjjVar) {
        Bundle bundle = zzjjVar.zzaqg.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        return bundle == null || !bundle.containsKey("gw");
    }

    private static long zzq(String str) {
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            zzane.zzb("", e);
            return -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public void destroy() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: destroy");
        this.zzvv.cancel();
        this.zzvy.zzi(this.zzvw.zzacw);
        zzbw zzbwVar = this.zzvw;
        if (zzbwVar.zzacs != null) {
            zzbwVar.zzacs.zzfs();
        }
        zzbwVar.zzada = null;
        zzbwVar.zzadc = null;
        zzbwVar.zzadb = null;
        zzbwVar.zzado = null;
        zzbwVar.zzadd = null;
        zzbwVar.zzg(false);
        if (zzbwVar.zzacs != null) {
            zzbwVar.zzacs.removeAllViews();
        }
        zzbwVar.zzfm();
        zzbwVar.zzfn();
        zzbwVar.zzacw = null;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public String getAdUnitId() {
        return this.zzvw.zzacp;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public zzlo getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final boolean isLoading() {
        return this.zzvu;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final boolean isReady() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: isLoaded");
        return this.zzvw.zzact == null && this.zzvw.zzacu == null && this.zzvw.zzacw != null;
    }

    @Override // com.google.android.gms.internal.ads.zzjd
    public void onAdClicked() {
        if (this.zzvw.zzacw == null) {
            zzakb.zzdk("Ad state was null when trying to ping click URLs.");
            return;
        }
        zzakb.zzck("Pinging click URLs.");
        if (this.zzvw.zzacy != null) {
            this.zzvw.zzacy.zzpn();
        }
        if (this.zzvw.zzacw.zzbsn != null) {
            zzbv.zzek();
            zzakk.zza(this.zzvw.zzrt, this.zzvw.zzacr.zzcw, zzc(this.zzvw.zzacw.zzbsn));
        }
        if (this.zzvw.zzacz != null) {
            try {
                this.zzvw.zzacz.onAdClicked();
            } catch (RemoteException e) {
                zzakb.zzd("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzd
    public final void onAppEvent(String str, String str2) {
        if (this.zzvw.zzadb != null) {
            try {
                this.zzvw.zzadb.onAppEvent(str, str2);
            } catch (RemoteException e) {
                zzakb.zzd("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public void pause() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: pause");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public void resume() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: resume");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public void setImmersiveMode(boolean z) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public void setManualImpressionsEnabled(boolean z) {
        zzakb.zzdk("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void setUserId(String str) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setUserId");
        this.zzvw.zzadr = str;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void stopLoading() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: stopLoading");
        this.zzvu = false;
        this.zzvw.zzg(true);
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public void zza(zzaaw zzaawVar) {
        zzakb.zzdk("#006 Unexpected call to a deprecated method.");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzabc zzabcVar, String str) {
        zzakb.zzdk("#006 Unexpected call to a deprecated method.");
    }

    public final void zza(zzagx zzagxVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzvw.zzadq = zzagxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzahe zzaheVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedVideoAdListener");
        this.zzvw.zzadp = zzaheVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(zzaig zzaigVar) {
        if (this.zzvw.zzadp == null) {
            return;
        }
        String str = "";
        int i = 1;
        if (zzaigVar != null) {
            try {
                str = zzaigVar.type;
                i = zzaigVar.zzcmk;
            } catch (RemoteException e) {
                zzakb.zzd("#007 Could not call remote method.", e);
                return;
            }
        }
        zzagp zzagpVar = new zzagp(str, i);
        this.zzvw.zzadp.zza(zzagpVar);
        if (this.zzvw.zzadq != null) {
            this.zzvw.zzadq.zza(zzagpVar, this.zzvw.zzacx.zzcgs.zzcdi);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadj
    public final void zza(zzaji zzajiVar) {
        if (zzajiVar.zzcos.zzceu != -1 && !TextUtils.isEmpty(zzajiVar.zzcos.zzcfd)) {
            long zzq = zzq(zzajiVar.zzcos.zzcfd);
            if (zzq != -1) {
                this.zzvr.zza(this.zzvr.zzd(zzajiVar.zzcos.zzceu + zzq), "stc");
            }
        }
        this.zzvr.zzan(zzajiVar.zzcos.zzcfd);
        this.zzvr.zza(this.zzvs, "arf");
        this.zzvt = this.zzvr.zzjj();
        this.zzvr.zze("gqi", zzajiVar.zzcos.zzamj);
        this.zzvw.zzact = null;
        this.zzvw.zzacx = zzajiVar;
        zzajiVar.zzcoq.zza(new zzc(this, zzajiVar));
        zzajiVar.zzcoq.zza(zzhu.zza.zzb.AD_LOADED);
        zza(zzajiVar, this.zzvr);
    }

    protected abstract void zza(zzaji zzajiVar, zznx zznxVar);

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzjn zzjnVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setAdSize");
        this.zzvw.zzacv = zzjnVar;
        if (this.zzvw.zzacw != null && this.zzvw.zzacw.zzbyo != null && this.zzvw.zzadv == 0) {
            this.zzvw.zzacw.zzbyo.zza(zzasi.zzb(zzjnVar));
        }
        if (this.zzvw.zzacs == null) {
            return;
        }
        if (this.zzvw.zzacs.getChildCount() > 1) {
            this.zzvw.zzacs.removeView(this.zzvw.zzacs.getNextView());
        }
        this.zzvw.zzacs.setMinimumWidth(zzjnVar.widthPixels);
        this.zzvw.zzacs.setMinimumHeight(zzjnVar.heightPixels);
        this.zzvw.zzacs.requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzke zzkeVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setAdClickListener");
        this.zzvw.zzacz = zzkeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzkh zzkhVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setAdListener");
        this.zzvw.zzada = zzkhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzkx zzkxVar) {
        this.zzvw.zzadc = zzkxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzla zzlaVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setAppEventListener");
        this.zzvw.zzadb = zzlaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzlg zzlgVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCorrelationIdProvider");
        this.zzvw.zzadd = zzlgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzlu zzluVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setIconAdOptions");
        this.zzvw.zzadl = zzluVar;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzmu zzmuVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setVideoOptions");
        this.zzvw.zzadk = zzmuVar;
    }

    public final void zza(zznv zznvVar) {
        this.zzvr = new zznx(((Boolean) zzkb.zzik().zzd(zznk.zzawh)).booleanValue(), "load_ad", this.zzvw.zzacv.zzarb);
        this.zzvt = new zznv(-1L, null, null);
        if (zznvVar == null) {
            this.zzvs = new zznv(-1L, null, null);
        } else {
            this.zzvs = new zznv(zznvVar.getTime(), zznvVar.zzjg(), zznvVar.zzjh());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public void zza(zzod zzodVar) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzb
    public final void zza(String str, Bundle bundle) {
        this.zzvz.putAll(bundle);
        if (!this.zzwa || this.zzvw.zzadc == null) {
            return;
        }
        try {
            this.zzvw.zzadc.zzt();
        } catch (RemoteException e) {
            zzakb.zzd("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final void zza(HashSet<zzajj> hashSet) {
        this.zzvw.zza(hashSet);
    }

    boolean zza(zzajh zzajhVar) {
        return false;
    }

    protected abstract boolean zza(zzajh zzajhVar, zzajh zzajhVar2);

    protected abstract boolean zza(zzjj zzjjVar, zznx zznxVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final List<String> zzb(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(zzajb.zzc(str, this.zzvw.zzrt));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public void zzb(zzajh zzajhVar) {
        zzhs zzhsVar;
        zzhu.zza.zzb zzbVar;
        this.zzvr.zza(this.zzvt, "awr");
        this.zzvw.zzacu = null;
        if (zzajhVar.errorCode != -2 && zzajhVar.errorCode != 3 && this.zzvw.zzfl() != null) {
            zzbv.zzep().zzb(this.zzvw.zzfl());
        }
        if (zzajhVar.errorCode == -1) {
            this.zzvu = false;
            return;
        }
        if (zza(zzajhVar)) {
            zzakb.zzck("Ad refresh scheduled.");
        }
        if (zzajhVar.errorCode != -2) {
            if (zzajhVar.errorCode == 3) {
                zzhsVar = zzajhVar.zzcoq;
                zzbVar = zzhu.zza.zzb.AD_FAILED_TO_LOAD_NO_FILL;
            } else {
                zzhsVar = zzajhVar.zzcoq;
                zzbVar = zzhu.zza.zzb.AD_FAILED_TO_LOAD;
            }
            zzhsVar.zza(zzbVar);
            zzi(zzajhVar.errorCode);
            return;
        }
        if (this.zzvw.zzadt == null) {
            zzbw zzbwVar = this.zzvw;
            zzbwVar.zzadt = new zzaju(zzbwVar.zzacp);
        }
        if (this.zzvw.zzacs != null) {
            this.zzvw.zzacs.zzfr().zzdc(zzajhVar.zzcfl);
        }
        this.zzvy.zzh(this.zzvw.zzacw);
        if (zza(this.zzvw.zzacw, zzajhVar)) {
            this.zzvw.zzacw = zzajhVar;
            zzbw zzbwVar2 = this.zzvw;
            if (zzbwVar2.zzacy != null) {
                if (zzbwVar2.zzacw != null) {
                    zzbwVar2.zzacy.zzh(zzbwVar2.zzacw.zzcoh);
                    zzbwVar2.zzacy.zzi(zzbwVar2.zzacw.zzcoi);
                    zzbwVar2.zzacy.zzz(zzbwVar2.zzacw.zzceq);
                }
                zzbwVar2.zzacy.zzy(zzbwVar2.zzacv.zzarc);
            }
            this.zzvr.zze("is_mraid", this.zzvw.zzacw.zzfz() ? "1" : "0");
            this.zzvr.zze("is_mediation", this.zzvw.zzacw.zzceq ? "1" : "0");
            if (this.zzvw.zzacw.zzbyo != null && this.zzvw.zzacw.zzbyo.zzuf() != null) {
                this.zzvr.zze("is_delay_pl", this.zzvw.zzacw.zzbyo.zzuf().zzux() ? "1" : "0");
            }
            this.zzvr.zza(this.zzvs, "ttc");
            if (zzbv.zzeo().zzpy() != null) {
                zzbv.zzeo().zzpy().zza(this.zzvr);
            }
            zzbv();
            if (this.zzvw.zzfo()) {
                zzbq();
            }
        }
        if (zzajhVar.zzbsr != null) {
            zzbv.zzek().zza(this.zzvw.zzrt, zzajhVar.zzbsr);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzb(boolean z) {
        zzakb.v("Ad finished loading.");
        this.zzvu = z;
        this.zzwa = true;
        if (this.zzvw.zzada != null) {
            try {
                this.zzvw.zzada.onAdLoaded();
            } catch (RemoteException e) {
                zzakb.zzd("#007 Could not call remote method.", e);
            }
        }
        if (this.zzvw.zzadp != null) {
            try {
                this.zzvw.zzadp.onRewardedVideoAdLoaded();
            } catch (RemoteException e2) {
                zzakb.zzd("#007 Could not call remote method.", e2);
            }
        }
        if (this.zzvw.zzadc != null) {
            try {
                this.zzvw.zzadc.zzt();
            } catch (RemoteException e3) {
                zzakb.zzd("#007 Could not call remote method.", e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public boolean zzb(zzjj zzjjVar) {
        String sb;
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: loadAd");
        zzbv.zzeq().zzhh();
        this.zzvz.clear();
        this.zzwa = false;
        if (((Boolean) zzkb.zzik().zzd(zznk.zzayo)).booleanValue()) {
            zzjjVar = zzjjVar.zzhv();
            if (((Boolean) zzkb.zzik().zzd(zznk.zzayp)).booleanValue()) {
                zzjjVar.extras.putBoolean(AdMobAdapter.NEW_BUNDLE, true);
            }
        }
        if (DeviceProperties.isSidewinder(this.zzvw.zzrt) && zzjjVar.zzaqe != null) {
            zzjjVar = new zzjk(zzjjVar).zza(null).zzhw();
        }
        if (this.zzvw.zzact != null || this.zzvw.zzacu != null) {
            zzakb.zzdk(this.zzvx != null ? "Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes." : "Loading already in progress, saving this object for future refreshes.");
            this.zzvx = zzjjVar;
            return false;
        }
        zzakb.zzdj("Starting ad request.");
        zza((zznv) null);
        this.zzvs = this.zzvr.zzjj();
        if (zzjjVar.zzapz) {
            sb = "This request is sent from a test device.";
        } else {
            zzkb.zzif();
            String zzbc = zzamu.zzbc(this.zzvw.zzrt);
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzbc).length() + 71);
            sb2.append("Use AdRequest.Builder.addTestDevice(\"");
            sb2.append(zzbc);
            sb2.append("\") to get test ads on this device.");
            sb = sb2.toString();
        }
        zzakb.zzdj(sb);
        this.zzvv.zzf(zzjjVar);
        boolean zza = zza(zzjjVar, this.zzvr);
        this.zzvu = zza;
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final Bundle zzba() {
        return this.zzwa ? this.zzvz : new Bundle();
    }

    public final zzw zzbi() {
        return this.zzwc;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final IObjectWrapper zzbj() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: getAdFrame");
        return ObjectWrapper.wrap(this.zzvw.zzacs);
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final zzjn zzbk() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: getAdSize");
        if (this.zzvw.zzacv == null) {
            return null;
        }
        return new zzms(this.zzvw.zzacv);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzt
    public final void zzbl() {
        zzbo();
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zzbm() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: recordManualImpression");
        if (this.zzvw.zzacw == null) {
            zzakb.zzdk("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        zzakb.zzck("Pinging manual tracking URLs.");
        if (this.zzvw.zzacw.zzcoo) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.zzvw.zzacw.zzces != null) {
            arrayList.addAll(this.zzvw.zzacw.zzces);
        }
        if (this.zzvw.zzacw.zzbtw != null && this.zzvw.zzacw.zzbtw.zzbrz != null) {
            arrayList.addAll(this.zzvw.zzacw.zzbtw.zzbrz);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        zzbv.zzek();
        zzakk.zza(this.zzvw.zzrt, this.zzvw.zzacr.zzcw, arrayList);
        this.zzvw.zzacw.zzcoo = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzbn() {
        zzakb.v("Ad closing.");
        if (this.zzvw.zzada != null) {
            try {
                this.zzvw.zzada.onAdClosed();
            } catch (RemoteException e) {
                zzakb.zzd("#007 Could not call remote method.", e);
            }
        }
        if (this.zzvw.zzadp != null) {
            try {
                this.zzvw.zzadp.onRewardedVideoAdClosed();
            } catch (RemoteException e2) {
                zzakb.zzd("#007 Could not call remote method.", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzbo() {
        zzakb.v("Ad leaving application.");
        if (this.zzvw.zzada != null) {
            try {
                this.zzvw.zzada.onAdLeftApplication();
            } catch (RemoteException e) {
                zzakb.zzd("#007 Could not call remote method.", e);
            }
        }
        if (this.zzvw.zzadp != null) {
            try {
                this.zzvw.zzadp.onRewardedVideoAdLeftApplication();
            } catch (RemoteException e2) {
                zzakb.zzd("#007 Could not call remote method.", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzbp() {
        zzakb.v("Ad opening.");
        if (this.zzvw.zzada != null) {
            try {
                this.zzvw.zzada.onAdOpened();
            } catch (RemoteException e) {
                zzakb.zzd("#007 Could not call remote method.", e);
            }
        }
        if (this.zzvw.zzadp != null) {
            try {
                this.zzvw.zzadp.onRewardedVideoAdOpened();
            } catch (RemoteException e2) {
                zzakb.zzd("#007 Could not call remote method.", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzbq() {
        zzb(false);
    }

    public final void zzbr() {
        zzakb.zzdj("Ad impression.");
        if (this.zzvw.zzada != null) {
            try {
                this.zzvw.zzada.onAdImpression();
            } catch (RemoteException e) {
                zzakb.zzd("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zzbs() {
        zzakb.zzdj("Ad clicked.");
        if (this.zzvw.zzada != null) {
            try {
                this.zzvw.zzada.onAdClicked();
            } catch (RemoteException e) {
                zzakb.zzd("#007 Could not call remote method.", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzbt() {
        if (this.zzvw.zzadp == null) {
            return;
        }
        try {
            this.zzvw.zzadp.onRewardedVideoStarted();
        } catch (RemoteException e) {
            zzakb.zzd("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzbu() {
        if (this.zzvw.zzadp == null) {
            return;
        }
        try {
            this.zzvw.zzadp.onRewardedVideoCompleted();
        } catch (RemoteException e) {
            zzakb.zzd("#007 Could not call remote method.", e);
        }
    }

    public final void zzbv() {
        zzajh zzajhVar = this.zzvw.zzacw;
        if (zzajhVar == null || TextUtils.isEmpty(zzajhVar.zzcfl) || zzajhVar.zzcop || !zzbv.zzeu().zzrx()) {
            return;
        }
        zzakb.zzck("Sending troubleshooting signals to the server.");
        zzbv.zzeu().zzb(this.zzvw.zzrt, this.zzvw.zzacr.zzcw, zzajhVar.zzcfl, this.zzvw.zzacp);
        zzajhVar.zzcop = true;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final zzla zzbw() {
        return this.zzvw.zzadb;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final zzkh zzbx() {
        return this.zzvw.zzada;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzby() {
        if (this.zzwb != null) {
            zzbv.zzfa().zzn(this.zzwb);
            this.zzwb = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzbz() {
        zzaji zzajiVar = this.zzvw.zzacx;
        if (zzajiVar == null || zzajiVar.zzcos == null) {
            return "javascript";
        }
        String str = zzajiVar.zzcos.zzcfq;
        if (TextUtils.isEmpty(str)) {
            return "javascript";
        }
        try {
            if (new JSONObject(str).optInt("media_type", -1) == 0) {
                return null;
            }
            return "javascript";
        } catch (JSONException e) {
            zzane.zzc("", e);
            return "javascript";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final List<String> zzc(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(zzajb.zzb(str, this.zzvw.zzrt));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzc(int i, boolean z) {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Failed to load ad: ");
        sb.append(i);
        zzakb.zzdk(sb.toString());
        this.zzvu = z;
        if (this.zzvw.zzada != null) {
            try {
                this.zzvw.zzada.onAdFailedToLoad(i);
            } catch (RemoteException e) {
                zzakb.zzd("#007 Could not call remote method.", e);
            }
        }
        if (this.zzvw.zzadp != null) {
            try {
                this.zzvw.zzadp.onRewardedVideoAdFailedToLoad(i);
            } catch (RemoteException e2) {
                zzakb.zzd("#007 Could not call remote method.", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean zzc(zzjj zzjjVar) {
        if (this.zzvw.zzacs == null) {
            return false;
        }
        ViewParent parent = this.zzvw.zzacs.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            return zzbv.zzek().zza(view, view.getContext());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzg(View view) {
        zzbx zzbxVar = this.zzvw.zzacs;
        if (zzbxVar != null) {
            zzbxVar.addView(view, zzbv.zzem().zzro());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzi(int i) {
        zzc(i, false);
    }
}
