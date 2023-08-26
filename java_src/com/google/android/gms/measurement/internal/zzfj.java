package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.measurement.zzmb;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzfj extends zzgx {
    static final Pair<String, Long> zza = new Pair<>("", 0L);
    private String zzaa;
    private boolean zzab;
    private long zzac;
    public zzfm zzb;
    public final zzfn zzc;
    public final zzfn zzd;
    public final zzfn zze;
    public final zzfn zzf;
    public final zzfn zzg;
    public final zzfn zzh;
    public final zzfn zzi;
    public final zzfp zzj;
    public final zzfn zzk;
    public final zzfn zzl;
    public final zzfl zzm;
    public final zzfp zzn;
    public final zzfl zzo;
    public final zzfn zzp;
    public boolean zzq;
    public zzfl zzr;
    public zzfl zzs;
    public zzfn zzt;
    public final zzfp zzu;
    public final zzfp zzv;
    public final zzfn zzw;
    public final zzfk zzx;
    private SharedPreferences zzz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair<String, Boolean> zza(String str) {
        zzc();
        long elapsedRealtime = zzl().elapsedRealtime();
        if (this.zzaa != null && elapsedRealtime < this.zzac) {
            return new Pair<>(this.zzaa, Boolean.valueOf(this.zzab));
        }
        this.zzac = elapsedRealtime + zzs().zze(str);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzm());
            if (advertisingIdInfo != null) {
                this.zzaa = advertisingIdInfo.getId();
                this.zzab = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.zzaa == null) {
                this.zzaa = "";
            }
        } catch (Exception e) {
            zzq().zzv().zza("Unable to get advertising id", e);
            this.zzaa = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.zzaa, Boolean.valueOf(this.zzab));
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    protected final boolean zzd() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfj(zzgb zzgbVar) {
        super(zzgbVar);
        this.zzc = new zzfn(this, "last_upload", 0L);
        this.zzd = new zzfn(this, "last_upload_attempt", 0L);
        this.zze = new zzfn(this, "backoff", 0L);
        this.zzf = new zzfn(this, "last_delete_stale", 0L);
        this.zzk = new zzfn(this, "time_before_start", 10000L);
        this.zzl = new zzfn(this, "session_timeout", 1800000L);
        this.zzm = new zzfl(this, "start_new_session", true);
        this.zzp = new zzfn(this, "last_pause_time", 0L);
        this.zzn = new zzfp(this, "non_personalized_ads", null);
        this.zzo = new zzfl(this, "allow_remote_dynamite", false);
        this.zzg = new zzfn(this, "midnight_offset", 0L);
        this.zzh = new zzfn(this, "first_open_time", 0L);
        this.zzi = new zzfn(this, "app_install_time", 0L);
        this.zzj = new zzfp(this, "app_instance_id", null);
        this.zzr = new zzfl(this, "app_backgrounded", false);
        this.zzs = new zzfl(this, "deep_link_retrieval_complete", false);
        this.zzt = new zzfn(this, "deep_link_retrieval_attempts", 0L);
        this.zzu = new zzfp(this, "firebase_feature_rollouts", null);
        this.zzv = new zzfp(this, "deferred_attribution_cache", null);
        this.zzw = new zzfn(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzx = new zzfk(this, "default_event_parameters", null);
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    protected final void g_() {
        SharedPreferences sharedPreferences = zzm().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzz = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzq = z;
        if (!z) {
            SharedPreferences.Editor edit = this.zzz.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.zzb = new zzfm(this, "health_monitor", Math.max(0L, zzat.zzb.zza(null).longValue()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final SharedPreferences zzf() {
        zzc();
        zzaa();
        return this.zzz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(String str) {
        zzc();
        SharedPreferences.Editor edit = zzf().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzg() {
        zzc();
        return zzf().getString("gmp_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(String str) {
        zzc();
        SharedPreferences.Editor edit = zzf().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzh() {
        zzc();
        return zzf().getString("admob_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean zzi() {
        zzc();
        if (zzf().contains("use_service")) {
            return Boolean.valueOf(zzf().getBoolean("use_service", false));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(boolean z) {
        zzc();
        SharedPreferences.Editor edit = zzf().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj() {
        zzc();
        Boolean zzu = zzu();
        SharedPreferences.Editor edit = zzf().edit();
        edit.clear();
        edit.apply();
        if (zzu != null) {
            zza(zzu);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(Boolean bool) {
        zzc();
        SharedPreferences.Editor edit = zzf().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean zzu() {
        zzc();
        if (zzf().contains("measurement_enabled")) {
            return Boolean.valueOf(zzf().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(Boolean bool) {
        if (zzmb.zzb() && zzs().zza(zzat.zzco)) {
            zzc();
            SharedPreferences.Editor edit = zzf().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean zzv() {
        if (zzmb.zzb() && zzs().zza(zzat.zzco)) {
            zzc();
            if (zzf().contains("measurement_enabled_from_api")) {
                return Boolean.valueOf(zzf().getBoolean("measurement_enabled_from_api", true));
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(zzad zzadVar, int i) {
        if (zzmb.zzb() && zzs().zza(zzat.zzco)) {
            zzc();
            if (zza(i)) {
                SharedPreferences.Editor edit = zzf().edit();
                edit.putString("consent_settings", zzadVar.zza());
                edit.putInt("consent_source", i);
                edit.apply();
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(int i) {
        return zzad.zza(i, zzf().getInt("consent_source", 100));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzad zzw() {
        zzc();
        return zzad.zza(zzf().getString("consent_settings", "G1"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzx() {
        zzc();
        String string = zzf().getString("previous_os_version", null);
        zzk().zzaa();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = zzf().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(boolean z) {
        zzc();
        zzq().zzw().zza("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = zzf().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzy() {
        return this.zzz.contains("deferred_analytics_collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(long j) {
        return j - this.zzl.zza() > this.zzp.zza();
    }
}
