package org.conscrypt;

import java.security.NoSuchAlgorithmException;
import java.util.Locale;
/* loaded from: classes2.dex */
final class EvpMdRef {
    public static final String MGF1_ALGORITHM_NAME = "MGF1";
    public static final String MGF1_OID = "1.2.840.113549.1.1.8";

    /* loaded from: classes2.dex */
    public static final class MD5 {
        public static final long EVP_MD;
        public static final String JCA_NAME = "MD5";
        public static final String OID = "1.2.840.113549.2.5";
        public static final int SIZE_BYTES;

        static {
            long EVP_get_digestbyname = NativeCrypto.EVP_get_digestbyname("md5");
            EVP_MD = EVP_get_digestbyname;
            SIZE_BYTES = NativeCrypto.EVP_MD_size(EVP_get_digestbyname);
        }

        private MD5() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class SHA1 {
        public static final long EVP_MD;
        public static final String JCA_NAME = "SHA-1";
        public static final String OID = "1.3.14.3.2.26";
        public static final int SIZE_BYTES;

        static {
            long EVP_get_digestbyname = NativeCrypto.EVP_get_digestbyname("sha1");
            EVP_MD = EVP_get_digestbyname;
            SIZE_BYTES = NativeCrypto.EVP_MD_size(EVP_get_digestbyname);
        }

        private SHA1() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class SHA224 {
        public static final long EVP_MD;
        public static final String JCA_NAME = "SHA-224";
        public static final String OID = "2.16.840.1.101.3.4.2.4";
        public static final int SIZE_BYTES;

        static {
            long EVP_get_digestbyname = NativeCrypto.EVP_get_digestbyname("sha224");
            EVP_MD = EVP_get_digestbyname;
            SIZE_BYTES = NativeCrypto.EVP_MD_size(EVP_get_digestbyname);
        }

        private SHA224() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class SHA256 {
        public static final long EVP_MD;
        public static final String JCA_NAME = "SHA-256";
        public static final String OID = "2.16.840.1.101.3.4.2.1";
        public static final int SIZE_BYTES;

        static {
            long EVP_get_digestbyname = NativeCrypto.EVP_get_digestbyname("sha256");
            EVP_MD = EVP_get_digestbyname;
            SIZE_BYTES = NativeCrypto.EVP_MD_size(EVP_get_digestbyname);
        }

        private SHA256() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class SHA384 {
        public static final long EVP_MD;
        public static final String JCA_NAME = "SHA-384";
        public static final String OID = "2.16.840.1.101.3.4.2.2";
        public static final int SIZE_BYTES;

        static {
            long EVP_get_digestbyname = NativeCrypto.EVP_get_digestbyname("sha384");
            EVP_MD = EVP_get_digestbyname;
            SIZE_BYTES = NativeCrypto.EVP_MD_size(EVP_get_digestbyname);
        }

        private SHA384() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class SHA512 {
        public static final long EVP_MD;
        public static final String JCA_NAME = "SHA-512";
        public static final String OID = "2.16.840.1.101.3.4.2.3";
        public static final int SIZE_BYTES;

        static {
            long EVP_get_digestbyname = NativeCrypto.EVP_get_digestbyname("sha512");
            EVP_MD = EVP_get_digestbyname;
            SIZE_BYTES = NativeCrypto.EVP_MD_size(EVP_get_digestbyname);
        }

        private SHA512() {
        }
    }

    private EvpMdRef() {
    }

    public static int getDigestSizeBytesByJcaDigestAlgorithmStandardName(String str) {
        String upperCase = str.toUpperCase(Locale.US);
        if (SHA256.JCA_NAME.equals(upperCase)) {
            return SHA256.SIZE_BYTES;
        }
        if (SHA512.JCA_NAME.equals(upperCase)) {
            return SHA512.SIZE_BYTES;
        }
        if (SHA1.JCA_NAME.equals(upperCase)) {
            return SHA1.SIZE_BYTES;
        }
        if (SHA384.JCA_NAME.equals(upperCase)) {
            return SHA384.SIZE_BYTES;
        }
        if (SHA224.JCA_NAME.equals(upperCase)) {
            return SHA224.SIZE_BYTES;
        }
        throw new NoSuchAlgorithmException("Unsupported algorithm: " + str);
    }

    public static long getEVP_MDByJcaDigestAlgorithmStandardName(String str) {
        String upperCase = str.toUpperCase(Locale.US);
        if (SHA256.JCA_NAME.equals(upperCase)) {
            return SHA256.EVP_MD;
        }
        if (SHA512.JCA_NAME.equals(upperCase)) {
            return SHA512.EVP_MD;
        }
        if (SHA1.JCA_NAME.equals(upperCase)) {
            return SHA1.EVP_MD;
        }
        if (SHA384.JCA_NAME.equals(upperCase)) {
            return SHA384.EVP_MD;
        }
        if (SHA224.JCA_NAME.equals(upperCase)) {
            return SHA224.EVP_MD;
        }
        throw new NoSuchAlgorithmException("Unsupported algorithm: " + str);
    }

    public static String getJcaDigestAlgorithmStandardName(String str) {
        String upperCase = str.toUpperCase(Locale.US);
        String str2 = SHA256.JCA_NAME;
        if (!SHA256.JCA_NAME.equals(upperCase) && !SHA256.OID.equals(upperCase)) {
            str2 = SHA512.JCA_NAME;
            if (!SHA512.JCA_NAME.equals(upperCase) && !SHA512.OID.equals(upperCase)) {
                str2 = SHA1.JCA_NAME;
                if (!SHA1.JCA_NAME.equals(upperCase) && !SHA1.OID.equals(upperCase)) {
                    str2 = SHA384.JCA_NAME;
                    if (!SHA384.JCA_NAME.equals(upperCase) && !SHA384.OID.equals(upperCase)) {
                        str2 = SHA224.JCA_NAME;
                        if (!SHA224.JCA_NAME.equals(upperCase) && !SHA224.OID.equals(upperCase)) {
                            return null;
                        }
                    }
                }
            }
        }
        return str2;
    }

    public static String getJcaDigestAlgorithmStandardNameFromEVP_MD(long j) {
        if (j == MD5.EVP_MD) {
            return MD5.JCA_NAME;
        }
        if (j == SHA1.EVP_MD) {
            return SHA1.JCA_NAME;
        }
        if (j == SHA224.EVP_MD) {
            return SHA224.JCA_NAME;
        }
        if (j == SHA256.EVP_MD) {
            return SHA256.JCA_NAME;
        }
        if (j == SHA384.EVP_MD) {
            return SHA384.JCA_NAME;
        }
        if (j == SHA512.EVP_MD) {
            return SHA512.JCA_NAME;
        }
        throw new IllegalArgumentException("Unknown EVP_MD reference");
    }
}
