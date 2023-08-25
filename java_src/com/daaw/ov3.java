package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
import com.google.android.gms.internal.ads.zzcdd;
/* loaded from: classes.dex */
public abstract class ov3 extends cp2 implements pv3 {
    public ov3() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: g3 */
    public static pv3 m13910g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof pv3 ? (pv3) queryLocalInterface : new nv3(iBinder);
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                mo1935B1(m3857I);
                break;
            case 2:
                yd0 m3857I2 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                dp2.m24105c(parcel);
                mo1928c1(m3857I2, readInt);
                break;
            case 3:
                yd0 m3857I3 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzi(m3857I3);
                break;
            case 4:
                yd0 m3857I4 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzj(m3857I4);
                break;
            case 5:
                yd0 m3857I5 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                mo1929a3(m3857I5);
                break;
            case 6:
                yd0 m3857I6 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                mo1932G(m3857I6);
                break;
            case 7:
                dp2.m24105c(parcel);
                mo1933F1(yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder()), (zzcdd) dp2.m24107a(parcel, zzcdd.CREATOR));
                break;
            case 8:
                yd0 m3857I7 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zze(m3857I7);
                break;
            case 9:
                yd0 m3857I8 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                dp2.m24105c(parcel);
                zzg(m3857I8, readInt2);
                break;
            case 10:
                yd0 m3857I9 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                mo1930P(m3857I9);
                break;
            case 11:
                yd0 m3857I10 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                mo1934D2(m3857I10);
                break;
            case 12:
                Bundle bundle = (Bundle) dp2.m24107a(parcel, Bundle.CREATOR);
                dp2.m24105c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
