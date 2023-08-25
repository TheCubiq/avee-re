package com.google.android.gms.ads.nativead;

import com.google.android.gms.ads.VideoOptions;
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
    public static final int SWIPE_GESTURE_DIRECTION_DOWN = 8;
    public static final int SWIPE_GESTURE_DIRECTION_LEFT = 2;
    public static final int SWIPE_GESTURE_DIRECTION_RIGHT = 1;
    public static final int SWIPE_GESTURE_DIRECTION_UP = 4;
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final VideoOptions e;
    public final boolean f;
    public final boolean g;
    public final int h;

    /* loaded from: classes.dex */
    public @interface AdChoicesPlacement {
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        public VideoOptions d;
        public boolean a = false;
        public int b = 0;
        public boolean c = false;
        public int e = 1;
        public boolean f = false;
        public boolean g = false;
        public int h = 0;

        public NativeAdOptions build() {
            return new NativeAdOptions(this, null);
        }

        public Builder enableCustomClickGestureDirection(@SwipeGestureDirection int i, boolean z) {
            this.g = z;
            this.h = i;
            return this;
        }

        public Builder setAdChoicesPlacement(@AdChoicesPlacement int i) {
            this.e = i;
            return this;
        }

        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int i) {
            this.b = i;
            return this;
        }

        public Builder setRequestCustomMuteThisAd(boolean z) {
            this.f = z;
            return this;
        }

        public Builder setRequestMultipleImages(boolean z) {
            this.c = z;
            return this;
        }

        public Builder setReturnUrlsForImageAssets(boolean z) {
            this.a = z;
            return this;
        }

        public Builder setVideoOptions(VideoOptions videoOptions) {
            this.d = videoOptions;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public @interface NativeMediaAspectRatio {
    }

    /* loaded from: classes.dex */
    public @interface SwipeGestureDirection {
    }

    public /* synthetic */ NativeAdOptions(Builder builder, zza zzaVar) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.e;
        this.e = builder.d;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
    }

    public int getAdChoicesPlacement() {
        return this.d;
    }

    public int getMediaAspectRatio() {
        return this.b;
    }

    public VideoOptions getVideoOptions() {
        return this.e;
    }

    public boolean shouldRequestMultipleImages() {
        return this.c;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.a;
    }

    public final int zza() {
        return this.h;
    }

    public final boolean zzb() {
        return this.g;
    }

    public final boolean zzc() {
        return this.f;
    }
}
