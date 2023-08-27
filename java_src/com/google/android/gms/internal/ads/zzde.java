package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzde {
    static zzauf zzso;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzb(zzcz zzczVar) throws IllegalAccessException, InvocationTargetException {
        Method zza;
        zzauf zza2;
        if (zzso != null) {
            return true;
        }
        String str = (String) zzkb.zzik().zzd(zznk.zzbax);
        if (str == null || str.length() == 0) {
            str = null;
            if (zzczVar != null && (zza = zzczVar.zza("4o7tecxtkw7XaNt5hPj+0H1LvOi0SgxCIJTY9VcbazM/HSl/sFlxBFwnc8glnvoB", "RgSY6YxU2k1vLXOV3vapBnQwJDzYDlmX50wbm2tDcnw=")) != null) {
                str = (String) zza.invoke(null, new Object[0]);
            }
            if (str == null) {
                return false;
            }
        }
        try {
            zzauh zzh = zzaul.zzh(zzbi.zza(str, true));
            for (zzaxp zzaxpVar : zzavc.zzdht.zzaal()) {
                if (zzaxpVar.zzyw().isEmpty()) {
                    throw new GeneralSecurityException("Missing type_url.");
                }
                if (zzaxpVar.zzze().isEmpty()) {
                    throw new GeneralSecurityException("Missing primitive_name.");
                }
                if (zzaxpVar.zzzh().isEmpty()) {
                    throw new GeneralSecurityException("Missing catalogue_name.");
                }
                zzauo.zza(zzaxpVar.zzyw(), zzauo.zzdy(zzaxpVar.zzzh()).zzb(zzaxpVar.zzyw(), zzaxpVar.zzze(), zzaxpVar.zzzf()), zzaxpVar.zzzg());
            }
            zza2 = zzavf.zza(zzh);
            zzso = zza2;
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
        return zza2 != null;
    }
}
