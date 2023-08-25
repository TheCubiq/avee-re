package com.daaw;

import android.view.View;
import android.view.ViewGroup;
import com.daaw.avee.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
/* loaded from: classes.dex */
public class la {
    public static yw1<d1, Integer, Integer, Boolean> d = new yw1<>();
    public static final boolean[] e = {false, false, false};
    public d1 a;
    public final az0 b;
    public int c;

    /* loaded from: classes.dex */
    public class a extends AdListener {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            la.this.a.a.setVisibility(8);
            la.e[la.this.c] = false;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            la.this.a.a.setVisibility(0);
            la.e[la.this.c] = true;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
        }
    }

    public la(int i, View view) {
        this.c = i;
        this.b = view != null ? new az0() : null;
        c(view);
    }

    public final void c(View view) {
        AdView adView;
        if (view instanceof AdView) {
            adView = (AdView) view;
        } else if (!(view instanceof ViewGroup)) {
            return;
        } else {
            AdView adView2 = new AdView(view.getContext());
            ((ViewGroup) view).addView(adView2);
            adView = adView2;
        }
        if (adView.getAdSize() == null) {
            adView.setAdSize(AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(adView.getContext(), (int) (adView.getResources().getDisplayMetrics().widthPixels / adView.getResources().getDisplayMetrics().density)));
        }
        if (adView.getAdUnitId() == null) {
            adView.setAdUnitId(adView.getResources().getString(R.string.ads_header_banner_ad_unit_id));
        }
        d1 d1Var = new d1(adView);
        this.a = d1Var;
        AdView adView3 = d1Var.a;
        if (adView3 != null) {
            adView3.setVisibility(e[this.c] ? 0 : 8);
            this.a.a.setAdListener(new a());
        }
    }

    public void d(int i) {
        d1 d1Var = this.a;
        if (d1Var == null || d1Var.a == null) {
            e[this.c] = false;
            return;
        }
        if ((nc0.g.a(Boolean.TRUE).booleanValue() && this.b.d()) || d.a(this.a, Integer.valueOf(this.c), Integer.valueOf(i), Boolean.FALSE).booleanValue()) {
            return;
        }
        e[this.c] = false;
        this.a.a.setVisibility(8);
    }
}
