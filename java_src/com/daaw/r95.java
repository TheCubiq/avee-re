package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzq;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class r95 extends kd3 implements ua5 {
    public r95() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.daaw.kd3
    /* renamed from: D */
    public final boolean mo8662D(int i, Parcel parcel, Parcel parcel2, int i2) {
        List mo8369l0;
        switch (i) {
            case 1:
                ne3.m15207c(parcel);
                mo8371i1((zzaw) ne3.m15209a(parcel, zzaw.CREATOR), (zzq) ne3.m15209a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                ne3.m15207c(parcel);
                mo8379C1((zzkw) ne3.m15209a(parcel, zzkw.CREATOR), (zzq) ne3.m15209a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                ne3.m15207c(parcel);
                mo8367m1((zzq) ne3.m15209a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                ne3.m15207c(parcel);
                mo8362y1((zzaw) ne3.m15209a(parcel, zzaw.CREATOR), readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                ne3.m15207c(parcel);
                mo8375X((zzq) ne3.m15209a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                boolean m15203g = ne3.m15203g(parcel);
                ne3.m15207c(parcel);
                mo8369l0 = mo8369l0((zzq) ne3.m15209a(parcel, zzq.CREATOR), m15203g);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo8369l0);
                return true;
            case 9:
                String readString3 = parcel.readString();
                ne3.m15207c(parcel);
                byte[] mo8368m0 = mo8368m0((zzaw) ne3.m15209a(parcel, zzaw.CREATOR), readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(mo8368m0);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                ne3.m15207c(parcel);
                mo8364u1(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                ne3.m15207c(parcel);
                String mo8363w0 = mo8363w0((zzq) ne3.m15209a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(mo8363w0);
                return true;
            case 12:
                ne3.m15207c(parcel);
                mo8378C2((zzac) ne3.m15209a(parcel, zzac.CREATOR), (zzq) ne3.m15209a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                ne3.m15207c(parcel);
                mo8370k0((zzac) ne3.m15209a(parcel, zzac.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                ne3.m15207c(parcel);
                mo8369l0 = mo8374a2(parcel.readString(), parcel.readString(), ne3.m15203g(parcel), (zzq) ne3.m15209a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo8369l0);
                return true;
            case 15:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                boolean m15203g2 = ne3.m15203g(parcel);
                ne3.m15207c(parcel);
                mo8369l0 = mo8372h0(readString7, readString8, readString9, m15203g2);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo8369l0);
                return true;
            case 16:
                ne3.m15207c(parcel);
                mo8369l0 = mo8366n1(parcel.readString(), parcel.readString(), (zzq) ne3.m15209a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo8369l0);
                return true;
            case 17:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                ne3.m15207c(parcel);
                mo8369l0 = mo8377G0(readString10, readString11, readString12);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo8369l0);
                return true;
            case 18:
                ne3.m15207c(parcel);
                mo8365s2((zzq) ne3.m15209a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                ne3.m15207c(parcel);
                mo8373e0((Bundle) ne3.m15209a(parcel, Bundle.CREATOR), (zzq) ne3.m15209a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                ne3.m15207c(parcel);
                mo8376T1((zzq) ne3.m15209a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
