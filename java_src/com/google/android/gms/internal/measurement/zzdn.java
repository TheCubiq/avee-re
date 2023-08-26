package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzdn implements zzcs {
    private static final Map<String, zzdn> zza = new ArrayMap();
    private final SharedPreferences zzb;
    private volatile Map<String, ?> zze;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: com.google.android.gms.internal.measurement.zzdm
        private final zzdn zza;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.zza = this;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            this.zza.zza(sharedPreferences, str);
        }
    };
    private final Object zzd = new Object();
    private final List<zzct> zzf = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdn zza(Context context, String str) {
        zzdn zzdnVar;
        String str2 = null;
        if ((!zzcm.zza() || str2.startsWith("direct_boot:")) ? true : zzcm.zza(context)) {
            synchronized (zzdn.class) {
                zzdnVar = zza.get(null);
                if (zzdnVar == null) {
                    zzdnVar = new zzdn(zzb(context, null));
                    zza.put(null, zzdnVar);
                }
            }
            return zzdnVar;
        }
        return null;
    }

    private static SharedPreferences zzb(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (zzcm.zza()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                return context.getSharedPreferences(str.substring(12), 0);
            }
            return context.getSharedPreferences(str, 0);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private zzdn(SharedPreferences sharedPreferences) {
        this.zzb = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzcs
    public final Object zza(String str) {
        Map<String, ?> map = this.zze;
        if (map == null) {
            synchronized (this.zzd) {
                map = this.zze;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    Map<String, ?> all = this.zzb.getAll();
                    this.zze = all;
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    map = all;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void zza() {
        synchronized (zzdn.class) {
            for (zzdn zzdnVar : zza.values()) {
                zzdnVar.zzb.unregisterOnSharedPreferenceChangeListener(zzdnVar.zzc);
            }
            zza.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zzd) {
            this.zze = null;
            zzdc.zza();
        }
        synchronized (this) {
            for (zzct zzctVar : this.zzf) {
                zzctVar.zza();
            }
        }
    }
}
