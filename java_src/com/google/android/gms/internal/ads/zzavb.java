package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* loaded from: classes2.dex */
final class zzavb implements zzaug<zzauf> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzaug
    /* renamed from: zzg */
    public final zzauf zza(zzbah zzbahVar) throws GeneralSecurityException {
        try {
            zzawu zzab = zzawu.zzab(zzbahVar);
            if (zzab instanceof zzawu) {
                zzawu zzawuVar = zzab;
                zzazq.zzj(zzawuVar.getVersion(), 0);
                zzavh.zza(zzawuVar.zzxs());
                zzawq zzxs = zzawuVar.zzxs();
                zzaww zzxu = zzxs.zzxu();
                return new zzayp(zzayt.zza(zzavh.zza(zzxu.zzyh()), zzawuVar.zzyc().toByteArray(), zzawuVar.zzyd().toByteArray()), zzxu.zzyj().toByteArray(), zzavh.zza(zzxu.zzyi()), zzavh.zza(zzxs.zzxw()), new zzavj(zzxs.zzxv().zzxp()));
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPublicKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final int getVersion() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final /* synthetic */ zzauf zza(zzbcu zzbcuVar) throws GeneralSecurityException {
        if (zzbcuVar instanceof zzawu) {
            zzawu zzawuVar = (zzawu) zzbcuVar;
            zzazq.zzj(zzawuVar.getVersion(), 0);
            zzavh.zza(zzawuVar.zzxs());
            zzawq zzxs = zzawuVar.zzxs();
            zzaww zzxu = zzxs.zzxu();
            return new zzayp(zzayt.zza(zzavh.zza(zzxu.zzyh()), zzawuVar.zzyc().toByteArray(), zzawuVar.zzyd().toByteArray()), zzxu.zzyj().toByteArray(), zzavh.zza(zzxu.zzyi()), zzavh.zza(zzxs.zzxw()), new zzavj(zzxs.zzxv().zzxp()));
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzbcu zzb(zzbah zzbahVar) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzbcu zzb(zzbcu zzbcuVar) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzaxi zzc(zzbah zzbahVar) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }
}
