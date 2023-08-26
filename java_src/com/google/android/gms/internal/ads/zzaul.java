package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxr;
import java.security.GeneralSecurityException;
/* loaded from: classes2.dex */
public final class zzaul {
    @Deprecated
    public static final zzauh zzh(byte[] bArr) throws GeneralSecurityException {
        try {
            zzaxr zzj = zzaxr.zzj(bArr);
            for (zzaxr.zzb zzbVar : zzj.zzzl()) {
                if (zzbVar.zzzp().zzyy() == zzaxi.zzb.UNKNOWN_KEYMATERIAL || zzbVar.zzzp().zzyy() == zzaxi.zzb.SYMMETRIC || zzbVar.zzzp().zzyy() == zzaxi.zzb.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzauh.zza(zzj);
        } catch (zzbbu unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
