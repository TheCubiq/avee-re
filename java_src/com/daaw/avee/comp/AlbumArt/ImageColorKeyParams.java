package com.daaw.avee.comp.AlbumArt;
/* loaded from: classes.dex */
public class ImageColorKeyParams {
    public boolean autoDetect;
    public int colorKey;
    public float opacityStrength;
    public float transparencyStrength;

    public ImageColorKeyParams(int i, boolean z, float f, float f2) {
        this.colorKey = i;
        this.autoDetect = z;
        this.transparencyStrength = f;
        this.opacityStrength = f2;
    }

    public String getStrId() {
        return "ck:" + this.colorKey + ":" + this.autoDetect + ":" + this.transparencyStrength + ":" + this.opacityStrength;
    }
}
