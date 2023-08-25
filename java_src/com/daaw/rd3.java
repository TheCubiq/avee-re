package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
import java.util.List;
/* loaded from: classes.dex */
public abstract class rd3 extends cp2 implements sd3 {
    public rd3() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: g3 */
    public static sd3 m11395g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof sd3 ? (sd3) queryLocalInterface : new qd3(iBinder);
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        String mo2685F2;
        IInterface mo2681s;
        boolean mo2682q;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                dp2.m24105c(parcel);
                mo2685F2 = mo2685F2(readString);
                parcel2.writeNoException();
                parcel2.writeString(mo2685F2);
                return true;
            case 2:
                String readString2 = parcel.readString();
                dp2.m24105c(parcel);
                mo2681s = mo2681s(readString2);
                parcel2.writeNoException();
                dp2.m24101g(parcel2, mo2681s);
                return true;
            case 3:
                List<String> zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(zzk);
                return true;
            case 4:
                mo2685F2 = zzi();
                parcel2.writeNoException();
                parcel2.writeString(mo2685F2);
                return true;
            case 5:
                String readString3 = parcel.readString();
                dp2.m24105c(parcel);
                zzn(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                mo2681s = zze();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, mo2681s);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                mo2681s = zzh();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, mo2681s);
                return true;
            case 10:
                yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                mo2682q = mo2682q(m3857I);
                parcel2.writeNoException();
                dp2.m24104d(parcel2, mo2682q);
                return true;
            case 11:
                parcel2.writeNoException();
                mo2681s = null;
                dp2.m24101g(parcel2, mo2681s);
                return true;
            case 12:
                mo2682q = zzq();
                parcel2.writeNoException();
                dp2.m24104d(parcel2, mo2682q);
                return true;
            case 13:
                mo2682q = zzs();
                parcel2.writeNoException();
                dp2.m24104d(parcel2, mo2682q);
                return true;
            case 14:
                yd0 m3857I2 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                mo2684f0(m3857I2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                mo2681s = zzf();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, mo2681s);
                return true;
            default:
                return false;
        }
    }
}
