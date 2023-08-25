package org.conscrypt;

import javax.net.ssl.SSLSession;
/* loaded from: classes2.dex */
interface SSLServerSessionCache {
    byte[] getSessionData(byte[] bArr);

    void putSessionData(SSLSession sSLSession, byte[] bArr);
}
