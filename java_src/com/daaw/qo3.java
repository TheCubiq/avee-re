package com.daaw;

import android.os.Parcel;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public abstract class qo3 extends cp2 implements ro3 {
    public qo3() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
            dp2.m24105c(parcel);
            mo11107P2(m3857I);
        } else if (i == 2) {
            String readString = parcel.readString();
            dp2.m24105c(parcel);
            mo11105a(readString);
        } else if (i == 3) {
            dp2.m24105c(parcel);
            zzf((zze) dp2.m24107a(parcel, zze.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            mn3 m16715g3 = ln3.m16715g3(parcel.readStrongBinder());
            dp2.m24105c(parcel);
            mo11106U2(m16715g3);
        }
        parcel2.writeNoException();
        return true;
    }
}
