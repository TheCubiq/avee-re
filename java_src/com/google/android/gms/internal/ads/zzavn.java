package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzayf;
import java.security.GeneralSecurityException;
/* loaded from: classes2.dex */
public final class zzavn {
    public static final zzayf zzdht = zzayf.zzaam().zzej("TINK_MAC_1_0_0").zzb(zzaub.zza("TinkMac", "Mac", "HmacKey", 0, true)).zzadi();
    private static final zzayf zzdhu = zzayf.zzaam().zza((zzayf.zza) zzdht).zzej("TINK_MAC_1_1_0").zzadi();

    static {
        try {
            zzwk();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zzwk() throws GeneralSecurityException {
        zzauo.zza("TinkMac", new zzavm());
    }
}
