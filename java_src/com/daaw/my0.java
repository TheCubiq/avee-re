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
    public final String a;
    public final vw1<Boolean> b;
    public final az0 c;
    public final List<Object> d;
    public InterstitialAd e;

    public my0(String str, vw1<Boolean> vw1Var, az0 az0Var) {
        ug0.f(str, "adId");
        ug0.f(vw1Var, "isPremium");
        ug0.f(az0Var, "preferences");
        this.a = str;
        this.b = vw1Var;
        this.c = az0Var;
        LinkedList linkedList = new LinkedList();
        this.d = linkedList;
        qv1.Q.b(new sw1.a() { // from class: com.daaw.ly0
            @Override // com.daaw.sw1.a
            public final void a(Object obj, Object obj2, Object obj3) {
                my0.c(my0.this, ((Boolean) obj).booleanValue(), (Long) obj2, (Boolean) obj3);
            }
        }, linkedList);
        qv1.S.b(new qw1.a() { // from class: com.daaw.ky0
            @Override // com.daaw.qw1.a
            public final void b(Object obj) {
                my0.d(my0.this, (Boolean) obj);
            }
        }, linkedList);
    }

    public static final void c(my0 my0Var, boolean z, Long l, Boolean bool) {
        Context c;
        ug0.f(my0Var, "this$0");
        if ((my0Var.b.a(Boolean.FALSE).booleanValue() && my0Var.c.d()) || !z || (c = my0Var.c.c()) == null) {
            return;
        }
        InterstitialAd.load(c, c.getString(R.string.ads_interstitial), a1.a.b(), my0Var);
    }

    public static final void d(my0 my0Var, Boolean bool) {
        ug0.f(my0Var, "this$0");
        if (my0Var.b.a(Boolean.FALSE).booleanValue() && my0Var.c.d()) {
            return;
        }
        my0Var.f();
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* renamed from: e */
    public void onAdLoaded(InterstitialAd interstitialAd) {
        ug0.f(interstitialAd, "ad");
        super.onAdLoaded(interstitialAd);
        this.e = interstitialAd;
    }

    public final void f() {
        InterstitialAd interstitialAd = this.e;
        if (interstitialAd == null) {
            return;
        }
        interstitialAd.show(MainActivity.r0());
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        ug0.f(loadAdError, "error");
        super.onAdFailedToLoad(loadAdError);
        StringBuilder sb = new StringBuilder();
        sb.append("onRewardedVideoAdFailedToLoad(");
        sb.append(loadAdError.getCode());
        sb.append(')');
    }
}
