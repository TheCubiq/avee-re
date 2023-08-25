package com.daaw;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
import com.google.android.gms.internal.ads.zzcao;
import com.google.android.gms.internal.ads.zzcgj;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class yy3 extends cp2 implements zy3 {
    public yy3() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zy3 zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof zy3 ? (zy3) queryLocalInterface : new xy3(iBinder);
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        wy3 wy3Var = null;
        switch (i) {
            case 1:
                yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                zzcgj zzcgjVar = (zzcgj) dp2.m24107a(parcel, zzcgj.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    wy3Var = queryLocalInterface instanceof wy3 ? (wy3) queryLocalInterface : new uy3(readStrongBinder);
                }
                dp2.m24105c(parcel);
                zze(m3857I, zzcgjVar, wy3Var);
                parcel2.writeNoException();
                return true;
            case 2:
                yd0 m3857I2 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzj(m3857I2);
                parcel2.writeNoException();
                return true;
            case 3:
                yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                parcel2.writeNoException();
                dp2.m24101g(parcel2, null);
                return true;
            case 4:
                yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                parcel2.writeNoException();
                dp2.m24101g(parcel2, null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                yd0 m3857I3 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                rs3 m12233g3 = qs3.m12233g3(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzl(createTypedArrayList, m3857I3, m12233g3);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                yd0 m3857I4 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                rs3 m12233g32 = qs3.m12233g3(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzk(createTypedArrayList2, m3857I4, m12233g32);
                parcel2.writeNoException();
                return true;
            case 7:
                dp2.m24105c(parcel);
                zzf((zzcao) dp2.m24107a(parcel, zzcao.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                yd0 m3857I5 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzi(m3857I5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                yd0 m3857I6 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                rs3 m12233g33 = qs3.m12233g3(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzh(createTypedArrayList3, m3857I6, m12233g33);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                yd0 m3857I7 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                rs3 m12233g34 = qs3.m12233g3(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzg(createTypedArrayList4, m3857I7, m12233g34);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
