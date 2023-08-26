package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbv;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public abstract class zzv {
    String zza;
    int zzb;
    Boolean zzc;
    Boolean zzd;
    Long zze;
    Long zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzv(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zzb();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zzc();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean zza(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean zza(String str, zzbv.zzf zzfVar, zzex zzexVar) {
        String zzd;
        List<String> list;
        Preconditions.checkNotNull(zzfVar);
        if (str == null || !zzfVar.zza() || zzfVar.zzb() == zzbv.zzf.zzb.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (zzfVar.zzb() == zzbv.zzf.zzb.IN_LIST) {
            if (zzfVar.zzh() == 0) {
                return null;
            }
        } else if (!zzfVar.zzc()) {
            return null;
        }
        zzbv.zzf.zzb zzb = zzfVar.zzb();
        boolean zzf = zzfVar.zzf();
        if (zzf || zzb == zzbv.zzf.zzb.REGEXP || zzb == zzbv.zzf.zzb.IN_LIST) {
            zzd = zzfVar.zzd();
        } else {
            zzd = zzfVar.zzd().toUpperCase(Locale.ENGLISH);
        }
        String str2 = zzd;
        if (zzfVar.zzh() == 0) {
            list = null;
        } else {
            List<String> zzg = zzfVar.zzg();
            if (!zzf) {
                ArrayList arrayList = new ArrayList(zzg.size());
                for (String str3 : zzg) {
                    arrayList.add(str3.toUpperCase(Locale.ENGLISH));
                }
                zzg = Collections.unmodifiableList(arrayList);
            }
            list = zzg;
        }
        return zza(str, zzb, zzf, str2, list, zzb == zzbv.zzf.zzb.REGEXP ? str2 : null, zzexVar);
    }

    private static Boolean zza(String str, zzbv.zzf.zzb zzbVar, boolean z, String str2, List<String> list, String str3, zzex zzexVar) {
        if (str == null) {
            return null;
        }
        if (zzbVar == zzbv.zzf.zzb.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && zzbVar != zzbv.zzf.zzb.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (zzr.zza[zzbVar.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (zzexVar != null) {
                        zzexVar.zzh().zza("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean zza(long j, zzbv.zzd zzdVar) {
        try {
            return zza(new BigDecimal(j), zzdVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean zza(double d, zzbv.zzd zzdVar) {
        try {
            return zza(new BigDecimal(d), zzdVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean zza(String str, zzbv.zzd zzdVar) {
        if (zzkt.zza(str)) {
            try {
                return zza(new BigDecimal(str), zzdVar, 0.0d);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
        if (r2 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Boolean zza(BigDecimal bigDecimal, zzbv.zzd zzdVar, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.checkNotNull(zzdVar);
        if (zzdVar.zza() && zzdVar.zzb() != zzbv.zzd.zza.UNKNOWN_COMPARISON_TYPE) {
            if (zzdVar.zzb() == zzbv.zzd.zza.BETWEEN) {
                if (!zzdVar.zzg() || !zzdVar.zzi()) {
                    return null;
                }
            } else if (!zzdVar.zze()) {
                return null;
            }
            zzbv.zzd.zza zzb = zzdVar.zzb();
            if (zzdVar.zzb() == zzbv.zzd.zza.BETWEEN) {
                if (zzkt.zza(zzdVar.zzh()) && zzkt.zza(zzdVar.zzj())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(zzdVar.zzh());
                        bigDecimal4 = new BigDecimal(zzdVar.zzj());
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            } else if (!zzkt.zza(zzdVar.zzf())) {
                return null;
            } else {
                try {
                    bigDecimal2 = new BigDecimal(zzdVar.zzf());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
            }
            if (zzb == zzbv.zzd.zza.BETWEEN) {
                if (bigDecimal3 == null) {
                    return null;
                }
            }
            int i = zzr.zzb[zzb.ordinal()];
            if (i == 1) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == -1);
            } else if (i == 2) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 1);
            } else if (i == 3) {
                if (d == 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                }
                if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) == 1 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) == -1) {
                    r5 = true;
                }
                return Boolean.valueOf(r5);
            } else if (i == 4) {
                if (bigDecimal.compareTo(bigDecimal3) != -1 && bigDecimal.compareTo(bigDecimal4) != 1) {
                    r5 = true;
                }
                return Boolean.valueOf(r5);
            }
        }
        return null;
    }
}
