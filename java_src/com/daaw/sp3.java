package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbye;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class sp3 extends cp3 {
    public final RtbAdapter p;
    public MediationInterstitialAd q;
    public MediationRewardedAd r;
    public MediationAppOpenAd s;
    public String t = "";

    public sp3(RtbAdapter rtbAdapter) {
        this.p = rtbAdapter;
    }

    public static final Bundle l3(String str) {
        k04.zzj("Server parameters: ".concat(String.valueOf(str)));
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
                return bundle2;
            }
            return bundle;
        } catch (JSONException e) {
            k04.zzh("", e);
            throw new RemoteException();
        }
    }

    public static final boolean m3(zzl zzlVar) {
        if (zzlVar.zzf) {
            return true;
        }
        zzay.zzb();
        return d04.x();
    }

    public static final String n3(String str, zzl zzlVar) {
        String str2 = zzlVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.daaw.dp3
    public final void E2(String str, String str2, zzl zzlVar, yd0 yd0Var, uo3 uo3Var, gn3 gn3Var) {
        try {
            this.p.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) nt0.M(yd0Var), str, l3(str2), k3(zzlVar), m3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, n3(str2, zzlVar), this.t), new kp3(this, uo3Var, gn3Var));
        } catch (Throwable th) {
            k04.zzh("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.daaw.dp3
    public final boolean L1(yd0 yd0Var) {
        MediationRewardedAd mediationRewardedAd = this.r;
        if (mediationRewardedAd != null) {
            try {
                mediationRewardedAd.showAd((Context) nt0.M(yd0Var));
                return true;
            } catch (Throwable th) {
                k04.zzh("", th);
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.dp3
    public final void N2(String str) {
        this.t = str;
    }

    @Override // com.daaw.dp3
    public final void Q(String str, String str2, zzl zzlVar, yd0 yd0Var, oo3 oo3Var, gn3 gn3Var) {
        try {
            this.p.loadRtbAppOpenAd(new MediationAppOpenAdConfiguration((Context) nt0.M(yd0Var), str, l3(str2), k3(zzlVar), m3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, n3(str2, zzlVar), this.t), new mp3(this, oo3Var, gn3Var));
        } catch (Throwable th) {
            k04.zzh("Adapter failed to render app open ad.", th);
            throw new RemoteException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.daaw.dp3
    public final void U(yd0 yd0Var, String str, Bundle bundle, Bundle bundle2, zzq zzqVar, gp3 gp3Var) {
        char c;
        AdFormat adFormat;
        try {
            qp3 qp3Var = new qp3(this, gp3Var);
            RtbAdapter rtbAdapter = this.p;
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
            if (c == 0) {
                adFormat = AdFormat.BANNER;
            } else if (c == 1) {
                adFormat = AdFormat.INTERSTITIAL;
            } else if (c == 2) {
                adFormat = AdFormat.REWARDED;
            } else if (c == 3) {
                adFormat = AdFormat.REWARDED_INTERSTITIAL;
            } else if (c == 4) {
                adFormat = AdFormat.NATIVE;
            } else if (c != 5) {
                throw new IllegalArgumentException("Internal Error");
            } else {
                adFormat = AdFormat.APP_OPEN_AD;
            }
            MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediationConfiguration);
            rtbAdapter.collectSignals(new RtbSignalData((Context) nt0.M(yd0Var), arrayList, bundle, zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), qp3Var);
        } catch (Throwable th) {
            k04.zzh("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    @Override // com.daaw.dp3
    public final void Z1(String str, String str2, zzl zzlVar, yd0 yd0Var, ap3 ap3Var, gn3 gn3Var) {
        try {
            this.p.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) nt0.M(yd0Var), str, l3(str2), k3(zzlVar), m3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, n3(str2, zzlVar), this.t), new rp3(this, ap3Var, gn3Var));
        } catch (Throwable th) {
            k04.zzh("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.daaw.dp3
    public final void b1(String str, String str2, zzl zzlVar, yd0 yd0Var, xo3 xo3Var, gn3 gn3Var, zzblz zzblzVar) {
        try {
            this.p.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) nt0.M(yd0Var), str, l3(str2), k3(zzlVar), m3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, n3(str2, zzlVar), this.t, zzblzVar), new lp3(this, xo3Var, gn3Var));
        } catch (Throwable th) {
            k04.zzh("Adapter failed to render native ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.daaw.dp3
    public final void c3(String str, String str2, zzl zzlVar, yd0 yd0Var, ro3 ro3Var, gn3 gn3Var, zzq zzqVar) {
        try {
            this.p.loadRtbInterscrollerAd(new MediationBannerAdConfiguration((Context) nt0.M(yd0Var), str, l3(str2), k3(zzlVar), m3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, n3(str2, zzlVar), zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.t), new jp3(this, ro3Var, gn3Var));
        } catch (Throwable th) {
            k04.zzh("Adapter failed to render interscroller ad.", th);
            throw new RemoteException();
        }
    }

    public final Bundle k3(zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.p.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // com.daaw.dp3
    public final boolean q(yd0 yd0Var) {
        MediationAppOpenAd mediationAppOpenAd = this.s;
        if (mediationAppOpenAd != null) {
            try {
                mediationAppOpenAd.showAd((Context) nt0.M(yd0Var));
                return true;
            } catch (Throwable th) {
                k04.zzh("", th);
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.dp3
    public final boolean q1(yd0 yd0Var) {
        MediationInterstitialAd mediationInterstitialAd = this.q;
        if (mediationInterstitialAd != null) {
            try {
                mediationInterstitialAd.showAd((Context) nt0.M(yd0Var));
                return true;
            } catch (Throwable th) {
                k04.zzh("", th);
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.dp3
    public final void s1(String str, String str2, zzl zzlVar, yd0 yd0Var, ro3 ro3Var, gn3 gn3Var, zzq zzqVar) {
        try {
            this.p.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) nt0.M(yd0Var), str, l3(str2), k3(zzlVar), m3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, n3(str2, zzlVar), zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.t), new ip3(this, ro3Var, gn3Var));
        } catch (Throwable th) {
            k04.zzh("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.daaw.dp3
    public final void y2(String str, String str2, zzl zzlVar, yd0 yd0Var, xo3 xo3Var, gn3 gn3Var) {
        b1(str, str2, zzlVar, yd0Var, xo3Var, gn3Var, null);
    }

    @Override // com.daaw.dp3
    public final void z1(String str, String str2, zzl zzlVar, yd0 yd0Var, ap3 ap3Var, gn3 gn3Var) {
        try {
            this.p.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) nt0.M(yd0Var), str, l3(str2), k3(zzlVar), m3(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, n3(str2, zzlVar), this.t), new rp3(this, ap3Var, gn3Var));
        } catch (Throwable th) {
            k04.zzh("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.daaw.dp3
    public final zzdq zze() {
        RtbAdapter rtbAdapter = this.p;
        if (rtbAdapter instanceof zza) {
            try {
                return ((zza) rtbAdapter).getVideoController();
            } catch (Throwable th) {
                k04.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.daaw.dp3
    public final zzbye zzf() {
        return zzbye.h(this.p.getVersionInfo());
    }

    @Override // com.daaw.dp3
    public final zzbye zzg() {
        return zzbye.h(this.p.getSDKVersionInfo());
    }
}
