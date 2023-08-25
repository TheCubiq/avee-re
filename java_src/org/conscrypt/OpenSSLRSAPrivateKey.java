package org.conscrypt;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Objects;
/* loaded from: classes2.dex */
class OpenSSLRSAPrivateKey implements RSAPrivateKey, OpenSSLKeyHolder {
    private static final long serialVersionUID = 4872170254439578735L;
    public transient boolean fetchedParams;
    public transient OpenSSLKey key;
    public BigInteger modulus;
    public BigInteger privateExponent;

    public OpenSSLRSAPrivateKey(RSAPrivateKeySpec rSAPrivateKeySpec) {
        this(init(rSAPrivateKeySpec));
    }

    public OpenSSLRSAPrivateKey(OpenSSLKey openSSLKey) {
        this.key = openSSLKey;
    }

    public OpenSSLRSAPrivateKey(OpenSSLKey openSSLKey, byte[][] bArr) {
        this(openSSLKey);
        readParams(bArr);
        this.fetchedParams = true;
    }

    public static OpenSSLKey getInstance(RSAPrivateKey rSAPrivateKey) {
        if (rSAPrivateKey.getFormat() == null) {
            return wrapPlatformKey(rSAPrivateKey);
        }
        BigInteger modulus = rSAPrivateKey.getModulus();
        BigInteger privateExponent = rSAPrivateKey.getPrivateExponent();
        if (modulus != null) {
            if (privateExponent != null) {
                try {
                    return new OpenSSLKey(NativeCrypto.EVP_PKEY_new_RSA(modulus.toByteArray(), null, privateExponent.toByteArray(), null, null, null, null, null));
                } catch (Exception e) {
                    throw new InvalidKeyException(e);
                }
            }
            throw new InvalidKeyException("privateExponent == null");
        }
        throw new InvalidKeyException("modulus == null");
    }

    public static OpenSSLRSAPrivateKey getInstance(OpenSSLKey openSSLKey) {
        byte[][] bArr = NativeCrypto.get_RSA_private_params(openSSLKey.getNativeRef());
        return bArr[1] != null ? new OpenSSLRSAPrivateCrtKey(openSSLKey, bArr) : new OpenSSLRSAPrivateKey(openSSLKey, bArr);
    }

    private static OpenSSLKey init(RSAPrivateKeySpec rSAPrivateKeySpec) {
        BigInteger modulus = rSAPrivateKeySpec.getModulus();
        BigInteger privateExponent = rSAPrivateKeySpec.getPrivateExponent();
        if (modulus != null) {
            if (privateExponent != null) {
                try {
                    return new OpenSSLKey(NativeCrypto.EVP_PKEY_new_RSA(modulus.toByteArray(), null, privateExponent.toByteArray(), null, null, null, null, null));
                } catch (Exception e) {
                    throw new InvalidKeySpecException(e);
                }
            }
            throw new InvalidKeySpecException("privateExponent == null");
        }
        throw new InvalidKeySpecException("modulus == null");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.key = new OpenSSLKey(NativeCrypto.EVP_PKEY_new_RSA(this.modulus.toByteArray(), null, this.privateExponent.toByteArray(), null, null, null, null, null));
        this.fetchedParams = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.conscrypt.OpenSSLKey wrapJCAPrivateKeyForTLSStackOnly(java.security.PrivateKey r3, java.security.PublicKey r4) {
        /*
            boolean r0 = r3 instanceof java.security.interfaces.RSAKey
            if (r0 == 0) goto Lc
            r0 = r3
            java.security.interfaces.RSAKey r0 = (java.security.interfaces.RSAKey) r0
        L7:
            java.math.BigInteger r0 = r0.getModulus()
            goto L15
        Lc:
            boolean r0 = r4 instanceof java.security.interfaces.RSAKey
            if (r0 == 0) goto L14
            r0 = r4
            java.security.interfaces.RSAKey r0 = (java.security.interfaces.RSAKey) r0
            goto L7
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L26
            org.conscrypt.OpenSSLKey r4 = new org.conscrypt.OpenSSLKey
            byte[] r0 = r0.toByteArray()
            long r0 = org.conscrypt.NativeCrypto.getRSAPrivateKeyWrapper(r3, r0)
            r3 = 1
            r4.<init>(r0, r3)
            return r4
        L26:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "RSA modulus not available. Private: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ", public: "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            goto L46
        L45:
            throw r0
        L46:
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: org.conscrypt.OpenSSLRSAPrivateKey.wrapJCAPrivateKeyForTLSStackOnly(java.security.PrivateKey, java.security.PublicKey):org.conscrypt.OpenSSLKey");
    }

    public static OpenSSLKey wrapPlatformKey(RSAPrivateKey rSAPrivateKey) {
        OpenSSLKey wrapRsaKey = Platform.wrapRsaKey(rSAPrivateKey);
        return wrapRsaKey != null ? wrapRsaKey : new OpenSSLKey(NativeCrypto.getRSAPrivateKeyWrapper(rSAPrivateKey, rSAPrivateKey.getModulus().toByteArray()), true);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        if (this.key.isHardwareBacked()) {
            throw new NotSerializableException("Hardware backed keys can not be serialized");
        }
        ensureReadParams();
        objectOutputStream.defaultWriteObject();
    }

    public final synchronized void ensureReadParams() {
        if (this.fetchedParams) {
            return;
        }
        readParams(NativeCrypto.get_RSA_private_params(this.key.getNativeRef()));
        this.fetchedParams = true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OpenSSLRSAPrivateKey) {
            return this.key.equals(((OpenSSLRSAPrivateKey) obj).getOpenSSLKey());
        }
        if (obj instanceof RSAPrivateKey) {
            ensureReadParams();
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) obj;
            return this.modulus.equals(rSAPrivateKey.getModulus()) && this.privateExponent.equals(rSAPrivateKey.getPrivateExponent());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "RSA";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.key.isHardwareBacked()) {
            return null;
        }
        return NativeCrypto.EVP_marshal_private_key(this.key.getNativeRef());
    }

    @Override // java.security.Key
    public final String getFormat() {
        if (this.key.isHardwareBacked()) {
            return null;
        }
        return "PKCS#8";
    }

    @Override // java.security.interfaces.RSAKey
    public final BigInteger getModulus() {
        ensureReadParams();
        return this.modulus;
    }

    @Override // org.conscrypt.OpenSSLKeyHolder
    public OpenSSLKey getOpenSSLKey() {
        return this.key;
    }

    @Override // java.security.interfaces.RSAPrivateKey
    public final BigInteger getPrivateExponent() {
        if (this.key.isHardwareBacked()) {
            throw new UnsupportedOperationException("Private exponent cannot be extracted");
        }
        ensureReadParams();
        return this.privateExponent;
    }

    public int hashCode() {
        ensureReadParams();
        int hashCode = 3 + this.modulus.hashCode();
        BigInteger bigInteger = this.privateExponent;
        return bigInteger != null ? (hashCode * 7) + bigInteger.hashCode() : hashCode;
    }

    public void readParams(byte[][] bArr) {
        Objects.requireNonNull(bArr[0], "modulus == null");
        if (bArr[2] == null && !this.key.isHardwareBacked()) {
            throw new NullPointerException("privateExponent == null");
        }
        this.modulus = new BigInteger(bArr[0]);
        if (bArr[2] != null) {
            this.privateExponent = new BigInteger(bArr[2]);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OpenSSLRSAPrivateKey{");
        ensureReadParams();
        sb.append("modulus=");
        sb.append(this.modulus.toString(16));
        return sb.toString();
    }
}
