package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
/* loaded from: classes.dex */
public abstract class rc3 extends cp2 implements sc3 {
    public rc3() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        float zze;
        IInterface zzi;
        ge3 ge3Var;
        switch (i) {
            case 2:
                zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 3:
                yd0 I = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                zzj(I);
                parcel2.writeNoException();
                return true;
            case 4:
                zzi = zzi();
                parcel2.writeNoException();
                dp2.g(parcel2, zzi);
                return true;
            case 5:
                zze = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 6:
                zze = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 7:
                zzi = zzh();
                parcel2.writeNoException();
                dp2.g(parcel2, zzi);
                return true;
            case 8:
                boolean zzk = zzk();
                parcel2.writeNoException();
                dp2.d(parcel2, zzk);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    ge3Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    ge3Var = queryLocalInterface instanceof ge3 ? (ge3) queryLocalInterface : new ge3(readStrongBinder);
                }
                dp2.c(parcel);
                p0(ge3Var);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
