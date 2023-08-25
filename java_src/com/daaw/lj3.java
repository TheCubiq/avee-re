package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
/* loaded from: classes.dex */
public abstract class lj3 extends cp2 implements mj3 {
    public lj3() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface zzb;
        pj3 nj3Var;
        if (i != 3) {
            if (i == 4) {
                zzd();
            } else if (i == 5) {
                yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    nj3Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    nj3Var = queryLocalInterface instanceof pj3 ? (pj3) queryLocalInterface : new nj3(readStrongBinder);
                }
                dp2.m24105c(parcel);
                mo10595R(m3857I, nj3Var);
            } else if (i == 6) {
                yd0 m3857I2 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zze(m3857I2);
            } else if (i != 7) {
                return false;
            } else {
                zzb = zzc();
            }
            parcel2.writeNoException();
            return true;
        }
        zzb = zzb();
        parcel2.writeNoException();
        dp2.m24101g(parcel2, zzb);
        return true;
    }
}
