package org.conscrypt;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
/* loaded from: classes2.dex */
public final class OpenSSLECKeyFactory extends KeyFactorySpi {
    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec != null) {
            if (keySpec instanceof ECPrivateKeySpec) {
                return new OpenSSLECPrivateKey((ECPrivateKeySpec) keySpec);
            }
            if (keySpec instanceof PKCS8EncodedKeySpec) {
                return OpenSSLKey.getPrivateKey((PKCS8EncodedKeySpec) keySpec, NativeConstants.EVP_PKEY_EC);
            }
            throw new InvalidKeySpecException("Must use ECPrivateKeySpec or PKCS8EncodedKeySpec; was " + keySpec.getClass().getName());
        }
        throw new InvalidKeySpecException("keySpec == null");
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec != null) {
            if (keySpec instanceof ECPublicKeySpec) {
                return new OpenSSLECPublicKey((ECPublicKeySpec) keySpec);
            }
            if (keySpec instanceof X509EncodedKeySpec) {
                return OpenSSLKey.getPublicKey((X509EncodedKeySpec) keySpec, NativeConstants.EVP_PKEY_EC);
            }
            throw new InvalidKeySpecException("Must use ECPublicKeySpec or X509EncodedKeySpec; was " + keySpec.getClass().getName());
        }
        throw new InvalidKeySpecException("keySpec == null");
    }

    @Override // java.security.KeyFactorySpi
    public <T extends KeySpec> T engineGetKeySpec(Key key, Class<T> cls) {
        if (key != null) {
            if (cls != null) {
                if ("EC".equals(key.getAlgorithm())) {
                    if ((key instanceof ECPublicKey) && ECPublicKeySpec.class.isAssignableFrom(cls)) {
                        ECPublicKey eCPublicKey = (ECPublicKey) key;
                        return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
                    }
                    boolean z = key instanceof PublicKey;
                    if (z && ECPublicKeySpec.class.isAssignableFrom(cls)) {
                        byte[] encoded = key.getEncoded();
                        if (!"X.509".equals(key.getFormat()) || encoded == null) {
                            throw new InvalidKeySpecException("Not a valid X.509 encoding");
                        }
                        ECPublicKey eCPublicKey2 = (ECPublicKey) engineGeneratePublic(new X509EncodedKeySpec(encoded));
                        return new ECPublicKeySpec(eCPublicKey2.getW(), eCPublicKey2.getParams());
                    } else if ((key instanceof ECPrivateKey) && ECPrivateKeySpec.class.isAssignableFrom(cls)) {
                        ECPrivateKey eCPrivateKey = (ECPrivateKey) key;
                        return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
                    } else {
                        boolean z2 = key instanceof PrivateKey;
                        if (z2 && ECPrivateKeySpec.class.isAssignableFrom(cls)) {
                            byte[] encoded2 = key.getEncoded();
                            if (!"PKCS#8".equals(key.getFormat()) || encoded2 == null) {
                                throw new InvalidKeySpecException("Not a valid PKCS#8 encoding");
                            }
                            ECPrivateKey eCPrivateKey2 = (ECPrivateKey) engineGeneratePrivate(new PKCS8EncodedKeySpec(encoded2));
                            return new ECPrivateKeySpec(eCPrivateKey2.getS(), eCPrivateKey2.getParams());
                        } else if (z2 && PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                            byte[] encoded3 = key.getEncoded();
                            if ("PKCS#8".equals(key.getFormat())) {
                                if (encoded3 != null) {
                                    return new PKCS8EncodedKeySpec(encoded3);
                                }
                                throw new InvalidKeySpecException("Key is not encodable");
                            }
                            throw new InvalidKeySpecException("Encoding type must be PKCS#8; was " + key.getFormat());
                        } else if (!z || !X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                            throw new InvalidKeySpecException("Unsupported key type and key spec combination; key=" + key.getClass().getName() + ", keySpec=" + cls.getName());
                        } else {
                            byte[] encoded4 = key.getEncoded();
                            if ("X.509".equals(key.getFormat())) {
                                if (encoded4 != null) {
                                    return new X509EncodedKeySpec(encoded4);
                                }
                                throw new InvalidKeySpecException("Key is not encodable");
                            }
                            throw new InvalidKeySpecException("Encoding type must be X.509; was " + key.getFormat());
                        }
                    }
                }
                throw new InvalidKeySpecException("Key must be an EC key");
            }
            throw new InvalidKeySpecException("keySpec == null");
        }
        throw new InvalidKeySpecException("key == null");
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) {
        if (key != null) {
            if ((key instanceof OpenSSLECPublicKey) || (key instanceof OpenSSLECPrivateKey)) {
                return key;
            }
            if (key instanceof ECPublicKey) {
                ECPublicKey eCPublicKey = (ECPublicKey) key;
                try {
                    return engineGeneratePublic(new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams()));
                } catch (InvalidKeySpecException e) {
                    throw new InvalidKeyException(e);
                }
            } else if (key instanceof ECPrivateKey) {
                ECPrivateKey eCPrivateKey = (ECPrivateKey) key;
                try {
                    return engineGeneratePrivate(new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams()));
                } catch (InvalidKeySpecException e2) {
                    throw new InvalidKeyException(e2);
                }
            } else if ((key instanceof PrivateKey) && "PKCS#8".equals(key.getFormat())) {
                byte[] encoded = key.getEncoded();
                if (encoded != null) {
                    try {
                        return engineGeneratePrivate(new PKCS8EncodedKeySpec(encoded));
                    } catch (InvalidKeySpecException e3) {
                        throw new InvalidKeyException(e3);
                    }
                }
                throw new InvalidKeyException("Key does not support encoding");
            } else if (!(key instanceof PublicKey) || !"X.509".equals(key.getFormat())) {
                throw new InvalidKeyException("Key must be EC public or private key; was " + key.getClass().getName());
            } else {
                byte[] encoded2 = key.getEncoded();
                if (encoded2 != null) {
                    try {
                        return engineGeneratePublic(new X509EncodedKeySpec(encoded2));
                    } catch (InvalidKeySpecException e4) {
                        throw new InvalidKeyException(e4);
                    }
                }
                throw new InvalidKeyException("Key does not support encoding");
            }
        }
        throw new InvalidKeyException("key == null");
    }
}
