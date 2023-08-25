package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.daaw.bp2;
import com.daaw.dp2;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzdl extends bp2 implements zzdn {
    public zzdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final Bundle zze() {
        Parcel I = I(5, D());
        Bundle bundle = (Bundle) dp2.a(I, Bundle.CREATOR);
        I.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final zzu zzf() {
        Parcel I = I(4, D());
        zzu zzuVar = (zzu) dp2.a(I, zzu.CREATOR);
        I.recycle();
        return zzuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzg() {
        Parcel I = I(1, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzh() {
        Parcel I = I(6, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzi() {
        Parcel I = I(2, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final List zzj() {
        Parcel I = I(3, D());
        ArrayList createTypedArrayList = I.createTypedArrayList(zzu.CREATOR);
        I.recycle();
        return createTypedArrayList;
    }
}
