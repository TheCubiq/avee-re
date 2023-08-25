package com.daaw;

import android.os.Parcel;
import com.daaw.yd0;
/* loaded from: classes.dex */
public abstract class ba3 extends cp2 implements ca3 {
    public ba3() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        String zzb;
        if (i == 1) {
            zzb = zzb();
        } else if (i != 2) {
            if (i == 3) {
                yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzd(m3857I);
            } else if (i == 4) {
                zze();
            } else if (i != 5) {
                return false;
            } else {
                zzf();
            }
            parcel2.writeNoException();
            return true;
        } else {
            zzb = zzc();
        }
        parcel2.writeNoException();
        parcel2.writeString(zzb);
        return true;
    }
}
