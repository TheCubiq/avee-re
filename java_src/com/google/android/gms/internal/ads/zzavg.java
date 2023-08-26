package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* loaded from: classes2.dex */
final class zzavg implements zzauf {
    private final /* synthetic */ zzaum zzdhy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavg(zzaum zzaumVar) {
        this.zzdhy = zzaumVar;
    }

    @Override // com.google.android.gms.internal.ads.zzauf
    public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzayk.zza(this.zzdhy.zzwh().zzwj(), ((zzauf) this.zzdhy.zzwh().zzwi()).zzc(bArr, bArr2));
    }
}
