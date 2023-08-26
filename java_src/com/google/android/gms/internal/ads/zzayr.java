package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes2.dex */
public final class zzayr {
    private ECPublicKey zzdnj;

    public zzayr(ECPublicKey eCPublicKey) {
        this.zzdnj = eCPublicKey;
    }

    public final zzays zza(String str, byte[] bArr, byte[] bArr2, int i, zzayw zzaywVar) throws GeneralSecurityException {
        byte[] bArr3;
        KeyPair zza = zzayt.zza(this.zzdnj.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) zza.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) zza.getPrivate();
        ECPublicKey eCPublicKey2 = this.zzdnj;
        ECParameterSpec params = eCPublicKey2.getParams();
        ECParameterSpec params2 = eCPrivateKey.getParams();
        if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
            throw new GeneralSecurityException("invalid public key spec");
        }
        byte[] zza2 = zzayt.zza(eCPrivateKey, eCPublicKey2.getW());
        EllipticCurve curve = eCPublicKey.getParams().getCurve();
        ECPoint w = eCPublicKey.getW();
        zzayt.zza(w, curve);
        int zzb = zzayt.zzb(curve);
        int i2 = zzayu.zzdnm[zzaywVar.ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            int i4 = (zzb * 2) + 1;
            byte[] bArr4 = new byte[i4];
            byte[] byteArray = w.getAffineX().toByteArray();
            byte[] byteArray2 = w.getAffineY().toByteArray();
            System.arraycopy(byteArray2, 0, bArr4, i4 - byteArray2.length, byteArray2.length);
            System.arraycopy(byteArray, 0, bArr4, (zzb + 1) - byteArray.length, byteArray.length);
            bArr4[0] = 4;
            bArr3 = bArr4;
        } else if (i2 != 2) {
            String valueOf = String.valueOf(zzaywVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("invalid format:");
            sb.append(valueOf);
            throw new GeneralSecurityException(sb.toString());
        } else {
            int i5 = zzb + 1;
            bArr3 = new byte[i5];
            byte[] byteArray3 = w.getAffineX().toByteArray();
            System.arraycopy(byteArray3, 0, bArr3, i5 - byteArray3.length, byteArray3.length);
            bArr3[0] = (byte) (w.getAffineY().testBit(0) ? 3 : 2);
        }
        byte[] zza3 = zzayk.zza(bArr3, zza2);
        Mac zzek = zzayy.zzdoa.zzek(str);
        if (i > zzek.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr == null || bArr.length == 0) {
            zzek.init(new SecretKeySpec(new byte[zzek.getMacLength()], str));
        } else {
            zzek.init(new SecretKeySpec(bArr, str));
        }
        byte[] doFinal = zzek.doFinal(zza3);
        byte[] bArr5 = new byte[i];
        zzek.init(new SecretKeySpec(doFinal, str));
        byte[] bArr6 = new byte[0];
        int i6 = 0;
        while (true) {
            zzek.update(bArr6);
            zzek.update(bArr2);
            zzek.update((byte) i3);
            bArr6 = zzek.doFinal();
            if (bArr6.length + i6 >= i) {
                System.arraycopy(bArr6, 0, bArr5, i6, i - i6);
                return new zzays(bArr3, bArr5);
            }
            System.arraycopy(bArr6, 0, bArr5, i6, bArr6.length);
            i6 += bArr6.length;
            i3++;
        }
    }
}
