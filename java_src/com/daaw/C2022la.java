package com.daaw;

import android.view.View;
import android.view.ViewGroup;
import com.daaw.avee.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
/* renamed from: com.daaw.la */
/* loaded from: classes.dex */
public class C2022la {

    /* renamed from: d */
    public static yw1<C1034d1, Integer, Integer, Boolean> f17168d = new yw1<>();

    /* renamed from: e */
    public static final boolean[] f17169e = {false, false, false};

    /* renamed from: a */
    public C1034d1 f17170a;

    /* renamed from: b */
    public final az0 f17171b;

    /* renamed from: c */
    public int f17172c;

    /* renamed from: com.daaw.la$a */
    /* loaded from: classes.dex */
    public class C2023a extends AdListener {
        public C2023a() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            C2022la.this.f17170a.f6358a.setVisibility(8);
            C2022la.f17169e[C2022la.this.f17172c] = false;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            C2022la.this.f17170a.f6358a.setVisibility(0);
            C2022la.f17169e[C2022la.this.f17172c] = true;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
        }
    }

    public C2022la(int i, View view) {
        this.f17172c = i;
        this.f17171b = view != null ? new az0() : null;
        m17076c(view);
    }

    /* renamed from: c */
    public final void m17076c(View view) {
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
        C1034d1 c1034d1 = new C1034d1(adView);
        this.f17170a = c1034d1;
        AdView adView3 = c1034d1.f6358a;
        if (adView3 != null) {
            adView3.setVisibility(f17169e[this.f17172c] ? 0 : 8);
            this.f17170a.f6358a.setAdListener(new C2023a());
        }
    }

    /* renamed from: d */
    public void m17075d(int i) {
        C1034d1 c1034d1 = this.f17170a;
        if (c1034d1 == null || c1034d1.f6358a == null) {
            f17169e[this.f17172c] = false;
            return;
        }
        if ((nc0.f19989g.m6692a(Boolean.TRUE).booleanValue() && this.f17171b.m26590d()) || f17168d.m3155a(this.f17170a, Integer.valueOf(this.f17172c), Integer.valueOf(i), Boolean.FALSE).booleanValue()) {
            return;
        }
        f17169e[this.f17172c] = false;
        this.f17170a.f6358a.setVisibility(8);
    }
}
