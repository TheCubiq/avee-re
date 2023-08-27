package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi;
import java.security.GeneralSecurityException;
/* loaded from: classes2.dex */
final class zzauw implements zzaug<zzatz> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzaug
    /* renamed from: zzd */
    public final zzatz zza(zzbah zzbahVar) throws GeneralSecurityException {
        try {
            zzawi zzu = zzawi.zzu(zzbahVar);
            if (zzu instanceof zzawi) {
                zzawi zzawiVar = zzu;
                zzazq.zzj(zzawiVar.getVersion(), 0);
                if (zzawiVar.zzwv().size() == 32) {
                    return new zzaym(zzawiVar.zzwv().toByteArray());
                }
                throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
            }
            throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305 key", e);
        }
    }

    private static zzawi zzwl() throws GeneralSecurityException {
        return zzawi.zzxn().zzap(0).zzv(zzbah.zzo(zzazl.zzbh(32))).zzadi();
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final int getVersion() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final /* synthetic */ zzatz zza(zzbcu zzbcuVar) throws GeneralSecurityException {
        if (zzbcuVar instanceof zzawi) {
            zzawi zzawiVar = (zzawi) zzbcuVar;
            zzazq.zzj(zzawiVar.getVersion(), 0);
            if (zzawiVar.zzwv().size() == 32) {
                return new zzaym(zzawiVar.zzwv().toByteArray());
            }
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
        throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzbcu zzb(zzbah zzbahVar) throws GeneralSecurityException {
        return zzwl();
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzbcu zzb(zzbcu zzbcuVar) throws GeneralSecurityException {
        return zzwl();
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzaxi zzc(zzbah zzbahVar) throws GeneralSecurityException {
        return zzaxi.zzyz().zzeb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").zzai(zzwl().zzaav()).zzb(zzaxi.zzb.SYMMETRIC).zzadi();
    }
}
