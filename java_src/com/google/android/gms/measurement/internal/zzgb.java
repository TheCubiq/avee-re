package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzmb;
import com.google.android.gms.internal.measurement.zzmn;
import com.google.android.gms.internal.measurement.zznr;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public class zzgb implements zzgw {
    private static volatile zzgb zzb;
    final long zza;
    private Boolean zzaa;
    private long zzab;
    private volatile Boolean zzac;
    private Boolean zzad;
    private Boolean zzae;
    private volatile boolean zzaf;
    private int zzag;
    private final Context zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final boolean zzg;
    private final zzx zzh;
    private final zzy zzi;
    private final zzfj zzj;
    private final zzex zzk;
    private final zzfu zzl;
    private final zzkb zzm;
    private final zzkx zzn;
    private final zzev zzo;
    private final Clock zzp;
    private final zzim zzq;
    private final zzhe zzr;
    private final zza zzs;
    private final zzih zzt;
    private zzet zzu;
    private zziv zzv;
    private zzal zzw;
    private zzeq zzx;
    private zzfo zzy;
    private boolean zzz = false;
    private AtomicInteger zzah = new AtomicInteger(0);

    private zzgb(zzhf zzhfVar) {
        long currentTimeMillis;
        boolean z = false;
        Preconditions.checkNotNull(zzhfVar);
        zzx zzxVar = new zzx(zzhfVar.zza);
        this.zzh = zzxVar;
        zzen.zza = zzxVar;
        this.zzc = zzhfVar.zza;
        this.zzd = zzhfVar.zzb;
        this.zze = zzhfVar.zzc;
        this.zzf = zzhfVar.zzd;
        this.zzg = zzhfVar.zzh;
        this.zzac = zzhfVar.zze;
        this.zzaf = true;
        com.google.android.gms.internal.measurement.zzae zzaeVar = zzhfVar.zzg;
        if (zzaeVar != null && zzaeVar.zzg != null) {
            Object obj = zzaeVar.zzg.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zzad = (Boolean) obj;
            }
            Object obj2 = zzaeVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzae = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzdc.zza(this.zzc);
        this.zzp = DefaultClock.getInstance();
        if (zzhfVar.zzi != null) {
            currentTimeMillis = zzhfVar.zzi.longValue();
        } else {
            currentTimeMillis = this.zzp.currentTimeMillis();
        }
        this.zza = currentTimeMillis;
        this.zzi = new zzy(this);
        zzfj zzfjVar = new zzfj(this);
        zzfjVar.zzab();
        this.zzj = zzfjVar;
        zzex zzexVar = new zzex(this);
        zzexVar.zzab();
        this.zzk = zzexVar;
        zzkx zzkxVar = new zzkx(this);
        zzkxVar.zzab();
        this.zzn = zzkxVar;
        zzev zzevVar = new zzev(this);
        zzevVar.zzab();
        this.zzo = zzevVar;
        this.zzs = new zza(this);
        zzim zzimVar = new zzim(this);
        zzimVar.zzw();
        this.zzq = zzimVar;
        zzhe zzheVar = new zzhe(this);
        zzheVar.zzw();
        this.zzr = zzheVar;
        zzkb zzkbVar = new zzkb(this);
        zzkbVar.zzw();
        this.zzm = zzkbVar;
        zzih zzihVar = new zzih(this);
        zzihVar.zzab();
        this.zzt = zzihVar;
        zzfu zzfuVar = new zzfu(this);
        zzfuVar.zzab();
        this.zzl = zzfuVar;
        if (zzhfVar.zzg != null && zzhfVar.zzg.zzb != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (this.zzc.getApplicationContext() instanceof Application) {
            zzhe zzg = zzg();
            if (zzg.zzm().getApplicationContext() instanceof Application) {
                Application application = (Application) zzg.zzm().getApplicationContext();
                if (zzg.zza == null) {
                    zzg.zza = new zzic(zzg, null);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(zzg.zza);
                    application.registerActivityLifecycleCallbacks(zzg.zza);
                    zzg.zzq().zzw().zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzq().zzh().zza("Application context is not an Application");
        }
        this.zzl.zza(new zzgd(this, zzhfVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzhf zzhfVar) {
        String concat;
        zzez zzezVar;
        zzp().zzc();
        zzal zzalVar = new zzal(this);
        zzalVar.zzab();
        this.zzw = zzalVar;
        zzeq zzeqVar = new zzeq(this, zzhfVar.zzf);
        zzeqVar.zzw();
        this.zzx = zzeqVar;
        zzet zzetVar = new zzet(this);
        zzetVar.zzw();
        this.zzu = zzetVar;
        zziv zzivVar = new zziv(this);
        zzivVar.zzw();
        this.zzv = zzivVar;
        this.zzn.zzac();
        this.zzj.zzac();
        this.zzy = new zzfo(this);
        this.zzx.zzx();
        zzq().zzu().zza("App measurement initialized, version", 31049L);
        zzq().zzu().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzaa = zzeqVar.zzaa();
        if (TextUtils.isEmpty(this.zzd)) {
            if (zzh().zze(zzaa)) {
                zzezVar = zzq().zzu();
                concat = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                zzez zzu = zzq().zzu();
                String valueOf = String.valueOf(zzaa);
                concat = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                zzezVar = zzu;
            }
            zzezVar.zza(concat);
        }
        zzq().zzv().zza("Debug-level message logging enabled");
        if (this.zzag != this.zzah.get()) {
            zzq().zze().zza("Not all components initialized", Integer.valueOf(this.zzag), Integer.valueOf(this.zzah.get()));
        }
        this.zzz = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(com.google.android.gms.internal.measurement.zzae zzaeVar) {
        zzp().zzc();
        if (zzmb.zzb() && this.zzi.zza(zzat.zzco)) {
            zzad zzw = zzb().zzw();
            if (zzaeVar != null && zzaeVar.zzg != null && zzb().zza(30)) {
                zzad zzb2 = zzad.zzb(zzaeVar.zzg);
                if (!zzb2.equals(zzad.zza)) {
                    zzg().zza(zzb2, 30, this.zza);
                    zzw = zzb2;
                }
            }
            zzg().zza(zzw);
        }
        if (zzb().zzc.zza() == 0) {
            zzb().zzc.zza(this.zzp.currentTimeMillis());
        }
        if (Long.valueOf(zzb().zzh.zza()).longValue() == 0) {
            zzq().zzw().zza("Persisting first open", Long.valueOf(this.zza));
            zzb().zzh.zza(this.zza);
        }
        if (this.zzi.zza(zzat.zzck)) {
            zzg().zzb.zzb();
        }
        if (!zzaf()) {
            if (zzaa()) {
                if (!zzh().zzc("android.permission.INTERNET")) {
                    zzq().zze().zza("App is missing INTERNET permission");
                }
                if (!zzh().zzc("android.permission.ACCESS_NETWORK_STATE")) {
                    zzq().zze().zza("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!Wrappers.packageManager(this.zzc).isCallerInstantApp() && !this.zzi.zzw()) {
                    if (!zzft.zza(this.zzc)) {
                        zzq().zze().zza("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!zzkx.zza(this.zzc, false)) {
                        zzq().zze().zza("AppMeasurementService not registered/enabled");
                    }
                }
                zzq().zze().zza("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(zzx().zzab()) || !TextUtils.isEmpty(zzx().zzac())) {
                zzh();
                if (zzkx.zza(zzx().zzab(), zzb().zzg(), zzx().zzac(), zzb().zzh())) {
                    zzq().zzu().zza("Rechecking which service to use due to a GMP App Id change");
                    zzb().zzj();
                    zzj().zzaa();
                    this.zzv.zzag();
                    this.zzv.zzae();
                    zzb().zzh.zza(this.zza);
                    zzb().zzj.zza(null);
                }
                zzb().zzb(zzx().zzab());
                zzb().zzc(zzx().zzac());
            }
            if (zzmb.zzb() && this.zzi.zza(zzat.zzco) && !zzb().zzw().zze()) {
                zzb().zzj.zza(null);
            }
            zzg().zza(zzb().zzj.zza());
            if (zzmn.zzb() && this.zzi.zza(zzat.zzbq) && !zzh().zzj() && !TextUtils.isEmpty(zzb().zzu.zza())) {
                zzq().zzh().zza("Remote config removed with active feature rollouts");
                zzb().zzu.zza(null);
            }
            if (!TextUtils.isEmpty(zzx().zzab()) || !TextUtils.isEmpty(zzx().zzac())) {
                boolean zzaa = zzaa();
                if (!zzb().zzy() && !this.zzi.zzf()) {
                    zzb().zzb(!zzaa);
                }
                if (zzaa) {
                    zzg().zzah();
                }
                zzd().zza.zza();
                zzv().zza(new AtomicReference<>());
                if (zznr.zzb() && this.zzi.zza(zzat.zzcg)) {
                    zzv().zza(zzb().zzx.zza());
                }
            }
        }
        zzb().zzo.zza(this.zzi.zza(zzat.zzay));
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final zzx zzt() {
        return this.zzh;
    }

    public final zzy zza() {
        return this.zzi;
    }

    public final zzfj zzb() {
        zza((zzgu) this.zzj);
        return this.zzj;
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final zzex zzq() {
        zzb(this.zzk);
        return this.zzk;
    }

    public final zzex zzc() {
        zzex zzexVar = this.zzk;
        if (zzexVar == null || !zzexVar.zzz()) {
            return null;
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final zzfu zzp() {
        zzb(this.zzl);
        return this.zzl;
    }

    public final zzkb zzd() {
        zzb(this.zzm);
        return this.zzm;
    }

    public final zzfo zze() {
        return this.zzy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfu zzf() {
        return this.zzl;
    }

    public final zzhe zzg() {
        zzb(this.zzr);
        return this.zzr;
    }

    public final zzkx zzh() {
        zza((zzgu) this.zzn);
        return this.zzn;
    }

    public final zzev zzi() {
        zza((zzgu) this.zzo);
        return this.zzo;
    }

    public final zzet zzj() {
        zzb(this.zzu);
        return this.zzu;
    }

    private final zzih zzah() {
        zzb(this.zzt);
        return this.zzt;
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final Context zzm() {
        return this.zzc;
    }

    public final boolean zzk() {
        return TextUtils.isEmpty(this.zzd);
    }

    public final String zzn() {
        return this.zzd;
    }

    public final String zzo() {
        return this.zze;
    }

    public final String zzr() {
        return this.zzf;
    }

    public final boolean zzs() {
        return this.zzg;
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final Clock zzl() {
        return this.zzp;
    }

    public final zzim zzu() {
        zzb(this.zzq);
        return this.zzq;
    }

    public final zziv zzv() {
        zzb(this.zzv);
        return this.zzv;
    }

    public final zzal zzw() {
        zzb(this.zzw);
        return this.zzw;
    }

    public final zzeq zzx() {
        zzb(this.zzx);
        return this.zzx;
    }

    public final zza zzy() {
        zza zzaVar = this.zzs;
        if (zzaVar != null) {
            return zzaVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public static zzgb zza(Context context, com.google.android.gms.internal.measurement.zzae zzaeVar, Long l) {
        if (zzaeVar != null && (zzaeVar.zze == null || zzaeVar.zzf == null)) {
            zzaeVar = new com.google.android.gms.internal.measurement.zzae(zzaeVar.zza, zzaeVar.zzb, zzaeVar.zzc, zzaeVar.zzd, null, null, zzaeVar.zzg);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzgb.class) {
                if (zzb == null) {
                    zzb = new zzgb(new zzhf(context, zzaeVar, l));
                }
            }
        } else if (zzaeVar != null && zzaeVar.zzg != null && zzaeVar.zzg.containsKey("dataCollectionDefaultEnabled")) {
            zzb.zza(zzaeVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        return zzb;
    }

    private static void zzb(zzgx zzgxVar) {
        if (zzgxVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (zzgxVar.zzz()) {
            return;
        }
        String valueOf = String.valueOf(zzgxVar.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    private static void zzb(zzg zzgVar) {
        if (zzgVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (zzgVar.zzu()) {
            return;
        }
        String valueOf = String.valueOf(zzgVar.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    private static void zza(zzgu zzguVar) {
        if (zzguVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(boolean z) {
        this.zzac = Boolean.valueOf(z);
    }

    public final boolean zzz() {
        return this.zzac != null && this.zzac.booleanValue();
    }

    public final boolean zzaa() {
        return zzab() == 0;
    }

    public final int zzab() {
        zzp().zzc();
        if (this.zzi.zzf()) {
            return 1;
        }
        Boolean bool = this.zzae;
        if (bool == null || !bool.booleanValue()) {
            if (zzmb.zzb() && this.zzi.zza(zzat.zzco) && !zzac()) {
                return 8;
            }
            Boolean zzu = zzb().zzu();
            if (zzu != null) {
                return zzu.booleanValue() ? 0 : 3;
            }
            Boolean zzf = this.zzi.zzf("firebase_analytics_collection_enabled");
            if (zzf != null) {
                return zzf.booleanValue() ? 0 : 4;
            }
            Boolean bool2 = this.zzad;
            if (bool2 != null) {
                return bool2.booleanValue() ? 0 : 5;
            } else if (GoogleServices.isMeasurementExplicitlyDisabled()) {
                return 6;
            } else {
                return (!this.zzi.zza(zzat.zzas) || this.zzac == null || this.zzac.booleanValue()) ? 0 : 7;
            }
        }
        return 2;
    }

    public final void zzb(boolean z) {
        zzp().zzc();
        this.zzaf = z;
    }

    public final boolean zzac() {
        zzp().zzc();
        return this.zzaf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzad() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzgx zzgxVar) {
        this.zzag++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzg zzgVar) {
        this.zzag++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzae() {
        this.zzah.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzaf() {
        if (!this.zzz) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzp().zzc();
        Boolean bool = this.zzaa;
        if (bool == null || this.zzab == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.zzp.elapsedRealtime() - this.zzab) > 1000)) {
            this.zzab = this.zzp.elapsedRealtime();
            boolean z = true;
            Boolean valueOf = Boolean.valueOf(zzh().zzc("android.permission.INTERNET") && zzh().zzc("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zzc).isCallerInstantApp() || this.zzi.zzw() || (zzft.zza(this.zzc) && zzkx.zza(this.zzc, false))));
            this.zzaa = valueOf;
            if (valueOf.booleanValue()) {
                if (!zzh().zza(zzx().zzab(), zzx().zzac(), zzx().zzad()) && TextUtils.isEmpty(zzx().zzac())) {
                    z = false;
                }
                this.zzaa = Boolean.valueOf(z);
            }
        }
        return this.zzaa.booleanValue();
    }

    public final void zzag() {
        zzp().zzc();
        zzb(zzah());
        String zzaa = zzx().zzaa();
        Pair<String, Boolean> zza = zzb().zza(zzaa);
        if (!this.zzi.zzg().booleanValue() || ((Boolean) zza.second).booleanValue() || TextUtils.isEmpty((CharSequence) zza.first)) {
            zzq().zzv().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        } else if (!zzah().zzf()) {
            zzq().zzh().zza("Network is not available for Deferred Deep Link request. Skipping");
        } else {
            zzkx zzh = zzh();
            zzx();
            URL zza2 = zzh.zza(31049L, zzaa, (String) zza.first, zzb().zzt.zza() - 1);
            zzih zzah = zzah();
            zzig zzigVar = new zzig(this) { // from class: com.google.android.gms.measurement.internal.zzga
                private final zzgb zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.measurement.internal.zzig
                public final void zza(String str, int i, Throwable th, byte[] bArr, Map map) {
                    this.zza.zza(str, i, th, bArr, map);
                }
            };
            zzah.zzc();
            zzah.zzaa();
            Preconditions.checkNotNull(zza2);
            Preconditions.checkNotNull(zzigVar);
            zzah.zzp().zzc(new zzij(zzah, zzaa, zza2, null, null, zzigVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str, int i, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        boolean z = true;
        if (!((i == 200 || i == 204 || i == 304) && th == null)) {
            zzq().zzh().zza("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            return;
        }
        zzb().zzs.zza(true);
        if (bArr.length == 0) {
            zzq().zzv().zza("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            String optString2 = jSONObject.optString("gclid", "");
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(optString)) {
                zzq().zzv().zza("Deferred Deep Link is empty.");
                return;
            }
            zzkx zzh = zzh();
            if (TextUtils.isEmpty(optString) || (queryIntentActivities = zzh.zzm().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                z = false;
            }
            if (!z) {
                zzq().zzh().zza("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.zzr.zza("auto", "_cmp", bundle);
            zzkx zzh2 = zzh();
            if (TextUtils.isEmpty(optString) || !zzh2.zza(optString, optDouble)) {
                return;
            }
            zzh2.zzm().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e) {
            zzq().zze().zza("Failed to parse the Deferred Deep Link response. exception", e);
        }
    }
}
