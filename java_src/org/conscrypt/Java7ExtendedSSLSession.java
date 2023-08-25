package org.conscrypt;

import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
/* loaded from: classes2.dex */
class Java7ExtendedSSLSession extends ExtendedSSLSession implements ConscryptSession {
    private static final String[] LOCAL_SUPPORTED_SIGNATURE_ALGORITHMS = {"SHA512withRSA", "SHA512withECDSA", "SHA384withRSA", "SHA384withECDSA", "SHA256withRSA", "SHA256withECDSA", "SHA224withRSA", "SHA224withECDSA", "SHA1withRSA", "SHA1withECDSA"};
    private static final String[] PEER_SUPPORTED_SIGNATURE_ALGORITHMS = {"SHA1withRSA", "SHA1withECDSA"};
    public final ExternalSession delegate;

    public Java7ExtendedSSLSession(ExternalSession externalSession) {
        this.delegate = externalSession;
    }

    @Override // javax.net.ssl.SSLSession
    public final int getApplicationBufferSize() {
        return this.delegate.getApplicationBufferSize();
    }

    @Override // org.conscrypt.ConscryptSession
    public String getApplicationProtocol() {
        return this.delegate.getApplicationProtocol();
    }

    @Override // javax.net.ssl.SSLSession
    public final String getCipherSuite() {
        return this.delegate.getCipherSuite();
    }

    @Override // javax.net.ssl.SSLSession
    public final long getCreationTime() {
        return this.delegate.getCreationTime();
    }

    @Override // javax.net.ssl.SSLSession
    public final byte[] getId() {
        return this.delegate.getId();
    }

    @Override // javax.net.ssl.SSLSession
    public final long getLastAccessedTime() {
        return this.delegate.getLastAccessedTime();
    }

    @Override // javax.net.ssl.SSLSession
    public final Certificate[] getLocalCertificates() {
        return this.delegate.getLocalCertificates();
    }

    @Override // javax.net.ssl.SSLSession
    public final Principal getLocalPrincipal() {
        return this.delegate.getLocalPrincipal();
    }

    @Override // javax.net.ssl.ExtendedSSLSession
    public final String[] getLocalSupportedSignatureAlgorithms() {
        return (String[]) LOCAL_SUPPORTED_SIGNATURE_ALGORITHMS.clone();
    }

    @Override // javax.net.ssl.SSLSession
    public final int getPacketBufferSize() {
        return this.delegate.getPacketBufferSize();
    }

    @Override // javax.net.ssl.SSLSession
    public final X509Certificate[] getPeerCertificateChain() {
        return this.delegate.getPeerCertificateChain();
    }

    @Override // javax.net.ssl.SSLSession
    public java.security.cert.X509Certificate[] getPeerCertificates() {
        return this.delegate.getPeerCertificates();
    }

    @Override // javax.net.ssl.SSLSession
    public final String getPeerHost() {
        return this.delegate.getPeerHost();
    }

    @Override // javax.net.ssl.SSLSession
    public final int getPeerPort() {
        return this.delegate.getPeerPort();
    }

    @Override // javax.net.ssl.SSLSession
    public final Principal getPeerPrincipal() {
        return this.delegate.getPeerPrincipal();
    }

    @Override // org.conscrypt.ConscryptSession
    public final byte[] getPeerSignedCertificateTimestamp() {
        return this.delegate.getPeerSignedCertificateTimestamp();
    }

    @Override // javax.net.ssl.ExtendedSSLSession
    public final String[] getPeerSupportedSignatureAlgorithms() {
        return (String[]) PEER_SUPPORTED_SIGNATURE_ALGORITHMS.clone();
    }

    @Override // javax.net.ssl.SSLSession
    public final String getProtocol() {
        return this.delegate.getProtocol();
    }

    @Override // org.conscrypt.ConscryptSession
    public final String getRequestedServerName() {
        return this.delegate.getRequestedServerName();
    }

    @Override // javax.net.ssl.SSLSession
    public final SSLSessionContext getSessionContext() {
        return this.delegate.getSessionContext();
    }

    @Override // org.conscrypt.ConscryptSession
    public final List<byte[]> getStatusResponses() {
        return this.delegate.getStatusResponses();
    }

    @Override // javax.net.ssl.SSLSession
    public final Object getValue(String str) {
        return this.delegate.getValue(str);
    }

    @Override // javax.net.ssl.SSLSession
    public final String[] getValueNames() {
        return this.delegate.getValueNames();
    }

    @Override // javax.net.ssl.SSLSession
    public final void invalidate() {
        this.delegate.invalidate();
    }

    @Override // javax.net.ssl.SSLSession
    public final boolean isValid() {
        return this.delegate.isValid();
    }

    @Override // javax.net.ssl.SSLSession
    public final void putValue(String str, Object obj) {
        this.delegate.putValue(this, str, obj);
    }

    @Override // javax.net.ssl.SSLSession
    public final void removeValue(String str) {
        this.delegate.removeValue(this, str);
    }
}
