package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbsj;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class cn3 extends cp2 implements dn3 {
    public cn3() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface zzn;
        Parcelable zze;
        gn3 gn3Var = null;
        switch (i) {
            case 1:
                yd0 I = yd0.a.I(parcel.readStrongBinder());
                zzq zzqVar = (zzq) dp2.a(parcel, zzq.CREATOR);
                zzl zzlVar = (zzl) dp2.a(parcel, zzl.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    gn3Var = queryLocalInterface instanceof gn3 ? (gn3) queryLocalInterface : new en3(readStrongBinder);
                }
                gn3 gn3Var2 = gn3Var;
                dp2.c(parcel);
                b3(I, zzqVar, zzlVar, readString, gn3Var2);
                parcel2.writeNoException();
                return true;
            case 2:
                zzn = zzn();
                parcel2.writeNoException();
                dp2.g(parcel2, zzn);
                return true;
            case 3:
                yd0 I2 = yd0.a.I(parcel.readStrongBinder());
                zzl zzlVar2 = (zzl) dp2.a(parcel, zzl.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    gn3Var = queryLocalInterface2 instanceof gn3 ? (gn3) queryLocalInterface2 : new en3(readStrongBinder2);
                }
                dp2.c(parcel);
                y0(I2, zzlVar2, readString2, gn3Var);
                parcel2.writeNoException();
                return true;
            case 4:
                h();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                yd0 I3 = yd0.a.I(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) dp2.a(parcel, zzq.CREATOR);
                zzl zzlVar3 = (zzl) dp2.a(parcel, zzl.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    gn3Var = queryLocalInterface3 instanceof gn3 ? (gn3) queryLocalInterface3 : new en3(readStrongBinder3);
                }
                gn3 gn3Var3 = gn3Var;
                dp2.c(parcel);
                k1(I3, zzqVar2, zzlVar3, readString3, readString4, gn3Var3);
                parcel2.writeNoException();
                return true;
            case 7:
                yd0 I4 = yd0.a.I(parcel.readStrongBinder());
                zzl zzlVar4 = (zzl) dp2.a(parcel, zzl.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    gn3Var = queryLocalInterface4 instanceof gn3 ? (gn3) queryLocalInterface4 : new en3(readStrongBinder4);
                }
                gn3 gn3Var4 = gn3Var;
                dp2.c(parcel);
                D0(I4, zzlVar4, readString5, readString6, gn3Var4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzE();
                parcel2.writeNoException();
                return true;
            case 9:
                d();
                parcel2.writeNoException();
                return true;
            case 10:
                yd0 I5 = yd0.a.I(parcel.readStrongBinder());
                zzl zzlVar5 = (zzl) dp2.a(parcel, zzl.CREATOR);
                String readString7 = parcel.readString();
                pv3 g3 = ov3.g3(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                dp2.c(parcel);
                J1(I5, zzlVar5, readString7, g3, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                String readString9 = parcel.readString();
                dp2.c(parcel);
                v2((zzl) dp2.a(parcel, zzl.CREATOR), readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                p();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzN = zzN();
                parcel2.writeNoException();
                dp2.d(parcel2, zzN);
                return true;
            case 14:
                yd0 I6 = yd0.a.I(parcel.readStrongBinder());
                zzl zzlVar6 = (zzl) dp2.a(parcel, zzl.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    gn3Var = queryLocalInterface5 instanceof gn3 ? (gn3) queryLocalInterface5 : new en3(readStrongBinder5);
                }
                gn3 gn3Var5 = gn3Var;
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                dp2.c(parcel);
                R0(I6, zzlVar6, readString10, readString11, gn3Var5, (zzblz) dp2.a(parcel, zzblz.CREATOR), createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
            case 16:
                parcel2.writeNoException();
                dp2.g(parcel2, null);
                return true;
            case 17:
                zze = zze();
                parcel2.writeNoException();
                dp2.f(parcel2, zze);
                return true;
            case 18:
                zze = zzf();
                parcel2.writeNoException();
                dp2.f(parcel2, zze);
                return true;
            case 19:
                zze = zzg();
                parcel2.writeNoException();
                dp2.f(parcel2, zze);
                return true;
            case 20:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                dp2.c(parcel);
                e3((zzl) dp2.a(parcel, zzl.CREATOR), readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 21:
                yd0 I7 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                t2(I7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                dp2.d(parcel2, false);
                return true;
            case 23:
                yd0 I8 = yd0.a.I(parcel.readStrongBinder());
                pv3 g32 = ov3.g3(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                dp2.c(parcel);
                I2(I8, g32, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzn = zzi();
                parcel2.writeNoException();
                dp2.g(parcel2, zzn);
                return true;
            case 25:
                boolean h = dp2.h(parcel);
                dp2.c(parcel);
                W1(h);
                parcel2.writeNoException();
                return true;
            case 26:
                zzn = zzh();
                parcel2.writeNoException();
                dp2.g(parcel2, zzn);
                return true;
            case 27:
                zzn = zzk();
                parcel2.writeNoException();
                dp2.g(parcel2, zzn);
                return true;
            case 28:
                yd0 I9 = yd0.a.I(parcel.readStrongBinder());
                zzl zzlVar7 = (zzl) dp2.a(parcel, zzl.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    gn3Var = queryLocalInterface6 instanceof gn3 ? (gn3) queryLocalInterface6 : new en3(readStrongBinder6);
                }
                dp2.c(parcel);
                q2(I9, zzlVar7, readString14, gn3Var);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                yd0 I10 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                V1(I10);
                parcel2.writeNoException();
                return true;
            case 31:
                yd0 I11 = yd0.a.I(parcel.readStrongBinder());
                dj3 g33 = cj3.g3(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbsj.CREATOR);
                dp2.c(parcel);
                i0(I11, g33, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                yd0 I12 = yd0.a.I(parcel.readStrongBinder());
                zzl zzlVar8 = (zzl) dp2.a(parcel, zzl.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    gn3Var = queryLocalInterface7 instanceof gn3 ? (gn3) queryLocalInterface7 : new en3(readStrongBinder7);
                }
                dp2.c(parcel);
                W(I12, zzlVar8, readString15, gn3Var);
                parcel2.writeNoException();
                return true;
            case 33:
                zze = zzl();
                parcel2.writeNoException();
                dp2.f(parcel2, zze);
                return true;
            case 34:
                zze = zzm();
                parcel2.writeNoException();
                dp2.f(parcel2, zze);
                return true;
            case 35:
                yd0 I13 = yd0.a.I(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) dp2.a(parcel, zzq.CREATOR);
                zzl zzlVar9 = (zzl) dp2.a(parcel, zzl.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    gn3Var = queryLocalInterface8 instanceof gn3 ? (gn3) queryLocalInterface8 : new en3(readStrongBinder8);
                }
                gn3 gn3Var6 = gn3Var;
                dp2.c(parcel);
                X0(I13, zzqVar3, zzlVar9, readString16, readString17, gn3Var6);
                parcel2.writeNoException();
                return true;
            case 36:
                zzn = zzj();
                parcel2.writeNoException();
                dp2.g(parcel2, zzn);
                return true;
            case 37:
                yd0 I14 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                D1(I14);
                parcel2.writeNoException();
                return true;
            case 38:
                yd0 I15 = yd0.a.I(parcel.readStrongBinder());
                zzl zzlVar10 = (zzl) dp2.a(parcel, zzl.CREATOR);
                String readString18 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    gn3Var = queryLocalInterface9 instanceof gn3 ? (gn3) queryLocalInterface9 : new en3(readStrongBinder9);
                }
                dp2.c(parcel);
                x2(I15, zzlVar10, readString18, gn3Var);
                parcel2.writeNoException();
                return true;
            case 39:
                yd0 I16 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                N0(I16);
                parcel2.writeNoException();
                return true;
        }
    }
}
