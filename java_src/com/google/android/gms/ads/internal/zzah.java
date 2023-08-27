package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import androidx.collection.SimpleArrayMap;
import com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerRootLocal;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzakk;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zzkh;
import com.google.android.gms.internal.ads.zzkl;
import com.google.android.gms.internal.ads.zzlg;
import com.google.android.gms.internal.ads.zznk;
import com.google.android.gms.internal.ads.zzpl;
import com.google.android.gms.internal.ads.zzqw;
import com.google.android.gms.internal.ads.zzqz;
import com.google.android.gms.internal.ads.zzrc;
import com.google.android.gms.internal.ads.zzrf;
import com.google.android.gms.internal.ads.zzri;
import com.google.android.gms.internal.ads.zzrl;
import com.google.android.gms.internal.ads.zzxn;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzah extends zzkl {
    private final Context mContext;
    private final zzw zzwc;
    private final zzxn zzwh;
    private final zzkh zzxs;
    private final zzqw zzxt;
    private final zzrl zzxu;
    private final zzqz zzxv;
    private final zzri zzxw;
    private final zzjn zzxx;
    private final PublisherAdViewOptions zzxy;
    private final SimpleArrayMap<String, zzrf> zzxz;
    private final SimpleArrayMap<String, zzrc> zzya;
    private final zzpl zzyb;
    private final zzlg zzyd;
    private final String zzye;
    private final zzang zzyf;
    private WeakReference<zzd> zzyg;
    private final Object mLock = new Object();
    private final List<String> zzyc = zzdg();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzah(Context context, String str, zzxn zzxnVar, zzang zzangVar, zzkh zzkhVar, zzqw zzqwVar, zzrl zzrlVar, zzqz zzqzVar, SimpleArrayMap<String, zzrf> simpleArrayMap, SimpleArrayMap<String, zzrc> simpleArrayMap2, zzpl zzplVar, zzlg zzlgVar, zzw zzwVar, zzri zzriVar, zzjn zzjnVar, PublisherAdViewOptions publisherAdViewOptions) {
        this.mContext = context;
        this.zzye = str;
        this.zzwh = zzxnVar;
        this.zzyf = zzangVar;
        this.zzxs = zzkhVar;
        this.zzxv = zzqzVar;
        this.zzxt = zzqwVar;
        this.zzxu = zzrlVar;
        this.zzxz = simpleArrayMap;
        this.zzya = simpleArrayMap2;
        this.zzyb = zzplVar;
        this.zzyd = zzlgVar;
        this.zzwc = zzwVar;
        this.zzxw = zzriVar;
        this.zzxx = zzjnVar;
        this.zzxy = publisherAdViewOptions;
        zznk.initialize(this.mContext);
    }

    private static void runOnUiThread(Runnable runnable) {
        zzakk.zzcrm.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zzjj zzjjVar, int i) {
        if (!((Boolean) zzkb.zzik().zzd(zznk.zzbcg)).booleanValue() && this.zzxu != null) {
            zzi(0);
            return;
        }
        Context context = this.mContext;
        zzbc zzbcVar = new zzbc(context, this.zzwc, zzjn.zzf(context), this.zzye, this.zzwh, this.zzyf);
        this.zzyg = new WeakReference<>(zzbcVar);
        zzqw zzqwVar = this.zzxt;
        Preconditions.checkMainThread("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        zzbcVar.zzvw.zzade = zzqwVar;
        zzrl zzrlVar = this.zzxu;
        Preconditions.checkMainThread("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
        zzbcVar.zzvw.zzadg = zzrlVar;
        zzqz zzqzVar = this.zzxv;
        Preconditions.checkMainThread("setOnContentAdLoadedListener must be called on the main UI thread.");
        zzbcVar.zzvw.zzadf = zzqzVar;
        SimpleArrayMap<String, zzrf> simpleArrayMap = this.zzxz;
        Preconditions.checkMainThread("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        zzbcVar.zzvw.zzadi = simpleArrayMap;
        zzbcVar.zza(this.zzxs);
        SimpleArrayMap<String, zzrc> simpleArrayMap2 = this.zzya;
        Preconditions.checkMainThread("setOnCustomClickListener must be called on the main UI thread.");
        zzbcVar.zzvw.zzadh = simpleArrayMap2;
        zzbcVar.zzd(zzdg());
        zzpl zzplVar = this.zzyb;
        Preconditions.checkMainThread("setNativeAdOptions must be called on the main UI thread.");
        zzbcVar.zzvw.zzadj = zzplVar;
        zzbcVar.zza(this.zzyd);
        zzbcVar.zzj(i);
        zzbcVar.zzb(zzjjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzde() {
        return ((Boolean) zzkb.zzik().zzd(zznk.zzaym)).booleanValue() && this.zzxw != null;
    }

    private final boolean zzdf() {
        if (this.zzxt == null && this.zzxv == null && this.zzxu == null) {
            SimpleArrayMap<String, zzrf> simpleArrayMap = this.zzxz;
            return simpleArrayMap != null && simpleArrayMap.size() > 0;
        }
        return true;
    }

    private final List<String> zzdg() {
        ArrayList arrayList = new ArrayList();
        if (this.zzxv != null) {
            arrayList.add("1");
        }
        if (this.zzxt != null) {
            arrayList.add("2");
        }
        if (this.zzxu != null) {
            arrayList.add(ContainerRootLocal.AddressMore);
        }
        if (this.zzxz.size() > 0) {
            arrayList.add("3");
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(zzjj zzjjVar) {
        if (!((Boolean) zzkb.zzik().zzd(zznk.zzbcg)).booleanValue() && this.zzxu != null) {
            zzi(0);
            return;
        }
        zzq zzqVar = new zzq(this.mContext, this.zzwc, this.zzxx, this.zzye, this.zzwh, this.zzyf);
        this.zzyg = new WeakReference<>(zzqVar);
        zzri zzriVar = this.zzxw;
        Preconditions.checkMainThread("setOnPublisherAdViewLoadedListener must be called on the main UI thread.");
        zzqVar.zzvw.zzadm = zzriVar;
        PublisherAdViewOptions publisherAdViewOptions = this.zzxy;
        if (publisherAdViewOptions != null) {
            if (publisherAdViewOptions.zzbg() != null) {
                zzqVar.zza(this.zzxy.zzbg());
            }
            zzqVar.setManualImpressionsEnabled(this.zzxy.getManualImpressionsEnabled());
        }
        zzqw zzqwVar = this.zzxt;
        Preconditions.checkMainThread("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        zzqVar.zzvw.zzade = zzqwVar;
        zzrl zzrlVar = this.zzxu;
        Preconditions.checkMainThread("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
        zzqVar.zzvw.zzadg = zzrlVar;
        zzqz zzqzVar = this.zzxv;
        Preconditions.checkMainThread("setOnContentAdLoadedListener must be called on the main UI thread.");
        zzqVar.zzvw.zzadf = zzqzVar;
        SimpleArrayMap<String, zzrf> simpleArrayMap = this.zzxz;
        Preconditions.checkMainThread("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        zzqVar.zzvw.zzadi = simpleArrayMap;
        SimpleArrayMap<String, zzrc> simpleArrayMap2 = this.zzya;
        Preconditions.checkMainThread("setOnCustomClickListener must be called on the main UI thread.");
        zzqVar.zzvw.zzadh = simpleArrayMap2;
        zzpl zzplVar = this.zzyb;
        Preconditions.checkMainThread("setNativeAdOptions must be called on the main UI thread.");
        zzqVar.zzvw.zzadj = zzplVar;
        zzqVar.zzd(zzdg());
        zzqVar.zza(this.zzxs);
        zzqVar.zza(this.zzyd);
        ArrayList arrayList = new ArrayList();
        if (zzdf()) {
            arrayList.add(1);
        }
        if (this.zzxw != null) {
            arrayList.add(2);
        }
        zzqVar.zze(arrayList);
        if (zzdf()) {
            zzjjVar.extras.putBoolean("ina", true);
        }
        if (this.zzxw != null) {
            zzjjVar.extras.putBoolean("iba", true);
        }
        zzqVar.zzb(zzjjVar);
    }

    private final void zzi(int i) {
        zzkh zzkhVar = this.zzxs;
        if (zzkhVar != null) {
            try {
                zzkhVar.onAdFailedToLoad(0);
            } catch (RemoteException e) {
                zzakb.zzc("Failed calling onAdFailedToLoad.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final String getMediationAdapterClassName() {
        synchronized (this.mLock) {
            if (this.zzyg != null) {
                zzd zzdVar = this.zzyg.get();
                return zzdVar != null ? zzdVar.getMediationAdapterClassName() : null;
            }
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final boolean isLoading() {
        synchronized (this.mLock) {
            if (this.zzyg != null) {
                zzd zzdVar = this.zzyg.get();
                return zzdVar != null ? zzdVar.isLoading() : false;
            }
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zza(zzjj zzjjVar, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Number of ads has to be more than 0");
        }
        runOnUiThread(new zzaj(this, zzjjVar, i));
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final String zzck() {
        synchronized (this.mLock) {
            if (this.zzyg != null) {
                zzd zzdVar = this.zzyg.get();
                return zzdVar != null ? zzdVar.zzck() : null;
            }
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzd(zzjj zzjjVar) {
        runOnUiThread(new zzai(this, zzjjVar));
    }
}
