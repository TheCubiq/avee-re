package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.ads.zzang;
/* loaded from: classes.dex */
public final class zzm implements Parcelable.Creator<AdOverlayInfoParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzc zzcVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        zzang zzangVar = null;
        String str4 = null;
        zzaq zzaqVar = null;
        IBinder iBinder6 = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    zzcVar = (zzc) SafeParcelReader.createParcelable(parcel, readHeader, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 4:
                    iBinder2 = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 5:
                    iBinder3 = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 6:
                    iBinder4 = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 7:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 9:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 10:
                    iBinder5 = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 11:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 12:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 13:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 14:
                    zzangVar = (zzang) SafeParcelReader.createParcelable(parcel, readHeader, zzang.CREATOR);
                    break;
                case 15:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 16:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 17:
                    zzaqVar = (zzaq) SafeParcelReader.createParcelable(parcel, readHeader, zzaq.CREATOR);
                    break;
                case 18:
                    iBinder6 = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new AdOverlayInfoParcel(zzcVar, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, zzangVar, str4, zzaqVar, iBinder6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
