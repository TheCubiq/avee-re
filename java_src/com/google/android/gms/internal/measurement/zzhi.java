package com.google.android.gms.internal.measurement;

import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.internal.measurement.zzhv;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public class zzhi {
    private static volatile boolean zza = false;
    private static boolean zzb = true;
    private static volatile zzhi zzc;
    private static volatile zzhi zzd;
    private static final zzhi zze = new zzhi(true);
    private final Map<zza, zzhv.zzf<?, ?>> zzf;

    public static zzhi zza() {
        zzhi zzhiVar = zzc;
        if (zzhiVar == null) {
            synchronized (zzhi.class) {
                zzhiVar = zzc;
                if (zzhiVar == null) {
                    zzhiVar = zze;
                    zzc = zzhiVar;
                }
            }
        }
        return zzhiVar;
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    /* loaded from: classes2.dex */
    static final class zza {
        private final Object zza;
        private final int zzb;

        zza(Object obj, int i) {
            this.zza = obj;
            this.zzb = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.zza) * SupportMenu.USER_MASK) + this.zzb;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof zza) {
                zza zzaVar = (zza) obj;
                return this.zza == zzaVar.zza && this.zzb == zzaVar.zzb;
            }
            return false;
        }
    }

    public static zzhi zzb() {
        zzhi zzhiVar = zzd;
        if (zzhiVar != null) {
            return zzhiVar;
        }
        synchronized (zzhi.class) {
            zzhi zzhiVar2 = zzd;
            if (zzhiVar2 != null) {
                return zzhiVar2;
            }
            zzhi zza2 = zzht.zza(zzhi.class);
            zzd = zza2;
            return zza2;
        }
    }

    public final <ContainingType extends zzjg> zzhv.zzf<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzhv.zzf<ContainingType, ?>) this.zzf.get(new zza(containingtype, i));
    }

    zzhi() {
        this.zzf = new HashMap();
    }

    private zzhi(boolean z) {
        this.zzf = Collections.emptyMap();
    }
}
