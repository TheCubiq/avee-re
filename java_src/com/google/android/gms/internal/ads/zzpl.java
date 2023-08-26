package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
@zzadh
/* loaded from: classes2.dex */
public final class zzpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpl> CREATOR = new zzpm();
    public final int versionCode;
    public final boolean zzbjn;
    public final int zzbjo;
    public final boolean zzbjp;
    public final int zzbjq;
    public final zzmu zzbjr;

    public zzpl(int i, boolean z, int i2, boolean z2, int i3, zzmu zzmuVar) {
        this.versionCode = i;
        this.zzbjn = z;
        this.zzbjo = i2;
        this.zzbjp = z2;
        this.zzbjq = i3;
        this.zzbjr = zzmuVar;
    }

    public zzpl(NativeAdOptions nativeAdOptions) {
        this(3, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzmu(nativeAdOptions.getVideoOptions()) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzbjn);
        SafeParcelWriter.writeInt(parcel, 3, this.zzbjo);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzbjp);
        SafeParcelWriter.writeInt(parcel, 5, this.zzbjq);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzbjr, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
