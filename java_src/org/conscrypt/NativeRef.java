package org.conscrypt;
/* loaded from: classes2.dex */
abstract class NativeRef {
    public final long address;

    /* loaded from: classes2.dex */
    public static final class EC_GROUP extends NativeRef {
        public EC_GROUP(long j) {
            super(j);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.EC_GROUP_clear_free(j);
        }
    }

    /* loaded from: classes2.dex */
    public static final class EC_POINT extends NativeRef {
        public EC_POINT(long j) {
            super(j);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.EC_POINT_clear_free(j);
        }
    }

    /* loaded from: classes2.dex */
    public static final class EVP_CIPHER_CTX extends NativeRef {
        public EVP_CIPHER_CTX(long j) {
            super(j);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.EVP_CIPHER_CTX_free(j);
        }
    }

    /* loaded from: classes2.dex */
    public static final class EVP_MD_CTX extends NativeRef {
        public EVP_MD_CTX(long j) {
            super(j);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.EVP_MD_CTX_destroy(j);
        }
    }

    /* loaded from: classes2.dex */
    public static final class EVP_PKEY extends NativeRef {
        public EVP_PKEY(long j) {
            super(j);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.EVP_PKEY_free(j);
        }
    }

    /* loaded from: classes2.dex */
    public static final class EVP_PKEY_CTX extends NativeRef {
        public EVP_PKEY_CTX(long j) {
            super(j);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.EVP_PKEY_CTX_free(j);
        }
    }

    /* loaded from: classes2.dex */
    public static final class HMAC_CTX extends NativeRef {
        public HMAC_CTX(long j) {
            super(j);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.HMAC_CTX_free(j);
        }
    }

    /* loaded from: classes2.dex */
    public static final class SSL_SESSION extends NativeRef {
        public SSL_SESSION(long j) {
            super(j);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.SSL_SESSION_free(j);
        }
    }

    public NativeRef(long j) {
        if (j == 0) {
            throw new NullPointerException("address == 0");
        }
        this.address = j;
    }

    public abstract void doFree(long j);

    public boolean equals(Object obj) {
        return (obj instanceof NativeRef) && ((NativeRef) obj).address == this.address;
    }

    public void finalize() {
        try {
            long j = this.address;
            if (j != 0) {
                doFree(j);
            }
        } finally {
            super.finalize();
        }
    }

    public int hashCode() {
        long j = this.address;
        return (int) (j ^ (j >>> 32));
    }
}
