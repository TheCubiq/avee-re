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

    /* renamed from: p */
    public final int f36843p;

    /* renamed from: q */
    public final boolean f36844q;

    /* renamed from: r */
    public final int f36845r;

    /* renamed from: s */
    public final boolean f36846s;

    /* renamed from: t */
    public final int f36847t;

    /* renamed from: u */
    public final zzfl f36848u;

    /* renamed from: v */
    public final boolean f36849v;

    /* renamed from: w */
    public final int f36850w;

    /* renamed from: x */
    public final int f36851x;

    /* renamed from: y */
    public final boolean f36852y;

    public zzblz(int i, boolean z, int i2, boolean z2, int i3, zzfl zzflVar, boolean z3, int i4, int i5, boolean z4) {
        this.f36843p = i;
        this.f36844q = z;
        this.f36845r = i2;
        this.f36846s = z2;
        this.f36847t = i3;
        this.f36848u = zzflVar;
        this.f36849v = z3;
        this.f36850w = i4;
        this.f36852y = z4;
        this.f36851x = i5;
    }

    @Deprecated
    public zzblz(NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzfl(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), 0, false);
    }

    /* renamed from: h */
    public static com.google.android.gms.ads.nativead.NativeAdOptions m1105h(zzblz zzblzVar) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzblzVar == null) {
            return builder.build();
        }
        int i = zzblzVar.f36843p;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    builder.setRequestCustomMuteThisAd(zzblzVar.f36849v);
                    builder.setMediaAspectRatio(zzblzVar.f36850w);
                    builder.enableCustomClickGestureDirection(zzblzVar.f36851x, zzblzVar.f36852y);
                }
                builder.setReturnUrlsForImageAssets(zzblzVar.f36844q);
                builder.setRequestMultipleImages(zzblzVar.f36846s);
                return builder.build();
            }
            zzfl zzflVar = zzblzVar.f36848u;
            if (zzflVar != null) {
                builder.setVideoOptions(new VideoOptions(zzflVar));
            }
        }
        builder.setAdChoicesPlacement(zzblzVar.f36847t);
        builder.setReturnUrlsForImageAssets(zzblzVar.f36844q);
        builder.setRequestMultipleImages(zzblzVar.f36846s);
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.f36843p);
        z71.m2731c(parcel, 2, this.f36844q);
        z71.m2723k(parcel, 3, this.f36845r);
        z71.m2731c(parcel, 4, this.f36846s);
        z71.m2723k(parcel, 5, this.f36847t);
        z71.m2718p(parcel, 6, this.f36848u, i, false);
        z71.m2731c(parcel, 7, this.f36849v);
        z71.m2723k(parcel, 8, this.f36850w);
        z71.m2723k(parcel, 9, this.f36851x);
        z71.m2731c(parcel, 10, this.f36852y);
        z71.m2732b(parcel, m2733a);
    }
}
