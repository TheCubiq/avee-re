package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zznf;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzim extends zzg {
    protected zzin zza;
    private volatile zzin zzb;
    private zzin zzc;
    private final Map<Activity, zzin> zzd;
    private Activity zze;
    private volatile boolean zzf;
    private volatile zzin zzg;
    private zzin zzh;
    private boolean zzi;
    private final Object zzj;
    private zzin zzk;
    private String zzl;

    public zzim(zzgb zzgbVar) {
        super(zzgbVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzy() {
        return false;
    }

    public final zzin zza(boolean z) {
        zzv();
        zzc();
        if (!zzs().zza(zzat.zzbw) || !z) {
            return this.zza;
        }
        zzin zzinVar = this.zza;
        return zzinVar != null ? zzinVar : this.zzh;
    }

    public final void zza(Bundle bundle, long j) {
        String str;
        if (!zzs().zza(zzat.zzbw)) {
            zzq().zzj().zza("Manual screen reporting is disabled.");
            return;
        }
        synchronized (this.zzj) {
            if (!this.zzi) {
                zzq().zzj().zza("Cannot log screen view event when the app is in the background.");
                return;
            }
            String str2 = null;
            if (bundle != null) {
                String string = bundle.getString(FirebaseAnalytics.Param.SCREEN_NAME);
                if (string != null && (string.length() <= 0 || string.length() > 100)) {
                    zzq().zzj().zza("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString(FirebaseAnalytics.Param.SCREEN_CLASS);
                if (string2 != null && (string2.length() <= 0 || string2.length() > 100)) {
                    zzq().zzj().zza("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                } else {
                    str = string;
                    str2 = string2;
                }
            } else {
                str = null;
            }
            if (str2 == null) {
                str2 = this.zze != null ? zza(this.zze.getClass().getCanonicalName()) : "Activity";
            }
            String str3 = str2;
            if (this.zzf && this.zzb != null) {
                this.zzf = false;
                boolean zzc = zzkx.zzc(this.zzb.zzb, str3);
                boolean zzc2 = zzkx.zzc(this.zzb.zza, str);
                if (zzc && zzc2) {
                    zzq().zzj().zza("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            zzq().zzw().zza("Logging screen view with name, class", str == null ? "null" : str, str3 == null ? "null" : str3);
            zzin zzinVar = this.zzb == null ? this.zzc : this.zzb;
            zzin zzinVar2 = new zzin(str, str3, zzo().zzf(), true, j);
            this.zzb = zzinVar2;
            this.zzc = zzinVar;
            this.zzg = zzinVar2;
            zzp().zza(new zzip(this, bundle, zzinVar2, zzinVar, zzl().elapsedRealtime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(Bundle bundle, zzin zzinVar, zzin zzinVar2, long j) {
        if (bundle != null) {
            bundle.remove(FirebaseAnalytics.Param.SCREEN_NAME);
            bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
        }
        zza(zzinVar, zzinVar2, j, true, zzo().zza((String) null, FirebaseAnalytics.Event.SCREEN_VIEW, bundle, (List<String>) null, true, true));
    }

    @Deprecated
    public final void zza(Activity activity, String str, String str2) {
        if (!zzs().zzh().booleanValue()) {
            zzq().zzj().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
        } else if (this.zzb == null) {
            zzq().zzj().zza("setCurrentScreen cannot be called while no activity active");
        } else if (this.zzd.get(activity) == null) {
            zzq().zzj().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = zza(activity.getClass().getCanonicalName());
            }
            boolean zzc = zzkx.zzc(this.zzb.zzb, str2);
            boolean zzc2 = zzkx.zzc(this.zzb.zza, str);
            if (zzc && zzc2) {
                zzq().zzj().zza("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                zzq().zzj().zza("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 != null && (str2.length() <= 0 || str2.length() > 100)) {
                zzq().zzj().zza("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            } else {
                zzq().zzw().zza("Setting current screen to name, class", str == null ? "null" : str, str2);
                zzin zzinVar = new zzin(str, str2, zzo().zzf());
                this.zzd.put(activity, zzinVar);
                zza(activity, zzinVar, true);
            }
        }
    }

    public final zzin zzaa() {
        return this.zzb;
    }

    private final void zza(Activity activity, zzin zzinVar, boolean z) {
        zzin zzinVar2;
        zzin zzinVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzinVar.zzb == null) {
            zzinVar2 = new zzin(zzinVar.zza, activity != null ? zza(activity.getClass().getCanonicalName()) : null, zzinVar.zzc, zzinVar.zze, zzinVar.zzf);
        } else {
            zzinVar2 = zzinVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzinVar2;
        zzp().zza(new zzio(this, zzinVar2, zzinVar3, zzl().elapsedRealtime(), z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzin zzinVar, zzin zzinVar2, long j, boolean z, Bundle bundle) {
        boolean z2;
        zzin zzinVar3;
        long zzb;
        zzc();
        boolean z3 = false;
        if (zzs().zza(zzat.zzat)) {
            z2 = z && this.zza != null;
            if (z2) {
                zza(this.zza, true, j);
            }
        } else {
            if (z && (zzinVar3 = this.zza) != null) {
                zza(zzinVar3, true, j);
            }
            z2 = false;
        }
        if ((zzinVar2 != null && zzinVar2.zzc == zzinVar.zzc && zzkx.zzc(zzinVar2.zzb, zzinVar.zzb) && zzkx.zzc(zzinVar2.zza, zzinVar.zza)) ? true : true) {
            Bundle bundle2 = new Bundle();
            if (zzs().zza(zzat.zzbw)) {
                bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            }
            Bundle bundle3 = bundle2;
            zza(zzinVar, bundle3, true);
            if (zzinVar2 != null) {
                if (zzinVar2.zza != null) {
                    bundle3.putString("_pn", zzinVar2.zza);
                }
                if (zzinVar2.zzb != null) {
                    bundle3.putString("_pc", zzinVar2.zzb);
                }
                bundle3.putLong("_pi", zzinVar2.zzc);
            }
            if (zzs().zza(zzat.zzat) && z2) {
                if (zznf.zzb() && zzs().zza(zzat.zzav)) {
                    zzb = zzj().zza(j);
                } else {
                    zzb = zzj().zzb.zzb();
                }
                if (zzb > 0) {
                    zzo().zza(bundle3, zzb);
                }
            }
            String str = "auto";
            if (zzs().zza(zzat.zzbw)) {
                if (!zzs().zzh().booleanValue()) {
                    bundle3.putLong("_mst", 1L);
                }
                if (zzinVar.zze) {
                    str = "app";
                }
            }
            String str2 = str;
            if (zzs().zza(zzat.zzbw)) {
                long currentTimeMillis = zzl().currentTimeMillis();
                if (zzinVar.zze && zzinVar.zzf != 0) {
                    currentTimeMillis = zzinVar.zzf;
                }
                zze().zza(str2, "_vs", currentTimeMillis, bundle3);
            } else {
                zze().zzb(str2, "_vs", bundle3);
            }
        }
        this.zza = zzinVar;
        if (zzs().zza(zzat.zzbw) && zzinVar.zze) {
            this.zzh = zzinVar;
        }
        zzg().zza(zzinVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzin zzinVar, boolean z, long j) {
        zzd().zza(zzl().elapsedRealtime());
        if (!zzj().zza(zzinVar != null && zzinVar.zzd, z, j) || zzinVar == null) {
            return;
        }
        zzinVar.zzd = false;
    }

    public static void zza(zzin zzinVar, Bundle bundle, boolean z) {
        if (bundle == null || zzinVar == null || (bundle.containsKey("_sc") && !z)) {
            if (bundle != null && zzinVar == null && z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        if (zzinVar.zza != null) {
            bundle.putString("_sn", zzinVar.zza);
        } else {
            bundle.remove("_sn");
        }
        if (zzinVar.zzb != null) {
            bundle.putString("_sc", zzinVar.zzb);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", zzinVar.zzc);
    }

    public final void zza(String str, zzin zzinVar) {
        zzc();
        synchronized (this) {
            if (this.zzl == null || this.zzl.equals(str) || zzinVar != null) {
                this.zzl = str;
                this.zzk = zzinVar;
            }
        }
    }

    private static String zza(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    private final zzin zzd(Activity activity) {
        Preconditions.checkNotNull(activity);
        zzin zzinVar = this.zzd.get(activity);
        if (zzinVar == null) {
            zzin zzinVar2 = new zzin(null, zza(activity.getClass().getCanonicalName()), zzo().zzf());
            this.zzd.put(activity, zzinVar2);
            zzinVar = zzinVar2;
        }
        return (zzs().zza(zzat.zzbw) && this.zzg != null) ? this.zzg : zzinVar;
    }

    public final void zza(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!zzs().zzh().booleanValue() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zzin(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), bundle2.getString("referrer_name"), bundle2.getLong(TtmlNode.ATTR_ID)));
    }

    public final void zza(Activity activity) {
        if (zzs().zza(zzat.zzbw)) {
            synchronized (this.zzj) {
                this.zzi = true;
                if (activity != this.zze) {
                    synchronized (this.zzj) {
                        this.zze = activity;
                        this.zzf = false;
                    }
                    if (zzs().zza(zzat.zzbv) && zzs().zzh().booleanValue()) {
                        this.zzg = null;
                        zzp().zza(new zzis(this));
                    }
                }
            }
        }
        if (zzs().zza(zzat.zzbv) && !zzs().zzh().booleanValue()) {
            this.zzb = this.zzg;
            zzp().zza(new zzir(this));
            return;
        }
        zza(activity, zzd(activity), false);
        zza zzd = zzd();
        zzd.zzp().zza(new zze(zzd, zzd.zzl().elapsedRealtime()));
    }

    public final void zzb(Activity activity) {
        if (zzs().zza(zzat.zzbw)) {
            synchronized (this.zzj) {
                this.zzi = false;
                this.zzf = true;
            }
        }
        long elapsedRealtime = zzl().elapsedRealtime();
        if (zzs().zza(zzat.zzbv) && !zzs().zzh().booleanValue()) {
            this.zzb = null;
            zzp().zza(new zziq(this, elapsedRealtime));
            return;
        }
        zzin zzd = zzd(activity);
        this.zzc = this.zzb;
        this.zzb = null;
        zzp().zza(new zzit(this, zzd, elapsedRealtime));
    }

    public final void zzb(Activity activity, Bundle bundle) {
        zzin zzinVar;
        if (!zzs().zzh().booleanValue() || bundle == null || (zzinVar = this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(TtmlNode.ATTR_ID, zzinVar.zzc);
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, zzinVar.zza);
        bundle2.putString("referrer_name", zzinVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void zzc(Activity activity) {
        synchronized (this.zzj) {
            if (activity == this.zze) {
                this.zze = null;
            }
        }
        if (zzs().zzh().booleanValue()) {
            this.zzd.remove(activity);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zza zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzhe zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzeq zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zziv zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzim zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzet zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzkb zzj() {
        return super.zzj();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzin zza(zzim zzimVar, zzin zzinVar) {
        zzimVar.zzh = null;
        return null;
    }
}
