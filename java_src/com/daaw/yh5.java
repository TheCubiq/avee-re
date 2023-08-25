package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.impl.C3985R;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
/* loaded from: classes.dex */
public final class yh5 {
    /* renamed from: a */
    public static final void m3745a(Context context, ViewGroup viewGroup, AdView adView) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout");
        m3740f(linearLayout, -1, -1);
        linearLayout.setGravity(17);
        linearLayout.addView(adView);
        adView.setTag("ad_view");
        viewGroup.addView(linearLayout);
    }

    /* renamed from: b */
    public static final void m3744b(Context context, ViewGroup viewGroup, NativeAd nativeAd) {
        NativeAdView nativeAdView = new NativeAdView(context);
        nativeAdView.setTag("ad_view_tag");
        m3740f(nativeAdView, -1, -1);
        viewGroup.addView(nativeAdView);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout_tag");
        linearLayout.setOrientation(1);
        m3740f(linearLayout, -1, -1);
        linearLayout.setBackgroundColor(-1);
        nativeAdView.addView(linearLayout);
        Resources m11919d = zzt.zzo().m11919d();
        linearLayout.addView(m3743c(context, m11919d == null ? "Headline" : m11919d.getString(C3985R.string.native_headline), "headline_header_tag"));
        View m3742d = m3742d(context, hz6.m20316c(nativeAd.getHeadline()), "headline_tag");
        nativeAdView.setHeadlineView(m3742d);
        linearLayout.addView(m3742d);
        linearLayout.addView(m3743c(context, m11919d == null ? "Body" : m11919d.getString(C3985R.string.native_body), "body_header_tag"));
        View m3742d2 = m3742d(context, hz6.m20316c(nativeAd.getBody()), "body_tag");
        nativeAdView.setBodyView(m3742d2);
        linearLayout.addView(m3742d2);
        linearLayout.addView(m3743c(context, m11919d == null ? "Media View" : m11919d.getString(C3985R.string.native_media_view), "media_view_header_tag"));
        MediaView mediaView = new MediaView(context);
        mediaView.setTag("media_view_tag");
        nativeAdView.setMediaView(mediaView);
        linearLayout.addView(mediaView);
        nativeAdView.setNativeAd(nativeAd);
    }

    /* renamed from: c */
    public static TextView m3743c(Context context, String str, String str2) {
        return m3741e(context, str, 16973894, -9210245, 0.0f, str2);
    }

    /* renamed from: d */
    public static TextView m3742d(Context context, String str, String str2) {
        return m3741e(context, str, 16973892, -16777216, 12.0f, str2);
    }

    /* renamed from: e */
    public static TextView m3741e(Context context, String str, int i, int i2, float f, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        m3740f(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i);
        textView.setTextColor(i2);
        textView.setText(str);
        return textView;
    }

    /* renamed from: f */
    public static void m3740f(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i;
        layoutParams2.width = i2;
        view.setLayoutParams(layoutParams2);
    }
}
