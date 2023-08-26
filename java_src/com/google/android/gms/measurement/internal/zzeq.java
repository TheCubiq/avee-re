package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.measurement.zzmb;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.internal.measurement.zzpa;
import com.google.android.gms.internal.measurement.zzpg;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzeq extends zzg {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private long zzg;
    private List<String> zzh;
    private int zzi;
    private String zzj;
    private String zzk;
    private String zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeq(zzgb zzgbVar, long j) {
        super(zzgbVar);
        this.zzg = j;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzy() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:1|(1:3)(6:103|104|(1:106)(2:121|(1:123))|107|108|(31:110|(1:112)(1:119)|114|115|5|(1:102)(1:9)|10|(1:101)(1:14)|15|(1:(1:18)(1:19))|(3:21|22|(17:25|26|(1:28)|29|30|(1:88)(1:34)|35|(1:37)(1:87)|38|39|(2:84|(1:86))(4:43|(1:45)(1:83)|46|(1:82))|(3:51|(1:53)(1:56)|54)|57|(3:59|(1:61)(3:63|(3:66|(1:68)|64)|69)|62)|(1:71)|72|(1:(2:75|76)(2:78|79))(2:80|81)))|100|26|(0)|29|30|(1:32)|88|35|(0)(0)|38|39|(1:41)|84|(0)|(0)|57|(0)|(0)|72|(0)(0)))|4|5|(1:7)|102|10|(1:12)|101|15|(0)|(0)|100|26|(0)|29|30|(0)|88|35|(0)(0)|38|39|(0)|84|(0)|(0)|57|(0)|(0)|72|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0253, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0254, code lost:
        zzq().zze().zza("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzex.zza(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b9 A[Catch: IllegalStateException -> 0x0253, TryCatch #3 {IllegalStateException -> 0x0253, blocks: (B:62:0x01b3, B:64:0x01b9, B:66:0x01c5, B:68:0x01d4, B:72:0x01dd, B:75:0x01e7, B:77:0x01f3, B:81:0x020a, B:83:0x0212, B:90:0x0236, B:92:0x024a, B:94:0x024f, B:93:0x024d, B:85:0x0218, B:86:0x021f, B:88:0x0225, B:67:0x01d0), top: B:127:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e7 A[Catch: IllegalStateException -> 0x0253, TRY_ENTER, TryCatch #3 {IllegalStateException -> 0x0253, blocks: (B:62:0x01b3, B:64:0x01b9, B:66:0x01c5, B:68:0x01d4, B:72:0x01dd, B:75:0x01e7, B:77:0x01f3, B:81:0x020a, B:83:0x0212, B:90:0x0236, B:92:0x024a, B:94:0x024f, B:93:0x024d, B:85:0x0218, B:86:0x021f, B:88:0x0225, B:67:0x01d0), top: B:127:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0225 A[Catch: IllegalStateException -> 0x0253, TryCatch #3 {IllegalStateException -> 0x0253, blocks: (B:62:0x01b3, B:64:0x01b9, B:66:0x01c5, B:68:0x01d4, B:72:0x01dd, B:75:0x01e7, B:77:0x01f3, B:81:0x020a, B:83:0x0212, B:90:0x0236, B:92:0x024a, B:94:0x024f, B:93:0x024d, B:85:0x0218, B:86:0x021f, B:88:0x0225, B:67:0x01d0), top: B:127:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0236 A[Catch: IllegalStateException -> 0x0253, TryCatch #3 {IllegalStateException -> 0x0253, blocks: (B:62:0x01b3, B:64:0x01b9, B:66:0x01c5, B:68:0x01d4, B:72:0x01dd, B:75:0x01e7, B:77:0x01f3, B:81:0x020a, B:83:0x0212, B:90:0x0236, B:92:0x024a, B:94:0x024f, B:93:0x024d, B:85:0x0218, B:86:0x021f, B:88:0x0225, B:67:0x01d0), top: B:127:0x01b3 }] */
    @Override // com.google.android.gms.measurement.internal.zzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzz() {
        String str;
        String str2;
        PackageInfo packageInfo;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        List<String> zzg;
        String googleAppId;
        String packageName = zzm().getPackageName();
        PackageManager packageManager = zzm().getPackageManager();
        String str3 = "Unknown";
        String str4 = "";
        String str5 = EnvironmentCompat.MEDIA_UNKNOWN;
        int i = Integer.MIN_VALUE;
        if (packageManager == null) {
            zzq().zze().zza("PackageManager is null, app identity information might be inaccurate. appId", zzex.zza(packageName));
        } else {
            try {
                str5 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                zzq().zze().zza("Error retrieving app installer package name. appId", zzex.zza(packageName));
            }
            if (str5 == null) {
                str5 = "manual_install";
            } else if ("com.android.vending".equals(str5)) {
                str5 = "";
            }
            try {
                packageInfo = packageManager.getPackageInfo(zzm().getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str = "Unknown";
            }
            if (packageInfo != null) {
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                str2 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                try {
                    str3 = packageInfo.versionName;
                    i = packageInfo.versionCode;
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = str3;
                    str3 = str2;
                    zzq().zze().zza("Error retrieving package info. appId, appName", zzex.zza(packageName), str3);
                    str2 = str3;
                    str3 = str;
                    this.zza = packageName;
                    this.zzd = str5;
                    this.zzb = str3;
                    this.zzc = i;
                    this.zze = str2;
                    this.zzf = 0L;
                    Status initialize = GoogleServices.initialize(zzm());
                    z = true;
                    if (initialize == null) {
                    }
                    if (TextUtils.isEmpty(this.zzy.zzn())) {
                    }
                    z3 = r6 | z2;
                    if (!z3) {
                    }
                    if (z3) {
                    }
                    z4 = false;
                    this.zzj = "";
                    this.zzk = "";
                    this.zzl = "";
                    if (z2) {
                    }
                    if (!zzpa.zzb()) {
                    }
                    googleAppId = GoogleServices.getGoogleAppId();
                    this.zzj = !TextUtils.isEmpty(googleAppId) ? "" : googleAppId;
                    if (!zznq.zzb()) {
                    }
                    if (!TextUtils.isEmpty(googleAppId)) {
                    }
                    if (z4) {
                    }
                    this.zzh = null;
                    zzg = zzs().zzg("analytics.safelisted_events");
                    if (zzg != null) {
                    }
                    if (z) {
                    }
                    if (Build.VERSION.SDK_INT >= 16) {
                    }
                }
                this.zza = packageName;
                this.zzd = str5;
                this.zzb = str3;
                this.zzc = i;
                this.zze = str2;
                this.zzf = 0L;
                Status initialize2 = GoogleServices.initialize(zzm());
                z = true;
                boolean z5 = initialize2 == null && initialize2.isSuccess();
                z2 = TextUtils.isEmpty(this.zzy.zzn()) && "am".equals(this.zzy.zzo());
                z3 = z5 | z2;
                if (!z3) {
                    if (initialize2 == null) {
                        zzq().zzf().zza("GoogleService failed to initialize (no status)");
                    } else {
                        zzq().zzf().zza("GoogleService failed to initialize, status", Integer.valueOf(initialize2.getStatusCode()), initialize2.getStatusMessage());
                    }
                }
                if (z3) {
                    int zzab = this.zzy.zzab();
                    switch (zzab) {
                        case 0:
                            zzq().zzw().zza("App measurement collection enabled");
                            break;
                        case 1:
                            zzq().zzu().zza("App measurement deactivated via the manifest");
                            break;
                        case 2:
                            zzq().zzw().zza("App measurement deactivated via the init parameters");
                            break;
                        case 3:
                            zzq().zzu().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                            break;
                        case 4:
                            zzq().zzu().zza("App measurement disabled via the manifest");
                            break;
                        case 5:
                            zzq().zzw().zza("App measurement disabled via the init parameters");
                            break;
                        case 6:
                            zzq().zzj().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                            break;
                        case 7:
                            zzq().zzu().zza("App measurement disabled via the global data collection setting");
                            break;
                        case 8:
                            zzq().zzu().zza("App measurement disabled due to denied storage consent");
                            break;
                        default:
                            zzq().zzu().zza("App measurement disabled");
                            zzq().zzf().zza("Invalid scion state in identity");
                            break;
                    }
                    if (zzab == 0) {
                        z4 = true;
                        this.zzj = "";
                        this.zzk = "";
                        this.zzl = "";
                        if (z2) {
                            this.zzk = this.zzy.zzn();
                        }
                        if (!zzpa.zzb() && zzs().zza(zzat.zzcj)) {
                            googleAppId = zzik.zza(zzm(), "google_app_id");
                        } else {
                            googleAppId = GoogleServices.getGoogleAppId();
                        }
                        this.zzj = !TextUtils.isEmpty(googleAppId) ? "" : googleAppId;
                        if (!zznq.zzb() && zzs().zza(zzat.zzbj)) {
                            StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(zzm());
                            String string = stringResourceValueReader.getString("ga_app_id");
                            if (!TextUtils.isEmpty(string)) {
                                str4 = string;
                            }
                            this.zzl = str4;
                            if (!TextUtils.isEmpty(googleAppId) || !TextUtils.isEmpty(string)) {
                                this.zzk = stringResourceValueReader.getString("admob_app_id");
                            }
                        } else if (!TextUtils.isEmpty(googleAppId)) {
                            this.zzk = new StringResourceValueReader(zzm()).getString("admob_app_id");
                        }
                        if (z4) {
                            zzq().zzw().zza("App measurement enabled for app package, google app id", this.zza, TextUtils.isEmpty(this.zzj) ? this.zzk : this.zzj);
                        }
                        this.zzh = null;
                        zzg = zzs().zzg("analytics.safelisted_events");
                        if (zzg != null) {
                            if (zzg.size() == 0) {
                                zzq().zzj().zza("Safelisted event list is empty. Ignoring");
                            } else {
                                for (String str6 : zzg) {
                                    if (!zzo().zzb("safelisted event", str6)) {
                                    }
                                }
                            }
                            z = false;
                        }
                        if (z) {
                            this.zzh = zzg;
                        }
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.zzi = 0;
                            return;
                        } else if (packageManager != null) {
                            this.zzi = InstantApps.isInstantApp(zzm()) ? 1 : 0;
                            return;
                        } else {
                            this.zzi = 0;
                            return;
                        }
                    }
                }
                z4 = false;
                this.zzj = "";
                this.zzk = "";
                this.zzl = "";
                if (z2) {
                }
                if (!zzpa.zzb()) {
                }
                googleAppId = GoogleServices.getGoogleAppId();
                this.zzj = !TextUtils.isEmpty(googleAppId) ? "" : googleAppId;
                if (!zznq.zzb()) {
                }
                if (!TextUtils.isEmpty(googleAppId)) {
                }
                if (z4) {
                }
                this.zzh = null;
                zzg = zzs().zzg("analytics.safelisted_events");
                if (zzg != null) {
                }
                if (z) {
                }
                if (Build.VERSION.SDK_INT >= 16) {
                }
            }
        }
        str2 = "Unknown";
        this.zza = packageName;
        this.zzd = str5;
        this.zzb = str3;
        this.zzc = i;
        this.zze = str2;
        this.zzf = 0L;
        Status initialize22 = GoogleServices.initialize(zzm());
        z = true;
        if (initialize22 == null) {
        }
        if (TextUtils.isEmpty(this.zzy.zzn())) {
        }
        z3 = z5 | z2;
        if (!z3) {
        }
        if (z3) {
        }
        z4 = false;
        this.zzj = "";
        this.zzk = "";
        this.zzl = "";
        if (z2) {
        }
        if (!zzpa.zzb()) {
        }
        googleAppId = GoogleServices.getGoogleAppId();
        this.zzj = !TextUtils.isEmpty(googleAppId) ? "" : googleAppId;
        if (!zznq.zzb()) {
        }
        if (!TextUtils.isEmpty(googleAppId)) {
        }
        if (z4) {
        }
        this.zzh = null;
        zzg = zzs().zzg("analytics.safelisted_events");
        if (zzg != null) {
        }
        if (z) {
        }
        if (Build.VERSION.SDK_INT >= 16) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzn zza(String str) {
        long min;
        zzc();
        String zzaa = zzaa();
        String zzab = zzab();
        zzv();
        String str2 = this.zzb;
        long zzae = zzae();
        zzv();
        String str3 = this.zzd;
        zzv();
        zzc();
        if (this.zzf == 0) {
            this.zzf = this.zzy.zzh().zza(zzm(), zzm().getPackageName());
        }
        long j = this.zzf;
        boolean zzaa2 = this.zzy.zzaa();
        boolean z = !zzr().zzq;
        zzc();
        String zzah = !this.zzy.zzaa() ? null : zzah();
        zzgb zzgbVar = this.zzy;
        Long valueOf = Long.valueOf(zzgbVar.zzb().zzh.zza());
        if (valueOf.longValue() == 0) {
            min = zzgbVar.zza;
        } else {
            min = Math.min(zzgbVar.zza, valueOf.longValue());
        }
        int zzaf = zzaf();
        boolean booleanValue = zzs().zzg().booleanValue();
        Boolean zzf = zzs().zzf("google_analytics_ssaid_collection_enabled");
        boolean booleanValue2 = Boolean.valueOf(zzf == null || zzf.booleanValue()).booleanValue();
        zzfj zzr = zzr();
        zzr.zzc();
        boolean z2 = zzr.zzf().getBoolean("deferred_analytics_collection", false);
        String zzac = zzac();
        Boolean zzf2 = zzs().zzf("google_analytics_default_allow_ad_personalization_signals");
        return new zzn(zzaa, zzab, str2, zzae, str3, 31049L, j, str, zzaa2, z, zzah, 0L, min, zzaf, booleanValue, booleanValue2, z2, zzac, zzf2 == null ? null : Boolean.valueOf(true ^ zzf2.booleanValue()), this.zzg, this.zzh, (zznq.zzb() && zzs().zza(zzat.zzbj)) ? zzad() : null, (zzmb.zzb() && zzs().zza(zzat.zzco)) ? zzr().zzw().zza() : "");
    }

    private final String zzah() {
        if (zzpg.zzb() && zzs().zza(zzat.zzbm)) {
            zzq().zzw().zza("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> loadClass = zzm().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, zzm());
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    zzq().zzj().zza("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                zzq().zzi().zza("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzaa() {
        zzv();
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzab() {
        zzv();
        return this.zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzac() {
        zzv();
        return this.zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzad() {
        zzv();
        return this.zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzae() {
        zzv();
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzaf() {
        zzv();
        return this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<String> zzag() {
        return this.zzh;
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
}
