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

    /* renamed from: a */
    public final boolean f36453a;

    /* renamed from: b */
    public final int f36454b;

    /* renamed from: c */
    public final boolean f36455c;

    /* renamed from: d */
    public final int f36456d;

    /* renamed from: e */
    public final VideoOptions f36457e;

    /* renamed from: f */
    public final boolean f36458f;

    /* renamed from: g */
    public final boolean f36459g;

    /* renamed from: h */
    public final int f36460h;

    /* loaded from: classes.dex */
    public @interface AdChoicesPlacement {
    }

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: d */
        public VideoOptions f36464d;

        /* renamed from: a */
        public boolean f36461a = false;

        /* renamed from: b */
        public int f36462b = 0;

        /* renamed from: c */
        public boolean f36463c = false;

        /* renamed from: e */
        public int f36465e = 1;

        /* renamed from: f */
        public boolean f36466f = false;

        /* renamed from: g */
        public boolean f36467g = false;

        /* renamed from: h */
        public int f36468h = 0;

        public NativeAdOptions build() {
            return new NativeAdOptions(this, null);
        }

        public Builder enableCustomClickGestureDirection(@SwipeGestureDirection int i, boolean z) {
            this.f36467g = z;
            this.f36468h = i;
            return this;
        }

        public Builder setAdChoicesPlacement(@AdChoicesPlacement int i) {
            this.f36465e = i;
            return this;
        }

        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int i) {
            this.f36462b = i;
            return this;
        }

        public Builder setRequestCustomMuteThisAd(boolean z) {
            this.f36466f = z;
            return this;
        }

        public Builder setRequestMultipleImages(boolean z) {
            this.f36463c = z;
            return this;
        }

        public Builder setReturnUrlsForImageAssets(boolean z) {
            this.f36461a = z;
            return this;
        }

        public Builder setVideoOptions(VideoOptions videoOptions) {
            this.f36464d = videoOptions;
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
        this.f36453a = builder.f36461a;
        this.f36454b = builder.f36462b;
        this.f36455c = builder.f36463c;
        this.f36456d = builder.f36465e;
        this.f36457e = builder.f36464d;
        this.f36458f = builder.f36466f;
        this.f36459g = builder.f36467g;
        this.f36460h = builder.f36468h;
    }

    public int getAdChoicesPlacement() {
        return this.f36456d;
    }

    public int getMediaAspectRatio() {
        return this.f36454b;
    }

    public VideoOptions getVideoOptions() {
        return this.f36457e;
    }

    public boolean shouldRequestMultipleImages() {
        return this.f36455c;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.f36453a;
    }

    public final int zza() {
        return this.f36460h;
    }

    public final boolean zzb() {
        return this.f36459g;
    }

    public final boolean zzc() {
        return this.f36458f;
    }
}
