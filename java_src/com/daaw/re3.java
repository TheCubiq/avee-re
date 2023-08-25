package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
/* loaded from: classes.dex */
public abstract class re3 extends cp2 implements se3 {
    public re3() {
        super("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    public static se3 zzc(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return queryLocalInterface instanceof se3 ? (se3) queryLocalInterface : new qe3(iBinder);
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
            dp2.m24105c(parcel);
            boolean zzb = zzb(m3857I);
            parcel2.writeNoException();
            dp2.m24104d(parcel2, zzb);
            return true;
        }
        return false;
    }
}
