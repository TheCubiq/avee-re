package org.conscrypt;

import javax.net.ssl.SSLSession;
/* loaded from: classes2.dex */
public interface SSLClientSessionCache {
    byte[] getSessionData(String str, int i);

    void putSessionData(SSLSession sSLSession, byte[] bArr);
}
