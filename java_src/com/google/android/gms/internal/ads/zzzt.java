package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzzt> CREATOR = new zzzu();
    private final int major;
    private final int minor;
    private final int zzbvo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzt(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.zzbvo = i3;
    }

    public static zzzt zza(zzatk zzatkVar) {
        return new zzzt(zzatkVar.zzdgt, zzatkVar.zzdgu, zzatkVar.zzdgv);
    }

    public final String toString() {
        int i = this.major;
        int i2 = this.minor;
        int i3 = this.zzbvo;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.major);
        SafeParcelWriter.writeInt(parcel, 2, this.minor);
        SafeParcelWriter.writeInt(parcel, 3, this.zzbvo);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
