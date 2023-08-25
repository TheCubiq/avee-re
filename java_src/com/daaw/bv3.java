package com.daaw;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class bv3 extends cp2 implements cv3 {
    public bv3() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(zzc);
        } else if (i != 2) {
            return false;
        } else {
            int zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeInt(zzb);
        }
        return true;
    }
}
