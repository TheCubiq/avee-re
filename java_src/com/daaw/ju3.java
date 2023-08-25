package com.daaw;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;
/* loaded from: classes2.dex */
public interface ju3 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(ox3 ox3Var);

    void getAppInstanceId(ox3 ox3Var);

    void getCachedAppInstanceId(ox3 ox3Var);

    void getConditionalUserProperties(String str, String str2, ox3 ox3Var);

    void getCurrentScreenClass(ox3 ox3Var);

    void getCurrentScreenName(ox3 ox3Var);

    void getGmpAppId(ox3 ox3Var);

    void getMaxUserProperties(String str, ox3 ox3Var);

    void getSessionId(ox3 ox3Var);

    void getTestFlag(ox3 ox3Var, int i);

    void getUserProperties(String str, String str2, boolean z, ox3 ox3Var);

    void initForTests(Map map);

    void initialize(yd0 yd0Var, zzcl zzclVar, long j);

    void isDataCollectionEnabled(ox3 ox3Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, ox3 ox3Var, long j);

    void logHealthData(int i, String str, yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3);

    void onActivityCreated(yd0 yd0Var, Bundle bundle, long j);

    void onActivityDestroyed(yd0 yd0Var, long j);

    void onActivityPaused(yd0 yd0Var, long j);

    void onActivityResumed(yd0 yd0Var, long j);

    void onActivitySaveInstanceState(yd0 yd0Var, ox3 ox3Var, long j);

    void onActivityStarted(yd0 yd0Var, long j);

    void onActivityStopped(yd0 yd0Var, long j);

    void performAction(Bundle bundle, ox3 ox3Var, long j);

    void registerOnMeasurementEventListener(v04 v04Var);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(yd0 yd0Var, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(v04 v04Var);

    void setInstanceIdProvider(b34 b34Var);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, yd0 yd0Var, boolean z, long j);

    void unregisterOnMeasurementEventListener(v04 v04Var);
}
