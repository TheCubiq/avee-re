package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzfl;
/* loaded from: classes.dex */
public final class VideoOptions {

    /* renamed from: a */
    public final boolean f36043a;

    /* renamed from: b */
    public final boolean f36044b;

    /* renamed from: c */
    public final boolean f36045c;

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a */
        public boolean f36046a = true;

        /* renamed from: b */
        public boolean f36047b = false;

        /* renamed from: c */
        public boolean f36048c = false;

        public VideoOptions build() {
            return new VideoOptions(this, null);
        }

        public Builder setClickToExpandRequested(boolean z) {
            this.f36048c = z;
            return this;
        }

        public Builder setCustomControlsRequested(boolean z) {
            this.f36047b = z;
            return this;
        }

        public Builder setStartMuted(boolean z) {
            this.f36046a = z;
            return this;
        }
    }

    public /* synthetic */ VideoOptions(Builder builder, zzi zziVar) {
        this.f36043a = builder.f36046a;
        this.f36044b = builder.f36047b;
        this.f36045c = builder.f36048c;
    }

    public VideoOptions(zzfl zzflVar) {
        this.f36043a = zzflVar.zza;
        this.f36044b = zzflVar.zzb;
        this.f36045c = zzflVar.zzc;
    }

    public boolean getClickToExpandRequested() {
        return this.f36045c;
    }

    public boolean getCustomControlsRequested() {
        return this.f36044b;
    }

    public boolean getStartMuted() {
        return this.f36043a;
    }
}
