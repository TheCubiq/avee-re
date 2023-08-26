package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
@zzadh
/* loaded from: classes2.dex */
public final class zzafj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzafj> CREATOR = new zzafk();
    String zzbgu;

    public zzafj(String str) {
        this.zzbgu = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzbgu, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
