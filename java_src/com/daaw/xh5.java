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

    /* renamed from: p */
    public final Map f32719p = new HashMap();

    /* renamed from: q */
    public final Context f32720q;

    /* renamed from: r */
    public final lh5 f32721r;

    /* renamed from: s */
    public final g77 f32722s;

    /* renamed from: t */
    public final yh5 f32723t;

    /* renamed from: u */
    public dh5 f32724u;

    public xh5(Context context, lh5 lh5Var, yh5 yh5Var, g77 g77Var) {
        this.f32720q = context;
        this.f32721r = lh5Var;
        this.f32722s = g77Var;
        this.f32723t = yh5Var;
    }

    /* renamed from: n3 */
    public static AdRequest m5098n3() {
        return new AdRequest.Builder().build();
    }

    /* renamed from: o3 */
    public static String m5097o3(Object obj) {
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

    /* renamed from: j3 */
    public final void m5102j3(dh5 dh5Var) {
        this.f32724u = dh5Var;
    }

    /* renamed from: k3 */
    public final synchronized void m5101k3(String str, Object obj, String str2) {
        this.f32719p.put(str, obj);
        m5096p3(m5097o3(obj), str2);
    }

    /* renamed from: l3 */
    public final synchronized void m5100l3(final String str, String str2, final String str3) {
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
            AppOpenAd.load(this.f32720q, str, m5098n3(), 1, new ph5(this, str, str3));
        } else if (c == 1) {
            AdView adView = new AdView(this.f32720q);
            adView.setAdSize(AdSize.BANNER);
            adView.setAdUnitId(str);
            adView.setAdListener(new qh5(this, str, adView, str3));
            adView.loadAd(m5098n3());
        } else if (c == 2) {
            InterstitialAd.load(this.f32720q, str, m5098n3(), new rh5(this, str, str3));
        } else if (c == 3) {
            AdLoader.Builder builder = new AdLoader.Builder(this.f32720q, str);
            builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.daaw.oh5
                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public final void onNativeAdLoaded(NativeAd nativeAd) {
                    xh5.this.m5101k3(str, nativeAd, str3);
                }
            });
            builder.withAdListener(new uh5(this, str3));
            builder.build().loadAd(m5098n3());
        } else if (c == 4) {
            RewardedAd.load(this.f32720q, str, m5098n3(), new sh5(this, str, str3));
        } else if (c != 5) {
        } else {
            RewardedInterstitialAd.load(this.f32720q, str, m5098n3(), new th5(this, str, str3));
        }
    }

    /* renamed from: m3 */
    public final synchronized void m5099m3(String str, String str2) {
        Activity m16953a = this.f32721r.m16953a();
        if (m16953a == null) {
            return;
        }
        Object obj = this.f32719p.get(str);
        if (obj == null) {
            return;
        }
        y83 y83Var = g93.f10850u8;
        if (!((Boolean) zzba.zzc().m23658b(y83Var)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
            this.f32719p.remove(str);
        }
        m5095q3(m5097o3(obj), str2);
        if (obj instanceof AppOpenAd) {
            ((AppOpenAd) obj).show(m16953a);
        } else if (obj instanceof InterstitialAd) {
            ((InterstitialAd) obj).show(m16953a);
        } else if (obj instanceof RewardedAd) {
            ((RewardedAd) obj).show(m16953a, new OnUserEarnedRewardListener() { // from class: com.daaw.mh5
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                }
            });
        } else if (obj instanceof RewardedInterstitialAd) {
            ((RewardedInterstitialAd) obj).show(m16953a, new OnUserEarnedRewardListener() { // from class: com.daaw.nh5
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                }
            });
        } else if (((Boolean) zzba.zzc().m23658b(y83Var)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
            Intent intent = new Intent();
            intent.setClassName(this.f32720q, OutOfContextTestingActivity.CLASS_NAME);
            intent.putExtra(OutOfContextTestingActivity.AD_UNIT_KEY, str);
            zzt.zzp();
            zzs.zzQ(this.f32720q, intent);
        }
    }

    /* renamed from: p3 */
    public final synchronized void m5096p3(String str, String str2) {
        try {
            s67.m10625r(this.f32724u.m24409b(str), new vh5(this, str2), this.f32722s);
        } catch (NullPointerException e) {
            zzt.zzo().m11902u(e, "OutOfContextTester.setAdAsOutOfContext");
            this.f32721r.m16949e(str2);
        }
    }

    /* renamed from: q3 */
    public final synchronized void m5095q3(String str, String str2) {
        try {
            s67.m10625r(this.f32724u.m24409b(str), new wh5(this, str2), this.f32722s);
        } catch (NullPointerException e) {
            zzt.zzo().m11902u(e, "OutOfContextTester.setAdAsShown");
            this.f32721r.m16949e(str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdj
    public final void zze(String str, yd0 yd0Var, yd0 yd0Var2) {
        Context context = (Context) nt0.m14831M(yd0Var);
        ViewGroup viewGroup = (ViewGroup) nt0.m14831M(yd0Var2);
        if (context == null || viewGroup == null) {
            return;
        }
        Object obj = this.f32719p.get(str);
        if (obj != null) {
            this.f32719p.remove(str);
        }
        if (obj instanceof AdView) {
            yh5.m3745a(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            yh5.m3744b(context, viewGroup, (NativeAd) obj);
        }
    }
}
