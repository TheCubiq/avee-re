package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.HashMap;
/* loaded from: classes2.dex */
public abstract class lt3 extends kd3 implements ju3 {
    public lt3() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static ju3 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof ju3 ? (ju3) queryLocalInterface : new js3(iBinder);
    }

    @Override // com.daaw.kd3
    public final boolean D(int i, Parcel parcel, Parcel parcel2, int i2) {
        ox3 kv3Var;
        ox3 ox3Var = null;
        ox3 ox3Var2 = null;
        ox3 ox3Var3 = null;
        ox3 ox3Var4 = null;
        v04 v04Var = null;
        v04 v04Var2 = null;
        v04 v04Var3 = null;
        ox3 ox3Var5 = null;
        ox3 ox3Var6 = null;
        ox3 ox3Var7 = null;
        ox3 ox3Var8 = null;
        ox3 ox3Var9 = null;
        ox3 ox3Var10 = null;
        b34 b34Var = null;
        ox3 ox3Var11 = null;
        ox3 ox3Var12 = null;
        ox3 ox3Var13 = null;
        ox3 ox3Var14 = null;
        switch (i) {
            case 1:
                long readLong = parcel.readLong();
                ne3.c(parcel);
                initialize(yd0.a.I(parcel.readStrongBinder()), (zzcl) ne3.a(parcel, zzcl.CREATOR), readLong);
                break;
            case 2:
                boolean g = ne3.g(parcel);
                boolean g2 = ne3.g(parcel);
                long readLong2 = parcel.readLong();
                ne3.c(parcel);
                logEvent(parcel.readString(), parcel.readString(), (Bundle) ne3.a(parcel, Bundle.CREATOR), g, g2, readLong2);
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) ne3.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    kv3Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kv3Var = queryLocalInterface instanceof ox3 ? (ox3) queryLocalInterface : new kv3(readStrongBinder);
                }
                long readLong3 = parcel.readLong();
                ne3.c(parcel);
                logEventAndBundle(readString, readString2, bundle, kv3Var, readLong3);
                break;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                yd0 I = yd0.a.I(parcel.readStrongBinder());
                boolean g3 = ne3.g(parcel);
                long readLong4 = parcel.readLong();
                ne3.c(parcel);
                setUserProperty(readString3, readString4, I, g3, readLong4);
                break;
            case 5:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean g4 = ne3.g(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ox3Var = queryLocalInterface2 instanceof ox3 ? (ox3) queryLocalInterface2 : new kv3(readStrongBinder2);
                }
                ne3.c(parcel);
                getUserProperties(readString5, readString6, g4, ox3Var);
                break;
            case 6:
                String readString7 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ox3Var14 = queryLocalInterface3 instanceof ox3 ? (ox3) queryLocalInterface3 : new kv3(readStrongBinder3);
                }
                ne3.c(parcel);
                getMaxUserProperties(readString7, ox3Var14);
                break;
            case 7:
                String readString8 = parcel.readString();
                long readLong5 = parcel.readLong();
                ne3.c(parcel);
                setUserId(readString8, readLong5);
                break;
            case 8:
                long readLong6 = parcel.readLong();
                ne3.c(parcel);
                setConditionalUserProperty((Bundle) ne3.a(parcel, Bundle.CREATOR), readLong6);
                break;
            case 9:
                ne3.c(parcel);
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) ne3.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ox3Var13 = queryLocalInterface4 instanceof ox3 ? (ox3) queryLocalInterface4 : new kv3(readStrongBinder4);
                }
                ne3.c(parcel);
                getConditionalUserProperties(readString9, readString10, ox3Var13);
                break;
            case 11:
                boolean g5 = ne3.g(parcel);
                long readLong7 = parcel.readLong();
                ne3.c(parcel);
                setMeasurementEnabled(g5, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                ne3.c(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                ne3.c(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                ne3.c(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                yd0 I2 = yd0.a.I(parcel.readStrongBinder());
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                long readLong11 = parcel.readLong();
                ne3.c(parcel);
                setCurrentScreen(I2, readString11, readString12, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ox3Var12 = queryLocalInterface5 instanceof ox3 ? (ox3) queryLocalInterface5 : new kv3(readStrongBinder5);
                }
                ne3.c(parcel);
                getCurrentScreenName(ox3Var12);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ox3Var11 = queryLocalInterface6 instanceof ox3 ? (ox3) queryLocalInterface6 : new kv3(readStrongBinder6);
                }
                ne3.c(parcel);
                getCurrentScreenClass(ox3Var11);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    b34Var = queryLocalInterface7 instanceof b34 ? (b34) queryLocalInterface7 : new y14(readStrongBinder7);
                }
                ne3.c(parcel);
                setInstanceIdProvider(b34Var);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ox3Var10 = queryLocalInterface8 instanceof ox3 ? (ox3) queryLocalInterface8 : new kv3(readStrongBinder8);
                }
                ne3.c(parcel);
                getCachedAppInstanceId(ox3Var10);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ox3Var9 = queryLocalInterface9 instanceof ox3 ? (ox3) queryLocalInterface9 : new kv3(readStrongBinder9);
                }
                ne3.c(parcel);
                getAppInstanceId(ox3Var9);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ox3Var8 = queryLocalInterface10 instanceof ox3 ? (ox3) queryLocalInterface10 : new kv3(readStrongBinder10);
                }
                ne3.c(parcel);
                getGmpAppId(ox3Var8);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ox3Var7 = queryLocalInterface11 instanceof ox3 ? (ox3) queryLocalInterface11 : new kv3(readStrongBinder11);
                }
                ne3.c(parcel);
                generateEventId(ox3Var7);
                break;
            case 23:
                String readString13 = parcel.readString();
                long readLong12 = parcel.readLong();
                ne3.c(parcel);
                beginAdUnitExposure(readString13, readLong12);
                break;
            case 24:
                String readString14 = parcel.readString();
                long readLong13 = parcel.readLong();
                ne3.c(parcel);
                endAdUnitExposure(readString14, readLong13);
                break;
            case 25:
                yd0 I3 = yd0.a.I(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                ne3.c(parcel);
                onActivityStarted(I3, readLong14);
                break;
            case 26:
                yd0 I4 = yd0.a.I(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                ne3.c(parcel);
                onActivityStopped(I4, readLong15);
                break;
            case 27:
                long readLong16 = parcel.readLong();
                ne3.c(parcel);
                onActivityCreated(yd0.a.I(parcel.readStrongBinder()), (Bundle) ne3.a(parcel, Bundle.CREATOR), readLong16);
                break;
            case 28:
                yd0 I5 = yd0.a.I(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                ne3.c(parcel);
                onActivityDestroyed(I5, readLong17);
                break;
            case 29:
                yd0 I6 = yd0.a.I(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                ne3.c(parcel);
                onActivityPaused(I6, readLong18);
                break;
            case 30:
                yd0 I7 = yd0.a.I(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                ne3.c(parcel);
                onActivityResumed(I7, readLong19);
                break;
            case 31:
                yd0 I8 = yd0.a.I(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ox3Var6 = queryLocalInterface12 instanceof ox3 ? (ox3) queryLocalInterface12 : new kv3(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                ne3.c(parcel);
                onActivitySaveInstanceState(I8, ox3Var6, readLong20);
                break;
            case 32:
                Bundle bundle2 = (Bundle) ne3.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ox3Var5 = queryLocalInterface13 instanceof ox3 ? (ox3) queryLocalInterface13 : new kv3(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                ne3.c(parcel);
                performAction(bundle2, ox3Var5, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString15 = parcel.readString();
                yd0 I9 = yd0.a.I(parcel.readStrongBinder());
                yd0 I10 = yd0.a.I(parcel.readStrongBinder());
                yd0 I11 = yd0.a.I(parcel.readStrongBinder());
                ne3.c(parcel);
                logHealthData(readInt, readString15, I9, I10, I11);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    v04Var3 = queryLocalInterface14 instanceof v04 ? (v04) queryLocalInterface14 : new ry3(readStrongBinder14);
                }
                ne3.c(parcel);
                setEventInterceptor(v04Var3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    v04Var2 = queryLocalInterface15 instanceof v04 ? (v04) queryLocalInterface15 : new ry3(readStrongBinder15);
                }
                ne3.c(parcel);
                registerOnMeasurementEventListener(v04Var2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    v04Var = queryLocalInterface16 instanceof v04 ? (v04) queryLocalInterface16 : new ry3(readStrongBinder16);
                }
                ne3.c(parcel);
                unregisterOnMeasurementEventListener(v04Var);
                break;
            case 37:
                HashMap b = ne3.b(parcel);
                ne3.c(parcel);
                initForTests(b);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ox3Var4 = queryLocalInterface17 instanceof ox3 ? (ox3) queryLocalInterface17 : new kv3(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                ne3.c(parcel);
                getTestFlag(ox3Var4, readInt2);
                break;
            case 39:
                boolean g6 = ne3.g(parcel);
                ne3.c(parcel);
                setDataCollectionEnabled(g6);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ox3Var3 = queryLocalInterface18 instanceof ox3 ? (ox3) queryLocalInterface18 : new kv3(readStrongBinder18);
                }
                ne3.c(parcel);
                isDataCollectionEnabled(ox3Var3);
                break;
            case 41:
            default:
                return false;
            case 42:
                ne3.c(parcel);
                setDefaultEventParameters((Bundle) ne3.a(parcel, Bundle.CREATOR));
                break;
            case 43:
                long readLong22 = parcel.readLong();
                ne3.c(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                long readLong23 = parcel.readLong();
                ne3.c(parcel);
                setConsent((Bundle) ne3.a(parcel, Bundle.CREATOR), readLong23);
                break;
            case 45:
                long readLong24 = parcel.readLong();
                ne3.c(parcel);
                setConsentThirdParty((Bundle) ne3.a(parcel, Bundle.CREATOR), readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ox3Var2 = queryLocalInterface19 instanceof ox3 ? (ox3) queryLocalInterface19 : new kv3(readStrongBinder19);
                }
                ne3.c(parcel);
                getSessionId(ox3Var2);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
