package org.conscrypt;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
/* loaded from: classes2.dex */
public final class OpenSSLSignatureRawRSA extends SignatureSpi {
    private byte[] inputBuffer;
    private boolean inputIsTooLong;
    private int inputOffset;
    private OpenSSLKey key;

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) {
        OpenSSLKey openSSLRSAPrivateKey;
        if (privateKey instanceof OpenSSLRSAPrivateKey) {
            openSSLRSAPrivateKey = ((OpenSSLRSAPrivateKey) privateKey).getOpenSSLKey();
        } else if (privateKey instanceof RSAPrivateCrtKey) {
            openSSLRSAPrivateKey = OpenSSLRSAPrivateCrtKey.getInstance((RSAPrivateCrtKey) privateKey);
        } else if (!(privateKey instanceof RSAPrivateKey)) {
            throw new InvalidKeyException("Need RSA private key");
        } else {
            openSSLRSAPrivateKey = OpenSSLRSAPrivateKey.getInstance((RSAPrivateKey) privateKey);
        }
        this.key = openSSLRSAPrivateKey;
        this.inputBuffer = new byte[NativeCrypto.RSA_size(this.key.getNativeRef())];
        this.inputOffset = 0;
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) {
        OpenSSLKey openSSLRSAPublicKey;
        if (publicKey instanceof OpenSSLRSAPublicKey) {
            openSSLRSAPublicKey = ((OpenSSLRSAPublicKey) publicKey).getOpenSSLKey();
        } else if (!(publicKey instanceof RSAPublicKey)) {
            throw new InvalidKeyException("Need RSA public key");
        } else {
            openSSLRSAPublicKey = OpenSSLRSAPublicKey.getInstance((RSAPublicKey) publicKey);
        }
        this.key = openSSLRSAPublicKey;
        this.inputBuffer = new byte[NativeCrypto.RSA_size(this.key.getNativeRef())];
        this.inputOffset = 0;
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() {
        OpenSSLKey openSSLKey = this.key;
        if (openSSLKey != null) {
            if (this.inputIsTooLong) {
                throw new SignatureException("input length " + this.inputOffset + " != " + this.inputBuffer.length + " (modulus size)");
            }
            byte[] bArr = this.inputBuffer;
            byte[] bArr2 = new byte[bArr.length];
            try {
                try {
                    NativeCrypto.RSA_private_encrypt(this.inputOffset, bArr, bArr2, openSSLKey.getNativeRef(), 1);
                    return bArr2;
                } catch (Exception e) {
                    throw new SignatureException(e);
                }
            } finally {
                this.inputOffset = 0;
            }
        }
        throw new SignatureException("Need RSA private key");
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) {
        int i = this.inputOffset;
        int i2 = i + 1;
        this.inputOffset = i2;
        byte[] bArr = this.inputBuffer;
        if (i2 > bArr.length) {
            this.inputIsTooLong = true;
        } else {
            bArr[i] = b;
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        int i3 = this.inputOffset;
        int i4 = i3 + i2;
        this.inputOffset = i4;
        byte[] bArr2 = this.inputBuffer;
        if (i4 > bArr2.length) {
            this.inputIsTooLong = true;
        } else {
            System.arraycopy(bArr, i, bArr2, i3, i2);
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) {
        OpenSSLKey openSSLKey = this.key;
        if (openSSLKey != null) {
            if (this.inputIsTooLong) {
                return false;
            }
            int length = bArr.length;
            byte[] bArr2 = this.inputBuffer;
            if (length > bArr2.length) {
                throw new SignatureException("Input signature length is too large: " + bArr.length + " > " + this.inputBuffer.length);
            }
            byte[] bArr3 = new byte[bArr2.length];
            try {
                try {
                    try {
                        boolean z = true;
                        int RSA_public_decrypt = NativeCrypto.RSA_public_decrypt(bArr.length, bArr, bArr3, openSSLKey.getNativeRef(), 1);
                        if (RSA_public_decrypt != this.inputOffset) {
                            z = false;
                        }
                        for (int i = 0; i < RSA_public_decrypt; i++) {
                            if (this.inputBuffer[i] != bArr3[i]) {
                                z = false;
                            }
                        }
                        return z;
                    } catch (Exception e) {
                        throw new SignatureException(e);
                    }
                } catch (SignatureException e2) {
                    throw e2;
                } catch (Exception unused) {
                    return false;
                }
            } finally {
                this.inputOffset = 0;
            }
        }
        throw new SignatureException("Need RSA public key");
    }
}
