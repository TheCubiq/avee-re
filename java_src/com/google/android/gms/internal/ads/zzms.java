package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
@zzadh
/* loaded from: classes2.dex */
public final class zzms extends zzjn {
    public zzms(zzjn zzjnVar) {
        super(zzjnVar.zzarb, zzjnVar.height, zzjnVar.heightPixels, zzjnVar.zzarc, zzjnVar.width, zzjnVar.widthPixels, zzjnVar.zzard, zzjnVar.zzare, zzjnVar.zzarf, zzjnVar.zzarg);
    }

    @Override // com.google.android.gms.internal.ads.zzjn, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzarb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.height);
        SafeParcelWriter.writeInt(parcel, 6, this.width);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
