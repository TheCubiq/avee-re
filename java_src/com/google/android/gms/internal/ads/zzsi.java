package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
@zzadh
/* loaded from: classes2.dex */
public final class zzsi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsi> CREATOR = new zzsj();
    public final byte[] data;
    public final int statusCode;
    public final boolean zzac;
    public final long zzad;
    public final String[] zzbnh;
    public final String[] zzbni;
    public final boolean zzbnj;
    public final String zzbnk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsi(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.zzbnj = z;
        this.zzbnk = str;
        this.statusCode = i;
        this.data = bArr;
        this.zzbnh = strArr;
        this.zzbni = strArr2;
        this.zzac = z2;
        this.zzad = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zzbnj);
        SafeParcelWriter.writeString(parcel, 2, this.zzbnk, false);
        SafeParcelWriter.writeInt(parcel, 3, this.statusCode);
        SafeParcelWriter.writeByteArray(parcel, 4, this.data, false);
        SafeParcelWriter.writeStringArray(parcel, 5, this.zzbnh, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.zzbni, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzac);
        SafeParcelWriter.writeLong(parcel, 8, this.zzad);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
