package org.conscrypt;
/* loaded from: classes2.dex */
class NativeCryptoJni {
    private NativeCryptoJni() {
    }

    public static void init() {
        System.loadLibrary("com.google.android.gms.org.conscrypt".equals(NativeCrypto.class.getPackage().getName()) ? "conscrypt_gmscore_jni" : "conscrypt_jni");
    }
}
