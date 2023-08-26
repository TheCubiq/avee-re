package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.daaw.avee.comp.Visualizer.Elements.Base.AnchorMode;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.internal.measurement.zzmb;
import com.google.android.gms.internal.measurement.zzmh;
import com.google.android.gms.internal.measurement.zzmn;
import com.google.android.gms.internal.measurement.zzmt;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.measurement.zznr;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzhe extends zzg {
    protected zzic zza;
    final zzp zzb;
    private zzhd zzc;
    private final Set<zzhc> zzd;
    private boolean zze;
    private final AtomicReference<String> zzf;
    private final Object zzg;
    private zzad zzh;
    private int zzi;
    private final AtomicLong zzj;
    private long zzk;
    private int zzl;
    private boolean zzm;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzhe(zzgb zzgbVar) {
        super(zzgbVar);
        this.zzd = new CopyOnWriteArraySet();
        this.zzg = new Object();
        this.zzm = true;
        this.zzf = new AtomicReference<>();
        this.zzh = new zzad(null, null);
        this.zzi = 100;
        this.zzk = -1L;
        this.zzl = 100;
        this.zzj = new AtomicLong(0L);
        this.zzb = new zzp(zzgbVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzy() {
        return false;
    }

    public final void zzaa() {
        if (zzm().getApplicationContext() instanceof Application) {
            ((Application) zzm().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
        }
    }

    public final Boolean zzab() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzp().zza(atomicReference, 15000L, "boolean test flag value", new zzhj(this, atomicReference));
    }

    public final String zzac() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzp().zza(atomicReference, 15000L, "String test flag value", new zzht(this, atomicReference));
    }

    public final Long zzad() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzp().zza(atomicReference, 15000L, "long test flag value", new zzhx(this, atomicReference));
    }

    public final Integer zzae() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzp().zza(atomicReference, 15000L, "int test flag value", new zzhw(this, atomicReference));
    }

    public final Double zzaf() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzp().zza(atomicReference, 15000L, "double test flag value", new zzhz(this, atomicReference));
    }

    public final void zza(Boolean bool) {
        zzv();
        zzp().zza(new zzhy(this, bool));
    }

    public final void zza(zzad zzadVar, int i, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        zzad zzadVar2 = zzadVar;
        if (zzmb.zzb() && zzs().zza(zzat.zzco)) {
            zzv();
            if (zzadVar.zzb() == null && zzadVar.zzd() == null) {
                zzq().zzj().zza("Discarding empty consent settings");
                return;
            }
            synchronized (this.zzg) {
                z = true;
                z2 = false;
                if (zzad.zza(i, this.zzi)) {
                    boolean zza = zzadVar.zza(this.zzh);
                    if (zzadVar.zze() && !this.zzh.zze()) {
                        z2 = true;
                    }
                    zzadVar2 = zzadVar.zzc(this.zzh);
                    this.zzh = zzadVar2;
                    z3 = z2;
                    z2 = zza;
                } else {
                    z = false;
                    z3 = false;
                }
            }
            if (!z) {
                zzq().zzu().zza("Ignoring lower-priority consent settings, proposed settings", zzadVar2);
                return;
            }
            long andIncrement = this.zzj.getAndIncrement();
            if (z2) {
                zza((String) null);
                zzp().zzb(new zzib(this, zzadVar2, j, i, andIncrement, z3));
                return;
            }
            zzp().zza(new zzia(this, zzadVar2, i, andIncrement, z3));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzad zzadVar) {
        zzc();
        boolean z = (zzadVar.zze() && zzadVar.zzc()) || zzg().zzai();
        if (z != this.zzy.zzac()) {
            this.zzy.zzb(z);
            Boolean zzv = zzr().zzv();
            if (!z || zzv == null || zzv.booleanValue()) {
                zza(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(Boolean bool, boolean z) {
        zzc();
        zzv();
        zzq().zzv().zza("Setting app measurement enabled (FE)", bool);
        zzr().zza(bool);
        if (zzmb.zzb() && zzs().zza(zzat.zzco) && z) {
            zzr().zzb(bool);
        }
        if (zzmb.zzb() && zzs().zza(zzat.zzco) && !this.zzy.zzac() && bool.booleanValue()) {
            return;
        }
        zzal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzad zzadVar, int i, long j, boolean z, boolean z2) {
        zzc();
        zzv();
        if (j <= this.zzk && zzad.zza(this.zzl, i)) {
            zzq().zzu().zza("Dropped out-of-date consent setting, proposed settings", zzadVar);
        } else if (zzr().zza(zzadVar, i)) {
            this.zzk = j;
            this.zzl = i;
            zzg().zza(z);
            if (z2) {
                zzg().zza(new AtomicReference<>());
            }
        } else {
            zzq().zzu().zza("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzal() {
        zzc();
        String zza = zzr().zzn.zza();
        if (zza != null) {
            if (AnchorMode.typeName0.equals(zza)) {
                zza("app", "_npa", (Object) null, zzl().currentTimeMillis());
            } else {
                zza("app", "_npa", Long.valueOf("true".equals(zza) ? 1L : 0L), zzl().currentTimeMillis());
            }
        }
        if (this.zzy.zzaa() && this.zzm) {
            zzq().zzv().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzah();
            if (zzne.zzb() && zzs().zza(zzat.zzbr)) {
                zzj().zza.zza();
            }
            if (zzmt.zzb() && zzs().zza(zzat.zzbu)) {
                if (!(this.zzy.zze().zza.zzb().zzi.zza() > 0)) {
                    zzfo zze = this.zzy.zze();
                    zze.zza(zze.zza.zzm().getPackageName());
                }
            }
            if (zzs().zza(zzat.zzck)) {
                zzp().zza(new zzhi(this));
                return;
            }
            return;
        }
        zzq().zzv().zza("Updating Scion state (FE)");
        zzg().zzab();
    }

    public final void zza(String str, String str2, Bundle bundle) {
        zza(str, str2, bundle, true, true, zzl().currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(String str, String str2, Bundle bundle) {
        zzc();
        zza(str, str2, zzl().currentTimeMillis(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(String str, String str2, long j, Bundle bundle) {
        zzc();
        zza(str, str2, j, bundle, true, this.zzc == null || zzkx.zzd(str2), false, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        String str4;
        long j2;
        long j3;
        String str5;
        String[] strArr;
        int length;
        int i;
        int i2;
        String str6;
        ArrayList arrayList;
        String str7;
        String str8;
        List<String> list;
        int i3;
        String str9;
        ArrayList arrayList2;
        String str10;
        String str11;
        zzin zzinVar;
        Bundle bundle2;
        long j4;
        int i4;
        String str12;
        String str13;
        String str14;
        boolean z4;
        Class<?> cls;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzc();
        zzv();
        if (!this.zzy.zzaa()) {
            zzq().zzv().zza("Event not sent since app measurement is disabled");
            return;
        }
        List<String> zzag = zzf().zzag();
        if (zzag != null && !zzag.contains(str2)) {
            zzq().zzv().zza("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.zze) {
            this.zze = true;
            try {
                if (!this.zzy.zzs()) {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zzm().getClassLoader());
                } else {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                }
                try {
                    cls.getDeclaredMethod("initialize", Context.class).invoke(null, zzm());
                } catch (Exception e) {
                    zzq().zzh().zza("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                zzq().zzu().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if (zzs().zza(zzat.zzbe) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            zza("auto", "_lgclid", bundle.getString("gclid"), zzl().currentTimeMillis());
        }
        if (zznr.zzb() && zzs().zza(zzat.zzcg) && z && zzkx.zzf(str2)) {
            zzo().zza(bundle, zzr().zzx.zza());
        }
        if (z3 && !"_iap".equals(str2)) {
            zzkx zzh = this.zzy.zzh();
            boolean z5 = zzlj.zzb() && zzs().zza(zzat.zzcr);
            int i5 = 13;
            if (zzh.zza(NotificationCompat.CATEGORY_EVENT, str2)) {
                if (z5) {
                    if (zzh.zza(NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                        i5 = 0;
                        if (i5 != 0) {
                            zzq().zzg().zza("Invalid public event name. Event will not be logged (FE)", zzn().zza(str2));
                            this.zzy.zzh();
                            this.zzy.zzh().zza(i5, "_ev", zzkx.zza(str2, 40, true), str2 != null ? str2.length() : 0);
                            return;
                        }
                    }
                } else if (zzh.zza(NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                }
            }
            i5 = 2;
            if (i5 != 0) {
            }
        }
        zzin zza = zzh().zza(false);
        if (zza != null && !bundle.containsKey("_sc")) {
            zza.zzd = true;
        }
        zzim.zza(zza, bundle, z && z3);
        boolean equals = "am".equals(str);
        boolean zzd = zzkx.zzd(str2);
        if (z && this.zzc != null && !zzd && !equals) {
            zzq().zzv().zza("Passing event to registered event handler (FE)", zzn().zza(str2), zzn().zza(bundle));
            this.zzc.interceptEvent(str, str2, bundle, j);
        } else if (this.zzy.zzaf()) {
            int zza2 = zzo().zza(str2, zzlj.zzb() && zzs().zza(zzat.zzcr));
            if (zza2 != 0) {
                zzq().zzg().zza("Invalid event name. Event will not be logged (FE)", zzn().zza(str2));
                zzo();
                this.zzy.zzh().zza(str3, zza2, "_ev", zzkx.zza(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            List<String> listOf = CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"});
            Bundle zza3 = zzo().zza(str3, str2, bundle, listOf, z3, true);
            zzin zzinVar2 = (zza3 != null && zza3.containsKey("_sc") && zza3.containsKey("_si")) ? new zzin(zza3.getString("_sn"), zza3.getString("_sc"), Long.valueOf(zza3.getLong("_si")).longValue()) : null;
            zzin zzinVar3 = zzinVar2 == null ? zza : zzinVar2;
            String str15 = "_ae";
            if (!zzs().zza(zzat.zzat) || zzh().zza(false) == null) {
                str4 = str2;
            } else {
                str4 = str2;
                if ("_ae".equals(str4)) {
                    long zzb = zzj().zzb.zzb();
                    if (zzb > 0) {
                        zzo().zza(zza3, zzb);
                    }
                }
            }
            if (zzmn.zzb() && zzs().zza(zzat.zzbq)) {
                if (!"auto".equals(str) && "_ssr".equals(str4)) {
                    zzkx zzo = zzo();
                    String string = zza3.getString("_ffr");
                    String trim = Strings.isEmptyOrWhitespace(string) ? null : string.trim();
                    if (zzkx.zzc(trim, zzo.zzr().zzu.zza())) {
                        zzo.zzq().zzv().zza("Not logging duplicate session_start_with_rollout event");
                        z4 = false;
                    } else {
                        zzo.zzr().zzu.zza(trim);
                        z4 = true;
                    }
                    if (!z4) {
                        return;
                    }
                } else if ("_ae".equals(str4)) {
                    String zza4 = zzo().zzr().zzu.zza();
                    if (!TextUtils.isEmpty(zza4)) {
                        zza3.putString("_ffr", zza4);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(zza3);
            long nextLong = zzo().zzg().nextLong();
            if (zzr().zzp.zza() > 0) {
                j2 = j;
                if (zzr().zza(j2) && zzr().zzr.zza()) {
                    zzq().zzw().zza("Current session is expired, remove the session number, ID, and engagement time");
                    j3 = nextLong;
                    str5 = "_o";
                    zza("auto", "_sid", (Object) null, zzl().currentTimeMillis());
                    zza("auto", "_sno", (Object) null, zzl().currentTimeMillis());
                    zza("auto", "_se", (Object) null, zzl().currentTimeMillis());
                    if (zza3.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, 0L) != 1) {
                        zzq().zzw().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                        this.zzy.zzd().zza.zza(j2, true);
                    }
                    strArr = (String[]) zza3.keySet().toArray(new String[zza3.size()]);
                    Arrays.sort(strArr);
                    if (!zzmh.zzb() && zzs().zza(zzat.zzca) && zzs().zza(zzat.zzbz)) {
                        for (String str16 : strArr) {
                            zzo();
                            Bundle[] zzb2 = zzkx.zzb(zza3.get(str16));
                            if (zzb2 != null) {
                                zza3.putParcelableArray(str16, zzb2);
                            }
                        }
                        str6 = str5;
                        arrayList = arrayList3;
                        str7 = str4;
                        str8 = "_ae";
                    } else {
                        length = strArr.length;
                        i = 0;
                        i2 = 0;
                        while (i < length) {
                            String str17 = strArr[i];
                            Object obj = zza3.get(str17);
                            zzo();
                            String[] strArr2 = strArr;
                            Bundle[] zzb3 = zzkx.zzb(obj);
                            if (zzb3 != null) {
                                i3 = length;
                                zza3.putInt(str17, zzb3.length);
                                str9 = str5;
                                int i6 = 0;
                                while (i6 < zzb3.length) {
                                    Bundle bundle3 = zzb3[i6];
                                    zzim.zza(zzinVar3, bundle3, true);
                                    ArrayList arrayList4 = arrayList3;
                                    Bundle zza5 = zzo().zza(str3, "_ep", bundle3, listOf, z3, false);
                                    zza5.putString("_en", str2);
                                    zza5.putLong("_eid", j3);
                                    zza5.putString("_gn", str17);
                                    zza5.putInt("_ll", zzb3.length);
                                    zza5.putInt("_i", i6);
                                    arrayList4.add(zza5);
                                    i6++;
                                    zza3 = zza3;
                                    zzinVar3 = zzinVar3;
                                    listOf = listOf;
                                    str15 = str15;
                                    str4 = str2;
                                    arrayList3 = arrayList4;
                                }
                                list = listOf;
                                arrayList2 = arrayList3;
                                str10 = str4;
                                str11 = str15;
                                zzinVar = zzinVar3;
                                bundle2 = zza3;
                                j4 = j3;
                                i2 += zzb3.length;
                            } else {
                                list = listOf;
                                i3 = length;
                                str9 = str5;
                                arrayList2 = arrayList3;
                                str10 = str4;
                                str11 = str15;
                                zzinVar = zzinVar3;
                                bundle2 = zza3;
                                j4 = j3;
                            }
                            i++;
                            strArr = strArr2;
                            zza3 = bundle2;
                            j3 = j4;
                            length = i3;
                            zzinVar3 = zzinVar;
                            listOf = list;
                            str15 = str11;
                            str4 = str10;
                            str5 = str9;
                            arrayList3 = arrayList2;
                        }
                        str6 = str5;
                        arrayList = arrayList3;
                        str7 = str4;
                        str8 = str15;
                        Bundle bundle4 = zza3;
                        long j5 = j3;
                        if (i2 != 0) {
                            bundle4.putLong("_eid", j5);
                            bundle4.putInt("_epc", i2);
                        }
                    }
                    i4 = 0;
                    while (i4 < arrayList.size()) {
                        Bundle bundle5 = (Bundle) arrayList.get(i4);
                        if (i4 != 0) {
                            str14 = "_ep";
                            str12 = str;
                            str13 = str6;
                        } else {
                            str12 = str;
                            str13 = str6;
                            str14 = str7;
                        }
                        bundle5.putString(str13, str12);
                        if (z2) {
                            bundle5 = zzo().zza(bundle5);
                        }
                        Bundle bundle6 = bundle5;
                        zzg().zza(new zzar(str14, new zzam(bundle6), str, j), str3);
                        if (!equals) {
                            for (zzhc zzhcVar : this.zzd) {
                                zzhcVar.onEvent(str, str2, new Bundle(bundle6), j);
                            }
                        }
                        i4++;
                        str6 = str13;
                    }
                    if (zzh().zza(false) == null && str8.equals(str7)) {
                        zzj().zza(true, true, zzl().elapsedRealtime());
                        return;
                    }
                }
            } else {
                j2 = j;
            }
            j3 = nextLong;
            str5 = "_o";
            if (zza3.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, 0L) != 1) {
            }
            strArr = (String[]) zza3.keySet().toArray(new String[zza3.size()]);
            Arrays.sort(strArr);
            if (zzmh.zzb()) {
            }
            length = strArr.length;
            i = 0;
            i2 = 0;
            while (i < length) {
            }
            str6 = str5;
            arrayList = arrayList3;
            str7 = str4;
            str8 = str15;
            Bundle bundle42 = zza3;
            long j52 = j3;
            if (i2 != 0) {
            }
            i4 = 0;
            while (i4 < arrayList.size()) {
            }
            if (zzh().zza(false) == null) {
            }
        }
    }

    public final void zza(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (zzs().zza(zzat.zzbw) && zzkx.zzc(str2, FirebaseAnalytics.Event.SCREEN_VIEW)) {
            zzh().zza(bundle2, j);
            return;
        }
        zzp().zza(new zzhn(this, str3, str2, j, zzkx.zzb(bundle2), z2, !z2 || this.zzc == null || zzkx.zzd(str2), !z, null));
    }

    public final void zza(String str, String str2, Object obj, boolean z) {
        zza(str, str2, obj, true, zzl().currentTimeMillis());
    }

    public final void zza(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        if (z) {
            i = zzo().zzb(str2);
        } else {
            zzkx zzo = zzo();
            if (zzo.zza("user property", str2)) {
                if (!zzo.zza("user property", zzha.zza, str2)) {
                    i = 15;
                } else if (zzo.zza("user property", 24, str2)) {
                    i = 0;
                }
            }
        }
        if (i != 0) {
            zzo();
            this.zzy.zzh().zza(i, "_ev", zzkx.zza(str2, 24, true), str2 != null ? str2.length() : 0);
        } else if (obj != null) {
            int zzb = zzo().zzb(str2, obj);
            if (zzb != 0) {
                zzo();
                String zza = zzkx.zza(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    r0 = String.valueOf(obj).length();
                }
                this.zzy.zzh().zza(zzb, "_ev", zza, r0);
                return;
            }
            Object zzc = zzo().zzc(str2, obj);
            if (zzc != null) {
                zza(str3, str2, j, zzc);
            }
        } else {
            zza(str3, str2, j, (Object) null);
        }
    }

    private final void zza(String str, String str2, long j, Object obj) {
        zzp().zza(new zzhm(this, str, str2, obj, j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(String str, String str2, Object obj, long j) {
        String str3;
        Long l;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzc();
        zzv();
        if (FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!TextUtils.isEmpty(str4)) {
                    Long valueOf = Long.valueOf("false".equals(str4.toLowerCase(Locale.ENGLISH)) ? 1L : 0L);
                    zzr().zzn.zza(valueOf.longValue() == 1 ? "true" : "false");
                    l = valueOf;
                    str3 = "_npa";
                    if (!this.zzy.zzaa()) {
                        zzq().zzw().zza("User property not set since app measurement is disabled");
                        return;
                    } else if (this.zzy.zzaf()) {
                        zzg().zza(new zzkw(str3, j, l, str));
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (obj == null) {
                zzr().zzn.zza(AnchorMode.typeName0);
                l = obj;
                str3 = "_npa";
                if (!this.zzy.zzaa()) {
                }
            }
        }
        str3 = str2;
        l = obj;
        if (!this.zzy.zzaa()) {
        }
    }

    public final List<zzkw> zza(boolean z) {
        zzv();
        zzq().zzw().zza("Getting user properties (FE)");
        if (zzp().zzf()) {
            zzq().zze().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        } else if (zzx.zza()) {
            zzq().zze().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.zzy.zzp().zza(atomicReference, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, "get user properties", new zzhp(this, atomicReference, z));
            List<zzkw> list = (List) atomicReference.get();
            if (list == null) {
                zzq().zze().zza("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyList();
            }
            return list;
        }
    }

    public final String zzag() {
        return this.zzf.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(String str) {
        this.zzf.set(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(long j, boolean z) {
        zzc();
        zzv();
        zzq().zzv().zza("Resetting analytics data (FE)");
        zzkb zzj = zzj();
        zzj.zzc();
        zzj.zzb.zza();
        boolean zzaa = this.zzy.zzaa();
        zzfj zzr = zzr();
        zzr.zzh.zza(j);
        if (!TextUtils.isEmpty(zzr.zzr().zzu.zza())) {
            zzr.zzu.zza(null);
        }
        if (zzne.zzb() && zzr.zzs().zza(zzat.zzbr)) {
            zzr.zzp.zza(0L);
        }
        if (!zzr.zzs().zzf()) {
            zzr.zzb(!zzaa);
        }
        zzr.zzv.zza(null);
        zzr.zzw.zza(0L);
        zzr.zzx.zza(null);
        if (z) {
            zzg().zzac();
        }
        if (zzne.zzb() && zzs().zza(zzat.zzbr)) {
            zzj().zza.zza();
        }
        this.zzm = !zzaa;
    }

    public final void zzah() {
        zzc();
        zzv();
        if (this.zzy.zzaf()) {
            if (zzs().zza(zzat.zzbd)) {
                Boolean zzf = zzs().zzf("google_analytics_deferred_deep_link_enabled");
                if (zzf != null && zzf.booleanValue()) {
                    zzq().zzv().zza("Deferred Deep Link feature enabled.");
                    zzp().zza(new Runnable(this) { // from class: com.google.android.gms.measurement.internal.zzhg
                        private final zzhe zza;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            zzhe zzheVar = this.zza;
                            zzheVar.zzc();
                            if (zzheVar.zzr().zzs.zza()) {
                                zzheVar.zzq().zzv().zza("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long zza = zzheVar.zzr().zzt.zza();
                            zzheVar.zzr().zzt.zza(1 + zza);
                            if (zza >= 5) {
                                zzheVar.zzq().zzh().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                zzheVar.zzr().zzs.zza(true);
                                return;
                            }
                            zzheVar.zzy.zzag();
                        }
                    });
                }
            }
            zzg().zzad();
            this.zzm = false;
            String zzx = zzr().zzx();
            if (TextUtils.isEmpty(zzx)) {
                return;
            }
            zzk().zzaa();
            if (zzx.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", zzx);
            zza("auto", "_ou", bundle);
        }
    }

    public final void zza(zzhd zzhdVar) {
        zzhd zzhdVar2;
        zzc();
        zzv();
        if (zzhdVar != null && zzhdVar != (zzhdVar2 = this.zzc)) {
            Preconditions.checkState(zzhdVar2 == null, "EventInterceptor already set.");
        }
        this.zzc = zzhdVar;
    }

    public final void zza(zzhc zzhcVar) {
        zzv();
        Preconditions.checkNotNull(zzhcVar);
        if (this.zzd.add(zzhcVar)) {
            return;
        }
        zzq().zzh().zza("OnEventListener already registered");
    }

    public final void zzb(zzhc zzhcVar) {
        zzv();
        Preconditions.checkNotNull(zzhcVar);
        if (this.zzd.remove(zzhcVar)) {
            return;
        }
        zzq().zzh().zza("OnEventListener had not been registered");
    }

    public final void zza(Bundle bundle) {
        zza(bundle, zzl().currentTimeMillis());
    }

    public final void zza(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzq().zzh().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        zzb(bundle2, j);
    }

    public final void zzb(Bundle bundle) {
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotEmpty(bundle.getString("app_id"));
        zza();
        zzb(new Bundle(bundle), zzl().currentTimeMillis());
    }

    private final void zzb(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        zzgz.zza(bundle, "app_id", String.class, null);
        zzgz.zza(bundle, "origin", String.class, null);
        zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.NAME, String.class, null);
        zzgz.zza(bundle, "value", Object.class, null);
        zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        Preconditions.checkNotEmpty(bundle.getString("origin"));
        Preconditions.checkNotNull(bundle.get("value"));
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        Object obj = bundle.get("value");
        if (zzo().zzb(string) != 0) {
            zzq().zze().zza("Invalid conditional user property name", zzn().zzc(string));
        } else if (zzo().zzb(string, obj) != 0) {
            zzq().zze().zza("Invalid conditional user property value", zzn().zzc(string), obj);
        } else {
            Object zzc = zzo().zzc(string, obj);
            if (zzc == null) {
                zzq().zze().zza("Unable to normalize conditional user property value", zzn().zzc(string), obj);
                return;
            }
            zzgz.zza(bundle, zzc);
            long j2 = bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
            if (!TextUtils.isEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME)) && (j2 > 15552000000L || j2 < 1)) {
                zzq().zze().zza("Invalid conditional user property timeout", zzn().zzc(string), Long.valueOf(j2));
                return;
            }
            long j3 = bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
            if (j3 > 15552000000L || j3 < 1) {
                zzq().zze().zza("Invalid conditional user property time to live", zzn().zzc(string), Long.valueOf(j3));
            } else {
                zzp().zza(new zzhq(this, bundle));
            }
        }
    }

    public final void zzc(String str, String str2, Bundle bundle) {
        zzb((String) null, str, str2, bundle);
    }

    public final void zza(String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotEmpty(str);
        zza();
        zzb(str, str2, str3, bundle);
    }

    private final void zzb(String str, String str2, String str3, Bundle bundle) {
        long currentTimeMillis = zzl().currentTimeMillis();
        Preconditions.checkNotEmpty(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str3 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str3);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzp().zza(new zzhs(this, bundle2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(Bundle bundle) {
        zzc();
        zzv();
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        Preconditions.checkNotEmpty(bundle.getString("origin"));
        Preconditions.checkNotNull(bundle.get("value"));
        if (!this.zzy.zzaa()) {
            zzq().zzw().zza("Conditional property not set since app measurement is disabled");
            return;
        }
        try {
            zzg().zza(new zzw(bundle.getString("app_id"), bundle.getString("origin"), new zzkw(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP), bundle.get("value"), bundle.getString("origin")), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), false, bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), zzo().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS), bundle.getString("origin"), 0L, true, false, zzlj.zzb() && zzs().zza(zzat.zzcr)), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), zzo().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS), bundle.getString("origin"), 0L, true, false, zzlj.zzb() && zzs().zza(zzat.zzcr)), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzo().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), bundle.getString("origin"), 0L, true, false, zzlj.zzb() && zzs().zza(zzat.zzcr))));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(Bundle bundle) {
        zzc();
        zzv();
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        if (!this.zzy.zzaa()) {
            zzq().zzw().zza("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            zzg().zza(new zzw(bundle.getString("app_id"), bundle.getString("origin"), new zzkw(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), 0L, null, null), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzo().zza(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), bundle.getString("origin"), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, false, zzlj.zzb() && zzs().zza(zzat.zzcr))));
        } catch (IllegalArgumentException unused) {
        }
    }

    public final ArrayList<Bundle> zza(String str, String str2) {
        return zzb((String) null, str, str2);
    }

    public final ArrayList<Bundle> zza(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zza();
        return zzb(str, str2, str3);
    }

    private final ArrayList<Bundle> zzb(String str, String str2, String str3) {
        if (zzp().zzf()) {
            zzq().zze().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (zzx.zza()) {
            zzq().zze().zza("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.zzy.zzp().zza(atomicReference, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, "get conditional user properties", new zzhv(this, atomicReference, str, str2, str3));
            List list = (List) atomicReference.get();
            if (list == null) {
                zzq().zze().zza("Timed out waiting for get conditional user properties", str);
                return new ArrayList<>();
            }
            return zzkx.zzb((List<zzw>) list);
        }
    }

    public final Map<String, Object> zza(String str, String str2, boolean z) {
        return zzb((String) null, str, str2, z);
    }

    public final Map<String, Object> zza(String str, String str2, String str3, boolean z) {
        Preconditions.checkNotEmpty(str);
        zza();
        return zzb(str, str2, str3, z);
    }

    private final Map<String, Object> zzb(String str, String str2, String str3, boolean z) {
        if (zzp().zzf()) {
            zzq().zze().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (zzx.zza()) {
            zzq().zze().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.zzy.zzp().zza(atomicReference, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, "get user properties", new zzhu(this, atomicReference, str, str2, str3, z));
            List<zzkw> list = (List) atomicReference.get();
            if (list == null) {
                zzq().zze().zza("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyMap();
            }
            ArrayMap arrayMap = new ArrayMap(list.size());
            for (zzkw zzkwVar : list) {
                arrayMap.put(zzkwVar.zza, zzkwVar.zza());
            }
            return arrayMap;
        }
    }

    public final String zzai() {
        zzin zzaa = this.zzy.zzu().zzaa();
        if (zzaa != null) {
            return zzaa.zza;
        }
        return null;
    }

    public final String zzaj() {
        zzin zzaa = this.zzy.zzu().zzaa();
        if (zzaa != null) {
            return zzaa.zzb;
        }
        return null;
    }

    public final String zzak() {
        if (this.zzy.zzn() != null) {
            return this.zzy.zzn();
        }
        try {
            return zzik.zza(zzm(), "google_app_id");
        } catch (IllegalStateException e) {
            this.zzy.zzq().zze().zza("getGoogleAppId failed with exception", e);
            return null;
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
}
