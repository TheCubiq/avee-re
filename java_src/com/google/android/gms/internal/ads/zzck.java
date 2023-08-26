package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes2.dex */
public final class zzck {
    private static Cipher zzrf;
    private static final Object zzrg = new Object();
    private static final Object zzrh = new Object();
    private final SecureRandom zzre = null;

    public zzck(SecureRandom secureRandom) {
    }

    private static Cipher getCipher() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (zzrh) {
            if (zzrf == null) {
                zzrf = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = zzrf;
        }
        return cipher;
    }

    public final byte[] zza(byte[] bArr, String str) throws zzcl {
        byte[] doFinal;
        if (bArr.length == 16) {
            try {
                byte[] zza = zzbi.zza(str, false);
                if (zza.length > 16) {
                    ByteBuffer allocate = ByteBuffer.allocate(zza.length);
                    allocate.put(zza);
                    allocate.flip();
                    byte[] bArr2 = new byte[16];
                    byte[] bArr3 = new byte[zza.length - 16];
                    allocate.get(bArr2);
                    allocate.get(bArr3);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    synchronized (zzrg) {
                        getCipher().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                        doFinal = getCipher().doFinal(bArr3);
                    }
                    return doFinal;
                }
                throw new zzcl(this);
            } catch (IllegalArgumentException e) {
                throw new zzcl(this, e);
            } catch (InvalidAlgorithmParameterException e2) {
                throw new zzcl(this, e2);
            } catch (InvalidKeyException e3) {
                throw new zzcl(this, e3);
            } catch (NoSuchAlgorithmException e4) {
                throw new zzcl(this, e4);
            } catch (BadPaddingException e5) {
                throw new zzcl(this, e5);
            } catch (IllegalBlockSizeException e6) {
                throw new zzcl(this, e6);
            } catch (NoSuchPaddingException e7) {
                throw new zzcl(this, e7);
            }
        }
        throw new zzcl(this);
    }

    public final String zzb(byte[] bArr, byte[] bArr2) throws zzcl {
        byte[] doFinal;
        byte[] iv;
        if (bArr.length == 16) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (zzrg) {
                    getCipher().init(1, secretKeySpec, (SecureRandom) null);
                    doFinal = getCipher().doFinal(bArr2);
                    iv = getCipher().getIV();
                }
                int length = doFinal.length + iv.length;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.put(iv).put(doFinal);
                allocate.flip();
                byte[] bArr3 = new byte[length];
                allocate.get(bArr3);
                return zzbi.zza(bArr3, false);
            } catch (InvalidKeyException e) {
                throw new zzcl(this, e);
            } catch (NoSuchAlgorithmException e2) {
                throw new zzcl(this, e2);
            } catch (BadPaddingException e3) {
                throw new zzcl(this, e3);
            } catch (IllegalBlockSizeException e4) {
                throw new zzcl(this, e4);
            } catch (NoSuchPaddingException e5) {
                throw new zzcl(this, e5);
            }
        }
        throw new zzcl(this);
    }

    public final byte[] zzl(String str) throws zzcl {
        try {
            byte[] zza = zzbi.zza(str, false);
            if (zza.length == 32) {
                byte[] bArr = new byte[16];
                ByteBuffer.wrap(zza, 4, 16).get(bArr);
                for (int i = 0; i < 16; i++) {
                    bArr[i] = (byte) (bArr[i] ^ 68);
                }
                return bArr;
            }
            throw new zzcl(this);
        } catch (IllegalArgumentException e) {
            throw new zzcl(this, e);
        }
    }
}
