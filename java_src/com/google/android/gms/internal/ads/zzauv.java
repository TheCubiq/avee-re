package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi;
import java.security.GeneralSecurityException;
/* loaded from: classes2.dex */
final class zzauv implements zzaug<zzatz> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzaug
    /* renamed from: zzd */
    public final zzatz zza(zzbah zzbahVar) throws GeneralSecurityException {
        try {
            zzawe zzr = zzawe.zzr(zzbahVar);
            if (zzr instanceof zzawe) {
                zzawe zzaweVar = zzr;
                zzazq.zzj(zzaweVar.getVersion(), 0);
                zzazq.zzbi(zzaweVar.zzwv().size());
                return new zzayj(zzaweVar.zzwv().toByteArray());
            }
            throw new GeneralSecurityException("expected AesGcmKey proto");
        } catch (zzbbu unused) {
            throw new GeneralSecurityException("expected AesGcmKey proto");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final int getVersion() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final /* synthetic */ zzatz zza(zzbcu zzbcuVar) throws GeneralSecurityException {
        if (zzbcuVar instanceof zzawe) {
            zzawe zzaweVar = (zzawe) zzbcuVar;
            zzazq.zzj(zzaweVar.getVersion(), 0);
            zzazq.zzbi(zzaweVar.zzwv().size());
            return new zzayj(zzaweVar.zzwv().toByteArray());
        }
        throw new GeneralSecurityException("expected AesGcmKey proto");
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzbcu zzb(zzbah zzbahVar) throws GeneralSecurityException {
        try {
            return zzb(zzawg.zzt(zzbahVar));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzbcu zzb(zzbcu zzbcuVar) throws GeneralSecurityException {
        if (zzbcuVar instanceof zzawg) {
            zzawg zzawgVar = (zzawg) zzbcuVar;
            zzazq.zzbi(zzawgVar.getKeySize());
            return zzawe.zzxk().zzs(zzbah.zzo(zzazl.zzbh(zzawgVar.getKeySize()))).zzao(0).zzadi();
        }
        throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzaxi zzc(zzbah zzbahVar) throws GeneralSecurityException {
        return zzaxi.zzyz().zzeb("type.googleapis.com/google.crypto.tink.AesGcmKey").zzai(((zzawe) zzb(zzbahVar)).zzaav()).zzb(zzaxi.zzb.SYMMETRIC).zzadi();
    }
}
