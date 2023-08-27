package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;
/* loaded from: classes.dex */
public class NativeContentAdMapper extends NativeAdMapper {
    private String zzbhw;
    private List<NativeAd.Image> zzbhx;
    private String zzbhy;
    private String zzbia;
    private String zzbim;
    private NativeAd.Image zzdfp;

    public final String getAdvertiser() {
        return this.zzbim;
    }

    public final String getBody() {
        return this.zzbhy;
    }

    public final String getCallToAction() {
        return this.zzbia;
    }

    public final String getHeadline() {
        return this.zzbhw;
    }

    public final List<NativeAd.Image> getImages() {
        return this.zzbhx;
    }

    public final NativeAd.Image getLogo() {
        return this.zzdfp;
    }

    public final void setAdvertiser(String str) {
        this.zzbim = str;
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

    public final void setImages(List<NativeAd.Image> list) {
        this.zzbhx = list;
    }

    public final void setLogo(NativeAd.Image image) {
        this.zzdfp = image;
    }
}
