package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.DataSchemeDataSource;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzca;
import com.google.android.gms.internal.measurement.zzcd;
import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.internal.measurement.zzma;
import com.google.android.gms.internal.measurement.zzmb;
import com.google.android.gms.internal.measurement.zzmh;
import com.google.android.gms.internal.measurement.zzmz;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.internal.measurement.zznr;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public class zzkp implements zzgw {
    private static volatile zzkp zza;
    private zzfv zzb;
    private zzfa zzc;
    private zzac zzd;
    private zzfh zze;
    private zzkl zzf;
    private zzo zzg;
    private final zzkt zzh;
    private zzil zzi;
    private zzjv zzj;
    private final zzgb zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private List<Runnable> zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private FileLock zzu;
    private FileChannel zzv;
    private List<Long> zzw;
    private List<Long> zzx;
    private long zzy;
    private final Map<String, zzad> zzz;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    /* loaded from: classes2.dex */
    public class zza implements zzae {
        zzcd.zzg zza;
        List<Long> zzb;
        List<zzcd.zzc> zzc;
        private long zzd;

        private zza() {
        }

        @Override // com.google.android.gms.measurement.internal.zzae
        public final void zza(zzcd.zzg zzgVar) {
            Preconditions.checkNotNull(zzgVar);
            this.zza = zzgVar;
        }

        @Override // com.google.android.gms.measurement.internal.zzae
        public final boolean zza(long j, zzcd.zzc zzcVar) {
            Preconditions.checkNotNull(zzcVar);
            if (this.zzc == null) {
                this.zzc = new ArrayList();
            }
            if (this.zzb == null) {
                this.zzb = new ArrayList();
            }
            if (this.zzc.size() <= 0 || zza(this.zzc.get(0)) == zza(zzcVar)) {
                long zzbp = this.zzd + zzcVar.zzbp();
                if (zzbp >= Math.max(0, zzat.zzh.zza(null).intValue())) {
                    return false;
                }
                this.zzd = zzbp;
                this.zzc.add(zzcVar);
                this.zzb.add(Long.valueOf(j));
                return this.zzc.size() < Math.max(1, zzat.zzi.zza(null).intValue());
            }
            return false;
        }

        private static long zza(zzcd.zzc zzcVar) {
            return ((zzcVar.zze() / 1000) / 60) / 60;
        }

        /* synthetic */ zza(zzkp zzkpVar, zzko zzkoVar) {
            this();
        }
    }

    public static zzkp zza(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zza == null) {
            synchronized (zzkp.class) {
                if (zza == null) {
                    zza = new zzkp(new zzku(context));
                }
            }
        }
        return zza;
    }

    private zzkp(zzku zzkuVar) {
        this(zzkuVar, null);
    }

    private zzkp(zzku zzkuVar, zzgb zzgbVar) {
        this.zzl = false;
        Preconditions.checkNotNull(zzkuVar);
        this.zzk = zzgb.zza(zzkuVar.zza, null, null);
        this.zzy = -1L;
        zzkt zzktVar = new zzkt(this);
        zzktVar.zzak();
        this.zzh = zzktVar;
        zzfa zzfaVar = new zzfa(this);
        zzfaVar.zzak();
        this.zzc = zzfaVar;
        zzfv zzfvVar = new zzfv(this);
        zzfvVar.zzak();
        this.zzb = zzfvVar;
        this.zzz = new HashMap();
        this.zzk.zzp().zza(new zzko(this, zzkuVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzku zzkuVar) {
        this.zzk.zzp().zzc();
        zzac zzacVar = new zzac(this);
        zzacVar.zzak();
        this.zzd = zzacVar;
        this.zzk.zza().zza(this.zzb);
        zzjv zzjvVar = new zzjv(this);
        zzjvVar.zzak();
        this.zzj = zzjvVar;
        zzo zzoVar = new zzo(this);
        zzoVar.zzak();
        this.zzg = zzoVar;
        zzil zzilVar = new zzil(this);
        zzilVar.zzak();
        this.zzi = zzilVar;
        zzkl zzklVar = new zzkl(this);
        zzklVar.zzak();
        this.zzf = zzklVar;
        this.zze = new zzfh(this);
        if (this.zzp != this.zzq) {
            this.zzk.zzq().zze().zza("Not all upload components initialized", Integer.valueOf(this.zzp), Integer.valueOf(this.zzq));
        }
        this.zzl = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza() {
        this.zzk.zzp().zzc();
        zze().zzu();
        if (this.zzk.zzb().zzc.zza() == 0) {
            this.zzk.zzb().zzc.zza(this.zzk.zzl().currentTimeMillis());
        }
        zzab();
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final zzx zzt() {
        return this.zzk.zzt();
    }

    public final zzy zzb() {
        return this.zzk.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final zzex zzq() {
        return this.zzk.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final zzfu zzp() {
        return this.zzk.zzp();
    }

    public final zzfv zzc() {
        zzb(this.zzb);
        return this.zzb;
    }

    public final zzfa zzd() {
        zzb(this.zzc);
        return this.zzc;
    }

    public final zzac zze() {
        zzb(this.zzd);
        return this.zzd;
    }

    private final zzfh zzv() {
        zzfh zzfhVar = this.zze;
        if (zzfhVar != null) {
            return zzfhVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final zzkl zzw() {
        zzb(this.zzf);
        return this.zzf;
    }

    public final zzo zzf() {
        zzb(this.zzg);
        return this.zzg;
    }

    public final zzil zzg() {
        zzb(this.zzi);
        return this.zzi;
    }

    public final zzkt zzh() {
        zzb(this.zzh);
        return this.zzh;
    }

    public final zzjv zzi() {
        return this.zzj;
    }

    public final zzev zzj() {
        return this.zzk.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final Context zzm() {
        return this.zzk.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final Clock zzl() {
        return this.zzk.zzl();
    }

    public final zzkx zzk() {
        return this.zzk.zzh();
    }

    private final void zzx() {
        this.zzk.zzp().zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzn() {
        if (!this.zzl) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    private static void zzb(zzkm zzkmVar) {
        if (zzkmVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzkmVar.zzai()) {
            return;
        }
        String valueOf = String.valueOf(zzkmVar.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(String str, zzad zzadVar) {
        if (zzmb.zzb() && this.zzk.zza().zza(zzat.zzcp)) {
            zzx();
            zzn();
            this.zzz.put(str, zzadVar);
            zzac zze = zze();
            if (zzmb.zzb() && zze.zzs().zza(zzat.zzcp)) {
                Preconditions.checkNotNull(str);
                Preconditions.checkNotNull(zzadVar);
                zze.zzc();
                zze.zzaj();
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("consent_state", zzadVar.zza());
                try {
                    if (zze.c_().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                        zze.zzq().zze().zza("Failed to insert/update consent setting (got -1). appId", zzex.zza(str));
                    }
                } catch (SQLiteException e) {
                    zze.zzq().zze().zza("Error storing consent setting. appId, error", zzex.zza(str), e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzad zza(String str) {
        zzad zzadVar = zzad.zza;
        if (zzmb.zzb() && this.zzk.zza().zza(zzat.zzcp)) {
            zzx();
            zzn();
            zzadVar = this.zzz.get(str);
            if (zzadVar == null) {
                zzadVar = zze().zzj(str);
                if (zzadVar == null) {
                    zzadVar = zzad.zza;
                }
                zza(str, zzadVar);
            }
        }
        return zzadVar;
    }

    private final long zzy() {
        long currentTimeMillis = this.zzk.zzl().currentTimeMillis();
        zzfj zzb = this.zzk.zzb();
        zzb.zzaa();
        zzb.zzc();
        long zza2 = zzb.zzg.zza();
        if (zza2 == 0) {
            zza2 = 1 + zzb.zzo().zzg().nextInt(86400000);
            zzb.zzg.zza(zza2);
        }
        return ((((currentTimeMillis + zza2) / 1000) / 60) / 60) / 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzar zzarVar, String str) {
        boolean z;
        String str2;
        zzf zzb = zze().zzb(str);
        if (zzb == null || TextUtils.isEmpty(zzb.zzl())) {
            this.zzk.zzq().zzv().zza("No app data available; dropping event", str);
            return;
        }
        Boolean zzb2 = zzb(zzb);
        if (zzb2 == null) {
            if (!"_ui".equals(zzarVar.zza)) {
                this.zzk.zzq().zzh().zza("Could not find package. appId", zzex.zza(str));
            }
        } else if (!zzb2.booleanValue()) {
            this.zzk.zzq().zze().zza("App version does not match; dropping event. appId", zzex.zza(str));
            return;
        }
        String zze = zzb.zze();
        String zzl = zzb.zzl();
        long zzm = zzb.zzm();
        String zzn = zzb.zzn();
        long zzo = zzb.zzo();
        long zzp = zzb.zzp();
        boolean zzr = zzb.zzr();
        String zzi = zzb.zzi();
        long zzae = zzb.zzae();
        boolean zzaf = zzb.zzaf();
        boolean zzag = zzb.zzag();
        String zzf = zzb.zzf();
        Boolean zzah = zzb.zzah();
        long zzq = zzb.zzq();
        List<String> zzai = zzb.zzai();
        if (zznq.zzb()) {
            z = zzr;
            if (this.zzk.zza().zze(zzb.zzc(), zzat.zzbj)) {
                str2 = zzb.zzg();
                zzb(zzarVar, new zzn(str, zze, zzl, zzm, zzn, zzo, zzp, (String) null, z, false, zzi, zzae, 0L, 0, zzaf, zzag, false, zzf, zzah, zzq, zzai, str2, (zzmb.zzb() || !this.zzk.zza().zza(zzat.zzcp)) ? "" : zza(str).zza()));
            }
        } else {
            z = zzr;
        }
        str2 = null;
        zzb(zzarVar, new zzn(str, zze, zzl, zzm, zzn, zzo, zzp, (String) null, z, false, zzi, zzae, 0L, 0, zzaf, zzag, false, zzf, zzah, zzq, zzai, str2, (zzmb.zzb() || !this.zzk.zza().zza(zzat.zzcp)) ? "" : zza(str).zza()));
    }

    private final void zzb(zzar zzarVar, zzn zznVar) {
        if (zznr.zzb() && this.zzk.zza().zza(zzat.zzch)) {
            zzfb zza2 = zzfb.zza(zzarVar);
            this.zzk.zzh().zza(zza2.zzb, zze().zzi(zznVar.zza));
            this.zzk.zzh().zza(zza2, this.zzk.zza().zza(zznVar.zza));
            zzarVar = zza2.zza();
        }
        if (this.zzk.zza().zza(zzat.zzbe) && "_cmp".equals(zzarVar.zza) && "referrer API v2".equals(zzarVar.zzb.zzd("_cis"))) {
            String zzd = zzarVar.zzb.zzd("gclid");
            if (!TextUtils.isEmpty(zzd)) {
                zza(new zzkw("_lgclid", zzarVar.zzd, zzd, "auto"), zznVar);
            }
        }
        zza(zzarVar, zznVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzar zzarVar, zzn zznVar) {
        List<zzw> zza2;
        List<zzw> zza3;
        List<zzw> zza4;
        zzar zzarVar2 = zzarVar;
        Preconditions.checkNotNull(zznVar);
        Preconditions.checkNotEmpty(zznVar.zza);
        zzx();
        zzn();
        String str = zznVar.zza;
        long j = zzarVar2.zzd;
        zzh();
        if (zzkt.zza(zzarVar, zznVar)) {
            if (!zznVar.zzh) {
                zzc(zznVar);
                return;
            }
            if (zznVar.zzu != null) {
                if (zznVar.zzu.contains(zzarVar2.zza)) {
                    Bundle zzb = zzarVar2.zzb.zzb();
                    zzb.putLong("ga_safelisted", 1L);
                    zzarVar2 = new zzar(zzarVar2.zza, new zzam(zzb), zzarVar2.zzc, zzarVar2.zzd);
                } else {
                    this.zzk.zzq().zzv().zza("Dropping non-safelisted event. appId, event name, origin", str, zzarVar2.zza, zzarVar2.zzc);
                    return;
                }
            }
            zze().zze();
            try {
                zzac zze = zze();
                Preconditions.checkNotEmpty(str);
                zze.zzc();
                zze.zzaj();
                if (j < 0) {
                    zze.zzq().zzh().zza("Invalid time querying timed out conditional properties", zzex.zza(str), Long.valueOf(j));
                    zza2 = Collections.emptyList();
                } else {
                    zza2 = zze.zza("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (zzw zzwVar : zza2) {
                    if (zzwVar != null) {
                        this.zzk.zzq().zzw().zza("User property timed out", zzwVar.zza, this.zzk.zzi().zzc(zzwVar.zzc.zza), zzwVar.zzc.zza());
                        if (zzwVar.zzg != null) {
                            zzc(new zzar(zzwVar.zzg, j), zznVar);
                        }
                        zze().zze(str, zzwVar.zzc.zza);
                    }
                }
                zzac zze2 = zze();
                Preconditions.checkNotEmpty(str);
                zze2.zzc();
                zze2.zzaj();
                if (j < 0) {
                    zze2.zzq().zzh().zza("Invalid time querying expired conditional properties", zzex.zza(str), Long.valueOf(j));
                    zza3 = Collections.emptyList();
                } else {
                    zza3 = zze2.zza("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(zza3.size());
                for (zzw zzwVar2 : zza3) {
                    if (zzwVar2 != null) {
                        this.zzk.zzq().zzw().zza("User property expired", zzwVar2.zza, this.zzk.zzi().zzc(zzwVar2.zzc.zza), zzwVar2.zzc.zza());
                        zze().zzb(str, zzwVar2.zzc.zza);
                        if (zzwVar2.zzk != null) {
                            arrayList.add(zzwVar2.zzk);
                        }
                        zze().zze(str, zzwVar2.zzc.zza);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    zzc(new zzar((zzar) obj, j), zznVar);
                }
                zzac zze3 = zze();
                String str2 = zzarVar2.zza;
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotEmpty(str2);
                zze3.zzc();
                zze3.zzaj();
                if (j < 0) {
                    zze3.zzq().zzh().zza("Invalid time querying triggered conditional properties", zzex.zza(str), zze3.zzn().zza(str2), Long.valueOf(j));
                    zza4 = Collections.emptyList();
                } else {
                    zza4 = zze3.zza("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList arrayList3 = new ArrayList(zza4.size());
                for (zzw zzwVar3 : zza4) {
                    if (zzwVar3 != null) {
                        zzkw zzkwVar = zzwVar3.zzc;
                        zzky zzkyVar = new zzky(zzwVar3.zza, zzwVar3.zzb, zzkwVar.zza, j, zzkwVar.zza());
                        if (zze().zza(zzkyVar)) {
                            this.zzk.zzq().zzw().zza("User property triggered", zzwVar3.zza, this.zzk.zzi().zzc(zzkyVar.zzc), zzkyVar.zze);
                        } else {
                            this.zzk.zzq().zze().zza("Too many active user properties, ignoring", zzex.zza(zzwVar3.zza), this.zzk.zzi().zzc(zzkyVar.zzc), zzkyVar.zze);
                        }
                        if (zzwVar3.zzi != null) {
                            arrayList3.add(zzwVar3.zzi);
                        }
                        zzwVar3.zzc = new zzkw(zzkyVar);
                        zzwVar3.zze = true;
                        zze().zza(zzwVar3);
                    }
                }
                zzc(zzarVar2, zznVar);
                ArrayList arrayList4 = arrayList3;
                int size2 = arrayList4.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList4.get(i2);
                    i2++;
                    zzc(new zzar((zzar) obj2, j), zznVar);
                }
                zze().b_();
            } finally {
                zze().zzg();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:84|(1:86)(1:322)|87|(6:92|93|94|(1:96)|97|(0))|314|315|316|317|93|94|(0)|97|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02ac, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02ae, code lost:
        r7.zzq().zze().zza("Error pruning currencies. appId", com.google.android.gms.measurement.internal.zzex.zza(r15), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0974, code lost:
        r11 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02e4 A[Catch: all -> 0x0a05, TryCatch #1 {all -> 0x0a05, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:73:0x01c4, B:75:0x01ce, B:77:0x01dc, B:82:0x020d, B:84:0x0213, B:86:0x0221, B:88:0x022d, B:90:0x0237, B:92:0x0242, B:95:0x0249, B:104:0x02da, B:106:0x02e4, B:110:0x031b, B:114:0x032d, B:116:0x0341, B:118:0x0351, B:120:0x0362, B:122:0x0394, B:124:0x0399, B:125:0x03b2, B:129:0x03c3, B:131:0x03d7, B:133:0x03dc, B:134:0x03f5, B:138:0x0418, B:142:0x043d, B:143:0x0456, B:146:0x0465, B:149:0x0488, B:150:0x04a4, B:152:0x04ae, B:154:0x04ba, B:156:0x04c0, B:157:0x04cb, B:159:0x04d7, B:160:0x04ee, B:162:0x0515, B:165:0x052e, B:168:0x0572, B:170:0x059a, B:172:0x05d4, B:173:0x05d9, B:175:0x05e1, B:176:0x05e6, B:178:0x05ee, B:179:0x05f3, B:181:0x05fc, B:182:0x0602, B:184:0x060f, B:185:0x0614, B:187:0x061a, B:189:0x0628, B:191:0x0640, B:192:0x0647, B:194:0x064d, B:196:0x065d, B:198:0x0667, B:200:0x066f, B:201:0x0674, B:203:0x067e, B:205:0x0688, B:207:0x0690, B:213:0x06ad, B:215:0x06b5, B:216:0x06ba, B:218:0x06c9, B:219:0x06cc, B:221:0x06e2, B:223:0x06f0, B:249:0x079e, B:251:0x07e6, B:252:0x07eb, B:254:0x07f3, B:256:0x07f9, B:258:0x0807, B:260:0x080e, B:262:0x0814, B:259:0x080b, B:263:0x0819, B:265:0x0825, B:267:0x0834, B:269:0x0842, B:271:0x0851, B:273:0x0861, B:275:0x086f, B:278:0x0880, B:280:0x08b5, B:281:0x08ba, B:277:0x0875, B:270:0x084a, B:282:0x08c6, B:284:0x08cc, B:286:0x08da, B:291:0x08f1, B:293:0x08fb, B:294:0x0902, B:295:0x090d, B:297:0x0913, B:299:0x0944, B:300:0x0954, B:302:0x095c, B:303:0x0962, B:305:0x0968, B:314:0x09b0, B:316:0x09b6, B:319:0x09d2, B:308:0x0976, B:310:0x099b, B:318:0x09ba, B:288:0x08e0, B:290:0x08ea, B:225:0x06f6, B:227:0x0700, B:229:0x070a, B:231:0x070e, B:233:0x0719, B:234:0x0726, B:236:0x0738, B:238:0x073c, B:240:0x0742, B:242:0x0752, B:244:0x0764, B:248:0x079b, B:245:0x077e, B:247:0x0784, B:208:0x0696, B:210:0x06a0, B:212:0x06a8, B:169:0x058c, B:97:0x0273, B:98:0x0291, B:103:0x02bf, B:102:0x02ae, B:89:0x0232, B:80:0x01e6, B:81:0x0203), top: B:328:0x0135, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x031b A[Catch: all -> 0x0a05, TRY_LEAVE, TryCatch #1 {all -> 0x0a05, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:73:0x01c4, B:75:0x01ce, B:77:0x01dc, B:82:0x020d, B:84:0x0213, B:86:0x0221, B:88:0x022d, B:90:0x0237, B:92:0x0242, B:95:0x0249, B:104:0x02da, B:106:0x02e4, B:110:0x031b, B:114:0x032d, B:116:0x0341, B:118:0x0351, B:120:0x0362, B:122:0x0394, B:124:0x0399, B:125:0x03b2, B:129:0x03c3, B:131:0x03d7, B:133:0x03dc, B:134:0x03f5, B:138:0x0418, B:142:0x043d, B:143:0x0456, B:146:0x0465, B:149:0x0488, B:150:0x04a4, B:152:0x04ae, B:154:0x04ba, B:156:0x04c0, B:157:0x04cb, B:159:0x04d7, B:160:0x04ee, B:162:0x0515, B:165:0x052e, B:168:0x0572, B:170:0x059a, B:172:0x05d4, B:173:0x05d9, B:175:0x05e1, B:176:0x05e6, B:178:0x05ee, B:179:0x05f3, B:181:0x05fc, B:182:0x0602, B:184:0x060f, B:185:0x0614, B:187:0x061a, B:189:0x0628, B:191:0x0640, B:192:0x0647, B:194:0x064d, B:196:0x065d, B:198:0x0667, B:200:0x066f, B:201:0x0674, B:203:0x067e, B:205:0x0688, B:207:0x0690, B:213:0x06ad, B:215:0x06b5, B:216:0x06ba, B:218:0x06c9, B:219:0x06cc, B:221:0x06e2, B:223:0x06f0, B:249:0x079e, B:251:0x07e6, B:252:0x07eb, B:254:0x07f3, B:256:0x07f9, B:258:0x0807, B:260:0x080e, B:262:0x0814, B:259:0x080b, B:263:0x0819, B:265:0x0825, B:267:0x0834, B:269:0x0842, B:271:0x0851, B:273:0x0861, B:275:0x086f, B:278:0x0880, B:280:0x08b5, B:281:0x08ba, B:277:0x0875, B:270:0x084a, B:282:0x08c6, B:284:0x08cc, B:286:0x08da, B:291:0x08f1, B:293:0x08fb, B:294:0x0902, B:295:0x090d, B:297:0x0913, B:299:0x0944, B:300:0x0954, B:302:0x095c, B:303:0x0962, B:305:0x0968, B:314:0x09b0, B:316:0x09b6, B:319:0x09d2, B:308:0x0976, B:310:0x099b, B:318:0x09ba, B:288:0x08e0, B:290:0x08ea, B:225:0x06f6, B:227:0x0700, B:229:0x070a, B:231:0x070e, B:233:0x0719, B:234:0x0726, B:236:0x0738, B:238:0x073c, B:240:0x0742, B:242:0x0752, B:244:0x0764, B:248:0x079b, B:245:0x077e, B:247:0x0784, B:208:0x0696, B:210:0x06a0, B:212:0x06a8, B:169:0x058c, B:97:0x0273, B:98:0x0291, B:103:0x02bf, B:102:0x02ae, B:89:0x0232, B:80:0x01e6, B:81:0x0203), top: B:328:0x0135, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0341 A[Catch: all -> 0x0a05, TryCatch #1 {all -> 0x0a05, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:73:0x01c4, B:75:0x01ce, B:77:0x01dc, B:82:0x020d, B:84:0x0213, B:86:0x0221, B:88:0x022d, B:90:0x0237, B:92:0x0242, B:95:0x0249, B:104:0x02da, B:106:0x02e4, B:110:0x031b, B:114:0x032d, B:116:0x0341, B:118:0x0351, B:120:0x0362, B:122:0x0394, B:124:0x0399, B:125:0x03b2, B:129:0x03c3, B:131:0x03d7, B:133:0x03dc, B:134:0x03f5, B:138:0x0418, B:142:0x043d, B:143:0x0456, B:146:0x0465, B:149:0x0488, B:150:0x04a4, B:152:0x04ae, B:154:0x04ba, B:156:0x04c0, B:157:0x04cb, B:159:0x04d7, B:160:0x04ee, B:162:0x0515, B:165:0x052e, B:168:0x0572, B:170:0x059a, B:172:0x05d4, B:173:0x05d9, B:175:0x05e1, B:176:0x05e6, B:178:0x05ee, B:179:0x05f3, B:181:0x05fc, B:182:0x0602, B:184:0x060f, B:185:0x0614, B:187:0x061a, B:189:0x0628, B:191:0x0640, B:192:0x0647, B:194:0x064d, B:196:0x065d, B:198:0x0667, B:200:0x066f, B:201:0x0674, B:203:0x067e, B:205:0x0688, B:207:0x0690, B:213:0x06ad, B:215:0x06b5, B:216:0x06ba, B:218:0x06c9, B:219:0x06cc, B:221:0x06e2, B:223:0x06f0, B:249:0x079e, B:251:0x07e6, B:252:0x07eb, B:254:0x07f3, B:256:0x07f9, B:258:0x0807, B:260:0x080e, B:262:0x0814, B:259:0x080b, B:263:0x0819, B:265:0x0825, B:267:0x0834, B:269:0x0842, B:271:0x0851, B:273:0x0861, B:275:0x086f, B:278:0x0880, B:280:0x08b5, B:281:0x08ba, B:277:0x0875, B:270:0x084a, B:282:0x08c6, B:284:0x08cc, B:286:0x08da, B:291:0x08f1, B:293:0x08fb, B:294:0x0902, B:295:0x090d, B:297:0x0913, B:299:0x0944, B:300:0x0954, B:302:0x095c, B:303:0x0962, B:305:0x0968, B:314:0x09b0, B:316:0x09b6, B:319:0x09d2, B:308:0x0976, B:310:0x099b, B:318:0x09ba, B:288:0x08e0, B:290:0x08ea, B:225:0x06f6, B:227:0x0700, B:229:0x070a, B:231:0x070e, B:233:0x0719, B:234:0x0726, B:236:0x0738, B:238:0x073c, B:240:0x0742, B:242:0x0752, B:244:0x0764, B:248:0x079b, B:245:0x077e, B:247:0x0784, B:208:0x0696, B:210:0x06a0, B:212:0x06a8, B:169:0x058c, B:97:0x0273, B:98:0x0291, B:103:0x02bf, B:102:0x02ae, B:89:0x0232, B:80:0x01e6, B:81:0x0203), top: B:328:0x0135, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0394 A[Catch: all -> 0x0a05, TryCatch #1 {all -> 0x0a05, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:73:0x01c4, B:75:0x01ce, B:77:0x01dc, B:82:0x020d, B:84:0x0213, B:86:0x0221, B:88:0x022d, B:90:0x0237, B:92:0x0242, B:95:0x0249, B:104:0x02da, B:106:0x02e4, B:110:0x031b, B:114:0x032d, B:116:0x0341, B:118:0x0351, B:120:0x0362, B:122:0x0394, B:124:0x0399, B:125:0x03b2, B:129:0x03c3, B:131:0x03d7, B:133:0x03dc, B:134:0x03f5, B:138:0x0418, B:142:0x043d, B:143:0x0456, B:146:0x0465, B:149:0x0488, B:150:0x04a4, B:152:0x04ae, B:154:0x04ba, B:156:0x04c0, B:157:0x04cb, B:159:0x04d7, B:160:0x04ee, B:162:0x0515, B:165:0x052e, B:168:0x0572, B:170:0x059a, B:172:0x05d4, B:173:0x05d9, B:175:0x05e1, B:176:0x05e6, B:178:0x05ee, B:179:0x05f3, B:181:0x05fc, B:182:0x0602, B:184:0x060f, B:185:0x0614, B:187:0x061a, B:189:0x0628, B:191:0x0640, B:192:0x0647, B:194:0x064d, B:196:0x065d, B:198:0x0667, B:200:0x066f, B:201:0x0674, B:203:0x067e, B:205:0x0688, B:207:0x0690, B:213:0x06ad, B:215:0x06b5, B:216:0x06ba, B:218:0x06c9, B:219:0x06cc, B:221:0x06e2, B:223:0x06f0, B:249:0x079e, B:251:0x07e6, B:252:0x07eb, B:254:0x07f3, B:256:0x07f9, B:258:0x0807, B:260:0x080e, B:262:0x0814, B:259:0x080b, B:263:0x0819, B:265:0x0825, B:267:0x0834, B:269:0x0842, B:271:0x0851, B:273:0x0861, B:275:0x086f, B:278:0x0880, B:280:0x08b5, B:281:0x08ba, B:277:0x0875, B:270:0x084a, B:282:0x08c6, B:284:0x08cc, B:286:0x08da, B:291:0x08f1, B:293:0x08fb, B:294:0x0902, B:295:0x090d, B:297:0x0913, B:299:0x0944, B:300:0x0954, B:302:0x095c, B:303:0x0962, B:305:0x0968, B:314:0x09b0, B:316:0x09b6, B:319:0x09d2, B:308:0x0976, B:310:0x099b, B:318:0x09ba, B:288:0x08e0, B:290:0x08ea, B:225:0x06f6, B:227:0x0700, B:229:0x070a, B:231:0x070e, B:233:0x0719, B:234:0x0726, B:236:0x0738, B:238:0x073c, B:240:0x0742, B:242:0x0752, B:244:0x0764, B:248:0x079b, B:245:0x077e, B:247:0x0784, B:208:0x0696, B:210:0x06a0, B:212:0x06a8, B:169:0x058c, B:97:0x0273, B:98:0x0291, B:103:0x02bf, B:102:0x02ae, B:89:0x0232, B:80:0x01e6, B:81:0x0203), top: B:328:0x0135, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0185 A[Catch: all -> 0x0a05, TRY_LEAVE, TryCatch #1 {all -> 0x0a05, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:73:0x01c4, B:75:0x01ce, B:77:0x01dc, B:82:0x020d, B:84:0x0213, B:86:0x0221, B:88:0x022d, B:90:0x0237, B:92:0x0242, B:95:0x0249, B:104:0x02da, B:106:0x02e4, B:110:0x031b, B:114:0x032d, B:116:0x0341, B:118:0x0351, B:120:0x0362, B:122:0x0394, B:124:0x0399, B:125:0x03b2, B:129:0x03c3, B:131:0x03d7, B:133:0x03dc, B:134:0x03f5, B:138:0x0418, B:142:0x043d, B:143:0x0456, B:146:0x0465, B:149:0x0488, B:150:0x04a4, B:152:0x04ae, B:154:0x04ba, B:156:0x04c0, B:157:0x04cb, B:159:0x04d7, B:160:0x04ee, B:162:0x0515, B:165:0x052e, B:168:0x0572, B:170:0x059a, B:172:0x05d4, B:173:0x05d9, B:175:0x05e1, B:176:0x05e6, B:178:0x05ee, B:179:0x05f3, B:181:0x05fc, B:182:0x0602, B:184:0x060f, B:185:0x0614, B:187:0x061a, B:189:0x0628, B:191:0x0640, B:192:0x0647, B:194:0x064d, B:196:0x065d, B:198:0x0667, B:200:0x066f, B:201:0x0674, B:203:0x067e, B:205:0x0688, B:207:0x0690, B:213:0x06ad, B:215:0x06b5, B:216:0x06ba, B:218:0x06c9, B:219:0x06cc, B:221:0x06e2, B:223:0x06f0, B:249:0x079e, B:251:0x07e6, B:252:0x07eb, B:254:0x07f3, B:256:0x07f9, B:258:0x0807, B:260:0x080e, B:262:0x0814, B:259:0x080b, B:263:0x0819, B:265:0x0825, B:267:0x0834, B:269:0x0842, B:271:0x0851, B:273:0x0861, B:275:0x086f, B:278:0x0880, B:280:0x08b5, B:281:0x08ba, B:277:0x0875, B:270:0x084a, B:282:0x08c6, B:284:0x08cc, B:286:0x08da, B:291:0x08f1, B:293:0x08fb, B:294:0x0902, B:295:0x090d, B:297:0x0913, B:299:0x0944, B:300:0x0954, B:302:0x095c, B:303:0x0962, B:305:0x0968, B:314:0x09b0, B:316:0x09b6, B:319:0x09d2, B:308:0x0976, B:310:0x099b, B:318:0x09ba, B:288:0x08e0, B:290:0x08ea, B:225:0x06f6, B:227:0x0700, B:229:0x070a, B:231:0x070e, B:233:0x0719, B:234:0x0726, B:236:0x0738, B:238:0x073c, B:240:0x0742, B:242:0x0752, B:244:0x0764, B:248:0x079b, B:245:0x077e, B:247:0x0784, B:208:0x0696, B:210:0x06a0, B:212:0x06a8, B:169:0x058c, B:97:0x0273, B:98:0x0291, B:103:0x02bf, B:102:0x02ae, B:89:0x0232, B:80:0x01e6, B:81:0x0203), top: B:328:0x0135, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzc(zzar zzarVar, zzn zznVar) {
        boolean z;
        boolean z2;
        long j;
        int i;
        long j2;
        long intValue;
        zzan zza2;
        zzky zzc;
        long longValue;
        boolean z3;
        zzky zzkyVar;
        zzky zzkyVar2;
        zzf zzb;
        zzar zzarVar2 = zzarVar;
        Preconditions.checkNotNull(zznVar);
        Preconditions.checkNotEmpty(zznVar.zza);
        long nanoTime = System.nanoTime();
        zzx();
        zzn();
        String str = zznVar.zza;
        zzh();
        if (!zzkt.zza(zzarVar, zznVar)) {
            return;
        }
        if (!zznVar.zzh) {
            zzc(zznVar);
        } else if (zzc().zzb(str, zzarVar2.zza)) {
            this.zzk.zzq().zzh().zza("Dropping blacklisted event. appId", zzex.zza(str), this.zzk.zzi().zza(zzarVar2.zza));
            boolean z4 = zzc().zzg(str) || zzc().zzh(str);
            if (!z4 && !"_err".equals(zzarVar2.zza)) {
                this.zzk.zzh().zza(str, 11, "_ev", zzarVar2.zza, 0);
            }
            if (!z4 || (zzb = zze().zzb(str)) == null || Math.abs(this.zzk.zzl().currentTimeMillis() - Math.max(zzb.zzu(), zzb.zzt())) <= zzat.zzy.zza(null).longValue()) {
                return;
            }
            this.zzk.zzq().zzv().zza("Fetching config for blacklisted app");
            zza(zzb);
        } else {
            if (zzma.zzb() && this.zzk.zza().zza(zzat.zzcd)) {
                zzfb zza3 = zzfb.zza(zzarVar);
                this.zzk.zzh().zza(zza3, this.zzk.zza().zza(str));
                zzarVar2 = zza3.zza();
            }
            if (this.zzk.zzq().zza(2)) {
                this.zzk.zzq().zzw().zza("Logging event", this.zzk.zzi().zza(zzarVar2));
            }
            zze().zze();
            try {
                zzc(zznVar);
                boolean z5 = zzmh.zzb() && this.zzk.zza().zza(zzat.zzcc);
                if (!FirebaseAnalytics.Event.ECOMMERCE_PURCHASE.equals(zzarVar2.zza) && (!z5 || (!FirebaseAnalytics.Event.PURCHASE.equals(zzarVar2.zza) && !FirebaseAnalytics.Event.REFUND.equals(zzarVar2.zza)))) {
                    z = false;
                    if (!"_iap".equals(zzarVar2.zza) && !z) {
                        z2 = false;
                        if (z2) {
                            j = nanoTime;
                            i = 0;
                        } else {
                            String zzd = zzarVar2.zzb.zzd(FirebaseAnalytics.Param.CURRENCY);
                            if (z) {
                                double doubleValue = zzarVar2.zzb.zzc("value").doubleValue() * 1000000.0d;
                                if (doubleValue == 0.0d) {
                                    double longValue2 = zzarVar2.zzb.zzb("value").longValue();
                                    Double.isNaN(longValue2);
                                    doubleValue = longValue2 * 1000000.0d;
                                }
                                if (doubleValue <= 9.223372036854776E18d && doubleValue >= -9.223372036854776E18d) {
                                    longValue = Math.round(doubleValue);
                                    if (zzmh.zzb() && this.zzk.zza().zza(zzat.zzcc) && FirebaseAnalytics.Event.REFUND.equals(zzarVar2.zza)) {
                                        longValue = -longValue;
                                    }
                                } else {
                                    this.zzk.zzq().zzh().zza("Data lost. Currency value is too big. appId", zzex.zza(str), Double.valueOf(doubleValue));
                                    j = nanoTime;
                                    i = 0;
                                    z3 = false;
                                    if (!z3) {
                                        zze().b_();
                                        return;
                                    }
                                }
                            } else {
                                longValue = zzarVar2.zzb.zzb("value").longValue();
                            }
                            if (!TextUtils.isEmpty(zzd)) {
                                String upperCase = zzd.toUpperCase(Locale.US);
                                if (upperCase.matches("[A-Z]{3}")) {
                                    String valueOf = String.valueOf(upperCase);
                                    String concat = valueOf.length() != 0 ? "_ltv_".concat(valueOf) : new String("_ltv_");
                                    zzky zzc2 = zze().zzc(str, concat);
                                    if (zzc2 != null && (zzc2.zze instanceof Long)) {
                                        j = nanoTime;
                                        i = 0;
                                        zzkyVar = new zzky(str, zzarVar2.zzc, concat, this.zzk.zzl().currentTimeMillis(), Long.valueOf(((Long) zzc2.zze).longValue() + longValue));
                                        zzkyVar2 = zzkyVar;
                                        if (!zze().zza(zzkyVar2)) {
                                            this.zzk.zzq().zze().zza("Too many unique user properties are set. Ignoring user property. appId", zzex.zza(str), this.zzk.zzi().zzc(zzkyVar2.zzc), zzkyVar2.zze);
                                            this.zzk.zzh().zza(str, 9, (String) null, (String) null, 0);
                                        }
                                        z3 = true;
                                        if (!z3) {
                                        }
                                    }
                                    j = nanoTime;
                                    i = 0;
                                    zzac zze = zze();
                                    int zzb2 = this.zzk.zza().zzb(str, zzat.zzad) - 1;
                                    Preconditions.checkNotEmpty(str);
                                    zze.zzc();
                                    zze.zzaj();
                                    zze.c_().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str, str, String.valueOf(zzb2)});
                                    zzkyVar = new zzky(str, zzarVar2.zzc, concat, this.zzk.zzl().currentTimeMillis(), Long.valueOf(longValue));
                                    zzkyVar2 = zzkyVar;
                                    if (!zze().zza(zzkyVar2)) {
                                    }
                                    z3 = true;
                                    if (!z3) {
                                    }
                                }
                            }
                            j = nanoTime;
                            i = 0;
                            z3 = true;
                            if (!z3) {
                            }
                        }
                        boolean zza4 = zzkx.zza(zzarVar2.zza);
                        boolean equals = "_err".equals(zzarVar2.zza);
                        if (zzmh.zzb() || !this.zzk.zza().zze(zznVar.zza, zzat.zzby)) {
                            j2 = 1;
                        } else {
                            this.zzk.zzh();
                            j2 = zzkx.zza(zzarVar2.zzb) + 1;
                        }
                        zzaf zza5 = zze().zza(zzy(), str, j2, true, zza4, false, equals, false);
                        intValue = zza5.zzb - zzat.zzj.zza(null).intValue();
                        if (intValue <= 0) {
                            if (intValue % 1000 == 1) {
                                this.zzk.zzq().zze().zza("Data loss. Too many events logged. appId, count", zzex.zza(str), Long.valueOf(zza5.zzb));
                            }
                            zze().b_();
                            return;
                        }
                        if (zza4) {
                            long intValue2 = zza5.zza - zzat.zzl.zza(null).intValue();
                            if (intValue2 > 0) {
                                if (intValue2 % 1000 == 1) {
                                    this.zzk.zzq().zze().zza("Data loss. Too many public events logged. appId, count", zzex.zza(str), Long.valueOf(zza5.zza));
                                }
                                this.zzk.zzh().zza(str, 16, "_ev", zzarVar2.zza, 0);
                                zze().b_();
                                return;
                            }
                        }
                        if (equals) {
                            long max = zza5.zzd - Math.max(i, Math.min(1000000, this.zzk.zza().zzb(zznVar.zza, zzat.zzk)));
                            if (max > 0) {
                                if (max == 1) {
                                    this.zzk.zzq().zze().zza("Too many error events logged. appId, count", zzex.zza(str), Long.valueOf(zza5.zzd));
                                }
                                zze().b_();
                                return;
                            }
                        }
                        Bundle zzb3 = zzarVar2.zzb.zzb();
                        this.zzk.zzh().zza(zzb3, "_o", zzarVar2.zzc);
                        if (this.zzk.zzh().zze(str)) {
                            this.zzk.zzh().zza(zzb3, "_dbg", (Object) 1L);
                            this.zzk.zzh().zza(zzb3, "_r", (Object) 1L);
                        }
                        if ("_s".equals(zzarVar2.zza) && (zzc = zze().zzc(zznVar.zza, "_sno")) != null && (zzc.zze instanceof Long)) {
                            this.zzk.zzh().zza(zzb3, "_sno", zzc.zze);
                        }
                        long zzc3 = zze().zzc(str);
                        if (zzc3 > 0) {
                            this.zzk.zzq().zzh().zza("Data lost. Too many events stored on disk, deleted. appId", zzex.zza(str), Long.valueOf(zzc3));
                        }
                        zzak zzakVar = new zzak(this.zzk, zzarVar2.zzc, str, zzarVar2.zza, zzarVar2.zzd, 0L, zzb3);
                        zzan zza6 = zze().zza(str, zzakVar.zzb);
                        if (zza6 == null) {
                            if (zze().zzh(str) >= this.zzk.zza().zzb(str) && zza4) {
                                this.zzk.zzq().zze().zza("Too many event names used, ignoring event. appId, name, supported count", zzex.zza(str), this.zzk.zzi().zza(zzakVar.zzb), Integer.valueOf(this.zzk.zza().zzb(str)));
                                this.zzk.zzh().zza(str, 8, (String) null, (String) null, 0);
                                return;
                            }
                            zza2 = new zzan(str, zzakVar.zzb, 0L, 0L, zzakVar.zzc, 0L, null, null, null, null);
                        } else {
                            zzakVar = zzakVar.zza(this.zzk, zza6.zzf);
                            zza2 = zza6.zza(zzakVar.zzc);
                        }
                        zze().zza(zza2);
                        zzx();
                        zzn();
                        Preconditions.checkNotNull(zzakVar);
                        Preconditions.checkNotNull(zznVar);
                        Preconditions.checkNotEmpty(zzakVar.zza);
                        Preconditions.checkArgument(zzakVar.zza.equals(zznVar.zza));
                        zzcd.zzg.zza zza7 = zzcd.zzg.zzbh().zza(1).zza(AbstractSpiCall.ANDROID_CLIENT_TYPE);
                        if (!TextUtils.isEmpty(zznVar.zza)) {
                            zza7.zzf(zznVar.zza);
                        }
                        if (!TextUtils.isEmpty(zznVar.zzd)) {
                            zza7.zze(zznVar.zzd);
                        }
                        if (!TextUtils.isEmpty(zznVar.zzc)) {
                            zza7.zzg(zznVar.zzc);
                        }
                        if (zznVar.zzj != -2147483648L) {
                            zza7.zzh((int) zznVar.zzj);
                        }
                        zza7.zzf(zznVar.zze);
                        if (!TextUtils.isEmpty(zznVar.zzb)) {
                            zza7.zzk(zznVar.zzb);
                        }
                        if (zzmb.zzb() && this.zzk.zza().zza(zzat.zzcp)) {
                            zzad zzb4 = zza(zznVar.zza).zzb(zzad.zza(zznVar.zzw));
                            if (!TextUtils.isEmpty(zznVar.zzw)) {
                                zza7.zzq(zzb4.zza());
                            }
                        }
                        if (zznq.zzb() && this.zzk.zza().zze(zznVar.zza, zzat.zzbj)) {
                            if (TextUtils.isEmpty(zza7.zzo()) && !TextUtils.isEmpty(zznVar.zzv)) {
                                zza7.zzp(zznVar.zzv);
                            }
                            if (TextUtils.isEmpty(zza7.zzo()) && TextUtils.isEmpty(zza7.zzs()) && !TextUtils.isEmpty(zznVar.zzr)) {
                                zza7.zzo(zznVar.zzr);
                            }
                        } else if (TextUtils.isEmpty(zza7.zzo()) && !TextUtils.isEmpty(zznVar.zzr)) {
                            zza7.zzo(zznVar.zzr);
                        }
                        if (zznVar.zzf != 0) {
                            zza7.zzh(zznVar.zzf);
                        }
                        zza7.zzk(zznVar.zzt);
                        List<Integer> zze2 = zzh().zze();
                        if (zze2 != null) {
                            zza7.zzd(zze2);
                        }
                        zzad zzb5 = zza(zznVar.zza).zzb(zzad.zza(zznVar.zzw));
                        if (!zzmb.zzb() || !this.zzk.zza().zza(zzat.zzcp) || zzb5.zzc()) {
                            Pair<String, Boolean> zza8 = this.zzj.zza(zznVar.zza, zzb5);
                            if (zza8 != null && !TextUtils.isEmpty((CharSequence) zza8.first)) {
                                if (zznVar.zzo) {
                                    zza7.zzh((String) zza8.first);
                                    if (zza8.second != null) {
                                        zza7.zza(((Boolean) zza8.second).booleanValue());
                                    }
                                }
                            } else if (!this.zzk.zzw().zza(this.zzk.zzm()) && zznVar.zzp && (!zzov.zzb() || !this.zzk.zza().zze(zznVar.zza, zzat.zzcn))) {
                                String string = Settings.Secure.getString(this.zzk.zzm().getContentResolver(), "android_id");
                                if (string == null) {
                                    this.zzk.zzq().zzh().zza("null secure ID. appId", zzex.zza(zza7.zzj()));
                                    string = "null";
                                } else if (string.isEmpty()) {
                                    this.zzk.zzq().zzh().zza("empty secure ID. appId", zzex.zza(zza7.zzj()));
                                }
                                zza7.zzm(string);
                            }
                        }
                        this.zzk.zzw().zzaa();
                        zzcd.zzg.zza zzc4 = zza7.zzc(Build.MODEL);
                        this.zzk.zzw().zzaa();
                        zzc4.zzb(Build.VERSION.RELEASE).zzf((int) this.zzk.zzw().zze()).zzd(this.zzk.zzw().zzf());
                        if (!this.zzk.zza().zza(zzat.zzcf)) {
                            zza7.zzj(zznVar.zzl);
                        }
                        if (this.zzk.zzaa()) {
                            if (zzmb.zzb() && this.zzk.zza().zza(zzat.zzcp)) {
                                zza7.zzj();
                            } else {
                                zza7.zzj();
                            }
                            if (!TextUtils.isEmpty(null)) {
                                zza7.zzn(null);
                            }
                        }
                        zzf zzb6 = zze().zzb(zznVar.zza);
                        if (zzb6 == null) {
                            zzb6 = new zzf(this.zzk, zznVar.zza);
                            if (zzmb.zzb() && this.zzk.zza().zza(zzat.zzcp)) {
                                zzb6.zza(zza(zzb5));
                            } else {
                                zzb6.zza(zzz());
                            }
                            zzb6.zzf(zznVar.zzk);
                            zzb6.zzb(zznVar.zzb);
                            if (!zzmb.zzb() || !this.zzk.zza().zza(zzat.zzcp) || zzb5.zzc()) {
                                zzb6.zze(this.zzj.zza(zznVar.zza));
                            }
                            zzb6.zzg(0L);
                            zzb6.zza(0L);
                            zzb6.zzb(0L);
                            zzb6.zzg(zznVar.zzc);
                            zzb6.zzc(zznVar.zzj);
                            zzb6.zzh(zznVar.zzd);
                            zzb6.zzd(zznVar.zze);
                            zzb6.zze(zznVar.zzf);
                            zzb6.zza(zznVar.zzh);
                            if (!this.zzk.zza().zza(zzat.zzcf)) {
                                zzb6.zzp(zznVar.zzl);
                            }
                            zzb6.zzf(zznVar.zzt);
                            zze().zza(zzb6);
                        }
                        if ((!zzmb.zzb() || !this.zzk.zza().zza(zzat.zzcp) || zzb5.zze()) && !TextUtils.isEmpty(zzb6.zzd())) {
                            zza7.zzi(zzb6.zzd());
                        }
                        if (!TextUtils.isEmpty(zzb6.zzi())) {
                            zza7.zzl(zzb6.zzi());
                        }
                        List<zzky> zza9 = zze().zza(zznVar.zza);
                        for (int i2 = 0; i2 < zza9.size(); i2++) {
                            zzcd.zzk.zza zza10 = zzcd.zzk.zzj().zza(zza9.get(i2).zzc).zza(zza9.get(i2).zzd);
                            zzh().zza(zza10, zza9.get(i2).zze);
                            zza7.zza(zza10);
                        }
                        try {
                            long zza11 = zze().zza((zzcd.zzg) ((com.google.android.gms.internal.measurement.zzhv) zza7.zzy()));
                            zzac zze3 = zze();
                            if (zzakVar.zze != null) {
                                Iterator<String> it = zzakVar.zze.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if ("_r".equals(it.next())) {
                                            break;
                                        }
                                    } else {
                                        boolean zzc5 = zzc().zzc(zzakVar.zza, zzakVar.zzb);
                                        zzaf zza12 = zze().zza(zzy(), zzakVar.zza, false, false, false, false, false);
                                        if (zzc5 && zza12.zze < this.zzk.zza().zzc(zzakVar.zza)) {
                                        }
                                    }
                                }
                            }
                            boolean z6 = false;
                            if (zze3.zza(zzakVar, zza11, z6)) {
                                this.zzn = 0L;
                            }
                        } catch (IOException e) {
                            this.zzk.zzq().zze().zza("Data loss. Failed to insert raw event metadata. appId", zzex.zza(zza7.zzj()), e);
                        }
                        zze().b_();
                        zze().zzg();
                        zzab();
                        this.zzk.zzq().zzw().zza("Background event processing time, ms", Long.valueOf(((System.nanoTime() - j) + 500000) / 1000000));
                        return;
                    }
                    z2 = true;
                    if (z2) {
                    }
                    boolean zza42 = zzkx.zza(zzarVar2.zza);
                    boolean equals2 = "_err".equals(zzarVar2.zza);
                    if (zzmh.zzb()) {
                    }
                    j2 = 1;
                    zzaf zza52 = zze().zza(zzy(), str, j2, true, zza42, false, equals2, false);
                    intValue = zza52.zzb - zzat.zzj.zza(null).intValue();
                    if (intValue <= 0) {
                    }
                }
                z = true;
                if (!"_iap".equals(zzarVar2.zza)) {
                    z2 = false;
                    if (z2) {
                    }
                    boolean zza422 = zzkx.zza(zzarVar2.zza);
                    boolean equals22 = "_err".equals(zzarVar2.zza);
                    if (zzmh.zzb()) {
                    }
                    j2 = 1;
                    zzaf zza522 = zze().zza(zzy(), str, j2, true, zza422, false, equals22, false);
                    intValue = zza522.zzb - zzat.zzj.zza(null).intValue();
                    if (intValue <= 0) {
                    }
                }
                z2 = true;
                if (z2) {
                }
                boolean zza4222 = zzkx.zza(zzarVar2.zza);
                boolean equals222 = "_err".equals(zzarVar2.zza);
                if (zzmh.zzb()) {
                }
                j2 = 1;
                zzaf zza5222 = zze().zza(zzy(), str, j2, true, zza4222, false, equals222, false);
                intValue = zza5222.zzb - zzat.zzj.zza(null).intValue();
                if (intValue <= 0) {
                }
            } finally {
                zze().zzg();
            }
        }
    }

    private final String zza(zzad zzadVar) {
        if (zzmb.zzb() && this.zzk.zza().zza(zzat.zzcp) && !zzadVar.zze()) {
            return null;
        }
        return zzz();
    }

    @Deprecated
    private final String zzz() {
        byte[] bArr = new byte[16];
        this.zzk.zzh().zzg().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c3 A[Catch: all -> 0x03af, TryCatch #1 {all -> 0x03af, blocks: (B:3:0x000c, B:5:0x0018, B:8:0x002d, B:10:0x0033, B:13:0x0048, B:15:0x0050, B:18:0x0059, B:23:0x0065, B:26:0x007a, B:28:0x0084, B:31:0x009c, B:33:0x00bc, B:35:0x00c2, B:36:0x00c5, B:38:0x00d5, B:39:0x00ee, B:41:0x00fe, B:43:0x0104, B:44:0x010e, B:46:0x0138, B:48:0x013e, B:50:0x014c, B:69:0x01a9, B:71:0x01c6, B:73:0x01cc, B:75:0x01da, B:79:0x01e7, B:81:0x01ed, B:83:0x01fb, B:88:0x0209, B:90:0x020f, B:92:0x021d, B:99:0x022e, B:101:0x0260, B:102:0x0263, B:104:0x0269, B:107:0x0279, B:109:0x0281, B:110:0x0284, B:112:0x0292, B:113:0x02a9, B:114:0x02b4, B:116:0x02c3, B:118:0x02d5, B:119:0x02ed, B:123:0x02fb, B:125:0x0302, B:127:0x031b, B:129:0x032a, B:130:0x0332, B:126:0x0312, B:132:0x0373, B:52:0x0156, B:53:0x015a, B:55:0x0160, B:57:0x0174, B:61:0x017d, B:63:0x0183, B:65:0x0197, B:67:0x01a1, B:68:0x01a6, B:133:0x0387, B:135:0x039c, B:137:0x03a6), top: B:146:0x000c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0302 A[Catch: MalformedURLException -> 0x0373, all -> 0x03af, TryCatch #0 {MalformedURLException -> 0x0373, blocks: (B:119:0x02ed, B:123:0x02fb, B:125:0x0302, B:127:0x031b, B:129:0x032a, B:130:0x0332, B:126:0x0312), top: B:144:0x02ed, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0312 A[Catch: MalformedURLException -> 0x0373, all -> 0x03af, TryCatch #0 {MalformedURLException -> 0x0373, blocks: (B:119:0x02ed, B:123:0x02fb, B:125:0x0302, B:127:0x031b, B:129:0x032a, B:130:0x0332, B:126:0x0312), top: B:144:0x02ed, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x032a A[Catch: MalformedURLException -> 0x0373, all -> 0x03af, TryCatch #0 {MalformedURLException -> 0x0373, blocks: (B:119:0x02ed, B:123:0x02fb, B:125:0x0302, B:127:0x031b, B:129:0x032a, B:130:0x0332, B:126:0x0312), top: B:144:0x02ed, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022e A[Catch: all -> 0x03af, TryCatch #1 {all -> 0x03af, blocks: (B:3:0x000c, B:5:0x0018, B:8:0x002d, B:10:0x0033, B:13:0x0048, B:15:0x0050, B:18:0x0059, B:23:0x0065, B:26:0x007a, B:28:0x0084, B:31:0x009c, B:33:0x00bc, B:35:0x00c2, B:36:0x00c5, B:38:0x00d5, B:39:0x00ee, B:41:0x00fe, B:43:0x0104, B:44:0x010e, B:46:0x0138, B:48:0x013e, B:50:0x014c, B:69:0x01a9, B:71:0x01c6, B:73:0x01cc, B:75:0x01da, B:79:0x01e7, B:81:0x01ed, B:83:0x01fb, B:88:0x0209, B:90:0x020f, B:92:0x021d, B:99:0x022e, B:101:0x0260, B:102:0x0263, B:104:0x0269, B:107:0x0279, B:109:0x0281, B:110:0x0284, B:112:0x0292, B:113:0x02a9, B:114:0x02b4, B:116:0x02c3, B:118:0x02d5, B:119:0x02ed, B:123:0x02fb, B:125:0x0302, B:127:0x031b, B:129:0x032a, B:130:0x0332, B:126:0x0312, B:132:0x0373, B:52:0x0156, B:53:0x015a, B:55:0x0160, B:57:0x0174, B:61:0x017d, B:63:0x0183, B:65:0x0197, B:67:0x01a1, B:68:0x01a6, B:133:0x0387, B:135:0x039c, B:137:0x03a6), top: B:146:0x000c, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzo() {
        zzf zzb;
        String str;
        boolean z;
        boolean z2;
        int i;
        String zza2;
        zzx();
        zzn();
        this.zzt = true;
        try {
            Boolean zzaf = this.zzk.zzv().zzaf();
            if (zzaf == null) {
                this.zzk.zzq().zzh().zza("Upload data called on the client side before use of service was decided");
            } else if (zzaf.booleanValue()) {
                this.zzk.zzq().zze().zza("Upload called in the client side when service should be used");
            } else if (this.zzn > 0) {
                zzab();
            } else {
                zzx();
                if (this.zzw != null) {
                    this.zzk.zzq().zzw().zza("Uploading requested multiple times");
                } else if (!zzd().zze()) {
                    this.zzk.zzq().zzw().zza("Network not connected, ignoring upload request");
                    zzab();
                } else {
                    long currentTimeMillis = this.zzk.zzl().currentTimeMillis();
                    int zzb2 = this.zzk.zza().zzb(null, zzat.zzap);
                    long zzj = currentTimeMillis - zzy.zzj();
                    for (int i2 = 0; i2 < zzb2 && zza((String) null, zzj); i2++) {
                    }
                    long zza3 = this.zzk.zzb().zzc.zza();
                    if (zza3 != 0) {
                        this.zzk.zzq().zzv().zza("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(currentTimeMillis - zza3)));
                    }
                    String d_ = zze().d_();
                    if (!TextUtils.isEmpty(d_)) {
                        if (this.zzy == -1) {
                            this.zzy = zze().zzz();
                        }
                        List<Pair<zzcd.zzg, Long>> zza4 = zze().zza(d_, this.zzk.zza().zzb(d_, zzat.zzf), Math.max(0, this.zzk.zza().zzb(d_, zzat.zzg)));
                        if (!zza4.isEmpty()) {
                            if (!zzmb.zzb() || !this.zzk.zza().zza(zzat.zzcp) || zza(d_).zzc()) {
                                Iterator<Pair<zzcd.zzg, Long>> it = zza4.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        str = null;
                                        break;
                                    }
                                    zzcd.zzg zzgVar = (zzcd.zzg) it.next().first;
                                    if (!TextUtils.isEmpty(zzgVar.zzad())) {
                                        str = zzgVar.zzad();
                                        break;
                                    }
                                }
                                if (str != null) {
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= zza4.size()) {
                                            break;
                                        }
                                        zzcd.zzg zzgVar2 = (zzcd.zzg) zza4.get(i3).first;
                                        if (!TextUtils.isEmpty(zzgVar2.zzad()) && !zzgVar2.zzad().equals(str)) {
                                            zza4 = zza4.subList(0, i3);
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            }
                            zzcd.zzf.zza zzb3 = zzcd.zzf.zzb();
                            int size = zza4.size();
                            ArrayList arrayList = new ArrayList(zza4.size());
                            boolean z3 = this.zzk.zza().zzh(d_) && !(zzmb.zzb() && this.zzk.zza().zza(zzat.zzcp) && !zza(d_).zzc());
                            try {
                                if (zzmb.zzb() && this.zzk.zza().zza(zzat.zzcp) && !zza(d_).zzc()) {
                                    z = false;
                                    if (zzmb.zzb() && this.zzk.zza().zza(zzat.zzcp) && !zza(d_).zze()) {
                                        z2 = false;
                                        i = 0;
                                        while (i < size) {
                                            zzcd.zzg.zza zzbo = ((zzcd.zzg) zza4.get(i).first).zzbo();
                                            arrayList.add((Long) zza4.get(i).second);
                                            ArrayList arrayList2 = arrayList;
                                            zzbo.zzg(31049L).zza(currentTimeMillis).zzb(false);
                                            if (!z3) {
                                                zzbo.zzr();
                                            }
                                            if (zzmb.zzb() && this.zzk.zza().zza(zzat.zzcp)) {
                                                if (!z) {
                                                    zzbo.zzk();
                                                    zzbo.zzl();
                                                }
                                                if (!z2) {
                                                    zzbo.zzm();
                                                }
                                            }
                                            if (this.zzk.zza().zze(d_, zzat.zzax)) {
                                                zzbo.zzl(zzh().zza(((zzcd.zzg) ((com.google.android.gms.internal.measurement.zzhv) zzbo.zzy())).zzbk()));
                                            }
                                            zzb3.zza(zzbo);
                                            i++;
                                            arrayList = arrayList2;
                                        }
                                        ArrayList arrayList3 = arrayList;
                                        String zza5 = !this.zzk.zzq().zza(2) ? zzh().zza((zzcd.zzf) ((com.google.android.gms.internal.measurement.zzhv) zzb3.zzy())) : null;
                                        zzh();
                                        byte[] zzbk = ((zzcd.zzf) ((com.google.android.gms.internal.measurement.zzhv) zzb3.zzy())).zzbk();
                                        zza2 = zzat.zzp.zza(null);
                                        URL url = new URL(zza2);
                                        Preconditions.checkArgument(arrayList3.isEmpty());
                                        if (this.zzw == null) {
                                            this.zzk.zzq().zze().zza("Set uploading progress before finishing the previous upload");
                                        } else {
                                            this.zzw = new ArrayList(arrayList3);
                                        }
                                        this.zzk.zzb().zzd.zza(currentTimeMillis);
                                        this.zzk.zzq().zzw().zza("Uploading data. app, uncompressed size, data", size > 0 ? zzb3.zza(0).zzx() : "?", Integer.valueOf(zzbk.length), zza5);
                                        this.zzs = true;
                                        zzfa zzd = zzd();
                                        zzkr zzkrVar = new zzkr(this, d_);
                                        zzd.zzc();
                                        zzd.zzaj();
                                        Preconditions.checkNotNull(url);
                                        Preconditions.checkNotNull(zzbk);
                                        Preconditions.checkNotNull(zzkrVar);
                                        zzd.zzp().zzc(new zzfe(zzd, d_, url, zzbk, null, zzkrVar));
                                    }
                                    z2 = true;
                                    i = 0;
                                    while (i < size) {
                                    }
                                    ArrayList arrayList32 = arrayList;
                                    if (!this.zzk.zzq().zza(2)) {
                                    }
                                    zzh();
                                    byte[] zzbk2 = ((zzcd.zzf) ((com.google.android.gms.internal.measurement.zzhv) zzb3.zzy())).zzbk();
                                    zza2 = zzat.zzp.zza(null);
                                    URL url2 = new URL(zza2);
                                    Preconditions.checkArgument(arrayList32.isEmpty());
                                    if (this.zzw == null) {
                                    }
                                    this.zzk.zzb().zzd.zza(currentTimeMillis);
                                    this.zzk.zzq().zzw().zza("Uploading data. app, uncompressed size, data", size > 0 ? zzb3.zza(0).zzx() : "?", Integer.valueOf(zzbk2.length), zza5);
                                    this.zzs = true;
                                    zzfa zzd2 = zzd();
                                    zzkr zzkrVar2 = new zzkr(this, d_);
                                    zzd2.zzc();
                                    zzd2.zzaj();
                                    Preconditions.checkNotNull(url2);
                                    Preconditions.checkNotNull(zzbk2);
                                    Preconditions.checkNotNull(zzkrVar2);
                                    zzd2.zzp().zzc(new zzfe(zzd2, d_, url2, zzbk2, null, zzkrVar2));
                                }
                                if (zzmb.zzb()) {
                                    z2 = false;
                                    i = 0;
                                    while (i < size) {
                                    }
                                    ArrayList arrayList322 = arrayList;
                                    if (!this.zzk.zzq().zza(2)) {
                                    }
                                    zzh();
                                    byte[] zzbk22 = ((zzcd.zzf) ((com.google.android.gms.internal.measurement.zzhv) zzb3.zzy())).zzbk();
                                    zza2 = zzat.zzp.zza(null);
                                    URL url22 = new URL(zza2);
                                    Preconditions.checkArgument(arrayList322.isEmpty());
                                    if (this.zzw == null) {
                                    }
                                    this.zzk.zzb().zzd.zza(currentTimeMillis);
                                    this.zzk.zzq().zzw().zza("Uploading data. app, uncompressed size, data", size > 0 ? zzb3.zza(0).zzx() : "?", Integer.valueOf(zzbk22.length), zza5);
                                    this.zzs = true;
                                    zzfa zzd22 = zzd();
                                    zzkr zzkrVar22 = new zzkr(this, d_);
                                    zzd22.zzc();
                                    zzd22.zzaj();
                                    Preconditions.checkNotNull(url22);
                                    Preconditions.checkNotNull(zzbk22);
                                    Preconditions.checkNotNull(zzkrVar22);
                                    zzd22.zzp().zzc(new zzfe(zzd22, d_, url22, zzbk22, null, zzkrVar22));
                                }
                                URL url222 = new URL(zza2);
                                Preconditions.checkArgument(arrayList322.isEmpty());
                                if (this.zzw == null) {
                                }
                                this.zzk.zzb().zzd.zza(currentTimeMillis);
                                this.zzk.zzq().zzw().zza("Uploading data. app, uncompressed size, data", size > 0 ? zzb3.zza(0).zzx() : "?", Integer.valueOf(zzbk22.length), zza5);
                                this.zzs = true;
                                zzfa zzd222 = zzd();
                                zzkr zzkrVar222 = new zzkr(this, d_);
                                zzd222.zzc();
                                zzd222.zzaj();
                                Preconditions.checkNotNull(url222);
                                Preconditions.checkNotNull(zzbk22);
                                Preconditions.checkNotNull(zzkrVar222);
                                zzd222.zzp().zzc(new zzfe(zzd222, d_, url222, zzbk22, null, zzkrVar222));
                            } catch (MalformedURLException unused) {
                                this.zzk.zzq().zze().zza("Failed to parse upload URL. Not uploading. appId", zzex.zza(d_), zza2);
                            }
                            z = true;
                            z2 = true;
                            i = 0;
                            while (i < size) {
                            }
                            ArrayList arrayList3222 = arrayList;
                            if (!this.zzk.zzq().zza(2)) {
                            }
                            zzh();
                            byte[] zzbk222 = ((zzcd.zzf) ((com.google.android.gms.internal.measurement.zzhv) zzb3.zzy())).zzbk();
                            zza2 = zzat.zzp.zza(null);
                        }
                    } else {
                        this.zzy = -1L;
                        String zza6 = zze().zza(currentTimeMillis - zzy.zzj());
                        if (!TextUtils.isEmpty(zza6) && (zzb = zze().zzb(zza6)) != null) {
                            zza(zzb);
                        }
                    }
                }
            }
        } finally {
            this.zzt = false;
            zzac();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0282 A[Catch: all -> 0x104a, TRY_ENTER, TryCatch #6 {all -> 0x104a, blocks: (B:3:0x000f, B:19:0x0083, B:115:0x0285, B:117:0x0289, B:123:0x0297, B:124:0x02c0, B:127:0x02d8, B:130:0x0300, B:132:0x0337, B:138:0x034d, B:140:0x0357, B:340:0x095f, B:142:0x037e, B:144:0x0384, B:146:0x039a, B:148:0x03a8, B:151:0x03c8, B:153:0x03ce, B:155:0x03de, B:157:0x03ec, B:159:0x03fc, B:160:0x040b, B:162:0x0410, B:165:0x0426, B:195:0x048a, B:198:0x0494, B:200:0x04a2, B:205:0x04f4, B:201:0x04c3, B:203:0x04d1, B:209:0x0501, B:212:0x0536, B:213:0x0564, B:215:0x0598, B:217:0x059e, B:239:0x0670, B:240:0x067c, B:243:0x0686, B:249:0x06a9, B:246:0x0698, B:252:0x06af, B:254:0x06bb, B:256:0x06c7, B:272:0x0716, B:275:0x0733, B:277:0x0747, B:279:0x0751, B:282:0x0764, B:284:0x0778, B:286:0x0786, B:330:0x08e7, B:332:0x08f1, B:334:0x08f7, B:335:0x0911, B:337:0x0925, B:338:0x093f, B:339:0x0947, B:290:0x07a7, B:292:0x07b5, B:295:0x07ca, B:297:0x07de, B:299:0x07ec, B:302:0x0800, B:304:0x0818, B:306:0x0824, B:309:0x0837, B:311:0x084b, B:313:0x0896, B:315:0x089d, B:317:0x08a3, B:319:0x08ae, B:321:0x08b5, B:323:0x08bb, B:325:0x08c6, B:326:0x08d7, B:260:0x06e8, B:264:0x06fc, B:266:0x0702, B:269:0x070d, B:220:0x05aa, B:222:0x05df, B:223:0x05fc, B:225:0x0602, B:227:0x0610, B:231:0x0626, B:228:0x061b, B:234:0x062d, B:236:0x0634, B:237:0x0653, B:172:0x0448, B:175:0x0452, B:178:0x045c, B:345:0x0979, B:347:0x0987, B:349:0x0990, B:360:0x09c2, B:350:0x0998, B:352:0x09a1, B:354:0x09a7, B:357:0x09b3, B:359:0x09bd, B:363:0x09c9, B:364:0x09d5, B:366:0x09db, B:372:0x09f4, B:373:0x09ff, B:378:0x0a0c, B:382:0x0a33, B:384:0x0a52, B:386:0x0a60, B:388:0x0a66, B:390:0x0a70, B:391:0x0aa2, B:393:0x0aa8, B:395:0x0ab6, B:399:0x0ac1, B:396:0x0abb, B:400:0x0ac4, B:401:0x0ad3, B:403:0x0ad9, B:405:0x0ae9, B:406:0x0af0, B:408:0x0afc, B:409:0x0b03, B:410:0x0b06, B:412:0x0b0c, B:414:0x0b1e, B:415:0x0b21, B:423:0x0b93, B:425:0x0baf, B:426:0x0bc0, B:428:0x0bc4, B:430:0x0bd0, B:431:0x0bd9, B:433:0x0bdd, B:435:0x0be5, B:436:0x0bf4, B:437:0x0bff, B:443:0x0c3f, B:444:0x0c47, B:446:0x0c4d, B:448:0x0c5f, B:450:0x0c63, B:464:0x0c99, B:467:0x0caf, B:452:0x0c71, B:454:0x0c75, B:456:0x0c7f, B:458:0x0c83, B:379:0x0a11, B:381:0x0a17, B:52:0x012f, B:67:0x01d5, B:76:0x020f, B:84:0x022f, B:90:0x0248, B:114:0x0282, B:41:0x00e1, B:55:0x0138), top: B:602:0x000f, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0289 A[Catch: all -> 0x104a, TryCatch #6 {all -> 0x104a, blocks: (B:3:0x000f, B:19:0x0083, B:115:0x0285, B:117:0x0289, B:123:0x0297, B:124:0x02c0, B:127:0x02d8, B:130:0x0300, B:132:0x0337, B:138:0x034d, B:140:0x0357, B:340:0x095f, B:142:0x037e, B:144:0x0384, B:146:0x039a, B:148:0x03a8, B:151:0x03c8, B:153:0x03ce, B:155:0x03de, B:157:0x03ec, B:159:0x03fc, B:160:0x040b, B:162:0x0410, B:165:0x0426, B:195:0x048a, B:198:0x0494, B:200:0x04a2, B:205:0x04f4, B:201:0x04c3, B:203:0x04d1, B:209:0x0501, B:212:0x0536, B:213:0x0564, B:215:0x0598, B:217:0x059e, B:239:0x0670, B:240:0x067c, B:243:0x0686, B:249:0x06a9, B:246:0x0698, B:252:0x06af, B:254:0x06bb, B:256:0x06c7, B:272:0x0716, B:275:0x0733, B:277:0x0747, B:279:0x0751, B:282:0x0764, B:284:0x0778, B:286:0x0786, B:330:0x08e7, B:332:0x08f1, B:334:0x08f7, B:335:0x0911, B:337:0x0925, B:338:0x093f, B:339:0x0947, B:290:0x07a7, B:292:0x07b5, B:295:0x07ca, B:297:0x07de, B:299:0x07ec, B:302:0x0800, B:304:0x0818, B:306:0x0824, B:309:0x0837, B:311:0x084b, B:313:0x0896, B:315:0x089d, B:317:0x08a3, B:319:0x08ae, B:321:0x08b5, B:323:0x08bb, B:325:0x08c6, B:326:0x08d7, B:260:0x06e8, B:264:0x06fc, B:266:0x0702, B:269:0x070d, B:220:0x05aa, B:222:0x05df, B:223:0x05fc, B:225:0x0602, B:227:0x0610, B:231:0x0626, B:228:0x061b, B:234:0x062d, B:236:0x0634, B:237:0x0653, B:172:0x0448, B:175:0x0452, B:178:0x045c, B:345:0x0979, B:347:0x0987, B:349:0x0990, B:360:0x09c2, B:350:0x0998, B:352:0x09a1, B:354:0x09a7, B:357:0x09b3, B:359:0x09bd, B:363:0x09c9, B:364:0x09d5, B:366:0x09db, B:372:0x09f4, B:373:0x09ff, B:378:0x0a0c, B:382:0x0a33, B:384:0x0a52, B:386:0x0a60, B:388:0x0a66, B:390:0x0a70, B:391:0x0aa2, B:393:0x0aa8, B:395:0x0ab6, B:399:0x0ac1, B:396:0x0abb, B:400:0x0ac4, B:401:0x0ad3, B:403:0x0ad9, B:405:0x0ae9, B:406:0x0af0, B:408:0x0afc, B:409:0x0b03, B:410:0x0b06, B:412:0x0b0c, B:414:0x0b1e, B:415:0x0b21, B:423:0x0b93, B:425:0x0baf, B:426:0x0bc0, B:428:0x0bc4, B:430:0x0bd0, B:431:0x0bd9, B:433:0x0bdd, B:435:0x0be5, B:436:0x0bf4, B:437:0x0bff, B:443:0x0c3f, B:444:0x0c47, B:446:0x0c4d, B:448:0x0c5f, B:450:0x0c63, B:464:0x0c99, B:467:0x0caf, B:452:0x0c71, B:454:0x0c75, B:456:0x0c7f, B:458:0x0c83, B:379:0x0a11, B:381:0x0a17, B:52:0x012f, B:67:0x01d5, B:76:0x020f, B:84:0x022f, B:90:0x0248, B:114:0x0282, B:41:0x00e1, B:55:0x0138), top: B:602:0x000f, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0297 A[Catch: all -> 0x104a, TryCatch #6 {all -> 0x104a, blocks: (B:3:0x000f, B:19:0x0083, B:115:0x0285, B:117:0x0289, B:123:0x0297, B:124:0x02c0, B:127:0x02d8, B:130:0x0300, B:132:0x0337, B:138:0x034d, B:140:0x0357, B:340:0x095f, B:142:0x037e, B:144:0x0384, B:146:0x039a, B:148:0x03a8, B:151:0x03c8, B:153:0x03ce, B:155:0x03de, B:157:0x03ec, B:159:0x03fc, B:160:0x040b, B:162:0x0410, B:165:0x0426, B:195:0x048a, B:198:0x0494, B:200:0x04a2, B:205:0x04f4, B:201:0x04c3, B:203:0x04d1, B:209:0x0501, B:212:0x0536, B:213:0x0564, B:215:0x0598, B:217:0x059e, B:239:0x0670, B:240:0x067c, B:243:0x0686, B:249:0x06a9, B:246:0x0698, B:252:0x06af, B:254:0x06bb, B:256:0x06c7, B:272:0x0716, B:275:0x0733, B:277:0x0747, B:279:0x0751, B:282:0x0764, B:284:0x0778, B:286:0x0786, B:330:0x08e7, B:332:0x08f1, B:334:0x08f7, B:335:0x0911, B:337:0x0925, B:338:0x093f, B:339:0x0947, B:290:0x07a7, B:292:0x07b5, B:295:0x07ca, B:297:0x07de, B:299:0x07ec, B:302:0x0800, B:304:0x0818, B:306:0x0824, B:309:0x0837, B:311:0x084b, B:313:0x0896, B:315:0x089d, B:317:0x08a3, B:319:0x08ae, B:321:0x08b5, B:323:0x08bb, B:325:0x08c6, B:326:0x08d7, B:260:0x06e8, B:264:0x06fc, B:266:0x0702, B:269:0x070d, B:220:0x05aa, B:222:0x05df, B:223:0x05fc, B:225:0x0602, B:227:0x0610, B:231:0x0626, B:228:0x061b, B:234:0x062d, B:236:0x0634, B:237:0x0653, B:172:0x0448, B:175:0x0452, B:178:0x045c, B:345:0x0979, B:347:0x0987, B:349:0x0990, B:360:0x09c2, B:350:0x0998, B:352:0x09a1, B:354:0x09a7, B:357:0x09b3, B:359:0x09bd, B:363:0x09c9, B:364:0x09d5, B:366:0x09db, B:372:0x09f4, B:373:0x09ff, B:378:0x0a0c, B:382:0x0a33, B:384:0x0a52, B:386:0x0a60, B:388:0x0a66, B:390:0x0a70, B:391:0x0aa2, B:393:0x0aa8, B:395:0x0ab6, B:399:0x0ac1, B:396:0x0abb, B:400:0x0ac4, B:401:0x0ad3, B:403:0x0ad9, B:405:0x0ae9, B:406:0x0af0, B:408:0x0afc, B:409:0x0b03, B:410:0x0b06, B:412:0x0b0c, B:414:0x0b1e, B:415:0x0b21, B:423:0x0b93, B:425:0x0baf, B:426:0x0bc0, B:428:0x0bc4, B:430:0x0bd0, B:431:0x0bd9, B:433:0x0bdd, B:435:0x0be5, B:436:0x0bf4, B:437:0x0bff, B:443:0x0c3f, B:444:0x0c47, B:446:0x0c4d, B:448:0x0c5f, B:450:0x0c63, B:464:0x0c99, B:467:0x0caf, B:452:0x0c71, B:454:0x0c75, B:456:0x0c7f, B:458:0x0c83, B:379:0x0a11, B:381:0x0a17, B:52:0x012f, B:67:0x01d5, B:76:0x020f, B:84:0x022f, B:90:0x0248, B:114:0x0282, B:41:0x00e1, B:55:0x0138), top: B:602:0x000f, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0670 A[Catch: all -> 0x104a, TryCatch #6 {all -> 0x104a, blocks: (B:3:0x000f, B:19:0x0083, B:115:0x0285, B:117:0x0289, B:123:0x0297, B:124:0x02c0, B:127:0x02d8, B:130:0x0300, B:132:0x0337, B:138:0x034d, B:140:0x0357, B:340:0x095f, B:142:0x037e, B:144:0x0384, B:146:0x039a, B:148:0x03a8, B:151:0x03c8, B:153:0x03ce, B:155:0x03de, B:157:0x03ec, B:159:0x03fc, B:160:0x040b, B:162:0x0410, B:165:0x0426, B:195:0x048a, B:198:0x0494, B:200:0x04a2, B:205:0x04f4, B:201:0x04c3, B:203:0x04d1, B:209:0x0501, B:212:0x0536, B:213:0x0564, B:215:0x0598, B:217:0x059e, B:239:0x0670, B:240:0x067c, B:243:0x0686, B:249:0x06a9, B:246:0x0698, B:252:0x06af, B:254:0x06bb, B:256:0x06c7, B:272:0x0716, B:275:0x0733, B:277:0x0747, B:279:0x0751, B:282:0x0764, B:284:0x0778, B:286:0x0786, B:330:0x08e7, B:332:0x08f1, B:334:0x08f7, B:335:0x0911, B:337:0x0925, B:338:0x093f, B:339:0x0947, B:290:0x07a7, B:292:0x07b5, B:295:0x07ca, B:297:0x07de, B:299:0x07ec, B:302:0x0800, B:304:0x0818, B:306:0x0824, B:309:0x0837, B:311:0x084b, B:313:0x0896, B:315:0x089d, B:317:0x08a3, B:319:0x08ae, B:321:0x08b5, B:323:0x08bb, B:325:0x08c6, B:326:0x08d7, B:260:0x06e8, B:264:0x06fc, B:266:0x0702, B:269:0x070d, B:220:0x05aa, B:222:0x05df, B:223:0x05fc, B:225:0x0602, B:227:0x0610, B:231:0x0626, B:228:0x061b, B:234:0x062d, B:236:0x0634, B:237:0x0653, B:172:0x0448, B:175:0x0452, B:178:0x045c, B:345:0x0979, B:347:0x0987, B:349:0x0990, B:360:0x09c2, B:350:0x0998, B:352:0x09a1, B:354:0x09a7, B:357:0x09b3, B:359:0x09bd, B:363:0x09c9, B:364:0x09d5, B:366:0x09db, B:372:0x09f4, B:373:0x09ff, B:378:0x0a0c, B:382:0x0a33, B:384:0x0a52, B:386:0x0a60, B:388:0x0a66, B:390:0x0a70, B:391:0x0aa2, B:393:0x0aa8, B:395:0x0ab6, B:399:0x0ac1, B:396:0x0abb, B:400:0x0ac4, B:401:0x0ad3, B:403:0x0ad9, B:405:0x0ae9, B:406:0x0af0, B:408:0x0afc, B:409:0x0b03, B:410:0x0b06, B:412:0x0b0c, B:414:0x0b1e, B:415:0x0b21, B:423:0x0b93, B:425:0x0baf, B:426:0x0bc0, B:428:0x0bc4, B:430:0x0bd0, B:431:0x0bd9, B:433:0x0bdd, B:435:0x0be5, B:436:0x0bf4, B:437:0x0bff, B:443:0x0c3f, B:444:0x0c47, B:446:0x0c4d, B:448:0x0c5f, B:450:0x0c63, B:464:0x0c99, B:467:0x0caf, B:452:0x0c71, B:454:0x0c75, B:456:0x0c7f, B:458:0x0c83, B:379:0x0a11, B:381:0x0a17, B:52:0x012f, B:67:0x01d5, B:76:0x020f, B:84:0x022f, B:90:0x0248, B:114:0x0282, B:41:0x00e1, B:55:0x0138), top: B:602:0x000f, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0747 A[Catch: all -> 0x104a, TryCatch #6 {all -> 0x104a, blocks: (B:3:0x000f, B:19:0x0083, B:115:0x0285, B:117:0x0289, B:123:0x0297, B:124:0x02c0, B:127:0x02d8, B:130:0x0300, B:132:0x0337, B:138:0x034d, B:140:0x0357, B:340:0x095f, B:142:0x037e, B:144:0x0384, B:146:0x039a, B:148:0x03a8, B:151:0x03c8, B:153:0x03ce, B:155:0x03de, B:157:0x03ec, B:159:0x03fc, B:160:0x040b, B:162:0x0410, B:165:0x0426, B:195:0x048a, B:198:0x0494, B:200:0x04a2, B:205:0x04f4, B:201:0x04c3, B:203:0x04d1, B:209:0x0501, B:212:0x0536, B:213:0x0564, B:215:0x0598, B:217:0x059e, B:239:0x0670, B:240:0x067c, B:243:0x0686, B:249:0x06a9, B:246:0x0698, B:252:0x06af, B:254:0x06bb, B:256:0x06c7, B:272:0x0716, B:275:0x0733, B:277:0x0747, B:279:0x0751, B:282:0x0764, B:284:0x0778, B:286:0x0786, B:330:0x08e7, B:332:0x08f1, B:334:0x08f7, B:335:0x0911, B:337:0x0925, B:338:0x093f, B:339:0x0947, B:290:0x07a7, B:292:0x07b5, B:295:0x07ca, B:297:0x07de, B:299:0x07ec, B:302:0x0800, B:304:0x0818, B:306:0x0824, B:309:0x0837, B:311:0x084b, B:313:0x0896, B:315:0x089d, B:317:0x08a3, B:319:0x08ae, B:321:0x08b5, B:323:0x08bb, B:325:0x08c6, B:326:0x08d7, B:260:0x06e8, B:264:0x06fc, B:266:0x0702, B:269:0x070d, B:220:0x05aa, B:222:0x05df, B:223:0x05fc, B:225:0x0602, B:227:0x0610, B:231:0x0626, B:228:0x061b, B:234:0x062d, B:236:0x0634, B:237:0x0653, B:172:0x0448, B:175:0x0452, B:178:0x045c, B:345:0x0979, B:347:0x0987, B:349:0x0990, B:360:0x09c2, B:350:0x0998, B:352:0x09a1, B:354:0x09a7, B:357:0x09b3, B:359:0x09bd, B:363:0x09c9, B:364:0x09d5, B:366:0x09db, B:372:0x09f4, B:373:0x09ff, B:378:0x0a0c, B:382:0x0a33, B:384:0x0a52, B:386:0x0a60, B:388:0x0a66, B:390:0x0a70, B:391:0x0aa2, B:393:0x0aa8, B:395:0x0ab6, B:399:0x0ac1, B:396:0x0abb, B:400:0x0ac4, B:401:0x0ad3, B:403:0x0ad9, B:405:0x0ae9, B:406:0x0af0, B:408:0x0afc, B:409:0x0b03, B:410:0x0b06, B:412:0x0b0c, B:414:0x0b1e, B:415:0x0b21, B:423:0x0b93, B:425:0x0baf, B:426:0x0bc0, B:428:0x0bc4, B:430:0x0bd0, B:431:0x0bd9, B:433:0x0bdd, B:435:0x0be5, B:436:0x0bf4, B:437:0x0bff, B:443:0x0c3f, B:444:0x0c47, B:446:0x0c4d, B:448:0x0c5f, B:450:0x0c63, B:464:0x0c99, B:467:0x0caf, B:452:0x0c71, B:454:0x0c75, B:456:0x0c7f, B:458:0x0c83, B:379:0x0a11, B:381:0x0a17, B:52:0x012f, B:67:0x01d5, B:76:0x020f, B:84:0x022f, B:90:0x0248, B:114:0x0282, B:41:0x00e1, B:55:0x0138), top: B:602:0x000f, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x08e7 A[Catch: all -> 0x104a, TryCatch #6 {all -> 0x104a, blocks: (B:3:0x000f, B:19:0x0083, B:115:0x0285, B:117:0x0289, B:123:0x0297, B:124:0x02c0, B:127:0x02d8, B:130:0x0300, B:132:0x0337, B:138:0x034d, B:140:0x0357, B:340:0x095f, B:142:0x037e, B:144:0x0384, B:146:0x039a, B:148:0x03a8, B:151:0x03c8, B:153:0x03ce, B:155:0x03de, B:157:0x03ec, B:159:0x03fc, B:160:0x040b, B:162:0x0410, B:165:0x0426, B:195:0x048a, B:198:0x0494, B:200:0x04a2, B:205:0x04f4, B:201:0x04c3, B:203:0x04d1, B:209:0x0501, B:212:0x0536, B:213:0x0564, B:215:0x0598, B:217:0x059e, B:239:0x0670, B:240:0x067c, B:243:0x0686, B:249:0x06a9, B:246:0x0698, B:252:0x06af, B:254:0x06bb, B:256:0x06c7, B:272:0x0716, B:275:0x0733, B:277:0x0747, B:279:0x0751, B:282:0x0764, B:284:0x0778, B:286:0x0786, B:330:0x08e7, B:332:0x08f1, B:334:0x08f7, B:335:0x0911, B:337:0x0925, B:338:0x093f, B:339:0x0947, B:290:0x07a7, B:292:0x07b5, B:295:0x07ca, B:297:0x07de, B:299:0x07ec, B:302:0x0800, B:304:0x0818, B:306:0x0824, B:309:0x0837, B:311:0x084b, B:313:0x0896, B:315:0x089d, B:317:0x08a3, B:319:0x08ae, B:321:0x08b5, B:323:0x08bb, B:325:0x08c6, B:326:0x08d7, B:260:0x06e8, B:264:0x06fc, B:266:0x0702, B:269:0x070d, B:220:0x05aa, B:222:0x05df, B:223:0x05fc, B:225:0x0602, B:227:0x0610, B:231:0x0626, B:228:0x061b, B:234:0x062d, B:236:0x0634, B:237:0x0653, B:172:0x0448, B:175:0x0452, B:178:0x045c, B:345:0x0979, B:347:0x0987, B:349:0x0990, B:360:0x09c2, B:350:0x0998, B:352:0x09a1, B:354:0x09a7, B:357:0x09b3, B:359:0x09bd, B:363:0x09c9, B:364:0x09d5, B:366:0x09db, B:372:0x09f4, B:373:0x09ff, B:378:0x0a0c, B:382:0x0a33, B:384:0x0a52, B:386:0x0a60, B:388:0x0a66, B:390:0x0a70, B:391:0x0aa2, B:393:0x0aa8, B:395:0x0ab6, B:399:0x0ac1, B:396:0x0abb, B:400:0x0ac4, B:401:0x0ad3, B:403:0x0ad9, B:405:0x0ae9, B:406:0x0af0, B:408:0x0afc, B:409:0x0b03, B:410:0x0b06, B:412:0x0b0c, B:414:0x0b1e, B:415:0x0b21, B:423:0x0b93, B:425:0x0baf, B:426:0x0bc0, B:428:0x0bc4, B:430:0x0bd0, B:431:0x0bd9, B:433:0x0bdd, B:435:0x0be5, B:436:0x0bf4, B:437:0x0bff, B:443:0x0c3f, B:444:0x0c47, B:446:0x0c4d, B:448:0x0c5f, B:450:0x0c63, B:464:0x0c99, B:467:0x0caf, B:452:0x0c71, B:454:0x0c75, B:456:0x0c7f, B:458:0x0c83, B:379:0x0a11, B:381:0x0a17, B:52:0x012f, B:67:0x01d5, B:76:0x020f, B:84:0x022f, B:90:0x0248, B:114:0x0282, B:41:0x00e1, B:55:0x0138), top: B:602:0x000f, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x08f7 A[Catch: all -> 0x104a, TryCatch #6 {all -> 0x104a, blocks: (B:3:0x000f, B:19:0x0083, B:115:0x0285, B:117:0x0289, B:123:0x0297, B:124:0x02c0, B:127:0x02d8, B:130:0x0300, B:132:0x0337, B:138:0x034d, B:140:0x0357, B:340:0x095f, B:142:0x037e, B:144:0x0384, B:146:0x039a, B:148:0x03a8, B:151:0x03c8, B:153:0x03ce, B:155:0x03de, B:157:0x03ec, B:159:0x03fc, B:160:0x040b, B:162:0x0410, B:165:0x0426, B:195:0x048a, B:198:0x0494, B:200:0x04a2, B:205:0x04f4, B:201:0x04c3, B:203:0x04d1, B:209:0x0501, B:212:0x0536, B:213:0x0564, B:215:0x0598, B:217:0x059e, B:239:0x0670, B:240:0x067c, B:243:0x0686, B:249:0x06a9, B:246:0x0698, B:252:0x06af, B:254:0x06bb, B:256:0x06c7, B:272:0x0716, B:275:0x0733, B:277:0x0747, B:279:0x0751, B:282:0x0764, B:284:0x0778, B:286:0x0786, B:330:0x08e7, B:332:0x08f1, B:334:0x08f7, B:335:0x0911, B:337:0x0925, B:338:0x093f, B:339:0x0947, B:290:0x07a7, B:292:0x07b5, B:295:0x07ca, B:297:0x07de, B:299:0x07ec, B:302:0x0800, B:304:0x0818, B:306:0x0824, B:309:0x0837, B:311:0x084b, B:313:0x0896, B:315:0x089d, B:317:0x08a3, B:319:0x08ae, B:321:0x08b5, B:323:0x08bb, B:325:0x08c6, B:326:0x08d7, B:260:0x06e8, B:264:0x06fc, B:266:0x0702, B:269:0x070d, B:220:0x05aa, B:222:0x05df, B:223:0x05fc, B:225:0x0602, B:227:0x0610, B:231:0x0626, B:228:0x061b, B:234:0x062d, B:236:0x0634, B:237:0x0653, B:172:0x0448, B:175:0x0452, B:178:0x045c, B:345:0x0979, B:347:0x0987, B:349:0x0990, B:360:0x09c2, B:350:0x0998, B:352:0x09a1, B:354:0x09a7, B:357:0x09b3, B:359:0x09bd, B:363:0x09c9, B:364:0x09d5, B:366:0x09db, B:372:0x09f4, B:373:0x09ff, B:378:0x0a0c, B:382:0x0a33, B:384:0x0a52, B:386:0x0a60, B:388:0x0a66, B:390:0x0a70, B:391:0x0aa2, B:393:0x0aa8, B:395:0x0ab6, B:399:0x0ac1, B:396:0x0abb, B:400:0x0ac4, B:401:0x0ad3, B:403:0x0ad9, B:405:0x0ae9, B:406:0x0af0, B:408:0x0afc, B:409:0x0b03, B:410:0x0b06, B:412:0x0b0c, B:414:0x0b1e, B:415:0x0b21, B:423:0x0b93, B:425:0x0baf, B:426:0x0bc0, B:428:0x0bc4, B:430:0x0bd0, B:431:0x0bd9, B:433:0x0bdd, B:435:0x0be5, B:436:0x0bf4, B:437:0x0bff, B:443:0x0c3f, B:444:0x0c47, B:446:0x0c4d, B:448:0x0c5f, B:450:0x0c63, B:464:0x0c99, B:467:0x0caf, B:452:0x0c71, B:454:0x0c75, B:456:0x0c7f, B:458:0x0c83, B:379:0x0a11, B:381:0x0a17, B:52:0x012f, B:67:0x01d5, B:76:0x020f, B:84:0x022f, B:90:0x0248, B:114:0x0282, B:41:0x00e1, B:55:0x0138), top: B:602:0x000f, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0911 A[Catch: all -> 0x104a, TryCatch #6 {all -> 0x104a, blocks: (B:3:0x000f, B:19:0x0083, B:115:0x0285, B:117:0x0289, B:123:0x0297, B:124:0x02c0, B:127:0x02d8, B:130:0x0300, B:132:0x0337, B:138:0x034d, B:140:0x0357, B:340:0x095f, B:142:0x037e, B:144:0x0384, B:146:0x039a, B:148:0x03a8, B:151:0x03c8, B:153:0x03ce, B:155:0x03de, B:157:0x03ec, B:159:0x03fc, B:160:0x040b, B:162:0x0410, B:165:0x0426, B:195:0x048a, B:198:0x0494, B:200:0x04a2, B:205:0x04f4, B:201:0x04c3, B:203:0x04d1, B:209:0x0501, B:212:0x0536, B:213:0x0564, B:215:0x0598, B:217:0x059e, B:239:0x0670, B:240:0x067c, B:243:0x0686, B:249:0x06a9, B:246:0x0698, B:252:0x06af, B:254:0x06bb, B:256:0x06c7, B:272:0x0716, B:275:0x0733, B:277:0x0747, B:279:0x0751, B:282:0x0764, B:284:0x0778, B:286:0x0786, B:330:0x08e7, B:332:0x08f1, B:334:0x08f7, B:335:0x0911, B:337:0x0925, B:338:0x093f, B:339:0x0947, B:290:0x07a7, B:292:0x07b5, B:295:0x07ca, B:297:0x07de, B:299:0x07ec, B:302:0x0800, B:304:0x0818, B:306:0x0824, B:309:0x0837, B:311:0x084b, B:313:0x0896, B:315:0x089d, B:317:0x08a3, B:319:0x08ae, B:321:0x08b5, B:323:0x08bb, B:325:0x08c6, B:326:0x08d7, B:260:0x06e8, B:264:0x06fc, B:266:0x0702, B:269:0x070d, B:220:0x05aa, B:222:0x05df, B:223:0x05fc, B:225:0x0602, B:227:0x0610, B:231:0x0626, B:228:0x061b, B:234:0x062d, B:236:0x0634, B:237:0x0653, B:172:0x0448, B:175:0x0452, B:178:0x045c, B:345:0x0979, B:347:0x0987, B:349:0x0990, B:360:0x09c2, B:350:0x0998, B:352:0x09a1, B:354:0x09a7, B:357:0x09b3, B:359:0x09bd, B:363:0x09c9, B:364:0x09d5, B:366:0x09db, B:372:0x09f4, B:373:0x09ff, B:378:0x0a0c, B:382:0x0a33, B:384:0x0a52, B:386:0x0a60, B:388:0x0a66, B:390:0x0a70, B:391:0x0aa2, B:393:0x0aa8, B:395:0x0ab6, B:399:0x0ac1, B:396:0x0abb, B:400:0x0ac4, B:401:0x0ad3, B:403:0x0ad9, B:405:0x0ae9, B:406:0x0af0, B:408:0x0afc, B:409:0x0b03, B:410:0x0b06, B:412:0x0b0c, B:414:0x0b1e, B:415:0x0b21, B:423:0x0b93, B:425:0x0baf, B:426:0x0bc0, B:428:0x0bc4, B:430:0x0bd0, B:431:0x0bd9, B:433:0x0bdd, B:435:0x0be5, B:436:0x0bf4, B:437:0x0bff, B:443:0x0c3f, B:444:0x0c47, B:446:0x0c4d, B:448:0x0c5f, B:450:0x0c63, B:464:0x0c99, B:467:0x0caf, B:452:0x0c71, B:454:0x0c75, B:456:0x0c7f, B:458:0x0c83, B:379:0x0a11, B:381:0x0a17, B:52:0x012f, B:67:0x01d5, B:76:0x020f, B:84:0x022f, B:90:0x0248, B:114:0x0282, B:41:0x00e1, B:55:0x0138), top: B:602:0x000f, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c A[Catch: all -> 0x024c, SQLiteException -> 0x0250, TRY_LEAVE, TryCatch #16 {SQLiteException -> 0x0250, all -> 0x024c, blocks: (B:48:0x0116, B:50:0x011c, B:54:0x0134, B:55:0x0138, B:56:0x014a, B:58:0x0150, B:59:0x0161, B:61:0x016d, B:63:0x0193, B:65:0x01c2, B:70:0x01db, B:71:0x01e4, B:73:0x01ef, B:81:0x0227, B:80:0x0216, B:62:0x0184, B:88:0x0235), top: B:612:0x0116, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134 A[Catch: all -> 0x024c, SQLiteException -> 0x0250, TRY_ENTER, TRY_LEAVE, TryCatch #16 {SQLiteException -> 0x0250, all -> 0x024c, blocks: (B:48:0x0116, B:50:0x011c, B:54:0x0134, B:55:0x0138, B:56:0x014a, B:58:0x0150, B:59:0x0161, B:61:0x016d, B:63:0x0193, B:65:0x01c2, B:70:0x01db, B:71:0x01e4, B:73:0x01ef, B:81:0x0227, B:80:0x0216, B:62:0x0184, B:88:0x0235), top: B:612:0x0116, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:576:0x102d  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x1044 A[Catch: all -> 0x1048, TRY_ENTER, TryCatch #4 {all -> 0x1048, blocks: (B:523:0x0eb0, B:543:0x0f27, B:545:0x0f2d, B:547:0x0f3d, B:550:0x0f44, B:555:0x0f77, B:551:0x0f4c, B:553:0x0f58, B:554:0x0f5e, B:556:0x0f88, B:557:0x0f9f, B:560:0x0fa7, B:561:0x0fac, B:562:0x0fbc, B:564:0x0fd6, B:565:0x0fef, B:566:0x0ff7, B:571:0x1019, B:570:0x1008, B:524:0x0eca, B:526:0x0ed2, B:528:0x0edc, B:530:0x0ee3, B:536:0x0ef3, B:538:0x0efa, B:540:0x0f19, B:542:0x0f20, B:541:0x0f1d, B:537:0x0ef7, B:529:0x0ee0, B:577:0x102e, B:583:0x1044, B:584:0x1047), top: B:599:0x0029, inners: #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zza(String str, long j) {
        String str2;
        SQLiteException sQLiteException;
        Cursor cursor;
        String str3;
        Throwable th;
        boolean z;
        boolean z2;
        String str4;
        int i;
        boolean z3;
        long j2;
        boolean z4;
        zza zzaVar;
        boolean z5;
        zza zzaVar2;
        Long l;
        HashMap hashMap;
        long zza2;
        SecureRandom secureRandom;
        HashMap hashMap2;
        zzkp zzkpVar;
        zzf zzb;
        boolean z6;
        long j3;
        String str5;
        zzcd.zzc.zza zzaVar3;
        zzcd.zzc.zza zzaVar4;
        zzcd.zzg.zza zzaVar5;
        String str6;
        String str7;
        String str8;
        int i2;
        String str9;
        int i3;
        boolean z7;
        String str10;
        zzcd.zzc.zza zzaVar6;
        char c;
        boolean z8;
        SQLiteDatabase c_;
        String string;
        Cursor query;
        String str11;
        String[] strArr;
        zzkp zzkpVar2 = this;
        String str12 = "_npa";
        String str13 = "_ai";
        zze().zze();
        try {
            Cursor cursor2 = null;
            zza zzaVar7 = new zza(zzkpVar2, null);
            zzac zze = zze();
            long j4 = zzkpVar2.zzy;
            Preconditions.checkNotNull(zzaVar7);
            zze.zzc();
            zze.zzaj();
            try {
                try {
                    try {
                        c_ = zze.c_();
                    } catch (Throwable th2) {
                        th = th2;
                        cursor2 = null;
                    }
                } catch (SQLiteException e) {
                    str2 = "";
                    sQLiteException = e;
                }
                try {
                    try {
                        try {
                        } catch (SQLiteException e2) {
                            e = e2;
                            str2 = "";
                            cursor = cursor2;
                            str3 = null;
                        }
                    } catch (SQLiteException e3) {
                        sQLiteException = e3;
                        str2 = "";
                        cursor = null;
                        str3 = null;
                        try {
                            zze.zzq().zze().zza("Data loss. Error selecting raw event. appId", zzex.zza(str3), sQLiteException);
                            if (cursor != null) {
                            }
                            if (zzaVar7.zzc != null) {
                            }
                            z = true;
                            if (z) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(null)) {
                        String[] strArr2 = j4 != -1 ? new String[]{String.valueOf(j4), String.valueOf(j)} : new String[]{String.valueOf(j)};
                        String str14 = j4 != -1 ? "rowid <= ? and " : "";
                        StringBuilder sb = new StringBuilder(str14.length() + 148);
                        sb.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb.append(str14);
                        sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        cursor2 = c_.rawQuery(sb.toString(), strArr2);
                        if (cursor2.moveToFirst()) {
                            str3 = cursor2.getString(0);
                            try {
                                string = cursor2.getString(1);
                                cursor2.close();
                                str2 = "";
                            } catch (SQLiteException e4) {
                                e = e4;
                                str2 = "";
                                cursor = cursor2;
                                sQLiteException = e;
                                zze.zzq().zze().zza("Data loss. Error selecting raw event. appId", zzex.zza(str3), sQLiteException);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (zzaVar7.zzc != null) {
                                }
                                z = true;
                                if (z) {
                                }
                            }
                            try {
                                query = c_.query("raw_events_metadata", new String[]{TtmlNode.TAG_METADATA}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, string}, null, null, "rowid", "2");
                            } catch (SQLiteException e5) {
                                e = e5;
                                cursor = cursor2;
                                sQLiteException = e;
                                zze.zzq().zze().zza("Data loss. Error selecting raw event. appId", zzex.zza(str3), sQLiteException);
                                if (cursor != null) {
                                }
                                if (zzaVar7.zzc != null) {
                                }
                                z = true;
                                if (z) {
                                }
                            }
                            try {
                                if (query.moveToFirst()) {
                                    zze.zzq().zze().zza("Raw event metadata record is missing. appId", zzex.zza(str3));
                                    if (query != null) {
                                        query.close();
                                    }
                                } else {
                                    try {
                                        zzcd.zzg zzgVar = (zzcd.zzg) ((com.google.android.gms.internal.measurement.zzhv) ((zzcd.zzg.zza) zzkt.zza(zzcd.zzg.zzbh(), query.getBlob(0))).zzy());
                                        if (query.moveToNext()) {
                                            zze.zzq().zzh().zza("Get multiple raw event metadata records, expected one. appId", zzex.zza(str3));
                                        }
                                        query.close();
                                        zzaVar7.zza(zzgVar);
                                        if (j4 != -1) {
                                            str11 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                            strArr = new String[]{str3, string, String.valueOf(j4)};
                                        } else {
                                            str11 = "app_id = ? and metadata_fingerprint = ?";
                                            strArr = new String[]{str3, string};
                                        }
                                        cursor = c_.query("raw_events", new String[]{"rowid", AppMeasurementSdk.ConditionalUserProperty.NAME, "timestamp", DataSchemeDataSource.SCHEME_DATA}, str11, strArr, null, null, "rowid", null);
                                        if (cursor.moveToFirst()) {
                                            while (true) {
                                                long j5 = cursor.getLong(0);
                                                try {
                                                    zzcd.zzc.zza zzaVar8 = (zzcd.zzc.zza) zzkt.zza(zzcd.zzc.zzj(), cursor.getBlob(3));
                                                    zzaVar8.zza(cursor.getString(1)).zza(cursor.getLong(2));
                                                    if (!zzaVar7.zza(j5, (zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzaVar8.zzy()))) {
                                                        if (cursor != null) {
                                                            cursor.close();
                                                        }
                                                    }
                                                } catch (IOException e6) {
                                                    zze.zzq().zze().zza("Data loss. Failed to merge raw event. appId", zzex.zza(str3), e6);
                                                }
                                                if (!cursor.moveToNext()) {
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                }
                                            }
                                        } else {
                                            zze.zzq().zzh().zza("Raw event data disappeared while in transaction. appId", zzex.zza(str3));
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                        }
                                    } catch (IOException e7) {
                                        zze.zzq().zze().zza("Data loss. Failed to merge raw event metadata. appId", zzex.zza(str3), e7);
                                        if (query != null) {
                                            query.close();
                                        }
                                    }
                                }
                            } catch (SQLiteException e8) {
                                e = e8;
                                sQLiteException = e;
                                zze.zzq().zze().zza("Data loss. Error selecting raw event. appId", zzex.zza(str3), sQLiteException);
                                if (cursor != null) {
                                }
                                if (zzaVar7.zzc != null) {
                                }
                                z = true;
                                if (z) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                cursor2 = cursor;
                                th = th;
                                if (cursor2 != null) {
                                }
                                throw th;
                            }
                            if (zzaVar7.zzc != null) {
                                z = false;
                                if (z) {
                                }
                            }
                            z = true;
                            if (z) {
                            }
                        } else {
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            str2 = "";
                            if (zzaVar7.zzc != null && !zzaVar7.zzc.isEmpty()) {
                                z = false;
                                if (z) {
                                    zzcd.zzg.zza zzc = zzaVar7.zza.zzbo().zzc();
                                    boolean zze2 = zzkpVar2.zzk.zza().zze(zzaVar7.zza.zzx(), zzat.zzau);
                                    int i4 = -1;
                                    int i5 = -1;
                                    zzcd.zzc.zza zzaVar9 = null;
                                    zzcd.zzc.zza zzaVar10 = null;
                                    int i6 = 0;
                                    boolean z9 = false;
                                    int i7 = 0;
                                    long j6 = 0;
                                    while (true) {
                                        z2 = z9;
                                        str4 = str12;
                                        i = i7;
                                        z3 = zze2;
                                        int i8 = i4;
                                        if (i6 >= zzaVar7.zzc.size()) {
                                            break;
                                        }
                                        zzcd.zzc.zza zzbo = zzaVar7.zzc.get(i6).zzbo();
                                        int i9 = i6;
                                        if (zzc().zzb(zzaVar7.zza.zzx(), zzbo.zzd())) {
                                            zzkpVar2.zzk.zzq().zzh().zza("Dropping blacklisted raw event. appId", zzex.zza(zzaVar7.zza.zzx()), zzkpVar2.zzk.zzi().zza(zzbo.zzd()));
                                            if (!zzc().zzg(zzaVar7.zza.zzx()) && !zzc().zzh(zzaVar7.zza.zzx())) {
                                                z8 = false;
                                                if (!z8 && !"_err".equals(zzbo.zzd())) {
                                                    zzkpVar2.zzk.zzh().zza(zzaVar7.zza.zzx(), 11, "_ev", zzbo.zzd(), 0);
                                                }
                                                j3 = j6;
                                                z9 = z2;
                                                i7 = i;
                                                i4 = i8;
                                                i3 = i9;
                                                str5 = str13;
                                            }
                                            z8 = true;
                                            if (!z8) {
                                                zzkpVar2.zzk.zzh().zza(zzaVar7.zza.zzx(), 11, "_ev", zzbo.zzd(), 0);
                                            }
                                            j3 = j6;
                                            z9 = z2;
                                            i7 = i;
                                            i4 = i8;
                                            i3 = i9;
                                            str5 = str13;
                                        } else {
                                            if (zzlj.zzb()) {
                                                j3 = j6;
                                                if (zzkpVar2.zzk.zza().zze(zzaVar7.zza.zzx(), zzat.zzcs) && zzbo.zzd().equals(zzgy.zza(str13))) {
                                                    zzbo.zza(str13);
                                                    zzkpVar2.zzk.zzq().zzw().zza("Renaming ad_impression to _ai");
                                                    if (zzkpVar2.zzk.zzq().zza(5)) {
                                                        for (int i10 = 0; i10 < zzbo.zzb(); i10++) {
                                                            if ("ad_platform".equals(zzbo.zza(i10).zzb()) && !TextUtils.isEmpty(zzbo.zza(i10).zzd()) && "admob".equalsIgnoreCase(zzbo.zza(i10).zzd())) {
                                                                zzkpVar2.zzk.zzq().zzj().zza("AdMob ad impression logged from app. Potentially duplicative.");
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                j3 = j6;
                                            }
                                            boolean zzc2 = zzc().zzc(zzaVar7.zza.zzx(), zzbo.zzd());
                                            if (zzc2) {
                                                str5 = str13;
                                                zzaVar3 = zzaVar9;
                                            } else {
                                                zzh();
                                                String zzd = zzbo.zzd();
                                                Preconditions.checkNotEmpty(zzd);
                                                str5 = str13;
                                                int hashCode = zzd.hashCode();
                                                zzaVar3 = zzaVar9;
                                                if (hashCode == 94660) {
                                                    if (zzd.equals("_in")) {
                                                        c = 0;
                                                        if (c != 0 || c == 1 || c == 2) {
                                                        }
                                                    }
                                                    c = 65535;
                                                    if (c != 0 || c == 1 || c == 2) {
                                                    }
                                                } else if (hashCode != 95025) {
                                                    if (hashCode == 95027 && zzd.equals("_ui")) {
                                                        c = 1;
                                                        if (c != 0 || c == 1 || c == 2) {
                                                            str6 = "_et";
                                                            zzaVar5 = zzc;
                                                            zzaVar4 = zzaVar10;
                                                            str8 = "_fr";
                                                            str7 = "_e";
                                                            z9 = z2;
                                                            if (zzc2) {
                                                                ArrayList arrayList = new ArrayList(zzbo.zza());
                                                                int i11 = -1;
                                                                int i12 = -1;
                                                                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                                                    if ("value".equals(((zzcd.zze) arrayList.get(i13)).zzb())) {
                                                                        i11 = i13;
                                                                    } else if (FirebaseAnalytics.Param.CURRENCY.equals(((zzcd.zze) arrayList.get(i13)).zzb())) {
                                                                        i12 = i13;
                                                                    }
                                                                }
                                                                if (i11 != -1) {
                                                                    if (!((zzcd.zze) arrayList.get(i11)).zze() && !((zzcd.zze) arrayList.get(i11)).zzi()) {
                                                                        zzkpVar2.zzk.zzq().zzj().zza("Value must be specified with a numeric type.");
                                                                        zzbo.zzb(i11);
                                                                        zza(zzbo, "_c");
                                                                        zza(zzbo, 18, "value");
                                                                    } else {
                                                                        if (i12 != -1) {
                                                                            String zzd2 = ((zzcd.zze) arrayList.get(i12)).zzd();
                                                                            if (zzd2.length() == 3) {
                                                                                int i14 = 0;
                                                                                while (i14 < zzd2.length()) {
                                                                                    int codePointAt = zzd2.codePointAt(i14);
                                                                                    if (Character.isLetter(codePointAt)) {
                                                                                        i14 += Character.charCount(codePointAt);
                                                                                    }
                                                                                }
                                                                                z7 = false;
                                                                            }
                                                                            z7 = true;
                                                                            break;
                                                                        }
                                                                        z7 = true;
                                                                        if (z7) {
                                                                            zzkpVar2.zzk.zzq().zzj().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                                                            zzbo.zzb(i11);
                                                                            zza(zzbo, "_c");
                                                                            zza(zzbo, 19, FirebaseAnalytics.Param.CURRENCY);
                                                                        }
                                                                        if (zzkpVar2.zzk.zza().zze(zzaVar7.zza.zzx(), zzat.zzat)) {
                                                                            i2 = i8;
                                                                            str9 = str6;
                                                                            zzc = zzaVar5;
                                                                        } else if (str7.equals(zzbo.zzd())) {
                                                                            zzh();
                                                                            if (zzkt.zza((zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo.zzy()), str8) == null) {
                                                                                if (zzaVar4 != null && Math.abs(zzaVar4.zzf() - zzbo.zzf()) <= 1000) {
                                                                                    zzcd.zzc.zza zzaVar11 = (zzcd.zzc.zza) ((zzhv.zzb) zzaVar4.clone());
                                                                                    if (zzkpVar2.zza(zzbo, zzaVar11)) {
                                                                                        zzc = zzaVar5;
                                                                                        zzc.zza(i5, zzaVar11);
                                                                                        i4 = i8;
                                                                                        str9 = str6;
                                                                                        zzaVar3 = null;
                                                                                        zzaVar4 = null;
                                                                                        if (!z3 && str7.equals(zzbo.zzd())) {
                                                                                            if (zzbo.zzb() != 0) {
                                                                                                zzkpVar2.zzk.zzq().zzh().zza("Engagement event does not contain any parameters. appId", zzex.zza(zzaVar7.zza.zzx()));
                                                                                            } else {
                                                                                                Long l2 = (Long) zzh().zzb((zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo.zzy()), str9);
                                                                                                if (l2 == null) {
                                                                                                    zzkpVar2.zzk.zzq().zzh().zza("Engagement event does not include duration. appId", zzex.zza(zzaVar7.zza.zzx()));
                                                                                                } else {
                                                                                                    j3 += l2.longValue();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        i3 = i9;
                                                                                        zzaVar7.zzc.set(i3, (zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo.zzy()));
                                                                                        i7 = i + 1;
                                                                                        zzc.zza(zzbo);
                                                                                        zzaVar9 = zzaVar3;
                                                                                        zzaVar10 = zzaVar4;
                                                                                    }
                                                                                }
                                                                                zzc = zzaVar5;
                                                                                zzaVar3 = zzbo;
                                                                                i4 = i;
                                                                                str9 = str6;
                                                                                if (!z3) {
                                                                                    if (zzbo.zzb() != 0) {
                                                                                    }
                                                                                }
                                                                                i3 = i9;
                                                                                zzaVar7.zzc.set(i3, (zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo.zzy()));
                                                                                i7 = i + 1;
                                                                                zzc.zza(zzbo);
                                                                                zzaVar9 = zzaVar3;
                                                                                zzaVar10 = zzaVar4;
                                                                            } else {
                                                                                zzc = zzaVar5;
                                                                                i2 = i8;
                                                                                str9 = str6;
                                                                            }
                                                                        } else {
                                                                            zzc = zzaVar5;
                                                                            if ("_vs".equals(zzbo.zzd())) {
                                                                                zzh();
                                                                                str9 = str6;
                                                                                if (zzkt.zza((zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo.zzy()), str9) == null) {
                                                                                    if (zzaVar3 != null && Math.abs(zzaVar3.zzf() - zzbo.zzf()) <= 1000) {
                                                                                        zzcd.zzc.zza zzaVar12 = (zzcd.zzc.zza) ((zzhv.zzb) zzaVar3.clone());
                                                                                        if (zzkpVar2.zza(zzaVar12, zzbo)) {
                                                                                            zzc.zza(i8, zzaVar12);
                                                                                            i4 = i8;
                                                                                            zzaVar3 = null;
                                                                                            zzaVar4 = null;
                                                                                            if (!z3) {
                                                                                            }
                                                                                            i3 = i9;
                                                                                            zzaVar7.zzc.set(i3, (zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo.zzy()));
                                                                                            i7 = i + 1;
                                                                                            zzc.zza(zzbo);
                                                                                            zzaVar9 = zzaVar3;
                                                                                            zzaVar10 = zzaVar4;
                                                                                        }
                                                                                    }
                                                                                    zzaVar4 = zzbo;
                                                                                    i4 = i8;
                                                                                    i5 = i;
                                                                                    if (!z3) {
                                                                                    }
                                                                                    i3 = i9;
                                                                                    zzaVar7.zzc.set(i3, (zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo.zzy()));
                                                                                    i7 = i + 1;
                                                                                    zzc.zza(zzbo);
                                                                                    zzaVar9 = zzaVar3;
                                                                                    zzaVar10 = zzaVar4;
                                                                                } else {
                                                                                    i2 = i8;
                                                                                }
                                                                            } else {
                                                                                i2 = i8;
                                                                                str9 = str6;
                                                                                if (zzkpVar2.zzk.zza().zze(zzaVar7.zza.zzx(), zzat.zzbn) && "_ab".equals(zzbo.zzd())) {
                                                                                    zzh();
                                                                                    if (zzkt.zza((zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo.zzy()), str9) == null && zzaVar3 != null && Math.abs(zzaVar3.zzf() - zzbo.zzf()) <= 4000) {
                                                                                        zzcd.zzc.zza zzaVar13 = (zzcd.zzc.zza) ((zzhv.zzb) zzaVar3.clone());
                                                                                        zzkpVar2.zzb(zzaVar13, zzbo);
                                                                                        Preconditions.checkArgument(str7.equals(zzaVar13.zzd()));
                                                                                        zzh();
                                                                                        zzcd.zze zza3 = zzkt.zza((zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzaVar13.zzy()), "_sn");
                                                                                        zzh();
                                                                                        zzcd.zze zza4 = zzkt.zza((zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzaVar13.zzy()), "_sc");
                                                                                        zzh();
                                                                                        zzcd.zze zza5 = zzkt.zza((zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzaVar13.zzy()), "_si");
                                                                                        String zzd3 = zza3 != null ? zza3.zzd() : str2;
                                                                                        if (!TextUtils.isEmpty(zzd3)) {
                                                                                            zzh().zza(zzbo, "_sn", zzd3);
                                                                                        }
                                                                                        String zzd4 = zza4 != null ? zza4.zzd() : str2;
                                                                                        if (!TextUtils.isEmpty(zzd4)) {
                                                                                            zzh().zza(zzbo, "_sc", zzd4);
                                                                                        }
                                                                                        if (zza5 != null) {
                                                                                            zzh().zza(zzbo, "_si", Long.valueOf(zza5.zzf()));
                                                                                        }
                                                                                        zzc.zza(i2, zzaVar13);
                                                                                        i4 = i2;
                                                                                        zzaVar3 = null;
                                                                                        if (!z3) {
                                                                                        }
                                                                                        i3 = i9;
                                                                                        zzaVar7.zzc.set(i3, (zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo.zzy()));
                                                                                        i7 = i + 1;
                                                                                        zzc.zza(zzbo);
                                                                                        zzaVar9 = zzaVar3;
                                                                                        zzaVar10 = zzaVar4;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        i4 = i2;
                                                                        if (!z3) {
                                                                        }
                                                                        i3 = i9;
                                                                        zzaVar7.zzc.set(i3, (zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo.zzy()));
                                                                        i7 = i + 1;
                                                                        zzc.zza(zzbo);
                                                                        zzaVar9 = zzaVar3;
                                                                        zzaVar10 = zzaVar4;
                                                                    }
                                                                }
                                                                if (zzkpVar2.zzk.zza().zze(zzaVar7.zza.zzx(), zzat.zzat)) {
                                                                }
                                                                i4 = i2;
                                                                if (!z3) {
                                                                }
                                                                i3 = i9;
                                                                zzaVar7.zzc.set(i3, (zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo.zzy()));
                                                                i7 = i + 1;
                                                                zzc.zza(zzbo);
                                                                zzaVar9 = zzaVar3;
                                                                zzaVar10 = zzaVar4;
                                                            }
                                                            if (zzkpVar2.zzk.zza().zze(zzaVar7.zza.zzx(), zzat.zzat)) {
                                                            }
                                                            i4 = i2;
                                                            if (!z3) {
                                                            }
                                                            i3 = i9;
                                                            zzaVar7.zzc.set(i3, (zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo.zzy()));
                                                            i7 = i + 1;
                                                            zzc.zza(zzbo);
                                                            zzaVar9 = zzaVar3;
                                                            zzaVar10 = zzaVar4;
                                                        }
                                                    }
                                                    c = 65535;
                                                    if (c != 0 || c == 1 || c == 2) {
                                                    }
                                                } else {
                                                    if (zzd.equals("_ug")) {
                                                        c = 2;
                                                        if (c != 0 || c == 1 || c == 2) {
                                                        }
                                                    }
                                                    c = 65535;
                                                    if (c != 0 || c == 1 || c == 2) {
                                                    }
                                                }
                                            }
                                            str6 = "_et";
                                            boolean z10 = false;
                                            boolean z11 = false;
                                            int i15 = 0;
                                            while (true) {
                                                zzaVar5 = zzc;
                                                if (i15 >= zzbo.zzb()) {
                                                    break;
                                                }
                                                if ("_c".equals(zzbo.zza(i15).zzb())) {
                                                    zzbo.zza(i15, (zzcd.zze) ((com.google.android.gms.internal.measurement.zzhv) zzbo.zza(i15).zzbo().zza(1L).zzy()));
                                                    zzaVar6 = zzaVar10;
                                                    z10 = true;
                                                } else if ("_r".equals(zzbo.zza(i15).zzb())) {
                                                    zzaVar6 = zzaVar10;
                                                    zzbo.zza(i15, (zzcd.zze) ((com.google.android.gms.internal.measurement.zzhv) zzbo.zza(i15).zzbo().zza(1L).zzy()));
                                                    z11 = true;
                                                } else {
                                                    zzaVar6 = zzaVar10;
                                                }
                                                i15++;
                                                zzc = zzaVar5;
                                                zzaVar10 = zzaVar6;
                                            }
                                            zzaVar4 = zzaVar10;
                                            if (z10 || !zzc2) {
                                                str10 = "_fr";
                                                str7 = "_e";
                                            } else {
                                                zzkpVar2.zzk.zzq().zzw().zza("Marking event as conversion", zzkpVar2.zzk.zzi().zza(zzbo.zzd()));
                                                str10 = "_fr";
                                                str7 = "_e";
                                                zzbo.zza(zzcd.zze.zzm().zza("_c").zza(1L));
                                            }
                                            if (!z11) {
                                                zzkpVar2.zzk.zzq().zzw().zza("Marking event as real-time", zzkpVar2.zzk.zzi().zza(zzbo.zzd()));
                                                zzbo.zza(zzcd.zze.zzm().zza("_r").zza(1L));
                                            }
                                            str8 = str10;
                                            if (zze().zza(zzy(), zzaVar7.zza.zzx(), false, false, false, false, true).zze > zzkpVar2.zzk.zza().zzc(zzaVar7.zza.zzx())) {
                                                zza(zzbo, "_r");
                                            } else {
                                                z2 = true;
                                            }
                                            if (zzkx.zza(zzbo.zzd()) && zzc2 && zze().zza(zzy(), zzaVar7.zza.zzx(), false, false, true, false, false).zzc > zzkpVar2.zzk.zza().zzb(zzaVar7.zza.zzx(), zzat.zzm)) {
                                                zzkpVar2.zzk.zzq().zzh().zza("Too many conversions. Not logging as conversion. appId", zzex.zza(zzaVar7.zza.zzx()));
                                                int i16 = -1;
                                                zzcd.zze.zza zzaVar14 = null;
                                                boolean z12 = false;
                                                for (int i17 = 0; i17 < zzbo.zzb(); i17++) {
                                                    zzcd.zze zza6 = zzbo.zza(i17);
                                                    if ("_c".equals(zza6.zzb())) {
                                                        zzaVar14 = zza6.zzbo();
                                                        i16 = i17;
                                                    } else if ("_err".equals(zza6.zzb())) {
                                                        z12 = true;
                                                    }
                                                }
                                                if (z12 && zzaVar14 != null) {
                                                    zzbo.zzb(i16);
                                                } else if (zzaVar14 != null) {
                                                    zzbo.zza(i16, (zzcd.zze) ((com.google.android.gms.internal.measurement.zzhv) ((zzcd.zze.zza) ((zzhv.zzb) zzaVar14.clone())).zza("_err").zza(10L).zzy()));
                                                } else {
                                                    zzkpVar2.zzk.zzq().zze().zza("Did not find conversion parameter. appId", zzex.zza(zzaVar7.zza.zzx()));
                                                }
                                            }
                                            z9 = z2;
                                            if (zzc2) {
                                            }
                                            if (zzkpVar2.zzk.zza().zze(zzaVar7.zza.zzx(), zzat.zzat)) {
                                            }
                                            i4 = i2;
                                            if (!z3) {
                                            }
                                            i3 = i9;
                                            zzaVar7.zzc.set(i3, (zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo.zzy()));
                                            i7 = i + 1;
                                            zzc.zza(zzbo);
                                            zzaVar9 = zzaVar3;
                                            zzaVar10 = zzaVar4;
                                        }
                                        i6 = i3 + 1;
                                        str13 = str5;
                                        str12 = str4;
                                        zze2 = z3;
                                        j6 = j3;
                                    }
                                    long j7 = j6;
                                    if (z3) {
                                        int i18 = i;
                                        long j8 = j7;
                                        int i19 = 0;
                                        while (i19 < i18) {
                                            zzcd.zzc zzb2 = zzc.zzb(i19);
                                            if ("_e".equals(zzb2.zzc())) {
                                                zzh();
                                                if (zzkt.zza(zzb2, "_fr") != null) {
                                                    zzc.zzc(i19);
                                                    i18--;
                                                    i19--;
                                                    i19++;
                                                }
                                            }
                                            zzh();
                                            zzcd.zze zza7 = zzkt.zza(zzb2, "_et");
                                            if (zza7 != null) {
                                                Long valueOf = zza7.zze() ? Long.valueOf(zza7.zzf()) : null;
                                                if (valueOf != null && valueOf.longValue() > 0) {
                                                    j8 += valueOf.longValue();
                                                }
                                            }
                                            i19++;
                                        }
                                        j2 = j8;
                                    } else {
                                        j2 = j7;
                                    }
                                    zzkpVar2.zza(zzc, j2, false);
                                    Iterator<zzcd.zzc> it = zzc.zza().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if ("_s".equals(it.next().zzc())) {
                                                z4 = true;
                                                break;
                                            }
                                        } else {
                                            z4 = false;
                                            break;
                                        }
                                    }
                                    if (z4) {
                                        zze().zzb(zzc.zzj(), "_se");
                                    }
                                    if (zzkt.zza(zzc, "_sid") >= 0) {
                                        zzkpVar2.zza(zzc, j2, true);
                                    } else {
                                        int zza8 = zzkt.zza(zzc, "_se");
                                        if (zza8 >= 0) {
                                            zzc.zze(zza8);
                                            zzkpVar2.zzk.zzq().zze().zza("Session engagement user property is in the bundle without session ID. appId", zzex.zza(zzaVar7.zza.zzx()));
                                        }
                                    }
                                    zzkt zzh = zzh();
                                    zzh.zzq().zzw().zza("Checking account type status for ad personalization signals");
                                    if (zzh.zzj().zze(zzc.zzj()) && (zzb = zzh.zzi().zzb(zzc.zzj())) != null && zzb.zzaf() && zzh.zzk().zzi()) {
                                        zzh.zzq().zzv().zza("Turning off ad personalization due to account type");
                                        zzcd.zzk zzkVar = (zzcd.zzk) ((com.google.android.gms.internal.measurement.zzhv) zzcd.zzk.zzj().zza(str4).zza(zzh.zzk().zzg()).zzb(1L).zzy());
                                        int i20 = 0;
                                        while (true) {
                                            if (i20 >= zzc.zze()) {
                                                z6 = false;
                                                break;
                                            } else if (str4.equals(zzc.zzd(i20).zzc())) {
                                                zzc.zza(i20, zzkVar);
                                                z6 = true;
                                                break;
                                            } else {
                                                i20++;
                                            }
                                        }
                                        if (!z6) {
                                            zzc.zza(zzkVar);
                                        }
                                    }
                                    zzc.zzb(Long.MAX_VALUE).zzc(Long.MIN_VALUE);
                                    for (int i21 = 0; i21 < zzc.zzb(); i21++) {
                                        zzcd.zzc zzb3 = zzc.zzb(i21);
                                        if (zzb3.zze() < zzc.zzf()) {
                                            zzc.zzb(zzb3.zze());
                                        }
                                        if (zzb3.zze() > zzc.zzg()) {
                                            zzc.zzc(zzb3.zze());
                                        }
                                    }
                                    if (zzov.zzb() && zzkpVar2.zzk.zza().zze(zzc.zzj(), zzat.zzcn)) {
                                        zzc.zzq();
                                    }
                                    zzc.zzp().zzc(zzf().zza(zzc.zzj(), zzc.zza(), zzc.zzd(), Long.valueOf(zzc.zzf()), Long.valueOf(zzc.zzg())));
                                    if (zzkpVar2.zzk.zza().zzi(zzaVar7.zza.zzx())) {
                                        try {
                                            HashMap hashMap3 = new HashMap();
                                            ArrayList arrayList2 = new ArrayList();
                                            SecureRandom zzg = zzkpVar2.zzk.zzh().zzg();
                                            int i22 = 0;
                                            while (i22 < zzc.zzb()) {
                                                zzcd.zzc.zza zzbo2 = zzc.zzb(i22).zzbo();
                                                if (zzbo2.zzd().equals("_ep")) {
                                                    String str15 = (String) zzh().zzb((zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo2.zzy()), "_en");
                                                    zzan zzanVar = (zzan) hashMap3.get(str15);
                                                    if (zzanVar == null) {
                                                        zzanVar = zze().zza(zzaVar7.zza.zzx(), str15);
                                                        hashMap3.put(str15, zzanVar);
                                                    }
                                                    if (zzanVar.zzi == null) {
                                                        if (zzanVar.zzj.longValue() > 1) {
                                                            zzh().zza(zzbo2, "_sr", zzanVar.zzj);
                                                        }
                                                        if (zzanVar.zzk != null && zzanVar.zzk.booleanValue()) {
                                                            zzh().zza(zzbo2, "_efs", (Object) 1L);
                                                        }
                                                        arrayList2.add((zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo2.zzy()));
                                                    }
                                                    zzc.zza(i22, zzbo2);
                                                } else {
                                                    long zzf = zzc().zzf(zzaVar7.zza.zzx());
                                                    zzkpVar2.zzk.zzh();
                                                    long zza9 = zzkx.zza(zzbo2.zzf(), zzf);
                                                    zzcd.zzc zzcVar = (zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo2.zzy());
                                                    Long l3 = 1L;
                                                    if (!TextUtils.isEmpty("_dbg") && l3 != null) {
                                                        Iterator<zzcd.zze> it2 = zzcVar.zza().iterator();
                                                        while (true) {
                                                            if (!it2.hasNext()) {
                                                                break;
                                                            }
                                                            zzcd.zze next = it2.next();
                                                            Iterator<zzcd.zze> it3 = it2;
                                                            if (!"_dbg".equals(next.zzb())) {
                                                                it2 = it3;
                                                            } else if (((l3 instanceof Long) && l3.equals(Long.valueOf(next.zzf()))) || (((l3 instanceof String) && l3.equals(next.zzd())) || ((l3 instanceof Double) && l3.equals(Double.valueOf(next.zzj()))))) {
                                                                z5 = true;
                                                            }
                                                        }
                                                    }
                                                    z5 = false;
                                                    int zzd5 = !z5 ? zzc().zzd(zzaVar7.zza.zzx(), zzbo2.zzd()) : 1;
                                                    if (zzd5 <= 0) {
                                                        zzkpVar2.zzk.zzq().zzh().zza("Sample rate must be positive. event, rate", zzbo2.zzd(), Integer.valueOf(zzd5));
                                                        arrayList2.add((zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo2.zzy()));
                                                        zzc.zza(i22, zzbo2);
                                                    } else {
                                                        zzan zzanVar2 = (zzan) hashMap3.get(zzbo2.zzd());
                                                        if (zzanVar2 == null && (zzanVar2 = zze().zza(zzaVar7.zza.zzx(), zzbo2.zzd())) == null) {
                                                            zzkpVar2.zzk.zzq().zzh().zza("Event being bundled has no eventAggregate. appId, eventName", zzaVar7.zza.zzx(), zzbo2.zzd());
                                                            zzanVar2 = new zzan(zzaVar7.zza.zzx(), zzbo2.zzd(), 1L, 1L, 1L, zzbo2.zzf(), 0L, null, null, null, null);
                                                        }
                                                        Long l4 = (Long) zzh().zzb((zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo2.zzy()), "_eid");
                                                        Boolean valueOf2 = Boolean.valueOf(l4 != null);
                                                        if (zzd5 == 1) {
                                                            arrayList2.add((zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo2.zzy()));
                                                            if (valueOf2.booleanValue() && (zzanVar2.zzi != null || zzanVar2.zzj != null || zzanVar2.zzk != null)) {
                                                                hashMap3.put(zzbo2.zzd(), zzanVar2.zza(null, null, null));
                                                            }
                                                            zzc.zza(i22, zzbo2);
                                                        } else {
                                                            if (zzg.nextInt(zzd5) == 0) {
                                                                zzaVar2 = zzaVar7;
                                                                SecureRandom secureRandom2 = zzg;
                                                                long j9 = zzd5;
                                                                zzh().zza(zzbo2, "_sr", Long.valueOf(j9));
                                                                arrayList2.add((zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo2.zzy()));
                                                                if (valueOf2.booleanValue()) {
                                                                    zzanVar2 = zzanVar2.zza(null, Long.valueOf(j9), null);
                                                                }
                                                                hashMap3.put(zzbo2.zzd(), zzanVar2.zza(zzbo2.zzf(), zza9));
                                                                hashMap2 = hashMap3;
                                                                secureRandom = secureRandom2;
                                                            } else {
                                                                zzaVar2 = zzaVar7;
                                                                SecureRandom secureRandom3 = zzg;
                                                                if (zzanVar2.zzh != null) {
                                                                    zza2 = zzanVar2.zzh.longValue();
                                                                    l = l4;
                                                                    hashMap = hashMap3;
                                                                } else {
                                                                    this.zzk.zzh();
                                                                    l = l4;
                                                                    hashMap = hashMap3;
                                                                    zza2 = zzkx.zza(zzbo2.zzg(), zzf);
                                                                }
                                                                if (zza2 != zza9) {
                                                                    secureRandom = secureRandom3;
                                                                    zzh().zza(zzbo2, "_efs", (Object) 1L);
                                                                    long j10 = zzd5;
                                                                    zzh().zza(zzbo2, "_sr", Long.valueOf(j10));
                                                                    arrayList2.add((zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzbo2.zzy()));
                                                                    if (valueOf2.booleanValue()) {
                                                                        zzanVar2 = zzanVar2.zza(null, Long.valueOf(j10), true);
                                                                    }
                                                                    hashMap2 = hashMap;
                                                                    hashMap2.put(zzbo2.zzd(), zzanVar2.zza(zzbo2.zzf(), zza9));
                                                                } else {
                                                                    secureRandom = secureRandom3;
                                                                    hashMap2 = hashMap;
                                                                    if (valueOf2.booleanValue()) {
                                                                        hashMap2.put(zzbo2.zzd(), zzanVar2.zza(l, null, null));
                                                                    }
                                                                }
                                                            }
                                                            zzc.zza(i22, zzbo2);
                                                            i22++;
                                                            zzkpVar2 = this;
                                                            hashMap3 = hashMap2;
                                                            zzg = secureRandom;
                                                            zzaVar7 = zzaVar2;
                                                        }
                                                    }
                                                }
                                                zzaVar2 = zzaVar7;
                                                secureRandom = zzg;
                                                hashMap2 = hashMap3;
                                                i22++;
                                                zzkpVar2 = this;
                                                hashMap3 = hashMap2;
                                                zzg = secureRandom;
                                                zzaVar7 = zzaVar2;
                                            }
                                            zza zzaVar15 = zzaVar7;
                                            HashMap hashMap4 = hashMap3;
                                            if (arrayList2.size() < zzc.zzb()) {
                                                zzc.zzc().zza(arrayList2);
                                            }
                                            for (Map.Entry entry : hashMap4.entrySet()) {
                                                zze().zza((zzan) entry.getValue());
                                            }
                                            zzaVar = zzaVar15;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            Throwable th6 = th;
                                            zze().zzg();
                                            throw th6;
                                        }
                                    } else {
                                        zzaVar = zzaVar7;
                                    }
                                    String zzx = zzaVar.zza.zzx();
                                    zzf zzb4 = zze().zzb(zzx);
                                    if (zzb4 == null) {
                                        zzkpVar = this;
                                        zzkpVar.zzk.zzq().zze().zza("Bundling raw events w/o app info. appId", zzex.zza(zzaVar.zza.zzx()));
                                    } else {
                                        zzkpVar = this;
                                        if (zzc.zzb() > 0) {
                                            long zzk = zzb4.zzk();
                                            if (zzk != 0) {
                                                zzc.zze(zzk);
                                            } else {
                                                zzc.zzi();
                                            }
                                            long zzj = zzb4.zzj();
                                            if (zzj != 0) {
                                                zzk = zzj;
                                            }
                                            if (zzk != 0) {
                                                zzc.zzd(zzk);
                                            } else {
                                                zzc.zzh();
                                            }
                                            zzb4.zzv();
                                            zzc.zzg((int) zzb4.zzs());
                                            zzb4.zza(zzc.zzf());
                                            zzb4.zzb(zzc.zzg());
                                            String zzad = zzb4.zzad();
                                            if (zzad != null) {
                                                zzc.zzj(zzad);
                                            } else {
                                                zzc.zzn();
                                            }
                                            zze().zza(zzb4);
                                        }
                                    }
                                    if (zzc.zzb() > 0) {
                                        zzca.zzb zza10 = zzc().zza(zzaVar.zza.zzx());
                                        if (zza10 != null && zza10.zza()) {
                                            zzc.zzi(zza10.zzb());
                                            zze().zza((zzcd.zzg) ((com.google.android.gms.internal.measurement.zzhv) zzc.zzy()), z2);
                                        }
                                        if (TextUtils.isEmpty(zzaVar.zza.zzam())) {
                                            zzc.zzi(-1L);
                                        } else {
                                            zzkpVar.zzk.zzq().zzh().zza("Did not find measurement config or missing version info. appId", zzex.zza(zzaVar.zza.zzx()));
                                        }
                                        zze().zza((zzcd.zzg) ((com.google.android.gms.internal.measurement.zzhv) zzc.zzy()), z2);
                                    }
                                    zzac zze3 = zze();
                                    List<Long> list = zzaVar.zzb;
                                    Preconditions.checkNotNull(list);
                                    zze3.zzc();
                                    zze3.zzaj();
                                    StringBuilder sb2 = new StringBuilder("rowid in (");
                                    for (int i23 = 0; i23 < list.size(); i23++) {
                                        if (i23 != 0) {
                                            sb2.append(",");
                                        }
                                        sb2.append(list.get(i23).longValue());
                                    }
                                    sb2.append(")");
                                    int delete = zze3.c_().delete("raw_events", sb2.toString(), null);
                                    if (delete != list.size()) {
                                        zze3.zzq().zze().zza("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
                                    }
                                    zzac zze4 = zze();
                                    try {
                                        zze4.c_().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{zzx, zzx});
                                    } catch (SQLiteException e9) {
                                        zze4.zzq().zze().zza("Failed to remove unused event metadata. appId", zzex.zza(zzx), e9);
                                    }
                                    zze().b_();
                                    zze().zzg();
                                    return true;
                                }
                                zze().b_();
                                zze().zzg();
                                return false;
                            }
                            z = true;
                            if (z) {
                            }
                        }
                    } else {
                        String[] strArr3 = j4 != -1 ? new String[]{null, String.valueOf(j4)} : new String[]{null};
                        String str16 = j4 != -1 ? " and rowid <= ?" : "";
                        StringBuilder sb3 = new StringBuilder(str16.length() + 84);
                        sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb3.append(str16);
                        sb3.append(" order by rowid limit 1;");
                        cursor2 = c_.rawQuery(sb3.toString(), strArr3);
                        if (cursor2.moveToFirst()) {
                            string = cursor2.getString(0);
                            cursor2.close();
                            str3 = null;
                            str2 = "";
                            query = c_.query("raw_events_metadata", new String[]{TtmlNode.TAG_METADATA}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, string}, null, null, "rowid", "2");
                            if (query.moveToFirst()) {
                            }
                            if (zzaVar7.zzc != null) {
                            }
                            z = true;
                            if (z) {
                            }
                        } else {
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            str2 = "";
                            if (zzaVar7.zzc != null) {
                            }
                            z = true;
                            if (z) {
                            }
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
            Throwable th62 = th;
            zze().zzg();
            throw th62;
        }
    }

    private final void zza(zzcd.zzg.zza zzaVar, long j, boolean z) {
        zzky zzkyVar;
        String str = z ? "_se" : "_lte";
        zzky zzc = zze().zzc(zzaVar.zzj(), str);
        if (zzc == null || zzc.zze == null) {
            zzkyVar = new zzky(zzaVar.zzj(), "auto", str, this.zzk.zzl().currentTimeMillis(), Long.valueOf(j));
        } else {
            zzkyVar = new zzky(zzaVar.zzj(), "auto", str, this.zzk.zzl().currentTimeMillis(), Long.valueOf(((Long) zzc.zze).longValue() + j));
        }
        zzcd.zzk zzkVar = (zzcd.zzk) ((com.google.android.gms.internal.measurement.zzhv) zzcd.zzk.zzj().zza(str).zza(this.zzk.zzl().currentTimeMillis()).zzb(((Long) zzkyVar.zze).longValue()).zzy());
        boolean z2 = false;
        int zza2 = zzkt.zza(zzaVar, str);
        if (zza2 >= 0) {
            zzaVar.zza(zza2, zzkVar);
            z2 = true;
        }
        if (!z2) {
            zzaVar.zza(zzkVar);
        }
        if (j > 0) {
            zze().zza(zzkyVar);
            this.zzk.zzq().zzw().zza("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", zzkyVar.zze);
        }
    }

    private final boolean zza(zzcd.zzc.zza zzaVar, zzcd.zzc.zza zzaVar2) {
        Preconditions.checkArgument("_e".equals(zzaVar.zzd()));
        zzh();
        zzcd.zze zza2 = zzkt.zza((zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzaVar.zzy()), "_sc");
        String zzd = zza2 == null ? null : zza2.zzd();
        zzh();
        zzcd.zze zza3 = zzkt.zza((zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzaVar2.zzy()), "_pc");
        String zzd2 = zza3 != null ? zza3.zzd() : null;
        if (zzd2 == null || !zzd2.equals(zzd)) {
            return false;
        }
        zzb(zzaVar, zzaVar2);
        return true;
    }

    private final void zzb(zzcd.zzc.zza zzaVar, zzcd.zzc.zza zzaVar2) {
        Preconditions.checkArgument("_e".equals(zzaVar.zzd()));
        zzh();
        zzcd.zze zza2 = zzkt.zza((zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzaVar.zzy()), "_et");
        if (!zza2.zze() || zza2.zzf() <= 0) {
            return;
        }
        long zzf = zza2.zzf();
        zzh();
        zzcd.zze zza3 = zzkt.zza((zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) zzaVar2.zzy()), "_et");
        if (zza3 != null && zza3.zzf() > 0) {
            zzf += zza3.zzf();
        }
        zzh().zza(zzaVar2, "_et", Long.valueOf(zzf));
        zzh().zza(zzaVar, "_fr", (Object) 1L);
    }

    private static void zza(zzcd.zzc.zza zzaVar, String str) {
        List<zzcd.zze> zza2 = zzaVar.zza();
        for (int i = 0; i < zza2.size(); i++) {
            if (str.equals(zza2.get(i).zzb())) {
                zzaVar.zzb(i);
                return;
            }
        }
    }

    private static void zza(zzcd.zzc.zza zzaVar, int i, String str) {
        List<zzcd.zze> zza2 = zzaVar.zza();
        for (int i2 = 0; i2 < zza2.size(); i2++) {
            if ("_err".equals(zza2.get(i2).zzb())) {
                return;
            }
        }
        zzaVar.zza((zzcd.zze) ((com.google.android.gms.internal.measurement.zzhv) zzcd.zze.zzm().zza("_err").zza(Long.valueOf(i).longValue()).zzy())).zza((zzcd.zze) ((com.google.android.gms.internal.measurement.zzhv) zzcd.zze.zzm().zza("_ev").zzb(str).zzy()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0158, code lost:
        r8.zzk.zzb().zze.zza(r8.zzk.zzl().currentTimeMillis());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(int i, Throwable th, byte[] bArr, String str) {
        zzac zze;
        long longValue;
        zzx();
        zzn();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzs = false;
                zzac();
            }
        }
        List<Long> list = this.zzw;
        this.zzw = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.zzk.zzb().zzc.zza(this.zzk.zzl().currentTimeMillis());
                this.zzk.zzb().zzd.zza(0L);
                zzab();
                this.zzk.zzq().zzw().zza("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                zze().zze();
                try {
                    for (Long l : list) {
                        try {
                            zze = zze();
                            longValue = l.longValue();
                            zze.zzc();
                            zze.zzaj();
                            try {
                            } catch (SQLiteException e) {
                                zze.zzq().zze().zza("Failed to delete a bundle in a queue table", e);
                                throw e;
                                break;
                            }
                        } catch (SQLiteException e2) {
                            if (this.zzx == null || !this.zzx.contains(l)) {
                                throw e2;
                            }
                        }
                        if (zze.c_().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                            break;
                        }
                    }
                    zze().b_();
                    zze().zzg();
                    this.zzx = null;
                    if (zzd().zze() && zzaa()) {
                        zzo();
                    } else {
                        this.zzy = -1L;
                        zzab();
                    }
                    this.zzn = 0L;
                } catch (Throwable th2) {
                    zze().zzg();
                    throw th2;
                }
            } catch (SQLiteException e3) {
                this.zzk.zzq().zze().zza("Database error while trying to delete uploaded bundles", e3);
                this.zzn = this.zzk.zzl().elapsedRealtime();
                this.zzk.zzq().zzw().zza("Disable upload, time", Long.valueOf(this.zzn));
            }
        } else {
            this.zzk.zzq().zzw().zza("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.zzk.zzb().zzd.zza(this.zzk.zzl().currentTimeMillis());
            if (i != 503 && i != 429) {
                z = false;
            }
            zze().zza(list);
            zzab();
        }
    }

    private final boolean zzaa() {
        zzx();
        zzn();
        return zze().zzx() || !TextUtils.isEmpty(zze().d_());
    }

    private final void zza(zzf zzfVar) {
        ArrayMap arrayMap;
        zzx();
        if (zznq.zzb() && this.zzk.zza().zze(zzfVar.zzc(), zzat.zzbj)) {
            if (TextUtils.isEmpty(zzfVar.zze()) && TextUtils.isEmpty(zzfVar.zzg()) && TextUtils.isEmpty(zzfVar.zzf())) {
                zza(zzfVar.zzc(), 204, null, null, null);
                return;
            }
        } else if (TextUtils.isEmpty(zzfVar.zze()) && TextUtils.isEmpty(zzfVar.zzf())) {
            zza(zzfVar.zzc(), 204, null, null, null);
            return;
        }
        String zza2 = this.zzk.zza().zza(zzfVar);
        try {
            URL url = new URL(zza2);
            this.zzk.zzq().zzw().zza("Fetching remote configuration", zzfVar.zzc());
            zzca.zzb zza3 = zzc().zza(zzfVar.zzc());
            String zzb = zzc().zzb(zzfVar.zzc());
            if (zza3 == null || TextUtils.isEmpty(zzb)) {
                arrayMap = null;
            } else {
                ArrayMap arrayMap2 = new ArrayMap();
                arrayMap2.put("If-Modified-Since", zzb);
                arrayMap = arrayMap2;
            }
            this.zzr = true;
            zzfa zzd = zzd();
            String zzc = zzfVar.zzc();
            zzkq zzkqVar = new zzkq(this);
            zzd.zzc();
            zzd.zzaj();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzkqVar);
            zzd.zzp().zzc(new zzfe(zzd, zzc, url, null, arrayMap, zzkqVar));
        } catch (MalformedURLException unused) {
            this.zzk.zzq().zze().zza("Failed to parse config URL. Not fetching. appId", zzex.zza(zzfVar.zzc()), zza2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
        r6.zzk.zzb().zze.zza(r6.zzk.zzl().currentTimeMillis());
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a A[Catch: all -> 0x018d, TryCatch #2 {all -> 0x0196, blocks: (B:4:0x000c, B:5:0x000e, B:64:0x0180, B:43:0x00f6, B:50:0x0117, B:6:0x0029, B:15:0x0045, B:63:0x0179, B:20:0x0061, B:27:0x00b0, B:28:0x00c5, B:31:0x00cd, B:34:0x00d9, B:36:0x00df, B:41:0x00ec, B:53:0x0124, B:55:0x013a, B:57:0x0162, B:59:0x016c, B:61:0x0172, B:62:0x0176, B:56:0x014a, B:46:0x0103, B:48:0x010d), top: B:73:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a A[Catch: all -> 0x018d, TryCatch #2 {all -> 0x0196, blocks: (B:4:0x000c, B:5:0x000e, B:64:0x0180, B:43:0x00f6, B:50:0x0117, B:6:0x0029, B:15:0x0045, B:63:0x0179, B:20:0x0061, B:27:0x00b0, B:28:0x00c5, B:31:0x00cd, B:34:0x00d9, B:36:0x00df, B:41:0x00ec, B:53:0x0124, B:55:0x013a, B:57:0x0162, B:59:0x016c, B:61:0x0172, B:62:0x0176, B:56:0x014a, B:46:0x0103, B:48:0x010d), top: B:73:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        zzx();
        zzn();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzr = false;
                zzac();
            }
        }
        this.zzk.zzq().zzw().zza("onConfigFetched. Response size", Integer.valueOf(bArr.length));
        zze().zze();
        zzf zzb = zze().zzb(str);
        boolean z = true;
        boolean z2 = (i == 200 || i == 204 || i == 304) && th == null;
        if (zzb == null) {
            this.zzk.zzq().zzh().zza("App does not exist in onConfigFetched. appId", zzex.zza(str));
        } else {
            if (!z2 && i != 404) {
                zzb.zzi(this.zzk.zzl().currentTimeMillis());
                zze().zza(zzb);
                this.zzk.zzq().zzw().zza("Fetching config failed. code, error", Integer.valueOf(i), th);
                zzc().zzc(str);
                this.zzk.zzb().zzd.zza(this.zzk.zzl().currentTimeMillis());
                if (i != 503 && i != 429) {
                    z = false;
                }
                zzab();
            }
            List<String> list = map != null ? map.get("Last-Modified") : null;
            String str2 = (list == null || list.size() <= 0) ? null : list.get(0);
            if (i != 404 && i != 304) {
                if (!zzc().zza(str, bArr, str2)) {
                    zze().zzg();
                    return;
                }
                zzb.zzh(this.zzk.zzl().currentTimeMillis());
                zze().zza(zzb);
                if (i != 404) {
                    this.zzk.zzq().zzj().zza("Config not found. Using empty config. appId", str);
                } else {
                    this.zzk.zzq().zzw().zza("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                }
                if (!zzd().zze() && zzaa()) {
                    zzo();
                } else {
                    zzab();
                }
            }
            if (zzc().zza(str) == null && !zzc().zza(str, null, null)) {
                zze().zzg();
                return;
            }
            zzb.zzh(this.zzk.zzl().currentTimeMillis());
            zze().zza(zzb);
            if (i != 404) {
            }
            if (!zzd().zze()) {
            }
            zzab();
        }
        zze().b_();
        zze().zzg();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzab() {
        long max;
        long j;
        zzx();
        zzn();
        if (this.zzn > 0) {
            long abs = 3600000 - Math.abs(this.zzk.zzl().elapsedRealtime() - this.zzn);
            if (abs > 0) {
                this.zzk.zzq().zzw().zza("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                zzv().zzb();
                zzw().zze();
                return;
            }
            this.zzn = 0L;
        }
        if (!this.zzk.zzaf() || !zzaa()) {
            this.zzk.zzq().zzw().zza("Nothing to upload or uploading impossible");
            zzv().zzb();
            zzw().zze();
            return;
        }
        long currentTimeMillis = this.zzk.zzl().currentTimeMillis();
        long max2 = Math.max(0L, zzat.zzz.zza(null).longValue());
        boolean z = zze().zzy() || zze().e_();
        if (z) {
            String zzu = this.zzk.zza().zzu();
            if (!TextUtils.isEmpty(zzu) && !".none.".equals(zzu)) {
                max = Math.max(0L, zzat.zzu.zza(null).longValue());
            } else {
                max = Math.max(0L, zzat.zzt.zza(null).longValue());
            }
        } else {
            max = Math.max(0L, zzat.zzs.zza(null).longValue());
        }
        long zza2 = this.zzk.zzb().zzc.zza();
        long zza3 = this.zzk.zzb().zzd.zza();
        long j2 = max;
        long max3 = Math.max(zze().zzv(), zze().zzw());
        if (max3 != 0) {
            long abs2 = currentTimeMillis - Math.abs(max3 - currentTimeMillis);
            long abs3 = currentTimeMillis - Math.abs(zza2 - currentTimeMillis);
            long abs4 = currentTimeMillis - Math.abs(zza3 - currentTimeMillis);
            long max4 = Math.max(abs3, abs4);
            j = abs2 + max2;
            if (z && max4 > 0) {
                j = Math.min(abs2, max4) + j2;
            }
            if (!zzh().zza(max4, j2)) {
                j = max4 + j2;
            }
            if (abs4 != 0 && abs4 >= abs2) {
                for (int i = 0; i < Math.min(20, Math.max(0, zzat.zzab.zza(null).intValue())); i++) {
                    j += Math.max(0L, zzat.zzaa.zza(null).longValue()) * (1 << i);
                    if (j > abs4) {
                        break;
                    }
                }
            }
            if (j != 0) {
                this.zzk.zzq().zzw().zza("Next upload time is 0");
                zzv().zzb();
                zzw().zze();
                return;
            } else if (!zzd().zze()) {
                this.zzk.zzq().zzw().zza("No network");
                zzv().zza();
                zzw().zze();
                return;
            } else {
                long zza4 = this.zzk.zzb().zze.zza();
                long max5 = Math.max(0L, zzat.zzq.zza(null).longValue());
                if (!zzh().zza(zza4, max5)) {
                    j = Math.max(j, zza4 + max5);
                }
                zzv().zzb();
                long currentTimeMillis2 = j - this.zzk.zzl().currentTimeMillis();
                if (currentTimeMillis2 <= 0) {
                    currentTimeMillis2 = Math.max(0L, zzat.zzv.zza(null).longValue());
                    this.zzk.zzb().zzc.zza(this.zzk.zzl().currentTimeMillis());
                }
                this.zzk.zzq().zzw().zza("Upload scheduled in approximately ms", Long.valueOf(currentTimeMillis2));
                zzw().zza(currentTimeMillis2);
                return;
            }
        }
        j = 0;
        if (j != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(Runnable runnable) {
        zzx();
        if (this.zzo == null) {
            this.zzo = new ArrayList();
        }
        this.zzo.add(runnable);
    }

    private final void zzac() {
        zzx();
        if (this.zzr || this.zzs || this.zzt) {
            this.zzk.zzq().zzw().zza("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzr), Boolean.valueOf(this.zzs), Boolean.valueOf(this.zzt));
            return;
        }
        this.zzk.zzq().zzw().zza("Stopping uploading service(s)");
        List<Runnable> list = this.zzo;
        if (list == null) {
            return;
        }
        for (Runnable runnable : list) {
            runnable.run();
        }
        this.zzo.clear();
    }

    private final Boolean zzb(zzf zzfVar) {
        try {
            if (zzfVar.zzm() != -2147483648L) {
                if (zzfVar.zzm() == Wrappers.packageManager(this.zzk.zzm()).getPackageInfo(zzfVar.zzc(), 0).versionCode) {
                    return true;
                }
            } else {
                String str = Wrappers.packageManager(this.zzk.zzm()).getPackageInfo(zzfVar.zzc(), 0).versionName;
                if (zzfVar.zzl() != null && zzfVar.zzl().equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzr() {
        zzx();
        zzn();
        if (this.zzm) {
            return;
        }
        this.zzm = true;
        if (zzad()) {
            int zza2 = zza(this.zzv);
            int zzae = this.zzk.zzx().zzae();
            zzx();
            if (zza2 > zzae) {
                this.zzk.zzq().zze().zza("Panic: can't downgrade version. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzae));
            } else if (zza2 < zzae) {
                if (zza(zzae, this.zzv)) {
                    this.zzk.zzq().zzw().zza("Storage version upgraded. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzae));
                } else {
                    this.zzk.zzq().zze().zza("Storage version upgrade failed. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzae));
                }
            }
        }
    }

    private final boolean zzad() {
        FileLock fileLock;
        zzx();
        if (this.zzk.zza().zza(zzat.zzbi) && (fileLock = this.zzu) != null && fileLock.isValid()) {
            this.zzk.zzq().zzw().zza("Storage concurrent access okay");
            return true;
        }
        try {
            FileChannel channel = new RandomAccessFile(new File(this.zzk.zzm().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzv = channel;
            FileLock tryLock = channel.tryLock();
            this.zzu = tryLock;
            if (tryLock != null) {
                this.zzk.zzq().zzw().zza("Storage concurrent access okay");
                return true;
            }
            this.zzk.zzq().zze().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            this.zzk.zzq().zze().zza("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            this.zzk.zzq().zze().zza("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e3) {
            this.zzk.zzq().zzh().zza("Storage lock already acquired", e3);
            return false;
        }
    }

    private final int zza(FileChannel fileChannel) {
        zzx();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.zzk.zzq().zze().zza("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int read = fileChannel.read(allocate);
            if (read == 4) {
                allocate.flip();
                return allocate.getInt();
            }
            if (read != -1) {
                this.zzk.zzq().zzh().zza("Unexpected data length. Bytes read", Integer.valueOf(read));
            }
            return 0;
        } catch (IOException e) {
            this.zzk.zzq().zze().zza("Failed to read from channel", e);
            return 0;
        }
    }

    private final boolean zza(int i, FileChannel fileChannel) {
        zzx();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.zzk.zzq().zze().zza("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0L);
            if (this.zzk.zza().zza(zzat.zzbt) && Build.VERSION.SDK_INT <= 19) {
                fileChannel.position(0L);
            }
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.zzk.zzq().zze().zza("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.zzk.zzq().zze().zza("Failed to write to channel", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzn zznVar) {
        if (this.zzw != null) {
            ArrayList arrayList = new ArrayList();
            this.zzx = arrayList;
            arrayList.addAll(this.zzw);
        }
        zzac zze = zze();
        String str = zznVar.zza;
        Preconditions.checkNotEmpty(str);
        zze.zzc();
        zze.zzaj();
        try {
            SQLiteDatabase c_ = zze.c_();
            String[] strArr = {str};
            int delete = c_.delete("apps", "app_id=?", strArr) + 0 + c_.delete("events", "app_id=?", strArr) + c_.delete("user_attributes", "app_id=?", strArr) + c_.delete("conditional_properties", "app_id=?", strArr) + c_.delete("raw_events", "app_id=?", strArr) + c_.delete("raw_events_metadata", "app_id=?", strArr) + c_.delete("queue", "app_id=?", strArr) + c_.delete("audience_filter_values", "app_id=?", strArr) + c_.delete("main_event_params", "app_id=?", strArr) + c_.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                zze.zzq().zzw().zza("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zze.zzq().zze().zza("Error resetting analytics data. appId, error", zzex.zza(str), e);
        }
        if (zznVar.zzh) {
            zzb(zznVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzkw zzkwVar, zzn zznVar) {
        zzx();
        zzn();
        if (zze(zznVar)) {
            if (!zznVar.zzh) {
                zzc(zznVar);
                return;
            }
            int zzb = this.zzk.zzh().zzb(zzkwVar.zza);
            if (zzb != 0) {
                this.zzk.zzh();
                this.zzk.zzh().zza(zznVar.zza, zzb, "_ev", zzkx.zza(zzkwVar.zza, 24, true), zzkwVar.zza != null ? zzkwVar.zza.length() : 0);
                return;
            }
            int zzb2 = this.zzk.zzh().zzb(zzkwVar.zza, zzkwVar.zza());
            if (zzb2 != 0) {
                this.zzk.zzh();
                String zza2 = zzkx.zza(zzkwVar.zza, 24, true);
                Object zza3 = zzkwVar.zza();
                this.zzk.zzh().zza(zznVar.zza, zzb2, "_ev", zza2, (zza3 == null || !((zza3 instanceof String) || (zza3 instanceof CharSequence))) ? 0 : String.valueOf(zza3).length());
                return;
            }
            Object zzc = this.zzk.zzh().zzc(zzkwVar.zza, zzkwVar.zza());
            if (zzc == null) {
                return;
            }
            if ("_sid".equals(zzkwVar.zza)) {
                long j = zzkwVar.zzb;
                String str = zzkwVar.zze;
                long j2 = 0;
                zzky zzc2 = zze().zzc(zznVar.zza, "_sno");
                if (zzc2 != null && (zzc2.zze instanceof Long)) {
                    j2 = ((Long) zzc2.zze).longValue();
                } else {
                    if (zzc2 != null) {
                        this.zzk.zzq().zzh().zza("Retrieved last session number from database does not contain a valid (long) value", zzc2.zze);
                    }
                    zzan zza4 = zze().zza(zznVar.zza, "_s");
                    if (zza4 != null) {
                        j2 = zza4.zzc;
                        this.zzk.zzq().zzw().zza("Backfill the session number. Last used session number", Long.valueOf(j2));
                    }
                }
                zza(new zzkw("_sno", j, Long.valueOf(j2 + 1), str), zznVar);
            }
            zzky zzkyVar = new zzky(zznVar.zza, zzkwVar.zze, zzkwVar.zza, zzkwVar.zzb, zzc);
            this.zzk.zzq().zzw().zza("Setting user property", this.zzk.zzi().zzc(zzkyVar.zzc), zzc);
            zze().zze();
            try {
                zzc(zznVar);
                boolean zza5 = zze().zza(zzkyVar);
                zze().b_();
                if (!zza5) {
                    this.zzk.zzq().zze().zza("Too many unique user properties are set. Ignoring user property", this.zzk.zzi().zzc(zzkyVar.zzc), zzkyVar.zze);
                    this.zzk.zzh().zza(zznVar.zza, 9, (String) null, (String) null, 0);
                }
            } finally {
                zze().zzg();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzkw zzkwVar, zzn zznVar) {
        zzx();
        zzn();
        if (zze(zznVar)) {
            if (!zznVar.zzh) {
                zzc(zznVar);
            } else if ("_npa".equals(zzkwVar.zza) && zznVar.zzs != null) {
                this.zzk.zzq().zzv().zza("Falling back to manifest metadata value for ad personalization");
                zza(new zzkw("_npa", this.zzk.zzl().currentTimeMillis(), Long.valueOf(zznVar.zzs.booleanValue() ? 1L : 0L), "auto"), zznVar);
            } else {
                this.zzk.zzq().zzv().zza("Removing user property", this.zzk.zzi().zzc(zzkwVar.zza));
                zze().zze();
                try {
                    zzc(zznVar);
                    zze().zzb(zznVar.zza, zzkwVar.zza);
                    zze().b_();
                    this.zzk.zzq().zzv().zza("User property removed", this.zzk.zzi().zzc(zzkwVar.zza));
                } finally {
                    zze().zzg();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzkm zzkmVar) {
        this.zzp++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzs() {
        this.zzq++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzgb zzu() {
        return this.zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0493 A[Catch: all -> 0x04bf, TryCatch #3 {all -> 0x04bf, blocks: (B:24:0x009f, B:26:0x00ad, B:44:0x010f, B:46:0x011b, B:48:0x0132, B:49:0x015a, B:51:0x01ab, B:54:0x01be, B:57:0x01d2, B:59:0x01dd, B:64:0x01ec, B:66:0x01f4, B:68:0x01fa, B:72:0x0209, B:74:0x020c, B:76:0x0230, B:78:0x0235, B:84:0x0255, B:87:0x0269, B:89:0x028c, B:90:0x029a, B:92:0x02cd, B:94:0x02d5, B:96:0x02d9, B:97:0x02dc, B:99:0x02fd, B:138:0x03d9, B:139:0x03dc, B:150:0x044d, B:152:0x045d, B:154:0x0477, B:155:0x047e, B:159:0x04b0, B:101:0x0316, B:106:0x0341, B:108:0x0349, B:110:0x0353, B:114:0x0367, B:118:0x0375, B:122:0x0380, B:125:0x0392, B:128:0x03a5, B:130:0x03bd, B:132:0x03c3, B:133:0x03c8, B:135:0x03ce, B:115:0x036d, B:104:0x0329, B:142:0x03f4, B:144:0x042a, B:146:0x0432, B:148:0x0436, B:149:0x0439, B:156:0x0493, B:158:0x0497, B:81:0x0245, B:30:0x00bc, B:32:0x00c0, B:36:0x00d1, B:38:0x00eb, B:40:0x00f5, B:43:0x00ff), top: B:172:0x009f, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b A[Catch: all -> 0x04bf, TryCatch #3 {all -> 0x04bf, blocks: (B:24:0x009f, B:26:0x00ad, B:44:0x010f, B:46:0x011b, B:48:0x0132, B:49:0x015a, B:51:0x01ab, B:54:0x01be, B:57:0x01d2, B:59:0x01dd, B:64:0x01ec, B:66:0x01f4, B:68:0x01fa, B:72:0x0209, B:74:0x020c, B:76:0x0230, B:78:0x0235, B:84:0x0255, B:87:0x0269, B:89:0x028c, B:90:0x029a, B:92:0x02cd, B:94:0x02d5, B:96:0x02d9, B:97:0x02dc, B:99:0x02fd, B:138:0x03d9, B:139:0x03dc, B:150:0x044d, B:152:0x045d, B:154:0x0477, B:155:0x047e, B:159:0x04b0, B:101:0x0316, B:106:0x0341, B:108:0x0349, B:110:0x0353, B:114:0x0367, B:118:0x0375, B:122:0x0380, B:125:0x0392, B:128:0x03a5, B:130:0x03bd, B:132:0x03c3, B:133:0x03c8, B:135:0x03ce, B:115:0x036d, B:104:0x0329, B:142:0x03f4, B:144:0x042a, B:146:0x0432, B:148:0x0436, B:149:0x0439, B:156:0x0493, B:158:0x0497, B:81:0x0245, B:30:0x00bc, B:32:0x00c0, B:36:0x00d1, B:38:0x00eb, B:40:0x00f5, B:43:0x00ff), top: B:172:0x009f, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d2 A[Catch: all -> 0x04bf, TryCatch #3 {all -> 0x04bf, blocks: (B:24:0x009f, B:26:0x00ad, B:44:0x010f, B:46:0x011b, B:48:0x0132, B:49:0x015a, B:51:0x01ab, B:54:0x01be, B:57:0x01d2, B:59:0x01dd, B:64:0x01ec, B:66:0x01f4, B:68:0x01fa, B:72:0x0209, B:74:0x020c, B:76:0x0230, B:78:0x0235, B:84:0x0255, B:87:0x0269, B:89:0x028c, B:90:0x029a, B:92:0x02cd, B:94:0x02d5, B:96:0x02d9, B:97:0x02dc, B:99:0x02fd, B:138:0x03d9, B:139:0x03dc, B:150:0x044d, B:152:0x045d, B:154:0x0477, B:155:0x047e, B:159:0x04b0, B:101:0x0316, B:106:0x0341, B:108:0x0349, B:110:0x0353, B:114:0x0367, B:118:0x0375, B:122:0x0380, B:125:0x0392, B:128:0x03a5, B:130:0x03bd, B:132:0x03c3, B:133:0x03c8, B:135:0x03ce, B:115:0x036d, B:104:0x0329, B:142:0x03f4, B:144:0x042a, B:146:0x0432, B:148:0x0436, B:149:0x0439, B:156:0x0493, B:158:0x0497, B:81:0x0245, B:30:0x00bc, B:32:0x00c0, B:36:0x00d1, B:38:0x00eb, B:40:0x00f5, B:43:0x00ff), top: B:172:0x009f, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020c A[Catch: all -> 0x04bf, TryCatch #3 {all -> 0x04bf, blocks: (B:24:0x009f, B:26:0x00ad, B:44:0x010f, B:46:0x011b, B:48:0x0132, B:49:0x015a, B:51:0x01ab, B:54:0x01be, B:57:0x01d2, B:59:0x01dd, B:64:0x01ec, B:66:0x01f4, B:68:0x01fa, B:72:0x0209, B:74:0x020c, B:76:0x0230, B:78:0x0235, B:84:0x0255, B:87:0x0269, B:89:0x028c, B:90:0x029a, B:92:0x02cd, B:94:0x02d5, B:96:0x02d9, B:97:0x02dc, B:99:0x02fd, B:138:0x03d9, B:139:0x03dc, B:150:0x044d, B:152:0x045d, B:154:0x0477, B:155:0x047e, B:159:0x04b0, B:101:0x0316, B:106:0x0341, B:108:0x0349, B:110:0x0353, B:114:0x0367, B:118:0x0375, B:122:0x0380, B:125:0x0392, B:128:0x03a5, B:130:0x03bd, B:132:0x03c3, B:133:0x03c8, B:135:0x03ce, B:115:0x036d, B:104:0x0329, B:142:0x03f4, B:144:0x042a, B:146:0x0432, B:148:0x0436, B:149:0x0439, B:156:0x0493, B:158:0x0497, B:81:0x0245, B:30:0x00bc, B:32:0x00c0, B:36:0x00d1, B:38:0x00eb, B:40:0x00f5, B:43:0x00ff), top: B:172:0x009f, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0235 A[Catch: all -> 0x04bf, TryCatch #3 {all -> 0x04bf, blocks: (B:24:0x009f, B:26:0x00ad, B:44:0x010f, B:46:0x011b, B:48:0x0132, B:49:0x015a, B:51:0x01ab, B:54:0x01be, B:57:0x01d2, B:59:0x01dd, B:64:0x01ec, B:66:0x01f4, B:68:0x01fa, B:72:0x0209, B:74:0x020c, B:76:0x0230, B:78:0x0235, B:84:0x0255, B:87:0x0269, B:89:0x028c, B:90:0x029a, B:92:0x02cd, B:94:0x02d5, B:96:0x02d9, B:97:0x02dc, B:99:0x02fd, B:138:0x03d9, B:139:0x03dc, B:150:0x044d, B:152:0x045d, B:154:0x0477, B:155:0x047e, B:159:0x04b0, B:101:0x0316, B:106:0x0341, B:108:0x0349, B:110:0x0353, B:114:0x0367, B:118:0x0375, B:122:0x0380, B:125:0x0392, B:128:0x03a5, B:130:0x03bd, B:132:0x03c3, B:133:0x03c8, B:135:0x03ce, B:115:0x036d, B:104:0x0329, B:142:0x03f4, B:144:0x042a, B:146:0x0432, B:148:0x0436, B:149:0x0439, B:156:0x0493, B:158:0x0497, B:81:0x0245, B:30:0x00bc, B:32:0x00c0, B:36:0x00d1, B:38:0x00eb, B:40:0x00f5, B:43:0x00ff), top: B:172:0x009f, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0255 A[Catch: all -> 0x04bf, TRY_LEAVE, TryCatch #3 {all -> 0x04bf, blocks: (B:24:0x009f, B:26:0x00ad, B:44:0x010f, B:46:0x011b, B:48:0x0132, B:49:0x015a, B:51:0x01ab, B:54:0x01be, B:57:0x01d2, B:59:0x01dd, B:64:0x01ec, B:66:0x01f4, B:68:0x01fa, B:72:0x0209, B:74:0x020c, B:76:0x0230, B:78:0x0235, B:84:0x0255, B:87:0x0269, B:89:0x028c, B:90:0x029a, B:92:0x02cd, B:94:0x02d5, B:96:0x02d9, B:97:0x02dc, B:99:0x02fd, B:138:0x03d9, B:139:0x03dc, B:150:0x044d, B:152:0x045d, B:154:0x0477, B:155:0x047e, B:159:0x04b0, B:101:0x0316, B:106:0x0341, B:108:0x0349, B:110:0x0353, B:114:0x0367, B:118:0x0375, B:122:0x0380, B:125:0x0392, B:128:0x03a5, B:130:0x03bd, B:132:0x03c3, B:133:0x03c8, B:135:0x03ce, B:115:0x036d, B:104:0x0329, B:142:0x03f4, B:144:0x042a, B:146:0x0432, B:148:0x0436, B:149:0x0439, B:156:0x0493, B:158:0x0497, B:81:0x0245, B:30:0x00bc, B:32:0x00c0, B:36:0x00d1, B:38:0x00eb, B:40:0x00f5, B:43:0x00ff), top: B:172:0x009f, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb(zzn zznVar) {
        String str;
        int i;
        zzf zzb;
        String str2;
        zzan zza2;
        long j;
        long j2;
        PackageInfo packageInfo;
        String str3;
        ApplicationInfo applicationInfo;
        boolean z;
        boolean z2;
        zzx();
        zzn();
        Preconditions.checkNotNull(zznVar);
        Preconditions.checkNotEmpty(zznVar.zza);
        if (zze(zznVar)) {
            zzf zzb2 = zze().zzb(zznVar.zza);
            if (zzb2 != null && TextUtils.isEmpty(zzb2.zze()) && !TextUtils.isEmpty(zznVar.zzb)) {
                zzb2.zzh(0L);
                zze().zza(zzb2);
                zzc().zzd(zznVar.zza);
            }
            if (!zznVar.zzh) {
                zzc(zznVar);
                return;
            }
            long j3 = zznVar.zzm;
            if (j3 == 0) {
                j3 = this.zzk.zzl().currentTimeMillis();
            }
            this.zzk.zzw().zzh();
            int i2 = zznVar.zzn;
            if (i2 != 0 && i2 != 1) {
                this.zzk.zzq().zzh().zza("Incorrect app type, assuming installed app. appId, appType", zzex.zza(zznVar.zza), Integer.valueOf(i2));
                i2 = 0;
            }
            zze().zze();
            try {
                zzky zzc = zze().zzc(zznVar.zza, "_npa");
                if (zzc != null && !"auto".equals(zzc.zzb)) {
                    str = "_sysu";
                    i = 1;
                    zzb = zze().zzb(zznVar.zza);
                    if (zzb != null) {
                        this.zzk.zzh();
                        if (zzkx.zza(zznVar.zzb, zzb.zze(), zznVar.zzr, zzb.zzf())) {
                            this.zzk.zzq().zzh().zza("New GMP App Id passed in. Removing cached database data. appId", zzex.zza(zzb.zzc()));
                            zzac zze = zze();
                            String zzc2 = zzb.zzc();
                            zze.zzaj();
                            zze.zzc();
                            Preconditions.checkNotEmpty(zzc2);
                            try {
                                SQLiteDatabase c_ = zze.c_();
                                String[] strArr = new String[i];
                                strArr[0] = zzc2;
                                int delete = c_.delete("events", "app_id=?", strArr) + 0 + c_.delete("user_attributes", "app_id=?", strArr) + c_.delete("conditional_properties", "app_id=?", strArr) + c_.delete("apps", "app_id=?", strArr) + c_.delete("raw_events", "app_id=?", strArr) + c_.delete("raw_events_metadata", "app_id=?", strArr) + c_.delete("event_filters", "app_id=?", strArr) + c_.delete("property_filters", "app_id=?", strArr) + c_.delete("audience_filter_values", "app_id=?", strArr) + c_.delete("consent_settings", "app_id=?", strArr);
                                if (delete > 0) {
                                    zze.zzq().zzw().zza("Deleted application data. app, records", zzc2, Integer.valueOf(delete));
                                }
                            } catch (SQLiteException e) {
                                zze.zzq().zze().zza("Error deleting application data. appId, error", zzex.zza(zzc2), e);
                            }
                            zzb = null;
                        }
                    }
                    if (zzb == null) {
                        if (zzb.zzm() != -2147483648L) {
                            str2 = "_sys";
                            if (zzb.zzm() != zznVar.zzj) {
                                z2 = true;
                                if (z2 | ((zzb.zzm() == -2147483648L || zzb.zzl() == null || zzb.zzl().equals(zznVar.zzc)) ? false : true)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("_pv", zzb.zzl());
                                    zza(new zzar("_au", new zzam(bundle), "auto", j3), zznVar);
                                }
                            }
                        } else {
                            str2 = "_sys";
                        }
                        z2 = false;
                        if (z2 | ((zzb.zzm() == -2147483648L || zzb.zzl() == null || zzb.zzl().equals(zznVar.zzc)) ? false : true)) {
                        }
                    } else {
                        str2 = "_sys";
                    }
                    zzc(zznVar);
                    if (i2 != 0) {
                        zza2 = zze().zza(zznVar.zza, "_f");
                    } else {
                        zza2 = i2 == 1 ? zze().zza(zznVar.zza, "_v") : null;
                    }
                    if (zza2 != null) {
                        long j4 = ((j3 / 3600000) + 1) * 3600000;
                        if (i2 == 0) {
                            zza(new zzkw("_fot", j3, Long.valueOf(j4), "auto"), zznVar);
                            if (this.zzk.zza().zze(zznVar.zzb, zzat.zzar)) {
                                zzx();
                                this.zzk.zze().zza(zznVar.zza);
                            }
                            zzx();
                            zzn();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("_c", 1L);
                            bundle2.putLong("_r", 1L);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong(str2, 0L);
                            String str4 = str;
                            bundle2.putLong(str4, 0L);
                            if (this.zzk.zza().zze(zznVar.zza, zzat.zzat)) {
                                j2 = 1;
                                bundle2.putLong("_et", 1L);
                            } else {
                                j2 = 1;
                            }
                            if (zznVar.zzq) {
                                bundle2.putLong("_dac", j2);
                            }
                            zzac zze2 = zze();
                            String str5 = zznVar.zza;
                            Preconditions.checkNotEmpty(str5);
                            zze2.zzc();
                            zze2.zzaj();
                            long zzh = zze2.zzh(str5, "first_open_count");
                            if (this.zzk.zzm().getPackageManager() == null) {
                                this.zzk.zzq().zze().zza("PackageManager is null, first open report might be inaccurate. appId", zzex.zza(zznVar.zza));
                            } else {
                                try {
                                    packageInfo = Wrappers.packageManager(this.zzk.zzm()).getPackageInfo(zznVar.zza, 0);
                                } catch (PackageManager.NameNotFoundException e2) {
                                    this.zzk.zzq().zze().zza("Package info is null, first open report might be inaccurate. appId", zzex.zza(zznVar.zza), e2);
                                    packageInfo = null;
                                }
                                if (packageInfo == null || packageInfo.firstInstallTime == 0) {
                                    str3 = str4;
                                } else {
                                    if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                        if (!this.zzk.zza().zza(zzat.zzbo)) {
                                            bundle2.putLong("_uwa", 1L);
                                        } else if (zzh == 0) {
                                            bundle2.putLong("_uwa", 1L);
                                        }
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    str3 = str4;
                                    zza(new zzkw("_fi", j3, Long.valueOf(z ? 1L : 0L), "auto"), zznVar);
                                }
                                try {
                                    applicationInfo = Wrappers.packageManager(this.zzk.zzm()).getApplicationInfo(zznVar.zza, 0);
                                } catch (PackageManager.NameNotFoundException e3) {
                                    this.zzk.zzq().zze().zza("Application info is null, first open report might be inaccurate. appId", zzex.zza(zznVar.zza), e3);
                                    applicationInfo = null;
                                }
                                if (applicationInfo != null) {
                                    if ((applicationInfo.flags & 1) != 0) {
                                        bundle2.putLong(str2, 1L);
                                    }
                                    if ((applicationInfo.flags & 128) != 0) {
                                        bundle2.putLong(str3, 1L);
                                    }
                                }
                            }
                            if (zzh >= 0) {
                                bundle2.putLong("_pfo", zzh);
                            }
                            zzb(new zzar("_f", new zzam(bundle2), "auto", j3), zznVar);
                        } else if (i2 == 1) {
                            zza(new zzkw("_fvt", j3, Long.valueOf(j4), "auto"), zznVar);
                            zzx();
                            zzn();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("_c", 1L);
                            bundle3.putLong("_r", 1L);
                            if (this.zzk.zza().zze(zznVar.zza, zzat.zzat)) {
                                j = 1;
                                bundle3.putLong("_et", 1L);
                            } else {
                                j = 1;
                            }
                            if (zznVar.zzq) {
                                bundle3.putLong("_dac", j);
                            }
                            zzb(new zzar("_v", new zzam(bundle3), "auto", j3), zznVar);
                        }
                        if (!this.zzk.zza().zze(zznVar.zza, zzat.zzau)) {
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("_et", 1L);
                            if (this.zzk.zza().zze(zznVar.zza, zzat.zzat)) {
                                bundle4.putLong("_fr", 1L);
                            }
                            zzb(new zzar("_e", new zzam(bundle4), "auto", j3), zznVar);
                        }
                    } else if (zznVar.zzi) {
                        zzb(new zzar("_cd", new zzam(new Bundle()), "auto", j3), zznVar);
                    }
                    zze().b_();
                }
                if (zznVar.zzs != null) {
                    str = "_sysu";
                    i = 1;
                    zzkw zzkwVar = new zzkw("_npa", j3, Long.valueOf(zznVar.zzs.booleanValue() ? 1L : 0L), "auto");
                    if (zzc == null || !zzc.zze.equals(zzkwVar.zzc)) {
                        zza(zzkwVar, zznVar);
                    }
                } else {
                    str = "_sysu";
                    i = 1;
                    if (zzc != null) {
                        zzb(new zzkw("_npa", j3, null, "auto"), zznVar);
                    }
                }
                zzb = zze().zzb(zznVar.zza);
                if (zzb != null) {
                }
                if (zzb == null) {
                }
                zzc(zznVar);
                if (i2 != 0) {
                }
                if (zza2 != null) {
                }
                zze().b_();
            } finally {
                zze().zzg();
            }
        }
    }

    private final zzn zzb(String str) {
        zzf zzb = zze().zzb(str);
        if (zzb == null || TextUtils.isEmpty(zzb.zzl())) {
            this.zzk.zzq().zzv().zza("No app data available; dropping", str);
            return null;
        }
        Boolean zzb2 = zzb(zzb);
        if (zzb2 != null && !zzb2.booleanValue()) {
            this.zzk.zzq().zze().zza("App version does not match; dropping. appId", zzex.zza(str));
            return null;
        }
        return new zzn(str, zzb.zze(), zzb.zzl(), zzb.zzm(), zzb.zzn(), zzb.zzo(), zzb.zzp(), (String) null, zzb.zzr(), false, zzb.zzi(), zzb.zzae(), 0L, 0, zzb.zzaf(), zzb.zzag(), false, zzb.zzf(), zzb.zzah(), zzb.zzq(), zzb.zzai(), (zznq.zzb() && this.zzk.zza().zze(str, zzat.zzbj)) ? zzb.zzg() : null, (zzmb.zzb() && this.zzk.zza().zza(zzat.zzcp)) ? zza(str).zza() : "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzw zzwVar) {
        zzn zzb = zzb(zzwVar.zza);
        if (zzb != null) {
            zza(zzwVar, zzb);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzw zzwVar, zzn zznVar) {
        Preconditions.checkNotNull(zzwVar);
        Preconditions.checkNotEmpty(zzwVar.zza);
        Preconditions.checkNotNull(zzwVar.zzb);
        Preconditions.checkNotNull(zzwVar.zzc);
        Preconditions.checkNotEmpty(zzwVar.zzc.zza);
        zzx();
        zzn();
        if (zze(zznVar)) {
            if (!zznVar.zzh) {
                zzc(zznVar);
                return;
            }
            zzw zzwVar2 = new zzw(zzwVar);
            boolean z = false;
            zzwVar2.zze = false;
            zze().zze();
            try {
                zzw zzd = zze().zzd(zzwVar2.zza, zzwVar2.zzc.zza);
                if (zzd != null && !zzd.zzb.equals(zzwVar2.zzb)) {
                    this.zzk.zzq().zzh().zza("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzk.zzi().zzc(zzwVar2.zzc.zza), zzwVar2.zzb, zzd.zzb);
                }
                if (zzd != null && zzd.zze) {
                    zzwVar2.zzb = zzd.zzb;
                    zzwVar2.zzd = zzd.zzd;
                    zzwVar2.zzh = zzd.zzh;
                    zzwVar2.zzf = zzd.zzf;
                    zzwVar2.zzi = zzd.zzi;
                    zzwVar2.zze = zzd.zze;
                    zzwVar2.zzc = new zzkw(zzwVar2.zzc.zza, zzd.zzc.zzb, zzwVar2.zzc.zza(), zzd.zzc.zze);
                } else if (TextUtils.isEmpty(zzwVar2.zzf)) {
                    zzwVar2.zzc = new zzkw(zzwVar2.zzc.zza, zzwVar2.zzd, zzwVar2.zzc.zza(), zzwVar2.zzc.zze);
                    zzwVar2.zze = true;
                    z = true;
                }
                if (zzwVar2.zze) {
                    zzkw zzkwVar = zzwVar2.zzc;
                    zzky zzkyVar = new zzky(zzwVar2.zza, zzwVar2.zzb, zzkwVar.zza, zzkwVar.zzb, zzkwVar.zza());
                    if (zze().zza(zzkyVar)) {
                        this.zzk.zzq().zzv().zza("User property updated immediately", zzwVar2.zza, this.zzk.zzi().zzc(zzkyVar.zzc), zzkyVar.zze);
                    } else {
                        this.zzk.zzq().zze().zza("(2)Too many active user properties, ignoring", zzex.zza(zzwVar2.zza), this.zzk.zzi().zzc(zzkyVar.zzc), zzkyVar.zze);
                    }
                    if (z && zzwVar2.zzi != null) {
                        zzc(new zzar(zzwVar2.zzi, zzwVar2.zzd), zznVar);
                    }
                }
                if (zze().zza(zzwVar2)) {
                    this.zzk.zzq().zzv().zza("Conditional property added", zzwVar2.zza, this.zzk.zzi().zzc(zzwVar2.zzc.zza), zzwVar2.zzc.zza());
                } else {
                    this.zzk.zzq().zze().zza("Too many conditional properties, ignoring", zzex.zza(zzwVar2.zza), this.zzk.zzi().zzc(zzwVar2.zzc.zza), zzwVar2.zzc.zza());
                }
                zze().b_();
            } finally {
                zze().zzg();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzw zzwVar) {
        zzn zzb = zzb(zzwVar.zza);
        if (zzb != null) {
            zzb(zzwVar, zzb);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzw zzwVar, zzn zznVar) {
        Preconditions.checkNotNull(zzwVar);
        Preconditions.checkNotEmpty(zzwVar.zza);
        Preconditions.checkNotNull(zzwVar.zzc);
        Preconditions.checkNotEmpty(zzwVar.zzc.zza);
        zzx();
        zzn();
        if (zze(zznVar)) {
            if (!zznVar.zzh) {
                zzc(zznVar);
                return;
            }
            zze().zze();
            try {
                zzc(zznVar);
                zzw zzd = zze().zzd(zzwVar.zza, zzwVar.zzc.zza);
                if (zzd != null) {
                    this.zzk.zzq().zzv().zza("Removing conditional user property", zzwVar.zza, this.zzk.zzi().zzc(zzwVar.zzc.zza));
                    zze().zze(zzwVar.zza, zzwVar.zzc.zza);
                    if (zzd.zze) {
                        zze().zzb(zzwVar.zza, zzwVar.zzc.zza);
                    }
                    if (zzwVar.zzk != null) {
                        zzc(this.zzk.zzh().zza(zzwVar.zza, zzwVar.zzk.zza, zzwVar.zzk.zzb != null ? zzwVar.zzk.zzb.zzb() : null, zzd.zzb, zzwVar.zzk.zzd, true, false, zzlj.zzb() && this.zzk.zza().zza(zzat.zzcs)), zznVar);
                    }
                } else {
                    this.zzk.zzq().zzh().zza("Conditional user property doesn't exist", zzex.zza(zzwVar.zza), this.zzk.zzi().zzc(zzwVar.zzc.zza));
                }
                zze().b_();
            } finally {
                zze().zzg();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzf zza(zzn zznVar, zzf zzfVar, String str) {
        boolean z;
        zzad zzadVar = zzad.zza;
        if (zzmb.zzb() && this.zzk.zza().zza(zzat.zzcp)) {
            zzadVar = zza(zznVar.zza).zzb(zzad.zza(zznVar.zzw));
        }
        boolean z2 = true;
        if (zzfVar == null) {
            zzfVar = new zzf(this.zzk, zznVar.zza);
            if (zzmb.zzb() && this.zzk.zza().zza(zzat.zzcp)) {
                if (zzadVar.zze()) {
                    zzfVar.zza(zza(zzadVar));
                }
                if (zzadVar.zzc()) {
                    zzfVar.zze(str);
                }
            } else {
                zzfVar.zza(zzz());
                zzfVar.zze(str);
            }
        } else if ((!zzmb.zzb() || !this.zzk.zza().zza(zzat.zzcp) || zzadVar.zzc()) && !str.equals(zzfVar.zzh())) {
            zzfVar.zze(str);
            if (zzmb.zzb() && this.zzk.zza().zza(zzat.zzcp)) {
                if (zzadVar.zze()) {
                    zzfVar.zza(zza(zzadVar));
                }
            } else {
                zzfVar.zza(zzz());
            }
        } else {
            z = false;
            if (!TextUtils.equals(zznVar.zzb, zzfVar.zze())) {
                zzfVar.zzb(zznVar.zzb);
                z = true;
            }
            if (!TextUtils.equals(zznVar.zzr, zzfVar.zzf())) {
                zzfVar.zzc(zznVar.zzr);
                z = true;
            }
            if (zznq.zzb() && this.zzk.zza().zze(zzfVar.zzc(), zzat.zzbj) && !TextUtils.equals(zznVar.zzv, zzfVar.zzg())) {
                zzfVar.zzd(zznVar.zzv);
                z = true;
            }
            if (!TextUtils.isEmpty(zznVar.zzk) && !zznVar.zzk.equals(zzfVar.zzi())) {
                zzfVar.zzf(zznVar.zzk);
                z = true;
            }
            if (zznVar.zze != 0 && zznVar.zze != zzfVar.zzo()) {
                zzfVar.zzd(zznVar.zze);
                z = true;
            }
            if (!TextUtils.isEmpty(zznVar.zzc) && !zznVar.zzc.equals(zzfVar.zzl())) {
                zzfVar.zzg(zznVar.zzc);
                z = true;
            }
            if (zznVar.zzj != zzfVar.zzm()) {
                zzfVar.zzc(zznVar.zzj);
                z = true;
            }
            if (zznVar.zzd != null && !zznVar.zzd.equals(zzfVar.zzn())) {
                zzfVar.zzh(zznVar.zzd);
                z = true;
            }
            if (zznVar.zzf != zzfVar.zzp()) {
                zzfVar.zze(zznVar.zzf);
                z = true;
            }
            if (zznVar.zzh != zzfVar.zzr()) {
                zzfVar.zza(zznVar.zzh);
                z = true;
            }
            if (!TextUtils.isEmpty(zznVar.zzg) && !zznVar.zzg.equals(zzfVar.zzac())) {
                zzfVar.zzi(zznVar.zzg);
                z = true;
            }
            if (!this.zzk.zza().zza(zzat.zzcf) && zznVar.zzl != zzfVar.zzae()) {
                zzfVar.zzp(zznVar.zzl);
                z = true;
            }
            if (zznVar.zzo != zzfVar.zzaf()) {
                zzfVar.zzb(zznVar.zzo);
                z = true;
            }
            if (zznVar.zzp != zzfVar.zzag()) {
                zzfVar.zzc(zznVar.zzp);
                z = true;
            }
            if (zznVar.zzs != zzfVar.zzah()) {
                zzfVar.zza(zznVar.zzs);
                z = true;
            }
            if (zznVar.zzt != 0 || zznVar.zzt == zzfVar.zzq()) {
                z2 = z;
            } else {
                zzfVar.zzf(zznVar.zzt);
            }
            if (z2) {
                zze().zza(zzfVar);
            }
            return zzfVar;
        }
        z = true;
        if (!TextUtils.equals(zznVar.zzb, zzfVar.zze())) {
        }
        if (!TextUtils.equals(zznVar.zzr, zzfVar.zzf())) {
        }
        if (zznq.zzb()) {
            zzfVar.zzd(zznVar.zzv);
            z = true;
        }
        if (!TextUtils.isEmpty(zznVar.zzk)) {
            zzfVar.zzf(zznVar.zzk);
            z = true;
        }
        if (zznVar.zze != 0) {
            zzfVar.zzd(zznVar.zze);
            z = true;
        }
        if (!TextUtils.isEmpty(zznVar.zzc)) {
            zzfVar.zzg(zznVar.zzc);
            z = true;
        }
        if (zznVar.zzj != zzfVar.zzm()) {
        }
        if (zznVar.zzd != null) {
            zzfVar.zzh(zznVar.zzd);
            z = true;
        }
        if (zznVar.zzf != zzfVar.zzp()) {
        }
        if (zznVar.zzh != zzfVar.zzr()) {
        }
        if (!TextUtils.isEmpty(zznVar.zzg)) {
            zzfVar.zzi(zznVar.zzg);
            z = true;
        }
        if (!this.zzk.zza().zza(zzat.zzcf)) {
            zzfVar.zzp(zznVar.zzl);
            z = true;
        }
        if (zznVar.zzo != zzfVar.zzaf()) {
        }
        if (zznVar.zzp != zzfVar.zzag()) {
        }
        if (zznVar.zzs != zzfVar.zzah()) {
        }
        if (zznVar.zzt != 0) {
        }
        z2 = z;
        if (z2) {
        }
        return zzfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzf zzc(zzn zznVar) {
        zzx();
        zzn();
        Preconditions.checkNotNull(zznVar);
        Preconditions.checkNotEmpty(zznVar.zza);
        zzf zzb = zze().zzb(zznVar.zza);
        zzad zzadVar = zzad.zza;
        if (zzmb.zzb() && this.zzk.zza().zza(zzat.zzcp)) {
            zzadVar = zza(zznVar.zza).zzb(zzad.zza(zznVar.zzw));
        }
        String zza2 = (zzmb.zzb() && this.zzk.zza().zza(zzat.zzcp) && !zzadVar.zzc()) ? "" : this.zzj.zza(zznVar.zza);
        if (zzmz.zzb() && this.zzk.zza().zza(zzat.zzbp)) {
            if (zzb == null) {
                zzb = new zzf(this.zzk, zznVar.zza);
                if (zzmb.zzb() && this.zzk.zza().zza(zzat.zzcp)) {
                    if (zzadVar.zze()) {
                        zzb.zza(zza(zzadVar));
                    }
                    if (zzadVar.zzc()) {
                        zzb.zze(zza2);
                    }
                } else {
                    zzb.zza(zzz());
                    zzb.zze(zza2);
                }
            } else if ((!zzmb.zzb() || !this.zzk.zza().zza(zzat.zzcp) || zzadVar.zzc()) && !zza2.equals(zzb.zzh())) {
                zzb.zze(zza2);
                if (zzmb.zzb() && this.zzk.zza().zza(zzat.zzcp)) {
                    zzb.zza(zza(zzadVar));
                } else {
                    zzb.zza(zzz());
                }
            }
            zzb.zzb(zznVar.zzb);
            zzb.zzc(zznVar.zzr);
            if (zznq.zzb() && this.zzk.zza().zze(zzb.zzc(), zzat.zzbj)) {
                zzb.zzd(zznVar.zzv);
            }
            if (!TextUtils.isEmpty(zznVar.zzk)) {
                zzb.zzf(zznVar.zzk);
            }
            if (zznVar.zze != 0) {
                zzb.zzd(zznVar.zze);
            }
            if (!TextUtils.isEmpty(zznVar.zzc)) {
                zzb.zzg(zznVar.zzc);
            }
            zzb.zzc(zznVar.zzj);
            if (zznVar.zzd != null) {
                zzb.zzh(zznVar.zzd);
            }
            zzb.zze(zznVar.zzf);
            zzb.zza(zznVar.zzh);
            if (!TextUtils.isEmpty(zznVar.zzg)) {
                zzb.zzi(zznVar.zzg);
            }
            if (!this.zzk.zza().zza(zzat.zzcf)) {
                zzb.zzp(zznVar.zzl);
            }
            zzb.zzb(zznVar.zzo);
            zzb.zzc(zznVar.zzp);
            zzb.zza(zznVar.zzs);
            zzb.zzf(zznVar.zzt);
            if (zzb.zza()) {
                zze().zza(zzb);
            }
            return zzb;
        }
        return zza(zznVar, zzb, zza2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzd(zzn zznVar) {
        try {
            return (String) this.zzk.zzp().zza(new zzks(this, zznVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.zzk.zzq().zze().zza("Failed to get app instance id. appId", zzex.zza(zznVar.zza), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(boolean z) {
        zzab();
    }

    private final boolean zze(zzn zznVar) {
        return (zznq.zzb() && this.zzk.zza().zze(zznVar.zza, zzat.zzbj)) ? (TextUtils.isEmpty(zznVar.zzb) && TextUtils.isEmpty(zznVar.zzv) && TextUtils.isEmpty(zznVar.zzr)) ? false : true : (TextUtils.isEmpty(zznVar.zzb) && TextUtils.isEmpty(zznVar.zzr)) ? false : true;
    }
}
