package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes2.dex */
public final class zzahl implements Parcelable.Creator<zzahk> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahk createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzjj zzjjVar = null;
        String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                zzjjVar = (zzjj) SafeParcelReader.createParcelable(parcel, readHeader, zzjj.CREATOR);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzahk(zzjjVar, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahk[] newArray(int i) {
        return new zzahk[i];
    }
}
