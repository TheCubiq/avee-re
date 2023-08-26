package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* loaded from: classes2.dex */
public final class zzauh {
    private zzaxr zzdhi;

    private zzauh(zzaxr zzaxrVar) {
        this.zzdhi = zzaxrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final zzauh zza(zzaxr zzaxrVar) throws GeneralSecurityException {
        if (zzaxrVar == null || zzaxrVar.zzzm() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzauh(zzaxrVar);
    }

    public final String toString() {
        return zzaup.zzb(this.zzdhi).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzaxr zzwg() {
        return this.zzdhi;
    }
}
