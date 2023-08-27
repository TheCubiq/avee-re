package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class zzayx implements zzatz {
    private final zzazi zzdnv;
    private final zzauk zzdnw;
    private final int zzdnx;

    public zzayx(zzazi zzaziVar, zzauk zzaukVar, int i) {
        this.zzdnv = zzaziVar;
        this.zzdnw = zzaukVar;
        this.zzdnx = i;
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzk = this.zzdnv.zzk(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return zzayk.zza(zzk, this.zzdnw.zzg(zzayk.zza(bArr2, zzk, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }
}
