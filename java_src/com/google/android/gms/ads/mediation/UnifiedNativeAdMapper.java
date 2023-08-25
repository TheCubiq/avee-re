package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class UnifiedNativeAdMapper {

    /* renamed from: a */
    public String f36419a;

    /* renamed from: b */
    public List f36420b;

    /* renamed from: c */
    public String f36421c;

    /* renamed from: d */
    public NativeAd.Image f36422d;

    /* renamed from: e */
    public String f36423e;

    /* renamed from: f */
    public String f36424f;

    /* renamed from: g */
    public Double f36425g;

    /* renamed from: h */
    public String f36426h;

    /* renamed from: i */
    public String f36427i;

    /* renamed from: j */
    public VideoController f36428j;

    /* renamed from: k */
    public boolean f36429k;

    /* renamed from: l */
    public View f36430l;

    /* renamed from: m */
    public View f36431m;

    /* renamed from: n */
    public Object f36432n;

    /* renamed from: o */
    public Bundle f36433o = new Bundle();

    /* renamed from: p */
    public boolean f36434p;

    /* renamed from: q */
    public boolean f36435q;

    /* renamed from: r */
    public float f36436r;

    public View getAdChoicesContent() {
        return this.f36430l;
    }

    public final String getAdvertiser() {
        return this.f36424f;
    }

    public final String getBody() {
        return this.f36421c;
    }

    public final String getCallToAction() {
        return this.f36423e;
    }

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    public final Bundle getExtras() {
        return this.f36433o;
    }

    public final String getHeadline() {
        return this.f36419a;
    }

    public final NativeAd.Image getIcon() {
        return this.f36422d;
    }

    public final List<NativeAd.Image> getImages() {
        return this.f36420b;
    }

    public float getMediaContentAspectRatio() {
        return this.f36436r;
    }

    public final boolean getOverrideClickHandling() {
        return this.f36435q;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.f36434p;
    }

    public final String getPrice() {
        return this.f36427i;
    }

    public final Double getStarRating() {
        return this.f36425g;
    }

    public final String getStore() {
        return this.f36426h;
    }

    public void handleClick(View view) {
    }

    public boolean hasVideoContent() {
        return this.f36429k;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(View view) {
        this.f36430l = view;
    }

    public final void setAdvertiser(String str) {
        this.f36424f = str;
    }

    public final void setBody(String str) {
        this.f36421c = str;
    }

    public final void setCallToAction(String str) {
        this.f36423e = str;
    }

    public final void setExtras(Bundle bundle) {
        this.f36433o = bundle;
    }

    public void setHasVideoContent(boolean z) {
        this.f36429k = z;
    }

    public final void setHeadline(String str) {
        this.f36419a = str;
    }

    public final void setIcon(NativeAd.Image image) {
        this.f36422d = image;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.f36420b = list;
    }

    public void setMediaContentAspectRatio(float f) {
        this.f36436r = f;
    }

    public void setMediaView(View view) {
        this.f36431m = view;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.f36435q = z;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.f36434p = z;
    }

    public final void setPrice(String str) {
        this.f36427i = str;
    }

    public final void setStarRating(Double d) {
        this.f36425g = d;
    }

    public final void setStore(String str) {
        this.f36426h = str;
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }

    public void untrackView(View view) {
    }

    public final View zza() {
        return this.f36431m;
    }

    public final VideoController zzb() {
        return this.f36428j;
    }

    public final Object zzc() {
        return this.f36432n;
    }

    public final void zzd(Object obj) {
        this.f36432n = obj;
    }

    public final void zze(VideoController videoController) {
        this.f36428j = videoController;
    }
}
