package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes2.dex */
final class zzavk implements zzaug<zzauk> {
    private static void zza(zzaxg zzaxgVar) throws GeneralSecurityException {
        if (zzaxgVar.zzyt() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i = zzavl.zzdhz[zzaxgVar.zzys().ordinal()];
        if (i == 1) {
            if (zzaxgVar.zzyt() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 2) {
            if (zzaxgVar.zzyt() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i != 3) {
            throw new GeneralSecurityException("unknown hash type");
        } else {
            if (zzaxgVar.zzyt() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzaug
    /* renamed from: zzh */
    public final zzauk zza(zzbah zzbahVar) throws GeneralSecurityException {
        zzazj zzazjVar;
        try {
            zzaxc zzae = zzaxc.zzae(zzbahVar);
            if (zzae instanceof zzaxc) {
                zzaxc zzaxcVar = zzae;
                zzazq.zzj(zzaxcVar.getVersion(), 0);
                if (zzaxcVar.zzwv().size() >= 16) {
                    zza(zzaxcVar.zzym());
                    zzaxa zzys = zzaxcVar.zzym().zzys();
                    SecretKeySpec secretKeySpec = new SecretKeySpec(zzaxcVar.zzwv().toByteArray(), "HMAC");
                    int zzyt = zzaxcVar.zzym().zzyt();
                    int i = zzavl.zzdhz[zzys.ordinal()];
                    if (i == 1) {
                        zzazjVar = new zzazj("HMACSHA1", secretKeySpec, zzyt);
                    } else if (i == 2) {
                        zzazjVar = new zzazj("HMACSHA256", secretKeySpec, zzyt);
                    } else if (i != 3) {
                        throw new GeneralSecurityException("unknown hash");
                    } else {
                        zzazjVar = new zzazj("HMACSHA512", secretKeySpec, zzyt);
                    }
                    return zzazjVar;
                }
                throw new GeneralSecurityException("key too short");
            }
            throw new GeneralSecurityException("expected HmacKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized HmacKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final int getVersion() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final /* synthetic */ zzauk zza(zzbcu zzbcuVar) throws GeneralSecurityException {
        if (zzbcuVar instanceof zzaxc) {
            zzaxc zzaxcVar = (zzaxc) zzbcuVar;
            zzazq.zzj(zzaxcVar.getVersion(), 0);
            if (zzaxcVar.zzwv().size() >= 16) {
                zza(zzaxcVar.zzym());
                zzaxa zzys = zzaxcVar.zzym().zzys();
                SecretKeySpec secretKeySpec = new SecretKeySpec(zzaxcVar.zzwv().toByteArray(), "HMAC");
                int zzyt = zzaxcVar.zzym().zzyt();
                int i = zzavl.zzdhz[zzys.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            return new zzazj("HMACSHA512", secretKeySpec, zzyt);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new zzazj("HMACSHA256", secretKeySpec, zzyt);
                }
                return new zzazj("HMACSHA1", secretKeySpec, zzyt);
            }
            throw new GeneralSecurityException("key too short");
        }
        throw new GeneralSecurityException("expected HmacKey proto");
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzbcu zzb(zzbah zzbahVar) throws GeneralSecurityException {
        try {
            return zzb(zzaxe.zzag(zzbahVar));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzbcu zzb(zzbcu zzbcuVar) throws GeneralSecurityException {
        if (zzbcuVar instanceof zzaxe) {
            zzaxe zzaxeVar = (zzaxe) zzbcuVar;
            if (zzaxeVar.getKeySize() >= 16) {
                zza(zzaxeVar.zzym());
                return zzaxc.zzyn().zzav(0).zzc(zzaxeVar.zzym()).zzaf(zzbah.zzo(zzazl.zzbh(zzaxeVar.getKeySize()))).zzadi();
            }
            throw new GeneralSecurityException("key too short");
        }
        throw new GeneralSecurityException("expected HmacKeyFormat proto");
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzaxi zzc(zzbah zzbahVar) throws GeneralSecurityException {
        return zzaxi.zzyz().zzeb("type.googleapis.com/google.crypto.tink.HmacKey").zzai(((zzaxc) zzb(zzbahVar)).zzaav()).zzb(zzaxi.zzb.SYMMETRIC).zzadi();
    }
}
