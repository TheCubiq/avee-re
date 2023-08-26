package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes.dex */
public abstract class zzdc<T> {
    private static final Object zza = new Object();
    @Nullable
    private static volatile zzdk zzb = null;
    private static volatile boolean zzc = false;
    private static final AtomicReference<Collection<zzdc<?>>> zzd = new AtomicReference<>();
    private static zzdp zze = new zzdp(zzde.zza);
    private static final AtomicInteger zzi = new AtomicInteger();
    private final zzdl zzf;
    private final String zzg;
    private final T zzh;
    private volatile int zzj;
    private volatile T zzk;
    private final boolean zzl;

    @Deprecated
    public static void zza(final Context context) {
        synchronized (zza) {
            zzdk zzdkVar = zzb;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (zzdkVar == null || zzdkVar.zza() != context) {
                zzco.zzc();
                zzdn.zza();
                zzcx.zza();
                zzb = new zzcp(context, zzea.zza(new zzeb(context) { // from class: com.google.android.gms.internal.measurement.zzdf
                    private final Context zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = context;
                    }

                    @Override // com.google.android.gms.internal.measurement.zzeb
                    public final Object zza() {
                        return zzdc.zzb(this.zza);
                    }
                }));
                zzi.incrementAndGet();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ boolean zzd() {
        return true;
    }

    abstract T zza(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza() {
        zzi.incrementAndGet();
    }

    private zzdc(zzdl zzdlVar, String str, T t, boolean z) {
        this.zzj = -1;
        if (zzdlVar.zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zzf = zzdlVar;
        this.zzg = str;
        this.zzh = t;
        this.zzl = z;
    }

    private final String zza(String str) {
        if (str == null || !str.isEmpty()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(this.zzg);
            return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return this.zzg;
    }

    public final String zzb() {
        return zza(this.zzf.zzc);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be A[Catch: all -> 0x0112, TryCatch #0 {, blocks: (B:8:0x001c, B:10:0x0020, B:14:0x0029, B:16:0x0040, B:22:0x0051, B:24:0x0057, B:26:0x0065, B:30:0x0082, B:32:0x008c, B:50:0x00df, B:52:0x00ef, B:54:0x0105, B:55:0x0108, B:56:0x010c, B:43:0x00be, B:45:0x00d4, B:49:0x00dd, B:28:0x0078, B:33:0x0091, B:35:0x009a, B:37:0x00ac, B:39:0x00b7, B:38:0x00b1, B:57:0x0110), top: B:64:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef A[Catch: all -> 0x0112, TryCatch #0 {, blocks: (B:8:0x001c, B:10:0x0020, B:14:0x0029, B:16:0x0040, B:22:0x0051, B:24:0x0057, B:26:0x0065, B:30:0x0082, B:32:0x008c, B:50:0x00df, B:52:0x00ef, B:54:0x0105, B:55:0x0108, B:56:0x010c, B:43:0x00be, B:45:0x00d4, B:49:0x00dd, B:28:0x0078, B:33:0x0091, B:35:0x009a, B:37:0x00ac, B:39:0x00b7, B:38:0x00b1, B:57:0x0110), top: B:64:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T zzc() {
        T t;
        zzdx<zzcy> zza2;
        zzcs zza3;
        Object zza4;
        if (!this.zzl) {
            zzdw.zzb(zze.zza(this.zzg), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i = zzi.get();
        if (this.zzj < i) {
            synchronized (this) {
                if (this.zzj < i) {
                    zzdk zzdkVar = zzb;
                    boolean z = true;
                    zzdw.zzb(zzdkVar != null, "Must call PhenotypeFlag.init() first");
                    String str = (String) zzcx.zza(zzdkVar.zza()).zza("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
                    if (str == null || !zzck.zzb.matcher(str).matches()) {
                        z = false;
                    }
                    if (!z) {
                        if (this.zzf.zza != null) {
                            zza3 = zzda.zza(zzdkVar.zza(), this.zzf.zza) ? zzco.zza(zzdkVar.zza().getContentResolver(), this.zzf.zza) : null;
                        } else {
                            zza3 = zzdn.zza(zzdkVar.zza(), (String) null);
                        }
                        if (zza3 != null && (zza4 = zza3.zza(zzb())) != null) {
                            t = zza(zza4);
                            if (t == null) {
                                Object zza5 = zzcx.zza(zzdkVar.zza()).zza(zza(this.zzf.zzb));
                                t = zza5 != null ? zza(zza5) : null;
                                if (t == null) {
                                    t = this.zzh;
                                }
                            }
                            zza2 = zzdkVar.zzb().zza();
                            if (zza2.zza()) {
                                String zza6 = zza2.zzb().zza(this.zzf.zza, null, this.zzf.zzc, this.zzg);
                                t = zza6 == null ? this.zzh : zza((Object) zza6);
                            }
                            this.zzk = t;
                            this.zzj = i;
                        }
                    } else if (Log.isLoggable("PhenotypeFlag", 3)) {
                        String valueOf = String.valueOf(zzb());
                        Log.d("PhenotypeFlag", valueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(valueOf) : new String("Bypass reading Phenotype values for flag: "));
                    }
                    t = null;
                    if (t == null) {
                    }
                    zza2 = zzdkVar.zzb().zza();
                    if (zza2.zza()) {
                    }
                    this.zzk = t;
                    this.zzj = i;
                }
            }
        }
        return this.zzk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdc<Long> zzb(zzdl zzdlVar, String str, long j, boolean z) {
        return new zzdh(zzdlVar, str, Long.valueOf(j), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdc<Boolean> zzb(zzdl zzdlVar, String str, boolean z, boolean z2) {
        return new zzdg(zzdlVar, str, Boolean.valueOf(z), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdc<Double> zzb(zzdl zzdlVar, String str, double d, boolean z) {
        return new zzdj(zzdlVar, str, Double.valueOf(-3.0d), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdc<String> zzb(zzdl zzdlVar, String str, String str2, boolean z) {
        return new zzdi(zzdlVar, str, str2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ zzdx zzb(Context context) {
        new zzdb();
        return zzdb.zza(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdc(zzdl zzdlVar, String str, Object obj, boolean z, zzdh zzdhVar) {
        this(zzdlVar, str, obj, z);
    }
}
