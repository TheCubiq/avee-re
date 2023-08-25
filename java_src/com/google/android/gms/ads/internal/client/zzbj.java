package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.daaw.cp2;
import com.daaw.dp2;
/* loaded from: classes.dex */
public abstract class zzbj extends cp2 implements zzbk {
    public zzbj() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzc();
        } else if (i != 2) {
            return false;
        } else {
            dp2.m24105c(parcel);
            zzb((zze) dp2.m24107a(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
