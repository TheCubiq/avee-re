package com.daaw;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public abstract class wo3 extends cp2 implements xo3 {
    public wo3() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            sn3 m11154g3 = rn3.m11154g3(parcel.readStrongBinder());
            dp2.m24105c(parcel);
            mo4877I0(m11154g3);
        } else if (i == 2) {
            String readString = parcel.readString();
            dp2.m24105c(parcel);
            mo4876a(readString);
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
