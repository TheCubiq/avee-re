package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzma;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.internal.measurement.zzod;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzy extends zzgu {
    private Boolean zza;
    private zzaa zzb;
    private Boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzy(zzgb zzgbVar) {
        super(zzgbVar);
        this.zzb = zzab.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzaa zzaaVar) {
        this.zzb = zzaaVar;
    }

    public final int zzd() {
        if (zzma.zzb() && zzs().zzd(null, zzat.zzce)) {
            zzkx zzo = zzo();
            Boolean zzaf = zzo.zzy.zzv().zzaf();
            if (zzo.zzi() >= 201500 || !(zzaf == null || zzaf.booleanValue())) {
                return 100;
            }
        }
        return 25;
    }

    public final int zza(String str) {
        return zza(str, zzat.zzah, 25, 100);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzb(String str) {
        if (zzma.zzb() && zzd(null, zzat.zzcd)) {
            return zza(str, zzat.zzag, 500, 2000);
        }
        return 500;
    }

    public final int zzc(String str) {
        return zzb(str, zzat.zzn);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzd(String str) {
        if (zzma.zzb() && zzd(null, zzat.zzcd)) {
            return zza(str, zzat.zzaf, 25, 100);
        }
        return 25;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zze(String str) {
        return zza(str, zzat.zza);
    }

    public final boolean zze() {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    ApplicationInfo applicationInfo = zzm().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.zzc = Boolean.valueOf(str != null && str.equals(myProcessName));
                    }
                    if (this.zzc == null) {
                        this.zzc = Boolean.TRUE;
                        zzq().zze().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzc.booleanValue();
    }

    public final long zza(String str, zzem<Long> zzemVar) {
        if (str == null) {
            return zzemVar.zza(null).longValue();
        }
        String zza = this.zzb.zza(str, zzemVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzemVar.zza(null).longValue();
        }
        try {
            return zzemVar.zza(Long.valueOf(Long.parseLong(zza))).longValue();
        } catch (NumberFormatException unused) {
            return zzemVar.zza(null).longValue();
        }
    }

    public final int zzb(String str, zzem<Integer> zzemVar) {
        if (str == null) {
            return zzemVar.zza(null).intValue();
        }
        String zza = this.zzb.zza(str, zzemVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzemVar.zza(null).intValue();
        }
        try {
            return zzemVar.zza(Integer.valueOf(Integer.parseInt(zza))).intValue();
        } catch (NumberFormatException unused) {
            return zzemVar.zza(null).intValue();
        }
    }

    private final int zza(String str, zzem<Integer> zzemVar, int i, int i2) {
        return Math.max(Math.min(zzb(str, zzemVar), i2), i);
    }

    public final double zzc(String str, zzem<Double> zzemVar) {
        if (str == null) {
            return zzemVar.zza(null).doubleValue();
        }
        String zza = this.zzb.zza(str, zzemVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzemVar.zza(null).doubleValue();
        }
        try {
            return zzemVar.zza(Double.valueOf(Double.parseDouble(zza))).doubleValue();
        } catch (NumberFormatException unused) {
            return zzemVar.zza(null).doubleValue();
        }
    }

    public final boolean zzd(String str, zzem<Boolean> zzemVar) {
        if (str == null) {
            return zzemVar.zza(null).booleanValue();
        }
        String zza = this.zzb.zza(str, zzemVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzemVar.zza(null).booleanValue();
        }
        return zzemVar.zza(Boolean.valueOf(Boolean.parseBoolean(zza))).booleanValue();
    }

    public final boolean zze(String str, zzem<Boolean> zzemVar) {
        return zzd(str, zzemVar);
    }

    public final boolean zza(zzem<Boolean> zzemVar) {
        return zzd(null, zzemVar);
    }

    private final Bundle zzx() {
        try {
            if (zzm().getPackageManager() == null) {
                zzq().zze().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(zzm()).getApplicationInfo(zzm().getPackageName(), 128);
            if (applicationInfo == null) {
                zzq().zze().zza("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            zzq().zze().zza("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean zzf(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle zzx = zzx();
        if (zzx == null) {
            zzq().zze().zza("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (zzx.containsKey(str)) {
            return Boolean.valueOf(zzx.getBoolean(str));
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<String> zzg(String str) {
        Integer valueOf;
        Preconditions.checkNotEmpty(str);
        Bundle zzx = zzx();
        if (zzx == null) {
            zzq().zze().zza("Failed to load metadata: Metadata bundle is null");
        } else if (zzx.containsKey(str)) {
            valueOf = Integer.valueOf(zzx.getInt(str));
            if (valueOf != null) {
                return null;
            }
            try {
                String[] stringArray = zzm().getResources().getStringArray(valueOf.intValue());
                if (stringArray == null) {
                    return null;
                }
                return Arrays.asList(stringArray);
            } catch (Resources.NotFoundException e) {
                zzq().zze().zza("Failed to load string array from metadata: resource not found", e);
                return null;
            }
        }
        valueOf = null;
        if (valueOf != null) {
        }
    }

    public final boolean zzf() {
        Boolean zzf = zzf("firebase_analytics_collection_deactivated");
        return zzf != null && zzf.booleanValue();
    }

    public final Boolean zzg() {
        Boolean zzf = zzf("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(zzf == null || zzf.booleanValue());
    }

    public final Boolean zzh() {
        boolean z = true;
        if (!zzod.zzb() || !zza(zzat.zzbv)) {
            return true;
        }
        Boolean zzf = zzf("google_analytics_automatic_screen_reporting_enabled");
        if (zzf != null && !zzf.booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static long zzi() {
        return zzat.zzac.zza(null).longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zza(zzf zzfVar) {
        Uri.Builder builder = new Uri.Builder();
        String zze = zzfVar.zze();
        if (TextUtils.isEmpty(zze)) {
            if (zznq.zzb() && zzs().zzd(zzfVar.zzc(), zzat.zzbj)) {
                zze = zzfVar.zzg();
            }
            zze = zzfVar.zzf();
        }
        Uri.Builder encodedAuthority = builder.scheme(zzat.zzd.zza(null)).encodedAuthority(zzat.zze.zza(null));
        String valueOf = String.valueOf(zze);
        encodedAuthority.path(valueOf.length() != 0 ? "config/app/".concat(valueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", zzfVar.zzd()).appendQueryParameter("platform", AbstractSpiCall.ANDROID_CLIENT_TYPE).appendQueryParameter("gmp_version", "31049");
        return builder.build().toString();
    }

    public static long zzj() {
        return zzat.zzc.zza(null).longValue();
    }

    public final String zzu() {
        return zza("debug.firebase.analytics.app", "");
    }

    public final String zzv() {
        return zza("debug.deferred.deeplink", "");
    }

    private final String zza(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (ClassNotFoundException e) {
            zzq().zze().zza("Could not find SystemProperties class", e);
            return str2;
        } catch (IllegalAccessException e2) {
            zzq().zze().zza("Could not access SystemProperties.get()", e2);
            return str2;
        } catch (NoSuchMethodException e3) {
            zzq().zze().zza("Could not find SystemProperties.get() method", e3);
            return str2;
        } catch (InvocationTargetException e4) {
            zzq().zze().zza("SystemProperties.get() threw an exception", e4);
            return str2;
        }
    }

    public final boolean zzh(String str) {
        return "1".equals(this.zzb.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzi(String str) {
        return "1".equals(this.zzb.zza(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzj(String str) {
        return zzd(str, zzat.zzaj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzk(String str) {
        zzem<String> zzemVar = zzat.zzak;
        if (str == null) {
            return zzemVar.zza(null);
        }
        return zzemVar.zza(this.zzb.zza(str, zzemVar.zza()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzw() {
        if (this.zza == null) {
            Boolean zzf = zzf("app_measurement_lite");
            this.zza = zzf;
            if (zzf == null) {
                this.zza = false;
            }
        }
        return this.zza.booleanValue() || !this.zzy.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzal zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ Clock zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ Context zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzev zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzkx zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ zzfu zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ zzex zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzfj zzr() {
        return super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzy zzs() {
        return super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ zzx zzt() {
        return super.zzt();
    }
}
