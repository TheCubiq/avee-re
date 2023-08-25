package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;
@Deprecated
/* loaded from: classes.dex */
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;
    @Deprecated
    public static final int ORIENTATION_ANY = 0;
    @Deprecated
    public static final int ORIENTATION_LANDSCAPE = 2;
    @Deprecated
    public static final int ORIENTATION_PORTRAIT = 1;

    /* renamed from: a */
    public final boolean f36055a;

    /* renamed from: b */
    public final int f36056b;

    /* renamed from: c */
    public final int f36057c;

    /* renamed from: d */
    public final boolean f36058d;

    /* renamed from: e */
    public final int f36059e;

    /* renamed from: f */
    public final VideoOptions f36060f;

    /* renamed from: g */
    public final boolean f36061g;

    /* loaded from: classes.dex */
    public @interface AdChoicesPlacement {
    }

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: e */
        public VideoOptions f36066e;

        /* renamed from: a */
        public boolean f36062a = false;

        /* renamed from: b */
        public int f36063b = -1;

        /* renamed from: c */
        public int f36064c = 0;

        /* renamed from: d */
        public boolean f36065d = false;

        /* renamed from: f */
        public int f36067f = 1;

        /* renamed from: g */
        public boolean f36068g = false;

        public NativeAdOptions build() {
            return new NativeAdOptions(this, null);
        }

        public Builder setAdChoicesPlacement(@AdChoicesPlacement int i) {
            this.f36067f = i;
            return this;
        }

        @Deprecated
        public Builder setImageOrientation(int i) {
            this.f36063b = i;
            return this;
        }

        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int i) {
            this.f36064c = i;
            return this;
        }

        public Builder setRequestCustomMuteThisAd(boolean z) {
            this.f36068g = z;
            return this;
        }

        public Builder setRequestMultipleImages(boolean z) {
            this.f36065d = z;
            return this;
        }

        public Builder setReturnUrlsForImageAssets(boolean z) {
            this.f36062a = z;
            return this;
        }

        public Builder setVideoOptions(VideoOptions videoOptions) {
            this.f36066e = videoOptions;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public @interface NativeMediaAspectRatio {
    }

    public /* synthetic */ NativeAdOptions(Builder builder, zzd zzdVar) {
        this.f36055a = builder.f36062a;
        this.f36056b = builder.f36063b;
        this.f36057c = builder.f36064c;
        this.f36058d = builder.f36065d;
        this.f36059e = builder.f36067f;
        this.f36060f = builder.f36066e;
        this.f36061g = builder.f36068g;
    }

    public int getAdChoicesPlacement() {
        return this.f36059e;
    }

    @Deprecated
    public int getImageOrientation() {
        return this.f36056b;
    }

    public int getMediaAspectRatio() {
        return this.f36057c;
    }

    public VideoOptions getVideoOptions() {
        return this.f36060f;
    }

    public boolean shouldRequestMultipleImages() {
        return this.f36058d;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.f36055a;
    }

    public final boolean zza() {
        return this.f36061g;
    }
}
