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
        Parcel m25951I = m25951I(5, m25952D());
        Bundle bundle = (Bundle) dp2.m24107a(m25951I, Bundle.CREATOR);
        m25951I.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final zzu zzf() {
        Parcel m25951I = m25951I(4, m25952D());
        zzu zzuVar = (zzu) dp2.m24107a(m25951I, zzu.CREATOR);
        m25951I.recycle();
        return zzuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzg() {
        Parcel m25951I = m25951I(1, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzh() {
        Parcel m25951I = m25951I(6, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzi() {
        Parcel m25951I = m25951I(2, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final List zzj() {
        Parcel m25951I = m25951I(3, m25952D());
        ArrayList createTypedArrayList = m25951I.createTypedArrayList(zzu.CREATOR);
        m25951I.recycle();
        return createTypedArrayList;
    }
}
