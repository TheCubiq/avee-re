package org.conscrypt;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
/* loaded from: classes2.dex */
public final class GCMParameters extends AlgorithmParametersSpi {
    private static final int DEFAULT_TLEN = 96;
    private byte[] iv;
    private int tLen;

    public GCMParameters() {
    }

    public GCMParameters(int i, byte[] bArr) {
        this.tLen = i;
        this.iv = bArr;
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        long j;
        long j2;
        int i;
        long j3 = 0;
        try {
            j = NativeCrypto.asn1_write_init();
            try {
                j3 = NativeCrypto.asn1_write_sequence(j);
                NativeCrypto.asn1_write_octetstring(j3, this.iv);
                if (this.tLen != 96) {
                    NativeCrypto.asn1_write_uint64(j3, i / 8);
                }
                byte[] asn1_write_finish = NativeCrypto.asn1_write_finish(j);
                NativeCrypto.asn1_write_free(j3);
                NativeCrypto.asn1_write_free(j);
                return asn1_write_finish;
            } catch (IOException e) {
                e = e;
                long j4 = j3;
                j3 = j;
                j2 = j4;
                try {
                    NativeCrypto.asn1_write_cleanup(j3);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    long j5 = j3;
                    j3 = j2;
                    j = j5;
                    NativeCrypto.asn1_write_free(j3);
                    NativeCrypto.asn1_write_free(j);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                NativeCrypto.asn1_write_free(j3);
                NativeCrypto.asn1_write_free(j);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            j2 = 0;
        } catch (Throwable th3) {
            th = th3;
            j = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) {
        if (str == null || str.equals("ASN.1")) {
            return engineGetEncoded();
        }
        throw new IOException("Unsupported format: " + str);
    }

    @Override // java.security.AlgorithmParametersSpi
    public <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) {
        if (cls == null || !cls.getName().equals("javax.crypto.spec.GCMParameterSpec")) {
            throw new InvalidParameterSpecException("Unsupported class: " + cls);
        }
        return cls.cast(Platform.toGCMParameterSpec(this.tLen, this.iv));
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        GCMParameters fromGCMParameterSpec = Platform.fromGCMParameterSpec(algorithmParameterSpec);
        if (fromGCMParameterSpec == null) {
            throw new InvalidParameterSpecException("Only GCMParameterSpec is supported");
        }
        this.tLen = fromGCMParameterSpec.tLen;
        this.iv = fromGCMParameterSpec.iv;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) {
        long j;
        try {
            j = NativeCrypto.asn1_read_init(bArr);
            try {
                long asn1_read_sequence = NativeCrypto.asn1_read_sequence(j);
                byte[] asn1_read_octetstring = NativeCrypto.asn1_read_octetstring(asn1_read_sequence);
                int asn1_read_uint64 = NativeCrypto.asn1_read_is_empty(asn1_read_sequence) ? 96 : ((int) NativeCrypto.asn1_read_uint64(asn1_read_sequence)) * 8;
                if (!NativeCrypto.asn1_read_is_empty(asn1_read_sequence) || !NativeCrypto.asn1_read_is_empty(j)) {
                    throw new IOException("Error reading ASN.1 encoding");
                }
                this.iv = asn1_read_octetstring;
                this.tLen = asn1_read_uint64;
                NativeCrypto.asn1_read_free(asn1_read_sequence);
                NativeCrypto.asn1_read_free(j);
            } catch (Throwable th) {
                th = th;
                NativeCrypto.asn1_read_free(0L);
                NativeCrypto.asn1_read_free(j);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) {
        if (str == null || str.equals("ASN.1")) {
            engineInit(bArr);
            return;
        }
        throw new IOException("Unsupported format: " + str);
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "Conscrypt GCM AlgorithmParameters";
    }

    public byte[] getIV() {
        return this.iv;
    }

    public int getTLen() {
        return this.tLen;
    }
}
