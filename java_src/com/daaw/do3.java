package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbsj;
import com.google.android.gms.internal.ads.zzbye;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class do3 extends cn3 {

    /* renamed from: p */
    public final Object f7575p;

    /* renamed from: q */
    public fo3 f7576q;

    /* renamed from: r */
    public pv3 f7577r;

    /* renamed from: s */
    public yd0 f7578s;

    /* renamed from: t */
    public View f7579t;

    /* renamed from: u */
    public MediationInterstitialAd f7580u;

    /* renamed from: v */
    public UnifiedNativeAdMapper f7581v;

    /* renamed from: w */
    public MediationRewardedAd f7582w;

    /* renamed from: x */
    public MediationInterscrollerAd f7583x;

    /* renamed from: y */
    public MediationAppOpenAd f7584y;

    /* renamed from: z */
    public final String f7585z = "";

    public do3(Adapter adapter) {
        this.f7575p = adapter;
    }

    public do3(MediationAdapter mediationAdapter) {
        this.f7575p = mediationAdapter;
    }

    /* renamed from: m3 */
    public static final boolean m24126m3(zzl zzlVar) {
        if (zzlVar.zzf) {
            return true;
        }
        zzay.zzb();
        return d04.m24808x();
    }

    /* renamed from: n3 */
    public static final String m24125n3(String str, zzl zzlVar) {
        String str2 = zzlVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.daaw.dn3
    /* renamed from: D0 */
    public final void mo24148D0(yd0 yd0Var, zzl zzlVar, String str, String str2, gn3 gn3Var) {
        RemoteException remoteException;
        Object obj = this.f7575p;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof Adapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f7575p.getClass().getCanonicalName();
            k04.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
        k04.zze("Requesting interstitial ad from adapter.");
        Object obj2 = this.f7575p;
        if (!(obj2 instanceof MediationInterstitialAdapter)) {
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) nt0.m14831M(yd0Var), "", m24127l3(str, zzlVar, str2), m24128k3(zzlVar), m24126m3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m24125n3(str, zzlVar), this.f7585z), new zn3(this, gn3Var));
                    return;
                } finally {
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
            List list = zzlVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzlVar.zzb;
            vn3 vn3Var = new vn3(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, m24126m3(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, m24125n3(str, zzlVar));
            Bundle bundle = zzlVar.zzm;
            mediationInterstitialAdapter.requestInterstitialAd((Context) nt0.m14831M(yd0Var), new fo3(gn3Var), m24127l3(str, zzlVar, str2), vn3Var, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } finally {
        }
    }

    @Override // com.daaw.dn3
    /* renamed from: D1 */
    public final void mo24147D1(yd0 yd0Var) {
        Object obj = this.f7575p;
        if ((obj instanceof Adapter) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                mo24134h();
                return;
            }
            k04.zze("Show interstitial ad from adapter.");
            MediationInterstitialAd mediationInterstitialAd = this.f7580u;
            if (mediationInterstitialAd != null) {
                mediationInterstitialAd.showAd((Context) nt0.m14831M(yd0Var));
                return;
            } else {
                k04.zzg("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.f7575p.getClass().getCanonicalName();
        k04.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
        throw new RemoteException();
    }

    @Override // com.daaw.dn3
    /* renamed from: I2 */
    public final void mo24146I2(yd0 yd0Var, pv3 pv3Var, List list) {
        k04.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.daaw.dn3
    /* renamed from: J1 */
    public final void mo24145J1(yd0 yd0Var, zzl zzlVar, String str, pv3 pv3Var, String str2) {
        Object obj = this.f7575p;
        if (obj instanceof Adapter) {
            this.f7578s = yd0Var;
            this.f7577r = pv3Var;
            pv3Var.mo1935B1(nt0.m14830g3(obj));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f7575p.getClass().getCanonicalName();
        k04.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.daaw.dn3
    /* renamed from: N0 */
    public final void mo24144N0(yd0 yd0Var) {
        if (this.f7575p instanceof Adapter) {
            k04.zze("Show app open ad from adapter.");
            MediationAppOpenAd mediationAppOpenAd = this.f7584y;
            if (mediationAppOpenAd != null) {
                mediationAppOpenAd.showAd((Context) nt0.m14831M(yd0Var));
                return;
            } else {
                k04.zzg("Can not show null mediation app open ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f7575p.getClass().getCanonicalName();
        k04.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.daaw.dn3
    /* renamed from: R0 */
    public final void mo24143R0(yd0 yd0Var, zzl zzlVar, String str, String str2, gn3 gn3Var, zzblz zzblzVar, List list) {
        RemoteException remoteException;
        Object obj = this.f7575p;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof Adapter)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f7575p.getClass().getCanonicalName();
            k04.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
        k04.zze("Requesting native ad from adapter.");
        Object obj2 = this.f7575p;
        if (!(obj2 instanceof MediationNativeAdapter)) {
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadNativeAd(new MediationNativeAdConfiguration((Context) nt0.m14831M(yd0Var), "", m24127l3(str, zzlVar, str2), m24128k3(zzlVar), m24126m3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m24125n3(str, zzlVar), this.f7585z, zzblzVar), new ao3(this, gn3Var));
                    return;
                } finally {
                }
            }
            return;
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
            List list2 = zzlVar.zze;
            HashSet hashSet = list2 != null ? new HashSet(list2) : null;
            long j = zzlVar.zzb;
            ho3 ho3Var = new ho3(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, m24126m3(zzlVar), zzlVar.zzg, zzblzVar, list, zzlVar.zzr, zzlVar.zzt, m24125n3(str, zzlVar));
            Bundle bundle = zzlVar.zzm;
            Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.f7576q = new fo3(gn3Var);
            mediationNativeAdapter.requestNativeAd((Context) nt0.m14831M(yd0Var), this.f7576q, m24127l3(str, zzlVar, str2), ho3Var, bundle2);
        } finally {
        }
    }

    @Override // com.daaw.dn3
    /* renamed from: V1 */
    public final void mo24142V1(yd0 yd0Var) {
        if (this.f7575p instanceof Adapter) {
            k04.zze("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.f7582w;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) nt0.m14831M(yd0Var));
                return;
            } else {
                k04.zzg("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f7575p.getClass().getCanonicalName();
        k04.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.daaw.dn3
    /* renamed from: W */
    public final void mo24141W(yd0 yd0Var, zzl zzlVar, String str, gn3 gn3Var) {
        if (this.f7575p instanceof Adapter) {
            k04.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) this.f7575p).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) nt0.m14831M(yd0Var), "", m24127l3(str, zzlVar, null), m24128k3(zzlVar), m24126m3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m24125n3(str, zzlVar), ""), new bo3(this, gn3Var));
                return;
            } catch (Exception e) {
                k04.zzh("", e);
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f7575p.getClass().getCanonicalName();
        k04.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.daaw.dn3
    /* renamed from: W1 */
    public final void mo24140W1(boolean z) {
        Object obj = this.f7575p;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                k04.zzh("", th);
                return;
            }
        }
        String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
        String canonicalName2 = this.f7575p.getClass().getCanonicalName();
        k04.zze(canonicalName + " #009 Class mismatch: " + canonicalName2);
    }

    @Override // com.daaw.dn3
    /* renamed from: X0 */
    public final void mo24139X0(yd0 yd0Var, zzq zzqVar, zzl zzlVar, String str, String str2, gn3 gn3Var) {
        if (this.f7575p instanceof Adapter) {
            k04.zze("Requesting interscroller ad from adapter.");
            try {
                Adapter adapter = (Adapter) this.f7575p;
                adapter.loadInterscrollerAd(new MediationBannerAdConfiguration((Context) nt0.m14831M(yd0Var), "", m24127l3(str, zzlVar, str2), m24128k3(zzlVar), m24126m3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m24125n3(str, zzlVar), zzb.zze(zzqVar.zze, zzqVar.zzb), ""), new wn3(this, gn3Var, adapter));
                return;
            } catch (Exception e) {
                k04.zzh("", e);
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f7575p.getClass().getCanonicalName();
        k04.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.daaw.dn3
    /* renamed from: b3 */
    public final void mo24138b3(yd0 yd0Var, zzq zzqVar, zzl zzlVar, String str, gn3 gn3Var) {
        mo24129k1(yd0Var, zzqVar, zzlVar, str, null, gn3Var);
    }

    @Override // com.daaw.dn3
    /* renamed from: d */
    public final void mo24137d() {
        Object obj = this.f7575p;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                k04.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.daaw.dn3
    /* renamed from: e3 */
    public final void mo24136e3(zzl zzlVar, String str, String str2) {
        Object obj = this.f7575p;
        if (obj instanceof Adapter) {
            mo24121q2(this.f7578s, zzlVar, str, new go3((Adapter) obj, this.f7577r));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f7575p.getClass().getCanonicalName();
        k04.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.daaw.dn3
    /* renamed from: h */
    public final void mo24134h() {
        if (this.f7575p instanceof MediationInterstitialAdapter) {
            k04.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f7575p).showInterstitial();
                return;
            } catch (Throwable th) {
                k04.zzh("", th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = this.f7575p.getClass().getCanonicalName();
        k04.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.daaw.dn3
    /* renamed from: i0 */
    public final void mo24132i0(yd0 yd0Var, dj3 dj3Var, List list) {
        char c;
        if (!(this.f7575p instanceof Adapter)) {
            throw new RemoteException();
        }
        xn3 xn3Var = new xn3(this, dj3Var);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbsj zzbsjVar = (zzbsj) it.next();
            String str = zzbsjVar.f36870p;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1167692200:
                    if (str.equals("app_open")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            AdFormat adFormat = c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? c != 5 ? null : AdFormat.APP_OPEN_AD : AdFormat.NATIVE : AdFormat.REWARDED_INTERSTITIAL : AdFormat.REWARDED : AdFormat.INTERSTITIAL : AdFormat.BANNER;
            if (adFormat != null) {
                arrayList.add(new MediationConfiguration(adFormat, zzbsjVar.f36871q));
            }
        }
        ((Adapter) this.f7575p).initialize((Context) nt0.m14831M(yd0Var), xn3Var, arrayList);
    }

    @Override // com.daaw.dn3
    /* renamed from: k1 */
    public final void mo24129k1(yd0 yd0Var, zzq zzqVar, zzl zzlVar, String str, String str2, gn3 gn3Var) {
        RemoteException remoteException;
        Object obj = this.f7575p;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof Adapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f7575p.getClass().getCanonicalName();
            k04.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
        k04.zze("Requesting banner ad from adapter.");
        AdSize zzd = zzqVar.zzn ? zzb.zzd(zzqVar.zze, zzqVar.zzb) : zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza);
        Object obj2 = this.f7575p;
        if (!(obj2 instanceof MediationBannerAdapter)) {
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) nt0.m14831M(yd0Var), "", m24127l3(str, zzlVar, str2), m24128k3(zzlVar), m24126m3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m24125n3(str, zzlVar), zzd, this.f7585z), new yn3(this, gn3Var));
                    return;
                } finally {
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
            List list = zzlVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzlVar.zzb;
            vn3 vn3Var = new vn3(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, m24126m3(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, m24125n3(str, zzlVar));
            Bundle bundle = zzlVar.zzm;
            mediationBannerAdapter.requestBannerAd((Context) nt0.m14831M(yd0Var), new fo3(gn3Var), m24127l3(str, zzlVar, str2), zzd, vn3Var, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } finally {
        }
    }

    /* renamed from: k3 */
    public final Bundle m24128k3(zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f7575p.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    /* renamed from: l3 */
    public final Bundle m24127l3(String str, zzl zzlVar, String str2) {
        k04.zze("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f7575p instanceof AdMobAdapter) {
                bundle.putString(AdMobAdapter.AD_JSON_PARAMETER, str2);
                if (zzlVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzlVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            k04.zzh("", th);
            throw new RemoteException();
        }
    }

    @Override // com.daaw.dn3
    /* renamed from: p */
    public final void mo24123p() {
        if (this.f7575p instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.f7582w;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) nt0.m14831M(this.f7578s));
                return;
            } else {
                k04.zzg("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f7575p.getClass().getCanonicalName();
        k04.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.daaw.dn3
    /* renamed from: q2 */
    public final void mo24121q2(yd0 yd0Var, zzl zzlVar, String str, gn3 gn3Var) {
        if (this.f7575p instanceof Adapter) {
            k04.zze("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) this.f7575p).loadRewardedAd(new MediationRewardedAdConfiguration((Context) nt0.m14831M(yd0Var), "", m24127l3(str, zzlVar, null), m24128k3(zzlVar), m24126m3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m24125n3(str, zzlVar), ""), new bo3(this, gn3Var));
                return;
            } catch (Exception e) {
                k04.zzh("", e);
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f7575p.getClass().getCanonicalName();
        k04.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.daaw.dn3
    /* renamed from: t2 */
    public final void mo24119t2(yd0 yd0Var) {
        Context context = (Context) nt0.m14831M(yd0Var);
        Object obj = this.f7575p;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.daaw.dn3
    /* renamed from: v2 */
    public final void mo24118v2(zzl zzlVar, String str) {
        mo24136e3(zzlVar, str, null);
    }

    @Override // com.daaw.dn3
    /* renamed from: x2 */
    public final void mo24117x2(yd0 yd0Var, zzl zzlVar, String str, gn3 gn3Var) {
        if (this.f7575p instanceof Adapter) {
            k04.zze("Requesting app open ad from adapter.");
            try {
                ((Adapter) this.f7575p).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) nt0.m14831M(yd0Var), "", m24127l3(str, zzlVar, null), m24128k3(zzlVar), m24126m3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m24125n3(str, zzlVar), ""), new co3(this, gn3Var));
                return;
            } catch (Exception e) {
                k04.zzh("", e);
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f7575p.getClass().getCanonicalName();
        k04.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.daaw.dn3
    /* renamed from: y0 */
    public final void mo24116y0(yd0 yd0Var, zzl zzlVar, String str, gn3 gn3Var) {
        mo24148D0(yd0Var, zzlVar, str, null, gn3Var);
    }

    @Override // com.daaw.dn3
    public final void zzE() {
        Object obj = this.f7575p;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                k04.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.daaw.dn3
    public final boolean zzM() {
        return false;
    }

    @Override // com.daaw.dn3
    public final boolean zzN() {
        if (this.f7575p instanceof Adapter) {
            return this.f7577r != null;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f7575p.getClass().getCanonicalName();
        k04.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.daaw.dn3
    public final on3 zzO() {
        return null;
    }

    @Override // com.daaw.dn3
    public final pn3 zzP() {
        return null;
    }

    @Override // com.daaw.dn3
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // com.daaw.dn3
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // com.daaw.dn3
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.daaw.dn3
    public final zzdq zzh() {
        Object obj = this.f7575p;
        if (obj instanceof zza) {
            try {
                return ((zza) obj).getVideoController();
            } catch (Throwable th) {
                k04.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.daaw.dn3
    public final sd3 zzi() {
        fo3 fo3Var = this.f7576q;
        if (fo3Var != null) {
            NativeCustomTemplateAd m22445a = fo3Var.m22445a();
            if (m22445a instanceof td3) {
                return ((td3) m22445a).m9280a();
            }
            return null;
        }
        return null;
    }

    @Override // com.daaw.dn3
    public final mn3 zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.f7583x;
        if (mediationInterscrollerAd != null) {
            return new eo3(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.daaw.dn3
    public final sn3 zzk() {
        UnifiedNativeAdMapper unifiedNativeAdMapper;
        UnifiedNativeAdMapper m22444b;
        Object obj = this.f7575p;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof Adapter) || (unifiedNativeAdMapper = this.f7581v) == null) {
                return null;
            }
            return new io3(unifiedNativeAdMapper);
        }
        fo3 fo3Var = this.f7576q;
        if (fo3Var == null || (m22444b = fo3Var.m22444b()) == null) {
            return null;
        }
        return new io3(m22444b);
    }

    @Override // com.daaw.dn3
    public final zzbye zzl() {
        Object obj = this.f7575p;
        if (obj instanceof Adapter) {
            return zzbye.m1099h(((Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.daaw.dn3
    public final zzbye zzm() {
        Object obj = this.f7575p;
        if (obj instanceof Adapter) {
            return zzbye.m1099h(((Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.daaw.dn3
    public final yd0 zzn() {
        Object obj = this.f7575p;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return nt0.m14830g3(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                k04.zzh("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            return nt0.m14830g3(this.f7579t);
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f7575p.getClass().getCanonicalName();
            k04.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    @Override // com.daaw.dn3
    public final void zzo() {
        Object obj = this.f7575p;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                k04.zzh("", th);
                throw new RemoteException();
            }
        }
    }
}
