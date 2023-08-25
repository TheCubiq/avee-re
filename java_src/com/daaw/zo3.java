package com.daaw;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public abstract class zo3 extends cp2 implements ap3 {
    public zo3() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            zzg();
        } else if (i == 3) {
            String readString = parcel.readString();
            dp2.m24105c(parcel);
            mo3475a(readString);
        } else if (i != 4) {
            return false;
        } else {
            dp2.m24105c(parcel);
            zzf((zze) dp2.m24107a(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
