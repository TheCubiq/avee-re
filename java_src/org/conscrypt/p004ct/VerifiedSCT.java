package org.conscrypt.p004ct;
/* renamed from: org.conscrypt.ct.VerifiedSCT */
/* loaded from: classes2.dex */
public final class VerifiedSCT {
    public final SignedCertificateTimestamp sct;
    public final Status status;

    /* renamed from: org.conscrypt.ct.VerifiedSCT$Status */
    /* loaded from: classes2.dex */
    public enum Status {
        VALID,
        INVALID_SIGNATURE,
        UNKNOWN_LOG,
        INVALID_SCT
    }

    public VerifiedSCT(SignedCertificateTimestamp signedCertificateTimestamp, Status status) {
        this.sct = signedCertificateTimestamp;
        this.status = status;
    }
}
