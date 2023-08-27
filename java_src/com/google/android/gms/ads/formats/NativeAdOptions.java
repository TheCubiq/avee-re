package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.internal.ads.zzadh;
@zzadh
/* loaded from: classes.dex */
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int ORIENTATION_ANY = 0;
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;
    private final boolean zzvc;
    private final int zzvd;
    private final boolean zzve;
    private final int zzvf;
    private final VideoOptions zzvg;

    /* loaded from: classes.dex */
    public @interface AdChoicesPlacement {
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private boolean zzvc = false;
        private int zzvd = -1;
        private boolean zzve = false;
        private int zzvf = 1;
        private VideoOptions zzvg;

        public final NativeAdOptions build() {
            return new NativeAdOptions(this);
        }

        public final Builder setAdChoicesPlacement(int i) {
            this.zzvf = i;
            return this;
        }

        public final Builder setImageOrientation(int i) {
            this.zzvd = i;
            return this;
        }

        public final Builder setRequestMultipleImages(boolean z) {
            this.zzve = z;
            return this;
        }

        public final Builder setReturnUrlsForImageAssets(boolean z) {
            this.zzvc = z;
            return this;
        }

        public final Builder setVideoOptions(VideoOptions videoOptions) {
            this.zzvg = videoOptions;
            return this;
        }
    }

    private NativeAdOptions(Builder builder) {
        this.zzvc = builder.zzvc;
        this.zzvd = builder.zzvd;
        this.zzve = builder.zzve;
        this.zzvf = builder.zzvf;
        this.zzvg = builder.zzvg;
    }

    public final int getAdChoicesPlacement() {
        return this.zzvf;
    }

    public final int getImageOrientation() {
        return this.zzvd;
    }

    public final VideoOptions getVideoOptions() {
        return this.zzvg;
    }

    public final boolean shouldRequestMultipleImages() {
        return this.zzve;
    }

    public final boolean shouldReturnUrlsForImageAssets() {
        return this.zzvc;
    }
}
