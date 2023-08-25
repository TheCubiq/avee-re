package org.conscrypt.p004ct;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;
import org.conscrypt.EvpMdRef;
import org.conscrypt.p004ct.VerifiedSCT;
/* renamed from: org.conscrypt.ct.CTLogInfo */
/* loaded from: classes2.dex */
public class CTLogInfo {
    private final String description;
    private final byte[] logId;
    private final PublicKey publicKey;
    private final String url;

    public CTLogInfo(PublicKey publicKey, String str, String str2) {
        try {
            this.logId = MessageDigest.getInstance(EvpMdRef.SHA256.JCA_NAME).digest(publicKey.getEncoded());
            this.publicKey = publicKey;
            this.description = str;
            this.url = str2;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CTLogInfo) {
            CTLogInfo cTLogInfo = (CTLogInfo) obj;
            return this.publicKey.equals(cTLogInfo.publicKey) && this.description.equals(cTLogInfo.description) && this.url.equals(cTLogInfo.url);
        }
        return false;
    }

    public String getDescription() {
        return this.description;
    }

    public byte[] getID() {
        return this.logId;
    }

    public PublicKey getPublicKey() {
        return this.publicKey;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return ((((this.publicKey.hashCode() + 31) * 31) + this.description.hashCode()) * 31) + this.url.hashCode();
    }

    public VerifiedSCT.Status verifySingleSCT(SignedCertificateTimestamp signedCertificateTimestamp, CertificateEntry certificateEntry) {
        if (Arrays.equals(signedCertificateTimestamp.getLogID(), getID())) {
            try {
                byte[] encodeTBS = signedCertificateTimestamp.encodeTBS(certificateEntry);
                try {
                    Signature signature = Signature.getInstance(signedCertificateTimestamp.getSignature().getAlgorithm());
                    try {
                        signature.initVerify(this.publicKey);
                        try {
                            signature.update(encodeTBS);
                            return !signature.verify(signedCertificateTimestamp.getSignature().getSignature()) ? VerifiedSCT.Status.INVALID_SIGNATURE : VerifiedSCT.Status.VALID;
                        } catch (SignatureException e) {
                            throw new RuntimeException(e);
                        }
                    } catch (InvalidKeyException unused) {
                        return VerifiedSCT.Status.INVALID_SCT;
                    }
                } catch (NoSuchAlgorithmException unused2) {
                    return VerifiedSCT.Status.INVALID_SCT;
                }
            } catch (SerializationException unused3) {
                return VerifiedSCT.Status.INVALID_SCT;
            }
        }
        return VerifiedSCT.Status.UNKNOWN_LOG;
    }
}
