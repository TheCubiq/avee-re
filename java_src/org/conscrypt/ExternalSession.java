package org.conscrypt;

import java.security.Principal;
import java.security.cert.Certificate;
import java.util.HashMap;
import java.util.List;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionBindingEvent;
import javax.net.ssl.SSLSessionBindingListener;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
/* loaded from: classes2.dex */
final class ExternalSession implements ConscryptSession {
    private final Provider provider;
    private final HashMap<String, Object> values = new HashMap<>(2);

    /* loaded from: classes2.dex */
    public interface Provider {
        ConscryptSession provideSession();
    }

    public ExternalSession(Provider provider) {
        this.provider = provider;
    }

    @Override // javax.net.ssl.SSLSession
    public int getApplicationBufferSize() {
        return this.provider.provideSession().getApplicationBufferSize();
    }

    @Override // org.conscrypt.ConscryptSession
    public String getApplicationProtocol() {
        return this.provider.provideSession().getApplicationProtocol();
    }

    @Override // javax.net.ssl.SSLSession
    public String getCipherSuite() {
        return this.provider.provideSession().getCipherSuite();
    }

    @Override // javax.net.ssl.SSLSession
    public long getCreationTime() {
        return this.provider.provideSession().getCreationTime();
    }

    @Override // javax.net.ssl.SSLSession
    public byte[] getId() {
        return this.provider.provideSession().getId();
    }

    @Override // javax.net.ssl.SSLSession
    public long getLastAccessedTime() {
        return this.provider.provideSession().getLastAccessedTime();
    }

    @Override // javax.net.ssl.SSLSession
    public Certificate[] getLocalCertificates() {
        return this.provider.provideSession().getLocalCertificates();
    }

    @Override // javax.net.ssl.SSLSession
    public Principal getLocalPrincipal() {
        return this.provider.provideSession().getLocalPrincipal();
    }

    @Override // javax.net.ssl.SSLSession
    public int getPacketBufferSize() {
        return this.provider.provideSession().getPacketBufferSize();
    }

    @Override // javax.net.ssl.SSLSession
    public X509Certificate[] getPeerCertificateChain() {
        return this.provider.provideSession().getPeerCertificateChain();
    }

    @Override // javax.net.ssl.SSLSession
    public java.security.cert.X509Certificate[] getPeerCertificates() {
        return this.provider.provideSession().getPeerCertificates();
    }

    @Override // javax.net.ssl.SSLSession
    public String getPeerHost() {
        return this.provider.provideSession().getPeerHost();
    }

    @Override // javax.net.ssl.SSLSession
    public int getPeerPort() {
        return this.provider.provideSession().getPeerPort();
    }

    @Override // javax.net.ssl.SSLSession
    public Principal getPeerPrincipal() {
        return this.provider.provideSession().getPeerPrincipal();
    }

    @Override // org.conscrypt.ConscryptSession
    public byte[] getPeerSignedCertificateTimestamp() {
        return this.provider.provideSession().getPeerSignedCertificateTimestamp();
    }

    @Override // javax.net.ssl.SSLSession
    public String getProtocol() {
        return this.provider.provideSession().getProtocol();
    }

    @Override // org.conscrypt.ConscryptSession
    public String getRequestedServerName() {
        return this.provider.provideSession().getRequestedServerName();
    }

    @Override // javax.net.ssl.SSLSession
    public SSLSessionContext getSessionContext() {
        return this.provider.provideSession().getSessionContext();
    }

    @Override // org.conscrypt.ConscryptSession
    public List<byte[]> getStatusResponses() {
        return this.provider.provideSession().getStatusResponses();
    }

    @Override // javax.net.ssl.SSLSession
    public Object getValue(String str) {
        if (str != null) {
            return this.values.get(str);
        }
        throw new IllegalArgumentException("name == null");
    }

    @Override // javax.net.ssl.SSLSession
    public String[] getValueNames() {
        return (String[]) this.values.keySet().toArray(new String[this.values.size()]);
    }

    @Override // javax.net.ssl.SSLSession
    public void invalidate() {
        this.provider.provideSession().invalidate();
    }

    @Override // javax.net.ssl.SSLSession
    public boolean isValid() {
        return this.provider.provideSession().isValid();
    }

    @Override // javax.net.ssl.SSLSession
    public void putValue(String str, Object obj) {
        putValue(this, str, obj);
    }

    public void putValue(SSLSession sSLSession, String str, Object obj) {
        if (str == null || obj == null) {
            throw new IllegalArgumentException("name == null || value == null");
        }
        Object put = this.values.put(str, obj);
        if (obj instanceof SSLSessionBindingListener) {
            ((SSLSessionBindingListener) obj).valueBound(new SSLSessionBindingEvent(sSLSession, str));
        }
        if (put instanceof SSLSessionBindingListener) {
            ((SSLSessionBindingListener) put).valueUnbound(new SSLSessionBindingEvent(sSLSession, str));
        }
    }

    @Override // javax.net.ssl.SSLSession
    public void removeValue(String str) {
        removeValue(this, str);
    }

    public void removeValue(SSLSession sSLSession, String str) {
        if (str == null) {
            throw new IllegalArgumentException("name == null");
        }
        Object remove = this.values.remove(str);
        if (remove instanceof SSLSessionBindingListener) {
            ((SSLSessionBindingListener) remove).valueUnbound(new SSLSessionBindingEvent(sSLSession, str));
        }
    }
}
