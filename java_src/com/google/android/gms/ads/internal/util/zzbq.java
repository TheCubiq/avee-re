package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import com.daaw.cp2;
import com.daaw.dp2;
import com.daaw.yd0;
/* loaded from: classes.dex */
public abstract class zzbq extends cp2 implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            dp2.m24105c(parcel);
            boolean zzf = zzf(m3857I, readString, readString2);
            parcel2.writeNoException();
            dp2.m24104d(parcel2, zzf);
        } else if (i != 2) {
            return false;
        } else {
            yd0 m3857I2 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
            dp2.m24105c(parcel);
            zze(m3857I2);
            parcel2.writeNoException();
        }
        return true;
    }
}
