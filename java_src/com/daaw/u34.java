package com.daaw;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes.dex */
public final class u34 extends SSLSocketFactory {

    /* renamed from: a */
    public final SSLSocketFactory f28509a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b */
    public final /* synthetic */ v34 f28510b;

    public u34(v34 v34Var) {
        this.f28510b = v34Var;
    }

    /* renamed from: a */
    public final Socket m8603a(Socket socket) {
        int i;
        int i2;
        v34 v34Var = this.f28510b;
        i = v34Var.f29833o;
        if (i > 0) {
            i2 = v34Var.f29833o;
            socket.setReceiveBufferSize(i2);
        }
        this.f28510b.f29834p.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f28509a.createSocket(str, i);
        m8603a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f28509a.createSocket(str, i, inetAddress, i2);
        m8603a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f28509a.createSocket(inetAddress, i);
        m8603a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.f28509a.createSocket(inetAddress, i, inetAddress2, i2);
        m8603a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.f28509a.createSocket(socket, str, i, z);
        m8603a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f28509a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f28509a.getSupportedCipherSuites();
    }
}
