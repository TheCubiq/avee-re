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
    public final boolean D(int i, Parcel parcel, Parcel parcel2, int i2) {
        List l0;
        switch (i) {
            case 1:
                ne3.c(parcel);
                i1((zzaw) ne3.a(parcel, zzaw.CREATOR), (zzq) ne3.a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                ne3.c(parcel);
                C1((zzkw) ne3.a(parcel, zzkw.CREATOR), (zzq) ne3.a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                ne3.c(parcel);
                m1((zzq) ne3.a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                ne3.c(parcel);
                y1((zzaw) ne3.a(parcel, zzaw.CREATOR), readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                ne3.c(parcel);
                X((zzq) ne3.a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                boolean g = ne3.g(parcel);
                ne3.c(parcel);
                l0 = l0((zzq) ne3.a(parcel, zzq.CREATOR), g);
                parcel2.writeNoException();
                parcel2.writeTypedList(l0);
                return true;
            case 9:
                String readString3 = parcel.readString();
                ne3.c(parcel);
                byte[] m0 = m0((zzaw) ne3.a(parcel, zzaw.CREATOR), readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(m0);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                ne3.c(parcel);
                u1(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                ne3.c(parcel);
                String w0 = w0((zzq) ne3.a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(w0);
                return true;
            case 12:
                ne3.c(parcel);
                C2((zzac) ne3.a(parcel, zzac.CREATOR), (zzq) ne3.a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                ne3.c(parcel);
                k0((zzac) ne3.a(parcel, zzac.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                ne3.c(parcel);
                l0 = a2(parcel.readString(), parcel.readString(), ne3.g(parcel), (zzq) ne3.a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(l0);
                return true;
            case 15:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                boolean g2 = ne3.g(parcel);
                ne3.c(parcel);
                l0 = h0(readString7, readString8, readString9, g2);
                parcel2.writeNoException();
                parcel2.writeTypedList(l0);
                return true;
            case 16:
                ne3.c(parcel);
                l0 = n1(parcel.readString(), parcel.readString(), (zzq) ne3.a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(l0);
                return true;
            case 17:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                ne3.c(parcel);
                l0 = G0(readString10, readString11, readString12);
                parcel2.writeNoException();
                parcel2.writeTypedList(l0);
                return true;
            case 18:
                ne3.c(parcel);
                s2((zzq) ne3.a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                ne3.c(parcel);
                e0((Bundle) ne3.a(parcel, Bundle.CREATOR), (zzq) ne3.a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                ne3.c(parcel);
                T1((zzq) ne3.a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
