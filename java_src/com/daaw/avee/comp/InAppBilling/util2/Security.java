package com.daaw.avee.comp.InAppBilling.util2;

import android.text.TextUtils;
import android.util.Base64;
import com.android.billingclient.util.BillingHelper;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
/* loaded from: classes.dex */
public class Security {
    private static final String KEY_FACTORY_ALGORITHM = "RSA";
    private static final String SIGNATURE_ALGORITHM = "SHA1withRSA";
    private static final String TAG = "IABUtil/Security";

    public static boolean verifyPurchase(String str, String str2, String str3) throws IOException {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            BillingHelper.logWarn(TAG, "Purchase verification failed: missing data.");
            return false;
        }
        return verify(generatePublicKey(str), str2, str3);
    }

    public static PublicKey generatePublicKey(String str) throws IOException {
        try {
            return KeyFactory.getInstance(KEY_FACTORY_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeySpecException e2) {
            String str2 = "Invalid key specification: " + e2;
            BillingHelper.logWarn(TAG, str2);
            throw new IOException(str2);
        }
    }

    public static boolean verify(PublicKey publicKey, String str, String str2) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            try {
                Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
                signature.initVerify(publicKey);
                signature.update(str.getBytes());
                if (signature.verify(decode)) {
                    return true;
                }
                BillingHelper.logWarn(TAG, "Signature verification failed.");
                return false;
            } catch (InvalidKeyException unused) {
                BillingHelper.logWarn(TAG, "Invalid key specification.");
                return false;
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            } catch (SignatureException unused2) {
                BillingHelper.logWarn(TAG, "Signature exception.");
                return false;
            }
        } catch (IllegalArgumentException unused3) {
            BillingHelper.logWarn(TAG, "Base64 decoding failed.");
            return false;
        }
    }
}
