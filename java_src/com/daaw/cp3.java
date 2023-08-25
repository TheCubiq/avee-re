package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbye;
/* loaded from: classes.dex */
public abstract class cp3 extends cp2 implements dp3 {
    public cp3() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static dp3 g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof dp3 ? (dp3) queryLocalInterface : new bp3(iBinder);
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzbye zzf;
        boolean q1;
        gp3 gp3Var = null;
        oo3 jo3Var = null;
        xo3 vo3Var = null;
        ro3 po3Var = null;
        ap3 yo3Var = null;
        xo3 vo3Var2 = null;
        ap3 yo3Var2 = null;
        uo3 so3Var = null;
        ro3 po3Var2 = null;
        if (i != 1) {
            if (i == 2) {
                zzf = zzf();
            } else if (i != 3) {
                if (i != 5) {
                    if (i == 10) {
                        yd0.a.I(parcel.readStrongBinder());
                    } else if (i != 11) {
                        switch (i) {
                            case 13:
                                String readString = parcel.readString();
                                String readString2 = parcel.readString();
                                zzl zzlVar = (zzl) dp2.a(parcel, zzl.CREATOR);
                                yd0 I = yd0.a.I(parcel.readStrongBinder());
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                if (readStrongBinder != null) {
                                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                    po3Var2 = queryLocalInterface instanceof ro3 ? (ro3) queryLocalInterface : new po3(readStrongBinder);
                                }
                                ro3 ro3Var = po3Var2;
                                dp2.c(parcel);
                                s1(readString, readString2, zzlVar, I, ro3Var, fn3.g3(parcel.readStrongBinder()), (zzq) dp2.a(parcel, zzq.CREATOR));
                                break;
                            case 14:
                                String readString3 = parcel.readString();
                                String readString4 = parcel.readString();
                                zzl zzlVar2 = (zzl) dp2.a(parcel, zzl.CREATOR);
                                yd0 I2 = yd0.a.I(parcel.readStrongBinder());
                                IBinder readStrongBinder2 = parcel.readStrongBinder();
                                if (readStrongBinder2 != null) {
                                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                    so3Var = queryLocalInterface2 instanceof uo3 ? (uo3) queryLocalInterface2 : new so3(readStrongBinder2);
                                }
                                uo3 uo3Var = so3Var;
                                gn3 g3 = fn3.g3(parcel.readStrongBinder());
                                dp2.c(parcel);
                                E2(readString3, readString4, zzlVar2, I2, uo3Var, g3);
                                break;
                            case 15:
                                yd0 I3 = yd0.a.I(parcel.readStrongBinder());
                                dp2.c(parcel);
                                q1 = q1(I3);
                                parcel2.writeNoException();
                                dp2.d(parcel2, q1);
                                break;
                            case 16:
                                String readString5 = parcel.readString();
                                String readString6 = parcel.readString();
                                zzl zzlVar3 = (zzl) dp2.a(parcel, zzl.CREATOR);
                                yd0 I4 = yd0.a.I(parcel.readStrongBinder());
                                IBinder readStrongBinder3 = parcel.readStrongBinder();
                                if (readStrongBinder3 != null) {
                                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                    yo3Var2 = queryLocalInterface3 instanceof ap3 ? (ap3) queryLocalInterface3 : new yo3(readStrongBinder3);
                                }
                                ap3 ap3Var = yo3Var2;
                                gn3 g32 = fn3.g3(parcel.readStrongBinder());
                                dp2.c(parcel);
                                z1(readString5, readString6, zzlVar3, I4, ap3Var, g32);
                                break;
                            case 17:
                                yd0 I5 = yd0.a.I(parcel.readStrongBinder());
                                dp2.c(parcel);
                                q1 = L1(I5);
                                parcel2.writeNoException();
                                dp2.d(parcel2, q1);
                                break;
                            case 18:
                                String readString7 = parcel.readString();
                                String readString8 = parcel.readString();
                                zzl zzlVar4 = (zzl) dp2.a(parcel, zzl.CREATOR);
                                yd0 I6 = yd0.a.I(parcel.readStrongBinder());
                                IBinder readStrongBinder4 = parcel.readStrongBinder();
                                if (readStrongBinder4 != null) {
                                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                    vo3Var2 = queryLocalInterface4 instanceof xo3 ? (xo3) queryLocalInterface4 : new vo3(readStrongBinder4);
                                }
                                xo3 xo3Var = vo3Var2;
                                gn3 g33 = fn3.g3(parcel.readStrongBinder());
                                dp2.c(parcel);
                                y2(readString7, readString8, zzlVar4, I6, xo3Var, g33);
                                break;
                            case 19:
                                String readString9 = parcel.readString();
                                dp2.c(parcel);
                                N2(readString9);
                                break;
                            case 20:
                                String readString10 = parcel.readString();
                                String readString11 = parcel.readString();
                                zzl zzlVar5 = (zzl) dp2.a(parcel, zzl.CREATOR);
                                yd0 I7 = yd0.a.I(parcel.readStrongBinder());
                                IBinder readStrongBinder5 = parcel.readStrongBinder();
                                if (readStrongBinder5 != null) {
                                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                    yo3Var = queryLocalInterface5 instanceof ap3 ? (ap3) queryLocalInterface5 : new yo3(readStrongBinder5);
                                }
                                ap3 ap3Var2 = yo3Var;
                                gn3 g34 = fn3.g3(parcel.readStrongBinder());
                                dp2.c(parcel);
                                Z1(readString10, readString11, zzlVar5, I7, ap3Var2, g34);
                                break;
                            case 21:
                                String readString12 = parcel.readString();
                                String readString13 = parcel.readString();
                                zzl zzlVar6 = (zzl) dp2.a(parcel, zzl.CREATOR);
                                yd0 I8 = yd0.a.I(parcel.readStrongBinder());
                                IBinder readStrongBinder6 = parcel.readStrongBinder();
                                if (readStrongBinder6 != null) {
                                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                    po3Var = queryLocalInterface6 instanceof ro3 ? (ro3) queryLocalInterface6 : new po3(readStrongBinder6);
                                }
                                ro3 ro3Var2 = po3Var;
                                dp2.c(parcel);
                                c3(readString12, readString13, zzlVar6, I8, ro3Var2, fn3.g3(parcel.readStrongBinder()), (zzq) dp2.a(parcel, zzq.CREATOR));
                                break;
                            case 22:
                                String readString14 = parcel.readString();
                                String readString15 = parcel.readString();
                                zzl zzlVar7 = (zzl) dp2.a(parcel, zzl.CREATOR);
                                yd0 I9 = yd0.a.I(parcel.readStrongBinder());
                                IBinder readStrongBinder7 = parcel.readStrongBinder();
                                if (readStrongBinder7 != null) {
                                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                    vo3Var = queryLocalInterface7 instanceof xo3 ? (xo3) queryLocalInterface7 : new vo3(readStrongBinder7);
                                }
                                xo3 xo3Var2 = vo3Var;
                                dp2.c(parcel);
                                b1(readString14, readString15, zzlVar7, I9, xo3Var2, fn3.g3(parcel.readStrongBinder()), (zzblz) dp2.a(parcel, zzblz.CREATOR));
                                break;
                            case 23:
                                String readString16 = parcel.readString();
                                String readString17 = parcel.readString();
                                zzl zzlVar8 = (zzl) dp2.a(parcel, zzl.CREATOR);
                                yd0 I10 = yd0.a.I(parcel.readStrongBinder());
                                IBinder readStrongBinder8 = parcel.readStrongBinder();
                                if (readStrongBinder8 != null) {
                                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                                    jo3Var = queryLocalInterface8 instanceof oo3 ? (oo3) queryLocalInterface8 : new jo3(readStrongBinder8);
                                }
                                oo3 oo3Var = jo3Var;
                                gn3 g35 = fn3.g3(parcel.readStrongBinder());
                                dp2.c(parcel);
                                Q(readString16, readString17, zzlVar8, I10, oo3Var, g35);
                                break;
                            case 24:
                                yd0 I11 = yd0.a.I(parcel.readStrongBinder());
                                dp2.c(parcel);
                                q1 = q(I11);
                                parcel2.writeNoException();
                                dp2.d(parcel2, q1);
                                break;
                            default:
                                return false;
                        }
                    } else {
                        parcel.createStringArray();
                        Bundle[] bundleArr = (Bundle[]) parcel.createTypedArray(Bundle.CREATOR);
                    }
                    dp2.c(parcel);
                } else {
                    zzdq zze = zze();
                    parcel2.writeNoException();
                    dp2.g(parcel2, zze);
                }
                return true;
            } else {
                zzf = zzg();
            }
            parcel2.writeNoException();
            dp2.f(parcel2, zzf);
            return true;
        }
        yd0 I12 = yd0.a.I(parcel.readStrongBinder());
        String readString18 = parcel.readString();
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) dp2.a(parcel, creator);
        Bundle bundle2 = (Bundle) dp2.a(parcel, creator);
        zzq zzqVar = (zzq) dp2.a(parcel, zzq.CREATOR);
        IBinder readStrongBinder9 = parcel.readStrongBinder();
        if (readStrongBinder9 != null) {
            IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
            gp3Var = queryLocalInterface9 instanceof gp3 ? (gp3) queryLocalInterface9 : new ep3(readStrongBinder9);
        }
        gp3 gp3Var2 = gp3Var;
        dp2.c(parcel);
        U(I12, readString18, bundle, bundle2, zzqVar, gp3Var2);
        parcel2.writeNoException();
        return true;
    }
}
