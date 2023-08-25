package com.daaw;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public abstract class cw3 extends cp2 implements dw3 {
    public cw3() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzg();
        } else if (i == 2) {
            int readInt = parcel.readInt();
            dp2.m24105c(parcel);
            zze(readInt);
        } else if (i != 3) {
            return false;
        } else {
            dp2.m24105c(parcel);
            zzf((zze) dp2.m24107a(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
