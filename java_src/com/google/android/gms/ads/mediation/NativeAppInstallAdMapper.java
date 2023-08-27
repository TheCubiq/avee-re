package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;
/* loaded from: classes.dex */
public class NativeAppInstallAdMapper extends NativeAdMapper {
    private String zzbhw;
    private List<NativeAd.Image> zzbhx;
    private String zzbhy;
    private String zzbia;
    private double zzbib;
    private String zzbic;
    private String zzbid;
    private NativeAd.Image zzdfo;

    public final String getBody() {
        return this.zzbhy;
    }

    public final String getCallToAction() {
        return this.zzbia;
    }

    public final String getHeadline() {
        return this.zzbhw;
    }

    public final NativeAd.Image getIcon() {
        return this.zzdfo;
    }

    public final List<NativeAd.Image> getImages() {
        return this.zzbhx;
    }

    public final String getPrice() {
        return this.zzbid;
    }

    public final double getStarRating() {
        return this.zzbib;
    }

    public final String getStore() {
        return this.zzbic;
    }

    public final void setBody(String str) {
        this.zzbhy = str;
    }

    public final void setCallToAction(String str) {
        this.zzbia = str;
    }

    public final void setHeadline(String str) {
        this.zzbhw = str;
    }

    public final void setIcon(NativeAd.Image image) {
        this.zzdfo = image;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.zzbhx = list;
    }

    public final void setPrice(String str) {
        this.zzbid = str;
    }

    public final void setStarRating(double d) {
        this.zzbib = d;
    }

    public final void setStore(String str) {
        this.zzbic = str;
    }
}
