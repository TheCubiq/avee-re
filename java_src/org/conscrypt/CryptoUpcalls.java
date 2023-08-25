package org.conscrypt;

import java.security.PrivateKey;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.logging.Logger;
/* loaded from: classes2.dex */
final class CryptoUpcalls {
    private static final Logger logger = Logger.getLogger(CryptoUpcalls.class.getName());

    private CryptoUpcalls() {
    }

    public static byte[] ecSignDigestWithPrivateKey(PrivateKey privateKey, byte[] bArr) {
        if ("EC".equals(privateKey.getAlgorithm())) {
            return signDigestWithPrivateKey(privateKey, bArr, "NONEwithECDSA");
        }
        throw new RuntimeException("Unexpected key type: " + privateKey.toString());
    }

    private static ArrayList<Provider> getExternalProviders(String str) {
        Provider[] providers;
        ArrayList<Provider> arrayList = new ArrayList<>(1);
        for (Provider provider : Security.getProviders(str)) {
            if (!Conscrypt.isConscrypt(provider)) {
                arrayList.add(provider);
            }
        }
        if (arrayList.isEmpty()) {
            logger.warning("Could not find external provider for algorithm: " + str);
        }
        return arrayList;
    }

    public static byte[] rsaDecryptWithPrivateKey(PrivateKey privateKey, int i, byte[] bArr) {
        return rsaOpWithPrivateKey(privateKey, i, 2, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
        if (org.conscrypt.Conscrypt.isConscrypt(r1.getProvider()) != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] rsaOpWithPrivateKey(java.security.PrivateKey r5, int r6, int r7, byte[] r8) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.conscrypt.CryptoUpcalls.rsaOpWithPrivateKey(java.security.PrivateKey, int, int, byte[]):byte[]");
    }

    public static byte[] rsaSignDigestWithPrivateKey(PrivateKey privateKey, int i, byte[] bArr) {
        return rsaOpWithPrivateKey(privateKey, i, 1, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (org.conscrypt.Conscrypt.isConscrypt(r1.getProvider()) != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] signDigestWithPrivateKey(java.security.PrivateKey r5, byte[] r6, java.lang.String r7) {
        /*
            r0 = 0
            java.security.Signature r1 = java.security.Signature.getInstance(r7)     // Catch: java.security.InvalidKeyException -> L13 java.security.NoSuchAlgorithmException -> L9c
            r1.initSign(r5)     // Catch: java.security.InvalidKeyException -> L13 java.security.NoSuchAlgorithmException -> L9c
            java.security.Provider r2 = r1.getProvider()     // Catch: java.security.InvalidKeyException -> L13 java.security.NoSuchAlgorithmException -> L9c
            boolean r2 = org.conscrypt.Conscrypt.isConscrypt(r2)     // Catch: java.security.InvalidKeyException -> L13 java.security.NoSuchAlgorithmException -> L9c
            if (r2 == 0) goto L1f
            goto L1e
        L13:
            r1 = move-exception
            java.util.logging.Logger r2 = org.conscrypt.CryptoUpcalls.logger
            java.lang.String r3 = "Preferred provider doesn't support key:"
            r2.warning(r3)
            r1.printStackTrace()
        L1e:
            r1 = r0
        L1f:
            if (r1 != 0) goto L71
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Signature."
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.util.ArrayList r2 = getExternalProviders(r2)
            java.util.Iterator r2 = r2.iterator()
            r3 = r0
        L3b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L55
            java.lang.Object r1 = r2.next()
            java.security.Provider r1 = (java.security.Provider) r1
            java.security.Signature r1 = java.security.Signature.getInstance(r7, r1)     // Catch: java.lang.RuntimeException -> L4f java.lang.Throwable -> L53
            r1.initSign(r5)     // Catch: java.lang.RuntimeException -> L4f java.lang.Throwable -> L53
            goto L55
        L4f:
            r1 = move-exception
            if (r3 != 0) goto L53
            r3 = r1
        L53:
            r1 = r0
            goto L3b
        L55:
            if (r1 != 0) goto L71
            if (r3 != 0) goto L70
            java.util.logging.Logger r5 = org.conscrypt.CryptoUpcalls.logger
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Could not find provider for algorithm: "
            r6.append(r1)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.warning(r6)
            return r0
        L70:
            throw r3
        L71:
            r1.update(r6)     // Catch: java.lang.Exception -> L79
            byte[] r5 = r1.sign()     // Catch: java.lang.Exception -> L79
            return r5
        L79:
            r6 = move-exception
            java.util.logging.Logger r7 = org.conscrypt.CryptoUpcalls.logger
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception while signing message with "
            r2.append(r3)
            java.lang.String r5 = r5.getAlgorithm()
            r2.append(r5)
            java.lang.String r5 = " private key:"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r7.log(r1, r5, r6)
            return r0
        L9c:
            java.util.logging.Logger r5 = org.conscrypt.CryptoUpcalls.logger
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Unsupported signature algorithm: "
            r6.append(r1)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.warning(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.conscrypt.CryptoUpcalls.signDigestWithPrivateKey(java.security.PrivateKey, byte[], java.lang.String):byte[]");
    }
}
