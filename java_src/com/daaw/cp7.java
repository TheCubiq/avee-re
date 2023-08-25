package com.daaw;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
/* loaded from: classes.dex */
public final class cp7 {
    /* renamed from: a */
    public static int m25142a(EllipticCurve ellipticCurve) {
        return (m25141b(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    /* renamed from: b */
    public static BigInteger m25141b(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    /* renamed from: c */
    public static KeyPair m25140c(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) ep7.f8663j.m23314a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    /* renamed from: d */
    public static void m25139d(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        BigInteger m25141b = m25141b(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        }
        if (affineX.signum() == -1 || affineX.compareTo(m25141b) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        if (affineY.signum() == -1 || affineY.compareTo(m25141b) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        }
        if (!affineY.multiply(affineY).mod(m25141b).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(m25141b))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    /* renamed from: e */
    public static void m25138e(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        m25137f(eCPublicKey, eCPrivateKey);
        m25139d(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    /* renamed from: f */
    public static void m25137f(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        try {
            ECParameterSpec params = eCPublicKey.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (params.getCurve().equals(params2.getCurve()) && params.getGenerator().equals(params2.getGenerator()) && params.getOrder().equals(params2.getOrder()) && params.getCofactor() == params2.getCofactor()) {
                return;
            }
            throw new GeneralSecurityException("invalid public key spec");
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e);
        }
    }

    /* renamed from: g */
    public static byte[] m25136g(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        m25137f(eCPublicKey, eCPrivateKey);
        ECPoint w = eCPublicKey.getW();
        m25139d(w, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = ((KeyFactory) ep7.f8664k.m23314a("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) ep7.f8662i.m23314a("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(generatePublic, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(m25141b(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            BigInteger m25141b = m25141b(curve);
            BigInteger mod = bigInteger.multiply(bigInteger).add(curve.getA()).multiply(bigInteger).add(curve.getB()).mod(m25141b);
            if (m25141b.signum() == 1) {
                BigInteger mod2 = mod.mod(m25141b);
                BigInteger bigInteger2 = BigInteger.ZERO;
                if (!mod2.equals(bigInteger2)) {
                    if (m25141b.testBit(0) && m25141b.testBit(1)) {
                        bigInteger2 = mod2.modPow(m25141b.add(BigInteger.ONE).shiftRight(2), m25141b);
                    } else if (m25141b.testBit(0) && !m25141b.testBit(1)) {
                        bigInteger2 = BigInteger.ONE;
                        BigInteger shiftRight = m25141b.subtract(bigInteger2).shiftRight(1);
                        int i = 0;
                        while (true) {
                            BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(m25141b);
                            if (mod3.equals(BigInteger.ZERO)) {
                                break;
                            }
                            BigInteger modPow = mod3.modPow(shiftRight, m25141b);
                            BigInteger bigInteger3 = BigInteger.ONE;
                            if (modPow.add(bigInteger3).equals(m25141b)) {
                                BigInteger shiftRight2 = m25141b.add(bigInteger3).shiftRight(1);
                                BigInteger bigInteger4 = bigInteger2;
                                for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                    BigInteger multiply = bigInteger4.multiply(bigInteger3);
                                    bigInteger4 = bigInteger4.multiply(bigInteger4).add(bigInteger3.multiply(bigInteger3).mod(m25141b).multiply(mod3)).mod(m25141b);
                                    bigInteger3 = multiply.add(multiply).mod(m25141b);
                                    if (shiftRight2.testBit(bitLength)) {
                                        BigInteger mod4 = bigInteger4.multiply(bigInteger2).add(bigInteger3.multiply(mod3)).mod(m25141b);
                                        bigInteger3 = bigInteger2.multiply(bigInteger3).add(bigInteger4).mod(m25141b);
                                        bigInteger4 = mod4;
                                    }
                                }
                                bigInteger2 = bigInteger4;
                            } else if (!modPow.equals(bigInteger3)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            } else {
                                bigInteger2 = bigInteger2.add(bigInteger3);
                                i++;
                                if (i == 128 && !m25141b.isProbablePrime(80)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            }
                        }
                    } else {
                        bigInteger2 = null;
                    }
                    if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(m25141b).compareTo(mod2) != 0) {
                        throw new GeneralSecurityException("Could not find a modular square root");
                    }
                }
                if (!bigInteger2.testBit(0)) {
                    m25141b.subtract(bigInteger2).mod(m25141b);
                }
                return generateSecret;
            }
            throw new InvalidAlgorithmParameterException("p must be positive");
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e);
        }
    }

    /* renamed from: h */
    public static ECPrivateKey m25135h(int i, byte[] bArr) {
        return (ECPrivateKey) ((KeyFactory) ep7.f8664k.m23314a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), m25132k(i)));
    }

    /* renamed from: i */
    public static ECPublicKey m25134i(int i, byte[] bArr, byte[] bArr2) {
        ECParameterSpec m25132k = m25132k(i);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        m25139d(eCPoint, m25132k.getCurve());
        return (ECPublicKey) ((KeyFactory) ep7.f8664k.m23314a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, m25132k));
    }

    /* renamed from: j */
    public static ECPublicKey m25133j(ECParameterSpec eCParameterSpec, int i, byte[] bArr) {
        EllipticCurve curve = eCParameterSpec.getCurve();
        int m25142a = m25142a(curve);
        int length = bArr.length;
        if (length == m25142a + m25142a + 1) {
            if (bArr[0] == 4) {
                int i2 = m25142a + 1;
                ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i2)), new BigInteger(1, Arrays.copyOfRange(bArr, i2, length)));
                m25139d(eCPoint, curve);
                return (ECPublicKey) ((KeyFactory) ep7.f8664k.m23314a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
            }
            throw new GeneralSecurityException("invalid point format");
        }
        throw new GeneralSecurityException("invalid point size");
    }

    /* renamed from: k */
    public static ECParameterSpec m25132k(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2 = i - 1;
        if (i2 == 0) {
            str = "115792089210356248762697446949407573530086143415290314195533631308867097853951";
            str2 = "115792089210356248762697446949407573529996955224135760342422259061068512044369";
            str3 = "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b";
            str4 = "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296";
            str5 = "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5";
        } else if (i2 != 1) {
            str = "6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151";
            str2 = "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449";
            str3 = "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00";
            str4 = "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66";
            str5 = "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650";
        } else {
            str = "39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319";
            str2 = "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643";
            str3 = "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef";
            str4 = "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7";
            str5 = "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f";
        }
        return m25129n(str, str2, str3, str4, str5);
    }

    /* renamed from: l */
    public static byte[] m25131l(int i, int i2, ECPoint eCPoint) {
        return m25130m(m25132k(i).getCurve(), 1, eCPoint);
    }

    /* renamed from: m */
    public static byte[] m25130m(EllipticCurve ellipticCurve, int i, ECPoint eCPoint) {
        m25139d(eCPoint, ellipticCurve);
        int m25142a = m25142a(ellipticCurve);
        int i2 = i - 1;
        if (i2 == 0) {
            int i3 = m25142a + m25142a + 1;
            byte[] bArr = new byte[i3];
            byte[] byteArray = eCPoint.getAffineX().toByteArray();
            byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
            int length = byteArray2.length;
            System.arraycopy(byteArray2, 0, bArr, i3 - length, length);
            int length2 = byteArray.length;
            System.arraycopy(byteArray, 0, bArr, (m25142a + 1) - length2, length2);
            bArr[0] = 4;
            return bArr;
        }
        if (i2 != 2) {
            int i4 = m25142a + 1;
            byte[] bArr2 = new byte[i4];
            byte[] byteArray3 = eCPoint.getAffineX().toByteArray();
            int length3 = byteArray3.length;
            System.arraycopy(byteArray3, 0, bArr2, i4 - length3, length3);
            bArr2[0] = true == eCPoint.getAffineY().testBit(0) ? (byte) 3 : (byte) 2;
            return bArr2;
        }
        int i5 = m25142a + m25142a;
        byte[] bArr3 = new byte[i5];
        byte[] byteArray4 = eCPoint.getAffineX().toByteArray();
        int length4 = byteArray4.length;
        if (length4 > m25142a) {
            byteArray4 = Arrays.copyOfRange(byteArray4, length4 - m25142a, length4);
        }
        byte[] byteArray5 = eCPoint.getAffineY().toByteArray();
        int length5 = byteArray5.length;
        if (length5 > m25142a) {
            byteArray5 = Arrays.copyOfRange(byteArray5, length5 - m25142a, length5);
        }
        int length6 = byteArray5.length;
        System.arraycopy(byteArray5, 0, bArr3, i5 - length6, length6);
        int length7 = byteArray4.length;
        System.arraycopy(byteArray4, 0, bArr3, m25142a - length7, length7);
        return bArr3;
    }

    /* renamed from: n */
    public static ECParameterSpec m25129n(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }
}
