package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzmb;
import com.google.android.gms.internal.measurement.zznr;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.5.0 */
/* loaded from: classes2.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzu {
    zzgb zza = null;
    private Map<Integer, zzhc> zzb = new ArrayMap();

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.5.0 */
    /* loaded from: classes2.dex */
    class zza implements zzhc {
        private com.google.android.gms.internal.measurement.zzab zza;

        zza(com.google.android.gms.internal.measurement.zzab zzabVar) {
            this.zza = zzabVar;
        }

        @Override // com.google.android.gms.measurement.internal.zzhc
        public final void onEvent(String str, String str2, Bundle bundle, long j) {
            try {
                this.zza.zza(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.zza.zzq().zzh().zza("Event listener threw exception", e);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.5.0 */
    /* loaded from: classes2.dex */
    class zzb implements zzhd {
        private com.google.android.gms.internal.measurement.zzab zza;

        zzb(com.google.android.gms.internal.measurement.zzab zzabVar) {
            this.zza = zzabVar;
        }

        @Override // com.google.android.gms.measurement.internal.zzhd
        public final void interceptEvent(String str, String str2, Bundle bundle, long j) {
            try {
                this.zza.zza(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.zza.zzq().zzh().zza("Event interceptor threw exception", e);
            }
        }
    }

    private final void zza() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzae zzaeVar, long j) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzgb zzgbVar = this.zza;
        if (zzgbVar == null) {
            this.zza = zzgb.zza(context, zzaeVar, Long.valueOf(j));
        } else {
            zzgbVar.zzq().zzh().zza("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zza();
        this.zza.zzg().zza(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        zza();
        this.zza.zzg().zza(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void setUserId(String str, long j) throws RemoteException {
        zza();
        this.zza.zzg().zza((String) null, "_id", (Object) str, true, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        zza();
        this.zza.zzu().zza((Activity) ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zza();
        this.zza.zzg().zza(Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void clearMeasurementEnabled(long j) throws RemoteException {
        zza();
        this.zza.zzg().zza((Boolean) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void setConsent(Bundle bundle, long j) throws RemoteException {
        zza();
        zzhe zzg = this.zza.zzg();
        if (zzmb.zzb() && zzg.zzs().zzd(null, zzat.zzco)) {
            zzg.zzv();
            String zza2 = zzad.zza(bundle);
            if (zza2 != null) {
                zzg.zzq().zzj().zza("Ignoring invalid consent setting", zza2);
                zzg.zzq().zzj().zza("Valid consent values are 'granted', 'denied'");
            }
            zzg.zza(zzad.zzb(bundle), 10, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void resetAnalyticsData(long j) throws RemoteException {
        zza();
        zzhe zzg = this.zza.zzg();
        zzg.zza((String) null);
        zzg.zzp().zza(new zzho(zzg, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void setMinimumSessionDuration(long j) throws RemoteException {
        zza();
        zzhe zzg = this.zza.zzg();
        zzg.zzp().zza(new zzhl(zzg, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zza();
        zzhe zzg = this.zza.zzg();
        zzg.zzp().zza(new zzhk(zzg, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzw zzwVar) throws RemoteException {
        zza();
        this.zza.zzg();
        Preconditions.checkNotEmpty(str);
        this.zza.zzh().zza(zzwVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzw zzwVar) throws RemoteException {
        zza();
        zza(zzwVar, this.zza.zzg().zzai());
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzw zzwVar) throws RemoteException {
        zza();
        zza(zzwVar, this.zza.zzg().zzaj());
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzw zzwVar) throws RemoteException {
        zza();
        zza(zzwVar, this.zza.zzg().zzag());
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzw zzwVar) throws RemoteException {
        zza();
        this.zza.zzp().zza(new zzh(this, zzwVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzw zzwVar) throws RemoteException {
        zza();
        zza(zzwVar, this.zza.zzg().zzak());
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void generateEventId(com.google.android.gms.internal.measurement.zzw zzwVar) throws RemoteException {
        zza();
        this.zza.zzh().zza(zzwVar, this.zza.zzh().zzf());
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        zza();
        this.zza.zzy().zza(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        zza();
        this.zza.zzy().zzb(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void initForTests(Map map) throws RemoteException {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzw zzwVar, long j) throws RemoteException {
        zza();
        Preconditions.checkNotEmpty(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.zza.zzp().zza(new zzj(this, zzwVar, new zzar(str2, new zzam(bundle), "app", j), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zza();
        zzic zzicVar = this.zza.zzg().zza;
        if (zzicVar != null) {
            this.zza.zzg().zzaa();
            zzicVar.onActivityStarted((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zza();
        zzic zzicVar = this.zza.zzg().zza;
        if (zzicVar != null) {
            this.zza.zzg().zzaa();
            zzicVar.onActivityStopped((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        zza();
        zzic zzicVar = this.zza.zzg().zza;
        if (zzicVar != null) {
            this.zza.zzg().zzaa();
            zzicVar.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zza();
        zzic zzicVar = this.zza.zzg().zza;
        if (zzicVar != null) {
            this.zza.zzg().zzaa();
            zzicVar.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zza();
        zzic zzicVar = this.zza.zzg().zza;
        if (zzicVar != null) {
            this.zza.zzg().zzaa();
            zzicVar.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zza();
        zzic zzicVar = this.zza.zzg().zza;
        if (zzicVar != null) {
            this.zza.zzg().zzaa();
            zzicVar.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzw zzwVar, long j) throws RemoteException {
        zza();
        zzic zzicVar = this.zza.zzg().zza;
        Bundle bundle = new Bundle();
        if (zzicVar != null) {
            this.zza.zzg().zzaa();
            zzicVar.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zzwVar.zza(bundle);
        } catch (RemoteException e) {
            this.zza.zzq().zzh().zza("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzw zzwVar, long j) throws RemoteException {
        zza();
        zzwVar.zza(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void getUserProperties(String str, String str2, boolean z, com.google.android.gms.internal.measurement.zzw zzwVar) throws RemoteException {
        zza();
        this.zza.zzp().zza(new zzi(this, zzwVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        zza();
        this.zza.zzq().zza(i, true, false, str, iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper), iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2), iObjectWrapper3 != null ? ObjectWrapper.unwrap(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzab zzabVar) throws RemoteException {
        zza();
        zzhe zzg = this.zza.zzg();
        zzb zzbVar = new zzb(zzabVar);
        zzg.zzv();
        zzg.zzp().zza(new zzhr(zzg, zzbVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzab zzabVar) throws RemoteException {
        zza();
        zzhc zzhcVar = this.zzb.get(Integer.valueOf(zzabVar.zza()));
        if (zzhcVar == null) {
            zzhcVar = new zza(zzabVar);
            this.zzb.put(Integer.valueOf(zzabVar.zza()), zzhcVar);
        }
        this.zza.zzg().zza(zzhcVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzab zzabVar) throws RemoteException {
        zza();
        zzhc remove = this.zzb.remove(Integer.valueOf(zzabVar.zza()));
        if (remove == null) {
            remove = new zza(zzabVar);
        }
        this.zza.zzg().zzb(remove);
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzac zzacVar) throws RemoteException {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        zza();
        if (bundle == null) {
            this.zza.zzq().zze().zza("Conditional user property must not be null");
        } else {
            this.zza.zzg().zza(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zza();
        this.zza.zzg().zzc(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzw zzwVar) throws RemoteException {
        zza();
        this.zza.zzp().zza(new zzl(this, zzwVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void getTestFlag(com.google.android.gms.internal.measurement.zzw zzwVar, int i) throws RemoteException {
        zza();
        if (i == 0) {
            this.zza.zzh().zza(zzwVar, this.zza.zzg().zzac());
        } else if (i == 1) {
            this.zza.zzh().zza(zzwVar, this.zza.zzg().zzad().longValue());
        } else if (i != 2) {
            if (i == 3) {
                this.zza.zzh().zza(zzwVar, this.zza.zzg().zzae().intValue());
            } else if (i != 4) {
            } else {
                this.zza.zzh().zza(zzwVar, this.zza.zzg().zzab().booleanValue());
            }
        } else {
            zzkx zzh = this.zza.zzh();
            double doubleValue = this.zza.zzg().zzaf().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzwVar.zza(bundle);
            } catch (RemoteException e) {
                zzh.zzy.zzq().zzh().zza("Error returning double value to wrapper", e);
            }
        }
    }

    private final void zza(com.google.android.gms.internal.measurement.zzw zzwVar, String str) {
        this.zza.zzh().zza(zzwVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zza();
        zzhe zzg = this.zza.zzg();
        zzg.zzv();
        zzg.zzp().zza(new zzid(zzg, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzw zzwVar) throws RemoteException {
        zza();
        this.zza.zzp().zza(new zzk(this, zzwVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void setDefaultEventParameters(Bundle bundle) {
        zza();
        final zzhe zzg = this.zza.zzg();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        zzg.zzp().zza(new Runnable(zzg, bundle2) { // from class: com.google.android.gms.measurement.internal.zzhh
            private final zzhe zza;
            private final Bundle zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzg;
                this.zzb = bundle2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzhe zzheVar = this.zza;
                Bundle bundle3 = this.zzb;
                if (zznr.zzb() && zzheVar.zzs().zza(zzat.zzcg)) {
                    if (bundle3 == null) {
                        zzheVar.zzr().zzx.zza(new Bundle());
                        return;
                    }
                    Bundle zza2 = zzheVar.zzr().zzx.zza();
                    for (String str : bundle3.keySet()) {
                        Object obj = bundle3.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            zzheVar.zzo();
                            if (zzkx.zza(obj)) {
                                zzheVar.zzo().zza(27, (String) null, (String) null, 0);
                            }
                            zzheVar.zzq().zzj().zza("Invalid default event parameter type. Name, value", str, obj);
                        } else if (zzkx.zzd(str)) {
                            zzheVar.zzq().zzj().zza("Invalid default event parameter name. Name", str);
                        } else if (obj == null) {
                            zza2.remove(str);
                        } else if (zzheVar.zzo().zza("param", str, 100, obj)) {
                            zzheVar.zzo().zza(zza2, str, obj);
                        }
                    }
                    zzheVar.zzo();
                    if (zzkx.zza(zza2, zzheVar.zzs().zzd())) {
                        zzheVar.zzo().zza(26, (String) null, (String) null, 0);
                        zzheVar.zzq().zzj().zza("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    zzheVar.zzr().zzx.zza(zza2);
                    zzheVar.zzg().zza(zza2);
                }
            }
        });
    }
}
