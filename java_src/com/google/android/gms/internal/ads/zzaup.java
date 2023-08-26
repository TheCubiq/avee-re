package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxr;
import com.google.android.gms.internal.ads.zzaxt;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
/* loaded from: classes2.dex */
final class zzaup {
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    public static zzaxt zzb(zzaxr zzaxrVar) {
        zzaxt.zza zzbb = zzaxt.zzzu().zzbb(zzaxrVar.zzzk());
        for (zzaxr.zzb zzbVar : zzaxrVar.zzzl()) {
            zzbb.zzb(zzaxt.zzb.zzzw().zzeh(zzbVar.zzzp().zzyw()).zzb(zzbVar.zzzq()).zzb(zzbVar.zzzs()).zzbd(zzbVar.zzzr()).zzadi());
        }
        return zzbb.zzadi();
    }

    public static void zzc(zzaxr zzaxrVar) throws GeneralSecurityException {
        if (zzaxrVar.zzzm() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        int zzzk = zzaxrVar.zzzk();
        boolean z = false;
        boolean z2 = true;
        for (zzaxr.zzb zzbVar : zzaxrVar.zzzl()) {
            if (!zzbVar.zzzo()) {
                throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzbVar.zzzr())));
            }
            if (zzbVar.zzzs() == zzayd.UNKNOWN_PREFIX) {
                throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzbVar.zzzr())));
            }
            if (zzbVar.zzzq() == zzaxl.UNKNOWN_STATUS) {
                throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzbVar.zzzr())));
            }
            if (zzbVar.zzzq() == zzaxl.ENABLED && zzbVar.zzzr() == zzzk) {
                if (z) {
                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                }
                z = true;
            }
            if (zzbVar.zzzp().zzyy() != zzaxi.zzb.ASYMMETRIC_PUBLIC) {
                z2 = false;
            }
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
