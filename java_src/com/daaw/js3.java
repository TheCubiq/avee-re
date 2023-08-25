package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzcl;
/* loaded from: classes2.dex */
public final class js3 extends hc3 implements ju3 {
    public js3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.daaw.ju3
    public final void beginAdUnitExposure(String str, long j) {
        Parcel D = D();
        D.writeString(str);
        D.writeLong(j);
        M(23, D);
    }

    @Override // com.daaw.ju3
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel D = D();
        D.writeString(str);
        D.writeString(str2);
        ne3.e(D, bundle);
        M(9, D);
    }

    @Override // com.daaw.ju3
    public final void endAdUnitExposure(String str, long j) {
        Parcel D = D();
        D.writeString(str);
        D.writeLong(j);
        M(24, D);
    }

    @Override // com.daaw.ju3
    public final void generateEventId(ox3 ox3Var) {
        Parcel D = D();
        ne3.f(D, ox3Var);
        M(22, D);
    }

    @Override // com.daaw.ju3
    public final void getCachedAppInstanceId(ox3 ox3Var) {
        Parcel D = D();
        ne3.f(D, ox3Var);
        M(19, D);
    }

    @Override // com.daaw.ju3
    public final void getConditionalUserProperties(String str, String str2, ox3 ox3Var) {
        Parcel D = D();
        D.writeString(str);
        D.writeString(str2);
        ne3.f(D, ox3Var);
        M(10, D);
    }

    @Override // com.daaw.ju3
    public final void getCurrentScreenClass(ox3 ox3Var) {
        Parcel D = D();
        ne3.f(D, ox3Var);
        M(17, D);
    }

    @Override // com.daaw.ju3
    public final void getCurrentScreenName(ox3 ox3Var) {
        Parcel D = D();
        ne3.f(D, ox3Var);
        M(16, D);
    }

    @Override // com.daaw.ju3
    public final void getGmpAppId(ox3 ox3Var) {
        Parcel D = D();
        ne3.f(D, ox3Var);
        M(21, D);
    }

    @Override // com.daaw.ju3
    public final void getMaxUserProperties(String str, ox3 ox3Var) {
        Parcel D = D();
        D.writeString(str);
        ne3.f(D, ox3Var);
        M(6, D);
    }

    @Override // com.daaw.ju3
    public final void getUserProperties(String str, String str2, boolean z, ox3 ox3Var) {
        Parcel D = D();
        D.writeString(str);
        D.writeString(str2);
        ne3.d(D, z);
        ne3.f(D, ox3Var);
        M(5, D);
    }

    @Override // com.daaw.ju3
    public final void initialize(yd0 yd0Var, zzcl zzclVar, long j) {
        Parcel D = D();
        ne3.f(D, yd0Var);
        ne3.e(D, zzclVar);
        D.writeLong(j);
        M(1, D);
    }

    @Override // com.daaw.ju3
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel D = D();
        D.writeString(str);
        D.writeString(str2);
        ne3.e(D, bundle);
        ne3.d(D, z);
        ne3.d(D, z2);
        D.writeLong(j);
        M(2, D);
    }

    @Override // com.daaw.ju3
    public final void logHealthData(int i, String str, yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3) {
        Parcel D = D();
        D.writeInt(5);
        D.writeString(str);
        ne3.f(D, yd0Var);
        ne3.f(D, yd0Var2);
        ne3.f(D, yd0Var3);
        M(33, D);
    }

    @Override // com.daaw.ju3
    public final void onActivityCreated(yd0 yd0Var, Bundle bundle, long j) {
        Parcel D = D();
        ne3.f(D, yd0Var);
        ne3.e(D, bundle);
        D.writeLong(j);
        M(27, D);
    }

    @Override // com.daaw.ju3
    public final void onActivityDestroyed(yd0 yd0Var, long j) {
        Parcel D = D();
        ne3.f(D, yd0Var);
        D.writeLong(j);
        M(28, D);
    }

    @Override // com.daaw.ju3
    public final void onActivityPaused(yd0 yd0Var, long j) {
        Parcel D = D();
        ne3.f(D, yd0Var);
        D.writeLong(j);
        M(29, D);
    }

    @Override // com.daaw.ju3
    public final void onActivityResumed(yd0 yd0Var, long j) {
        Parcel D = D();
        ne3.f(D, yd0Var);
        D.writeLong(j);
        M(30, D);
    }

    @Override // com.daaw.ju3
    public final void onActivitySaveInstanceState(yd0 yd0Var, ox3 ox3Var, long j) {
        Parcel D = D();
        ne3.f(D, yd0Var);
        ne3.f(D, ox3Var);
        D.writeLong(j);
        M(31, D);
    }

    @Override // com.daaw.ju3
    public final void onActivityStarted(yd0 yd0Var, long j) {
        Parcel D = D();
        ne3.f(D, yd0Var);
        D.writeLong(j);
        M(25, D);
    }

    @Override // com.daaw.ju3
    public final void onActivityStopped(yd0 yd0Var, long j) {
        Parcel D = D();
        ne3.f(D, yd0Var);
        D.writeLong(j);
        M(26, D);
    }

    @Override // com.daaw.ju3
    public final void performAction(Bundle bundle, ox3 ox3Var, long j) {
        Parcel D = D();
        ne3.e(D, bundle);
        ne3.f(D, ox3Var);
        D.writeLong(j);
        M(32, D);
    }

    @Override // com.daaw.ju3
    public final void registerOnMeasurementEventListener(v04 v04Var) {
        Parcel D = D();
        ne3.f(D, v04Var);
        M(35, D);
    }

    @Override // com.daaw.ju3
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel D = D();
        ne3.e(D, bundle);
        D.writeLong(j);
        M(8, D);
    }

    @Override // com.daaw.ju3
    public final void setConsent(Bundle bundle, long j) {
        Parcel D = D();
        ne3.e(D, bundle);
        D.writeLong(j);
        M(44, D);
    }

    @Override // com.daaw.ju3
    public final void setCurrentScreen(yd0 yd0Var, String str, String str2, long j) {
        Parcel D = D();
        ne3.f(D, yd0Var);
        D.writeString(str);
        D.writeString(str2);
        D.writeLong(j);
        M(15, D);
    }

    @Override // com.daaw.ju3
    public final void setDataCollectionEnabled(boolean z) {
        Parcel D = D();
        ne3.d(D, z);
        M(39, D);
    }

    @Override // com.daaw.ju3
    public final void setUserProperty(String str, String str2, yd0 yd0Var, boolean z, long j) {
        Parcel D = D();
        D.writeString(str);
        D.writeString(str2);
        ne3.f(D, yd0Var);
        ne3.d(D, z);
        D.writeLong(j);
        M(4, D);
    }
}
