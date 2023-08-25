.class public interface abstract Lcom/daaw/ju3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/IInterface;


# virtual methods
.method public abstract beginAdUnitExposure(Ljava/lang/String;J)V
.end method

.method public abstract clearConditionalUserProperty(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
.end method

.method public abstract clearMeasurementEnabled(J)V
.end method

.method public abstract endAdUnitExposure(Ljava/lang/String;J)V
.end method

.method public abstract generateEventId(Lcom/daaw/ox3;)V
.end method

.method public abstract getAppInstanceId(Lcom/daaw/ox3;)V
.end method

.method public abstract getCachedAppInstanceId(Lcom/daaw/ox3;)V
.end method

.method public abstract getConditionalUserProperties(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/ox3;)V
.end method

.method public abstract getCurrentScreenClass(Lcom/daaw/ox3;)V
.end method

.method public abstract getCurrentScreenName(Lcom/daaw/ox3;)V
.end method

.method public abstract getGmpAppId(Lcom/daaw/ox3;)V
.end method

.method public abstract getMaxUserProperties(Ljava/lang/String;Lcom/daaw/ox3;)V
.end method

.method public abstract getSessionId(Lcom/daaw/ox3;)V
.end method

.method public abstract getTestFlag(Lcom/daaw/ox3;I)V
.end method

.method public abstract getUserProperties(Ljava/lang/String;Ljava/lang/String;ZLcom/daaw/ox3;)V
.end method

.method public abstract initForTests(Ljava/util/Map;)V
.end method

.method public abstract initialize(Lcom/daaw/yd0;Lcom/google/android/gms/internal/measurement/zzcl;J)V
.end method

.method public abstract isDataCollectionEnabled(Lcom/daaw/ox3;)V
.end method

.method public abstract logEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V
.end method

.method public abstract logEventAndBundle(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/daaw/ox3;J)V
.end method

.method public abstract logHealthData(ILjava/lang/String;Lcom/daaw/yd0;Lcom/daaw/yd0;Lcom/daaw/yd0;)V
.end method

.method public abstract onActivityCreated(Lcom/daaw/yd0;Landroid/os/Bundle;J)V
.end method

.method public abstract onActivityDestroyed(Lcom/daaw/yd0;J)V
.end method

.method public abstract onActivityPaused(Lcom/daaw/yd0;J)V
.end method

.method public abstract onActivityResumed(Lcom/daaw/yd0;J)V
.end method

.method public abstract onActivitySaveInstanceState(Lcom/daaw/yd0;Lcom/daaw/ox3;J)V
.end method

.method public abstract onActivityStarted(Lcom/daaw/yd0;J)V
.end method

.method public abstract onActivityStopped(Lcom/daaw/yd0;J)V
.end method

.method public abstract performAction(Landroid/os/Bundle;Lcom/daaw/ox3;J)V
.end method

.method public abstract registerOnMeasurementEventListener(Lcom/daaw/v04;)V
.end method

.method public abstract resetAnalyticsData(J)V
.end method

.method public abstract setConditionalUserProperty(Landroid/os/Bundle;J)V
.end method

.method public abstract setConsent(Landroid/os/Bundle;J)V
.end method

.method public abstract setConsentThirdParty(Landroid/os/Bundle;J)V
.end method

.method public abstract setCurrentScreen(Lcom/daaw/yd0;Ljava/lang/String;Ljava/lang/String;J)V
.end method

.method public abstract setDataCollectionEnabled(Z)V
.end method

.method public abstract setDefaultEventParameters(Landroid/os/Bundle;)V
.end method

.method public abstract setEventInterceptor(Lcom/daaw/v04;)V
.end method

.method public abstract setInstanceIdProvider(Lcom/daaw/b34;)V
.end method

.method public abstract setMeasurementEnabled(ZJ)V
.end method

.method public abstract setMinimumSessionDuration(J)V
.end method

.method public abstract setSessionTimeoutDuration(J)V
.end method

.method public abstract setUserId(Ljava/lang/String;J)V
.end method

.method public abstract setUserProperty(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/yd0;ZJ)V
.end method

.method public abstract unregisterOnMeasurementEventListener(Lcom/daaw/v04;)V
.end method
