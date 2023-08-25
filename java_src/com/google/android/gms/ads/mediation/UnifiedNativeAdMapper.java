package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class UnifiedNativeAdMapper {
    public String a;
    public List b;
    public String c;
    public NativeAd.Image d;
    public String e;
    public String f;
    public Double g;
    public String h;
    public String i;
    public VideoController j;
    public boolean k;
    public View l;
    public View m;
    public Object n;
    public Bundle o = new Bundle();
    public boolean p;
    public boolean q;
    public float r;

    public View getAdChoicesContent() {
        return this.l;
    }

    public final String getAdvertiser() {
        return this.f;
    }

    public final String getBody() {
        return this.c;
    }

    public final String getCallToAction() {
        return this.e;
    }

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    public final Bundle getExtras() {
        return this.o;
    }

    public final String getHeadline() {
        return this.a;
    }

    public final NativeAd.Image getIcon() {
        return this.d;
    }

    public final List<NativeAd.Image> getImages() {
        return this.b;
    }

    public float getMediaContentAspectRatio() {
        return this.r;
    }

    public final boolean getOverrideClickHandling() {
        return this.q;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.p;
    }

    public final String getPrice() {
        return this.i;
    }

    public final Double getStarRating() {
        return this.g;
    }

    public final String getStore() {
        return this.h;
    }

    public void handleClick(View view) {
    }

    public boolean hasVideoContent() {
        return this.k;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(View view) {
        this.l = view;
    }

    public final void setAdvertiser(String str) {
        this.f = str;
    }

    public final void setBody(String str) {
        this.c = str;
    }

    public final void setCallToAction(String str) {
        this.e = str;
    }

    public final void setExtras(Bundle bundle) {
        this.o = bundle;
    }

    public void setHasVideoContent(boolean z) {
        this.k = z;
    }

    public final void setHeadline(String str) {
        this.a = str;
    }

    public final void setIcon(NativeAd.Image image) {
        this.d = image;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.b = list;
    }

    public void setMediaContentAspectRatio(float f) {
        this.r = f;
    }

    public void setMediaView(View view) {
        this.m = view;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.q = z;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.p = z;
    }

    public final void setPrice(String str) {
        this.i = str;
    }

    public final void setStarRating(Double d) {
        this.g = d;
    }

    public final void setStore(String str) {
        this.h = str;
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }

    public void untrackView(View view) {
    }

    public final View zza() {
        return this.m;
    }

    public final VideoController zzb() {
        return this.j;
    }

    public final Object zzc() {
        return this.n;
    }

    public final void zzd(Object obj) {
        this.n = obj;
    }

    public final void zze(VideoController videoController) {
        this.j = videoController;
    }
}
