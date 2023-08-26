package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
@zzadh
/* loaded from: classes2.dex */
public final class zzlu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlu> CREATOR = new zzlv();
    public final int zzasj;

    public zzlu(int i) {
        this.zzasj = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzasj);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
