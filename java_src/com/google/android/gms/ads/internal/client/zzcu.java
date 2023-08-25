package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.bp2;
/* loaded from: classes.dex */
public final class zzcu extends bp2 implements zzcw {
    public zzcu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final String zze() {
        Parcel I = I(1, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final String zzf() {
        Parcel I = I(2, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }
}
