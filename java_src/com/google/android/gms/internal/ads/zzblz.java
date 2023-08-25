package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.kc3;
import com.daaw.z71;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzblz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzblz> CREATOR = new kc3();
    public final int p;
    public final boolean q;
    public final int r;
    public final boolean s;
    public final int t;
    public final zzfl u;
    public final boolean v;
    public final int w;
    public final int x;
    public final boolean y;

    public zzblz(int i, boolean z, int i2, boolean z2, int i3, zzfl zzflVar, boolean z3, int i4, int i5, boolean z4) {
        this.p = i;
        this.q = z;
        this.r = i2;
        this.s = z2;
        this.t = i3;
        this.u = zzflVar;
        this.v = z3;
        this.w = i4;
        this.y = z4;
        this.x = i5;
    }

    @Deprecated
    public zzblz(NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzfl(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), 0, false);
    }

    public static com.google.android.gms.ads.nativead.NativeAdOptions h(zzblz zzblzVar) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzblzVar == null) {
            return builder.build();
        }
        int i = zzblzVar.p;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    builder.setRequestCustomMuteThisAd(zzblzVar.v);
                    builder.setMediaAspectRatio(zzblzVar.w);
                    builder.enableCustomClickGestureDirection(zzblzVar.x, zzblzVar.y);
                }
                builder.setReturnUrlsForImageAssets(zzblzVar.q);
                builder.setRequestMultipleImages(zzblzVar.s);
                return builder.build();
            }
            zzfl zzflVar = zzblzVar.u;
            if (zzflVar != null) {
                builder.setVideoOptions(new VideoOptions(zzflVar));
            }
        }
        builder.setAdChoicesPlacement(zzblzVar.t);
        builder.setReturnUrlsForImageAssets(zzblzVar.q);
        builder.setRequestMultipleImages(zzblzVar.s);
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, this.p);
        z71.c(parcel, 2, this.q);
        z71.k(parcel, 3, this.r);
        z71.c(parcel, 4, this.s);
        z71.k(parcel, 5, this.t);
        z71.p(parcel, 6, this.u, i, false);
        z71.c(parcel, 7, this.v);
        z71.k(parcel, 8, this.w);
        z71.k(parcel, 9, this.x);
        z71.c(parcel, 10, this.y);
        z71.b(parcel, a);
    }
}
