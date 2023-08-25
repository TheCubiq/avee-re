package org.conscrypt.p004ct;

import java.security.cert.X509Certificate;
/* renamed from: org.conscrypt.ct.CTPolicy */
/* loaded from: classes2.dex */
public interface CTPolicy {
    boolean doesResultConformToPolicy(CTVerificationResult cTVerificationResult, String str, X509Certificate[] x509CertificateArr);
}
