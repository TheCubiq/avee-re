package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes2.dex */
final class zzavh {
    public static zzayv zza(zzawy zzawyVar) throws GeneralSecurityException {
        int i = zzavi.zzdia[zzawyVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return zzayv.NIST_P521;
                }
                String valueOf = String.valueOf(zzawyVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown curve type: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
            }
            return zzayv.NIST_P384;
        }
        return zzayv.NIST_P256;
    }

    public static zzayw zza(zzawk zzawkVar) throws GeneralSecurityException {
        int i = zzavi.zzdib[zzawkVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return zzayw.COMPRESSED;
            }
            String valueOf = String.valueOf(zzawkVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("unknown point format: ");
            sb.append(valueOf);
            throw new GeneralSecurityException(sb.toString());
        }
        return zzayw.UNCOMPRESSED;
    }

    public static String zza(zzaxa zzaxaVar) throws NoSuchAlgorithmException {
        int i = zzavi.zzdhz[zzaxaVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "HmacSha512";
                }
                String valueOf = String.valueOf(zzaxaVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                sb.append("hash unsupported for HMAC: ");
                sb.append(valueOf);
                throw new NoSuchAlgorithmException(sb.toString());
            }
            return "HmacSha256";
        }
        return "HmacSha1";
    }

    public static void zza(zzawq zzawqVar) throws GeneralSecurityException {
        zzayt.zza(zza(zzawqVar.zzxu().zzyh()));
        zza(zzawqVar.zzxu().zzyi());
        if (zzawqVar.zzxw() == zzawk.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        zzauo.zza(zzawqVar.zzxv().zzxp());
    }
}
