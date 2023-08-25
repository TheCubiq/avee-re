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
        Parcel m20847D = m20847D();
        m20847D.writeString(str);
        m20847D.writeLong(j);
        m20845M(23, m20847D);
    }

    @Override // com.daaw.ju3
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel m20847D = m20847D();
        m20847D.writeString(str);
        m20847D.writeString(str2);
        ne3.m15205e(m20847D, bundle);
        m20845M(9, m20847D);
    }

    @Override // com.daaw.ju3
    public final void endAdUnitExposure(String str, long j) {
        Parcel m20847D = m20847D();
        m20847D.writeString(str);
        m20847D.writeLong(j);
        m20845M(24, m20847D);
    }

    @Override // com.daaw.ju3
    public final void generateEventId(ox3 ox3Var) {
        Parcel m20847D = m20847D();
        ne3.m15204f(m20847D, ox3Var);
        m20845M(22, m20847D);
    }

    @Override // com.daaw.ju3
    public final void getCachedAppInstanceId(ox3 ox3Var) {
        Parcel m20847D = m20847D();
        ne3.m15204f(m20847D, ox3Var);
        m20845M(19, m20847D);
    }

    @Override // com.daaw.ju3
    public final void getConditionalUserProperties(String str, String str2, ox3 ox3Var) {
        Parcel m20847D = m20847D();
        m20847D.writeString(str);
        m20847D.writeString(str2);
        ne3.m15204f(m20847D, ox3Var);
        m20845M(10, m20847D);
    }

    @Override // com.daaw.ju3
    public final void getCurrentScreenClass(ox3 ox3Var) {
        Parcel m20847D = m20847D();
        ne3.m15204f(m20847D, ox3Var);
        m20845M(17, m20847D);
    }

    @Override // com.daaw.ju3
    public final void getCurrentScreenName(ox3 ox3Var) {
        Parcel m20847D = m20847D();
        ne3.m15204f(m20847D, ox3Var);
        m20845M(16, m20847D);
    }

    @Override // com.daaw.ju3
    public final void getGmpAppId(ox3 ox3Var) {
        Parcel m20847D = m20847D();
        ne3.m15204f(m20847D, ox3Var);
        m20845M(21, m20847D);
    }

    @Override // com.daaw.ju3
    public final void getMaxUserProperties(String str, ox3 ox3Var) {
        Parcel m20847D = m20847D();
        m20847D.writeString(str);
        ne3.m15204f(m20847D, ox3Var);
        m20845M(6, m20847D);
    }

    @Override // com.daaw.ju3
    public final void getUserProperties(String str, String str2, boolean z, ox3 ox3Var) {
        Parcel m20847D = m20847D();
        m20847D.writeString(str);
        m20847D.writeString(str2);
        ne3.m15206d(m20847D, z);
        ne3.m15204f(m20847D, ox3Var);
        m20845M(5, m20847D);
    }

    @Override // com.daaw.ju3
    public final void initialize(yd0 yd0Var, zzcl zzclVar, long j) {
        Parcel m20847D = m20847D();
        ne3.m15204f(m20847D, yd0Var);
        ne3.m15205e(m20847D, zzclVar);
        m20847D.writeLong(j);
        m20845M(1, m20847D);
    }

    @Override // com.daaw.ju3
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel m20847D = m20847D();
        m20847D.writeString(str);
        m20847D.writeString(str2);
        ne3.m15205e(m20847D, bundle);
        ne3.m15206d(m20847D, z);
        ne3.m15206d(m20847D, z2);
        m20847D.writeLong(j);
        m20845M(2, m20847D);
    }

    @Override // com.daaw.ju3
    public final void logHealthData(int i, String str, yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3) {
        Parcel m20847D = m20847D();
        m20847D.writeInt(5);
        m20847D.writeString(str);
        ne3.m15204f(m20847D, yd0Var);
        ne3.m15204f(m20847D, yd0Var2);
        ne3.m15204f(m20847D, yd0Var3);
        m20845M(33, m20847D);
    }

    @Override // com.daaw.ju3
    public final void onActivityCreated(yd0 yd0Var, Bundle bundle, long j) {
        Parcel m20847D = m20847D();
        ne3.m15204f(m20847D, yd0Var);
        ne3.m15205e(m20847D, bundle);
        m20847D.writeLong(j);
        m20845M(27, m20847D);
    }

    @Override // com.daaw.ju3
    public final void onActivityDestroyed(yd0 yd0Var, long j) {
        Parcel m20847D = m20847D();
        ne3.m15204f(m20847D, yd0Var);
        m20847D.writeLong(j);
        m20845M(28, m20847D);
    }

    @Override // com.daaw.ju3
    public final void onActivityPaused(yd0 yd0Var, long j) {
        Parcel m20847D = m20847D();
        ne3.m15204f(m20847D, yd0Var);
        m20847D.writeLong(j);
        m20845M(29, m20847D);
    }

    @Override // com.daaw.ju3
    public final void onActivityResumed(yd0 yd0Var, long j) {
        Parcel m20847D = m20847D();
        ne3.m15204f(m20847D, yd0Var);
        m20847D.writeLong(j);
        m20845M(30, m20847D);
    }

    @Override // com.daaw.ju3
    public final void onActivitySaveInstanceState(yd0 yd0Var, ox3 ox3Var, long j) {
        Parcel m20847D = m20847D();
        ne3.m15204f(m20847D, yd0Var);
        ne3.m15204f(m20847D, ox3Var);
        m20847D.writeLong(j);
        m20845M(31, m20847D);
    }

    @Override // com.daaw.ju3
    public final void onActivityStarted(yd0 yd0Var, long j) {
        Parcel m20847D = m20847D();
        ne3.m15204f(m20847D, yd0Var);
        m20847D.writeLong(j);
        m20845M(25, m20847D);
    }

    @Override // com.daaw.ju3
    public final void onActivityStopped(yd0 yd0Var, long j) {
        Parcel m20847D = m20847D();
        ne3.m15204f(m20847D, yd0Var);
        m20847D.writeLong(j);
        m20845M(26, m20847D);
    }

    @Override // com.daaw.ju3
    public final void performAction(Bundle bundle, ox3 ox3Var, long j) {
        Parcel m20847D = m20847D();
        ne3.m15205e(m20847D, bundle);
        ne3.m15204f(m20847D, ox3Var);
        m20847D.writeLong(j);
        m20845M(32, m20847D);
    }

    @Override // com.daaw.ju3
    public final void registerOnMeasurementEventListener(v04 v04Var) {
        Parcel m20847D = m20847D();
        ne3.m15204f(m20847D, v04Var);
        m20845M(35, m20847D);
    }

    @Override // com.daaw.ju3
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel m20847D = m20847D();
        ne3.m15205e(m20847D, bundle);
        m20847D.writeLong(j);
        m20845M(8, m20847D);
    }

    @Override // com.daaw.ju3
    public final void setConsent(Bundle bundle, long j) {
        Parcel m20847D = m20847D();
        ne3.m15205e(m20847D, bundle);
        m20847D.writeLong(j);
        m20845M(44, m20847D);
    }

    @Override // com.daaw.ju3
    public final void setCurrentScreen(yd0 yd0Var, String str, String str2, long j) {
        Parcel m20847D = m20847D();
        ne3.m15204f(m20847D, yd0Var);
        m20847D.writeString(str);
        m20847D.writeString(str2);
        m20847D.writeLong(j);
        m20845M(15, m20847D);
    }

    @Override // com.daaw.ju3
    public final void setDataCollectionEnabled(boolean z) {
        Parcel m20847D = m20847D();
        ne3.m15206d(m20847D, z);
        m20845M(39, m20847D);
    }

    @Override // com.daaw.ju3
    public final void setUserProperty(String str, String str2, yd0 yd0Var, boolean z, long j) {
        Parcel m20847D = m20847D();
        m20847D.writeString(str);
        m20847D.writeString(str2);
        ne3.m15204f(m20847D, yd0Var);
        ne3.m15206d(m20847D, z);
        m20847D.writeLong(j);
        m20845M(4, m20847D);
    }
}
