package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdi;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class xh5 extends zzdi {
    public final Map p = new HashMap();
    public final Context q;
    public final lh5 r;
    public final g77 s;
    public final yh5 t;
    public dh5 u;

    public xh5(Context context, lh5 lh5Var, yh5 yh5Var, g77 g77Var) {
        this.q = context;
        this.r = lh5Var;
        this.s = g77Var;
        this.t = yh5Var;
    }

    public static AdRequest n3() {
        return new AdRequest.Builder().build();
    }

    public static String o3(Object obj) {
        ResponseInfo responseInfo;
        zzdn zzc;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (!(obj instanceof AdView)) {
            if (obj instanceof NativeAd) {
                responseInfo = ((NativeAd) obj).getResponseInfo();
            }
            return "";
        } else {
            responseInfo = ((AdView) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzc = responseInfo.zzc()) == null) {
            return "";
        }
        try {
            return zzc.zzh();
        } catch (RemoteException unused) {
        }
    }

    public final void j3(dh5 dh5Var) {
        this.u = dh5Var;
    }

    public final synchronized void k3(String str, Object obj, String str2) {
        this.p.put(str, obj);
        p3(o3(obj), str2);
    }

    public final synchronized void l3(final String str, String str2, final String str3) {
        char c;
        switch (str2.hashCode()) {
            case -1999289321:
                if (str2.equals("NATIVE")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (str2.equals("INTERSTITIAL")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -428325382:
                if (str2.equals("APP_OPEN_AD")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str2.equals("REWARDED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1854800829:
                if (str2.equals("REWARDED_INTERSTITIAL")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str2.equals("BANNER")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            AppOpenAd.load(this.q, str, n3(), 1, new ph5(this, str, str3));
        } else if (c == 1) {
            AdView adView = new AdView(this.q);
            adView.setAdSize(AdSize.BANNER);
            adView.setAdUnitId(str);
            adView.setAdListener(new qh5(this, str, adView, str3));
            adView.loadAd(n3());
        } else if (c == 2) {
            InterstitialAd.load(this.q, str, n3(), new rh5(this, str, str3));
        } else if (c == 3) {
            AdLoader.Builder builder = new AdLoader.Builder(this.q, str);
            builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.daaw.oh5
                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public final void onNativeAdLoaded(NativeAd nativeAd) {
                    xh5.this.k3(str, nativeAd, str3);
                }
            });
            builder.withAdListener(new uh5(this, str3));
            builder.build().loadAd(n3());
        } else if (c == 4) {
            RewardedAd.load(this.q, str, n3(), new sh5(this, str, str3));
        } else if (c != 5) {
        } else {
            RewardedInterstitialAd.load(this.q, str, n3(), new th5(this, str, str3));
        }
    }

    public final synchronized void m3(String str, String str2) {
        Activity a = this.r.a();
        if (a == null) {
            return;
        }
        Object obj = this.p.get(str);
        if (obj == null) {
            return;
        }
        y83 y83Var = g93.u8;
        if (!((Boolean) zzba.zzc().b(y83Var)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
            this.p.remove(str);
        }
        q3(o3(obj), str2);
        if (obj instanceof AppOpenAd) {
            ((AppOpenAd) obj).show(a);
        } else if (obj instanceof InterstitialAd) {
            ((InterstitialAd) obj).show(a);
        } else if (obj instanceof RewardedAd) {
            ((RewardedAd) obj).show(a, new OnUserEarnedRewardListener() { // from class: com.daaw.mh5
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                }
            });
        } else if (obj instanceof RewardedInterstitialAd) {
            ((RewardedInterstitialAd) obj).show(a, new OnUserEarnedRewardListener() { // from class: com.daaw.nh5
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                }
            });
        } else if (((Boolean) zzba.zzc().b(y83Var)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
            Intent intent = new Intent();
            intent.setClassName(this.q, OutOfContextTestingActivity.CLASS_NAME);
            intent.putExtra(OutOfContextTestingActivity.AD_UNIT_KEY, str);
            zzt.zzp();
            zzs.zzQ(this.q, intent);
        }
    }

    public final synchronized void p3(String str, String str2) {
        try {
            s67.r(this.u.b(str), new vh5(this, str2), this.s);
        } catch (NullPointerException e) {
            zzt.zzo().u(e, "OutOfContextTester.setAdAsOutOfContext");
            this.r.e(str2);
        }
    }

    public final synchronized void q3(String str, String str2) {
        try {
            s67.r(this.u.b(str), new wh5(this, str2), this.s);
        } catch (NullPointerException e) {
            zzt.zzo().u(e, "OutOfContextTester.setAdAsShown");
            this.r.e(str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdj
    public final void zze(String str, yd0 yd0Var, yd0 yd0Var2) {
        Context context = (Context) nt0.M(yd0Var);
        ViewGroup viewGroup = (ViewGroup) nt0.M(yd0Var2);
        if (context == null || viewGroup == null) {
            return;
        }
        Object obj = this.p.get(str);
        if (obj != null) {
            this.p.remove(str);
        }
        if (obj instanceof AdView) {
            yh5.a(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            yh5.b(context, viewGroup, (NativeAd) obj);
        }
    }
}
