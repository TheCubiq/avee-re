package com.daaw;

import android.content.Context;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.qw1;
import com.daaw.sw1;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public final class my0 extends InterstitialAdLoadCallback {

    /* renamed from: a */
    public final String f19284a;

    /* renamed from: b */
    public final vw1<Boolean> f19285b;

    /* renamed from: c */
    public final az0 f19286c;

    /* renamed from: d */
    public final List<Object> f19287d;

    /* renamed from: e */
    public InterstitialAd f19288e;

    public my0(String str, vw1<Boolean> vw1Var, az0 az0Var) {
        ug0.m8268f(str, "adId");
        ug0.m8268f(vw1Var, "isPremium");
        ug0.m8268f(az0Var, "preferences");
        this.f19284a = str;
        this.f19285b = vw1Var;
        this.f19286c = az0Var;
        LinkedList linkedList = new LinkedList();
        this.f19287d = linkedList;
        qv1.f24437Q.m9794b(new sw1.InterfaceC2987a() { // from class: com.daaw.ly0
            @Override // com.daaw.sw1.InterfaceC2987a
            /* renamed from: a */
            public final void mo3118a(Object obj, Object obj2, Object obj3) {
                my0.m15664c(my0.this, ((Boolean) obj).booleanValue(), (Long) obj2, (Boolean) obj3);
            }
        }, linkedList);
        qv1.f24439S.m12017b(new qw1.InterfaceC2788a() { // from class: com.daaw.ky0
            @Override // com.daaw.qw1.InterfaceC2788a
            /* renamed from: b */
            public final void mo3122b(Object obj) {
                my0.m15663d(my0.this, (Boolean) obj);
            }
        }, linkedList);
    }

    /* renamed from: c */
    public static final void m15664c(my0 my0Var, boolean z, Long l, Boolean bool) {
        Context m26591c;
        ug0.m8268f(my0Var, "this$0");
        if ((my0Var.f19285b.m6692a(Boolean.FALSE).booleanValue() && my0Var.f19286c.m26590d()) || !z || (m26591c = my0Var.f19286c.m26591c()) == null) {
            return;
        }
        InterstitialAd.load(m26591c, m26591c.getString(R.string.ads_interstitial), C0563a1.f2690a.m27751b(), my0Var);
    }

    /* renamed from: d */
    public static final void m15663d(my0 my0Var, Boolean bool) {
        ug0.m8268f(my0Var, "this$0");
        if (my0Var.f19285b.m6692a(Boolean.FALSE).booleanValue() && my0Var.f19286c.m26590d()) {
            return;
        }
        my0Var.m15661f();
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* renamed from: e */
    public void onAdLoaded(InterstitialAd interstitialAd) {
        ug0.m8268f(interstitialAd, "ad");
        super.onAdLoaded(interstitialAd);
        this.f19288e = interstitialAd;
    }

    /* renamed from: f */
    public final void m15661f() {
        InterstitialAd interstitialAd = this.f19288e;
        if (interstitialAd == null) {
            return;
        }
        interstitialAd.show(MainActivity.m26903r0());
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        ug0.m8268f(loadAdError, "error");
        super.onAdFailedToLoad(loadAdError);
        StringBuilder sb = new StringBuilder();
        sb.append("onRewardedVideoAdFailedToLoad(");
        sb.append(loadAdError.getCode());
        sb.append(')');
    }
}
