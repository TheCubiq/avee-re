package com.daaw;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class uc3 extends cp2 implements vc3 {
    public uc3() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: g3 */
    public static vc3 m8320g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof vc3 ? (vc3) queryLocalInterface : new tc3(iBinder);
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        int zzd;
        if (i == 1) {
            yd0 zzf = zzf();
            parcel2.writeNoException();
            dp2.m24101g(parcel2, zzf);
        } else if (i == 2) {
            Uri zze = zze();
            parcel2.writeNoException();
            dp2.m24102f(parcel2, zze);
        } else if (i != 3) {
            if (i == 4) {
                zzd = zzd();
            } else if (i != 5) {
                return false;
            } else {
                zzd = zzc();
            }
            parcel2.writeNoException();
            parcel2.writeInt(zzd);
        } else {
            double zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeDouble(zzb);
        }
        return true;
    }
}
